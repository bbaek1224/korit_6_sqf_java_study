package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class WhileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isLank = true;

        System.out.println("팀 순위");

        while(isLank) {
            System.out.println("[팀 알아보기]");
            System.out.println("1. 젠지");
            System.out.println("2. T1");
            System.out.println("3. 한화생명");
            System.out.println("4. KT");
            System.out.println("5. DK");
            System.out.println("6. 광동");
            System.out.println("7. 피어엑스");
            System.out.println("8. 농심");
            System.out.println("9. DRX");
            System.out.println("10. OK저축은행");
            System.out.println("b. 프로그램 종료");

            System.out.print("보고 싶은 팀을 고르시요: ");
            String selectTeam = scanner.nextLine();
            System.out.println();
            switch (selectTeam) {
                case "1":
                    System.out.println("젠지");
                    break;
                case "2":
                    System.out.println("T1");
                    boolean t1 = true;
                    while(t1) {
                        System.out.println("1. 선수 명단");
                        System.out.println("2. 코치 명단");
                        System.out.println("3. 업적");
                        System.out.println("q. 나가기");
                        System.out.println("b. 종료");

                        System.out.print("메뉴 선택: ");
                        selectTeam = scanner.nextLine();
                        System.out.println();
                        switch (selectTeam) {
                            case "1":
                                System.out.println("탑: 제우스");
                                System.out.println("정글: 오너");
                                System.out.println("미드: 페이커");
                                System.out.println("원딜: 구마유시");
                                System.out.println("서폿: 케리아");
                                t1 = false;
                                break;
                            case "2":
                                System.out.println("감독: 김정균");
                                System.out.println("코치: 톰");
                                System.out.println("코치: 로치");
                                t1 = false;
                                break;
                            case "3":
                                System.out.println("2023 월드챔피언쉽 우승");
                                t1 = false;
                                break;
                            case "q":
                                System.out.println("메뉴로 돌아갑니다.");
                                t1 = false;
                                break;
                            case "b":
                                System.out.println("프로그램을 종료합니다.");
                                t1 = false;
                                isLank = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("한화생명");
                    break;
                case "4":
                    System.out.println("KT");
                    break;
                case "5":
                    System.out.println("DK");
                    break;
                case "6":
                    System.out.println("광동");
                    break;
                case "7":
                    System.out.println("피어엑스");
                    break;
                case "8":
                    System.out.println("농심");
                    break;
                case "9":
                    System.out.println("DRX");
                    break;
                case "10":
                    System.out.println("OK저축은행");
                    break;
                case "b":
                    System.out.println("프로그램을 종료합니다.");
                    isLank = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
