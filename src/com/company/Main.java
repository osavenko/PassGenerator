package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GeneratePass pass = new GeneratePass(10);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(pass.generate());
        }
        for (String s:list){
            System.out.println(s);
        }
    }
}
