package com.pointer.springbootdemo.mybatis.util;

import org.apache.shiro.crypto.hash.SimpleHash;

public class Md5Util {
    public static String getHash(String password,String salt) {
        String hashAlgorithmName = "MD5";
        int hashIterations = 2;
        SimpleHash returnPassword= new SimpleHash(hashAlgorithmName, password, salt, hashIterations);
        return returnPassword.toString();
    }
}
