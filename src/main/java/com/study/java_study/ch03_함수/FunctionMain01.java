package com.study.java_study.ch03_함수;

public class FunctionMain01 {
    public static void main(String[] args) {
        Function01 function01 = new Function01();

        int result1 = function01.add(10, 2);
        int result2 = function01.add(100, 50);
        int result3 = function01.sub(50, 20);
        int result4 = function01.sub(100, 20);

        System.out.println(result1);  //add
        System.out.println(result2);  //add
        System.out.println(result3);  //sub
        System.out.println(result4);  //sub
    }
}
