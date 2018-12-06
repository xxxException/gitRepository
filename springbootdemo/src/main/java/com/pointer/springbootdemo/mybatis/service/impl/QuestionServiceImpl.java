package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.Question;
import com.pointer.springbootdemo.mybatis.mapper.QuestionMapper;
import com.pointer.springbootdemo.mybatis.service.IQuestionService;
import com.pointer.springbootdemo.mybatis.util.SensitiveTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import java.io.*;

@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    QuestionMapper questionMapper;

    @Override
    public Integer addQuestion(Question question) {

        SensitiveTree tree = new SensitiveTree();
        String[] sensitiveWords = getStringsByFile(new File("D:\\MyDocument\\project\\springbootdemo\\src\\main\\resources\\sensitiveWord.txt"));
        for (String sensitiveWord:sensitiveWords) {
            tree.addWord(sensitiveWord);
        }

        question.setContent(tree.checkSensitive(question.getContent()));
        question.setTitle(tree.checkSensitive(question.getTitle()));

        //过滤html标签，防止脚本注入，将标签转意
        question.setContent(HtmlUtils.htmlEscape(question.getContent()));
        question.setTitle(HtmlUtils.htmlEscape(question.getTitle()));
        return questionMapper.addQuestion(question);
    }

    private String[] getStringsByFile(File file) {
        String re = new String();
        //敏感词过滤
        SensitiveTree tree = new SensitiveTree();
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
        return sensitiveWords;
    }
}
