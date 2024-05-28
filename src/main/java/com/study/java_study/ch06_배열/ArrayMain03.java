package com.study.java_study.ch06_배열;

public class ArrayMain03 {

    public static void main(String[] args) {

        Computer[] computers = new Computer[3];

        computers[0] = new Computer("13", "8GB");
        computers[1] = new Computer("15", "16GB");
        computers[2] = new Computer("17", "32GB");

        for(Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }
}
