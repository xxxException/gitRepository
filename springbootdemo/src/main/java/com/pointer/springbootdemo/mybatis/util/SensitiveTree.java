package com.pointer.springbootdemo.mybatis.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SensitiveTree {

    //根节点
    Node root;

    Node firstNode;
    Node secondNode;
    Node thirdNode;

    public SensitiveTree() {
        root = new Node();
    }

    public void addNode() { }

    public Node getRoot() {
        return root;
    }

    public void addWord(String word) {
        Node tempNode = root;
        for (int i = 0; i < word.length()-1; i++) {
            Character character = word.charAt(i);
            if (!tempNode.getChildNodes().keySet().contains(character)) {
                tempNode.getChildNodes().put(character,new Node(character));
            }
//            System.out.println(tempNode.getChildNodes());
            tempNode = tempNode.getChildNodes().get(character);
        }
        Character lastCharacter = word.charAt(word.length()-1);
        if (!tempNode.getChildNodes().keySet().contains(lastCharacter)) {
            tempNode.getChildNodes().put(lastCharacter,new Node(lastCharacter).setIdEnd(true));
        }
        tempNode = tempNode.getChildNodes().get(lastCharacter).setIdEnd(true);
    }

    public void list () {
        Node tempNode = root;
        System.out.println(tempNode.getChildNodes());
        while(tempNode.getChildNodes().size()>0) {
            for (Character character:tempNode.getChildNodes().keySet()) {
                tempNode = tempNode.getChildNodes().get(character);
                System.out.println(character);
                System.out.println(tempNode.getChildNodes());
            }
        }
    }

    public String checkSensitive(String word) {
        Character character;
        Node nowNode = root;
        int nowIndex = 0;
        StringBuilder outPutWord = new StringBuilder();
        for (int startIndex = 0; startIndex < word.length(); ) {

            StringBuilder sensitiveWord = new StringBuilder();
            StringBuilder formalWord = new StringBuilder();
            character = word.charAt(startIndex);
            nowIndex = startIndex;
            startIndex++;
            if (!nowNode.getChildNodes().keySet().contains(character)) {
                outPutWord.append(character);
                continue;
            }

            while (nowNode.getChildNodes().keySet().contains(character)) {
                formalWord.append(character);
                sensitiveWord.append('*');

                nowNode = nowNode.getChildNodes().get(character);
                nowIndex++;
                if (nowIndex<word.length()) {
                    character = word.charAt(nowIndex);
                }
            }

            if (nowNode.isEnd()) {
                outPutWord.append(sensitiveWord);
                sensitiveWord = null;
                startIndex = nowIndex;
            } else {
                outPutWord.append(formalWord);
                formalWord = null;
            }
            nowNode = root;
        }
        return outPutWord.toString();
    }


    private class Node{
        @Override
        public String toString() {
            return "Node{" +
                    "character=" + character +
                    ", idEnd=" + idEnd +
                    '}';
        }

        Character character;
        boolean idEnd = false;
        Map<Character, Node> childNodes;

        public Node(Character character) {
            childNodes = new HashMap<>();
            this.character = character;
        }

        public Node() {
            childNodes = new HashMap<>();
        }


        public boolean isEnd() {
            return idEnd;
        }

        //链式编程
        public Node setIdEnd(boolean idEnd) {
            this.idEnd = idEnd;
            return this;
        }

        public Map<Character, Node> getChildNodes() {
            return childNodes;
        }

        public void setChildNodes(Map<Character, Node> childNodes) {
            this.childNodes = childNodes;
        }
    }


}
