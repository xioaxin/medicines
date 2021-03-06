package com.example.demo.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class MD5Util {
    //向量(同时拥有向量和密匙才能解密)，此向量必须是8byte，多少都报错
    private final byte[] DESIV = new byte[]{0x22, 0x54, 0x36, 110, 0x40, (byte) 0xac, (byte) 0xad, (byte) 0xdf};// 向量
    private AlgorithmParameterSpec iv = null;// 加密算法的参数接口
    private Key key = null;
    private String charset = "utf-8";

    /**
     * 构造函数
     *
     * @throws Exception
     */
    public MD5Util() throws Exception {
        String deSkey = "qwrwrww十多个";
        String charset = "utf-8";
        DESKeySpec keySpec = new DESKeySpec(deSkey.getBytes(this.charset));// 设置密钥参数
        iv = new IvParameterSpec(DESIV);// 设置向量
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");// 获得密钥工厂
        key = keyFactory.generateSecret(keySpec);// 得到密钥对象
    }

    /**
     * 加密
     *
     * @param data
     * @return
     */
    public String encode(String data) {
        Cipher enCipher = null;// 得到加密对象Cipher
        try {
            enCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        try {
            enCipher.init(Cipher.ENCRYPT_MODE, key, iv);// 设置工作模式为加密模式，给出密钥和向量
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        byte[] pasByte = new byte[0];
        try {
            pasByte = enCipher.doFinal(data.getBytes(this.charset));
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(pasByte);
    }

    /**
     * 解密
     *
     * @param data
     * @return
     * @throws Exception
     */
    public String decode(String data) {
        Cipher deCipher = null;
        try {
            deCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            deCipher.init(Cipher.DECRYPT_MODE, key, iv);
            BASE64Decoder base64Decoder = new BASE64Decoder();
            //此处注意doFinal()的参数的位数必须是8的倍数，否则会报错（通过encode加密的字符串读出来都是8的倍数位，但写入文件再读出来，就可能因为读取的方式的问题，导致最后此处的doFinal()的参数的位数不是8的倍数）
            //此处必须用base64Decoder，若用data。getBytes()则获取的字符串的byte数组的个数极可能不是8的倍数，而且不与上面的BASE64Encoder对应（即使解密不报错也不会得到正确结果）
            byte[] pasByte = deCipher.doFinal(base64Decoder.decodeBuffer(data));
            return new String(pasByte, this.charset);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取MD5的值，可用于对比校验
     *
     * @param sourceStr
     * @return
     */
    private static String getMD5Value(String sourceStr) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
        } catch (NoSuchAlgorithmException e) {
        }
        return result;
    }

//    public static void main(String[] args) throws Exception {
//        try {
//
//            String value = "123456";
//            String key = "qwrwrww十多个";// 自定义密钥,个数不能太短，太短报错，过长，它默认只取前N位（N的具体值，大家另行查找资料）
//            MD5Util mt = new MD5Util(key, "utf-8");
//            System.out.println("加密前的字符：" + value);
//            System.out.println("加密后的字符：" + mt.encode(value));
//            System.out.println("解密后的字符：" + mt.decode(mt.encode(value)));
//            System.out.println("字符串的MD5值：" + getMD5Value(value));
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//    }
}

