package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        Student s = new Student();

        fx.fx01(1234, "김준일", 31, "01099881916");

        s.studentCode = 1234;
        s.name = "김준일";
        s.age = 31;
        s.phone = "01099881916";

        fx.fx02(s);
    }
}
