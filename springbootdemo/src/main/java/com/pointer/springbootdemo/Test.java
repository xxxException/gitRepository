package com.pointer.springbootdemo;

import com.pointer.springbootdemo.mybatis.util.SensitiveTree;


public class Test {

    public static void main(String[] args) throws InterruptedException {
        SensitiveTree tree = new SensitiveTree();
        tree.addWord("傻逼");

        tree.addWord("色情");
        Thread.sleep(100);
        System.out.println();
        tree.addWord("00");

        String output = tree.checkSensitive("白yj色s情人节");
        System.out.println(output);
    }

    public void test() {
        SensitiveTree tree = new SensitiveTree();
        tree.addWord("abcd");
        tree.list();
    }
}
