package com.pointer.springbootdemo.mybatis.util;

import org.apache.shiro.crypto.hash.SimpleHash;

public class Md5Util {
    public static String getHash(String password) {
        String hashAlgorithmName = "MD5";
        String credentials = "admin";
        int hashIterations = 2;
        SimpleHash returnPassword= new SimpleHash(hashAlgorithmName, credentials, "salt", hashIterations);
        return returnPassword.toString();
    }
}
