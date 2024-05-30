package com.study.java_study.ch06_배열;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // 기존 배열
        int[] nums = new int[]{1, 2, 3, 4, 5};

        // 배열에 추가할 값
        int n = 6;

        // 새로운 배열 생성(기존 배열의 길이보다 1큰 배열)
        int[] newNums = new int[nums.length + 1];

        // 기존 배열의 정보를 새로운 배열로 전부 옮긴다. 이 때 마지막 인덱스의 값은 빈 값
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }

        // 새로운 배열에 마지막 인덱스에 값을 추가한다.
        newNums[newNums.length - 1] = n;

        // 기존 배열의 주소가 들어있는 변수 nums에 새로운 배열의 주소값을 대입한다.
        nums = newNums;

        System.out.println(Arrays.toString(nums));


        // 정수형 배열 생성
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열의 두 번째 요소(인덱스 1)의 값을 변경
        numbers[1] = 10;

        // 변경된 배열 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // 기존 배열
        int[] numNum = new int[]{1, 2, 3};

        // 새로운 배열(기존 배열의 길이보다 1작은 배열)
        int[] numNum2 = new int[numNum.length - 1];

        // 기존 배열의 정보를 새로운 배열로 옮긴다. 이 때 기존 배열의 마지막 인덱스가 제거된다.
        for (int i = 0; i < numNum.length - 1; i++) {
            numNum2[i] = numNum[i];
        }

        // 기존 배열의 주소값이 들어있는 변수 numNum의 새로운 주소값을 대입한다.
        numNum = numNum2;
        System.out.println(Arrays.toString(numNum));


        for(int num : nums) {
            System.out.println(num);
        }
    }
}

