package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("게임 시작");
            System.out.println("게임 종료");
        };

        runnable.run();

        Function<String, Integer> fx = status -> Integer.parseInt(status);

        Integer attack = fx.apply("320");
        System.out.println("공격력 : " + attack);
        Integer magic = fx.andThen(result -> result + 100).apply("300");
        System.out.println("주문력 : " + magic);

        Consumer<String> champion = name -> {
            System.out.println(name + "님이 처치하였습니다.");
            System.out.println(name + "님 더블킬");
            System.out.println(name + "님 트리플킬");
        };

        champion.accept("가렌");

        Supplier<String> item = () -> "장갑";

        System.out.println(item.get());

        Predicate<Integer> even = num -> num % 2 == 0;
        Predicate<Integer> even2 = num2 -> num2 % 3 == 0;
        Predicate<Integer> result = even.and(even2);

        System.out.println(result.test(12));
    }
}
