package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.Question;
import com.pointer.springbootdemo.mybatis.util.SensitiveTree;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

import static org.junit.Assert.*;

public class QuestionServiceImplTest {

    @Autowired
    QuestionServiceImpl questionService;

    @Test
    public void addQuestion() {
        String re = new String();
        //敏感词过滤
        SensitiveTree tree = new SensitiveTree();
        File file = new File("D:\\MyDocument\\project\\springbootdemo\\src\\main\\resources\\sensitiveWord.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            re = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.err.println("敏感词文件没有找到");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        String[] sensitiveWords = re.split(",");
        for (String word:sensitiveWords) {
            System.out.println(word);
        }
    }
}