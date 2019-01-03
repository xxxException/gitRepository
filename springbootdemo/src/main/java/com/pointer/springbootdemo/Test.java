package com.pointer.springbootdemo;

import com.pointer.springbootdemo.mybatis.util.SensitiveTree;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
    }

    public void test() throws InterruptedException {


        SensitiveTree tree = new SensitiveTree();
        tree.addWord("傻逼");

        tree.addWord("色情");
        Thread.sleep(100);
        System.out.println();
        tree.addWord("00");

        String output = tree.checkSensitive("白yj色s情人节");
        System.out.println(output);

        tree = new SensitiveTree();
        tree.addWord("abcd");
        tree.list();
    }
}
