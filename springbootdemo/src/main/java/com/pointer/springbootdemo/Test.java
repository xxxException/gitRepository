package com.pointer.springbootdemo;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class Test {
    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        String credentials = "admin";
        int hashIterations = 2;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, "salt", hashIterations);
        System.out.println(obj);
    }
}
