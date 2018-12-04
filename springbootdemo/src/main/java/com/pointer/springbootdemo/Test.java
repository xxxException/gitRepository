package com.pointer.springbootdemo;

import com.pointer.springbootdemo.utils.RandomNumUtil;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;


public class Test {
    public static void main(String[] args) throws IOException {
        RandomNumUtil randomNum = RandomNumUtil.instance();
        String identifyingCode = randomNum.getString();
        ByteArrayInputStream imgInputStream = randomNum.getImage();
        //返回可不发生阻塞地从此输入流读取的字节数。
        byte[] bytes = new byte[imgInputStream.available()];
        //从此输入流读取的字节数。
        imgInputStream.read(bytes);
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //将字节数组用base64编码
        String a =base64Encoder.encode(bytes);
        System.out.println(a);
    }
}
