package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class WebToonService {

    private Scanner scanner;
    private WebToonRepository webToonRepository;

    private WebToonService() {
        scanner = new Scanner(System.in);
        webToonRepository = new WebToonRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();

            if(menus.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[웹툰 관리 프로그램]");
        System.out.println("1. 웹툰 등록");
        System.out.println("2. 웹툰 조회");
        System.out.println("3. 웹툰 수정");
        System.out.println("4. 웹툰 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "q":
                isRun = false;
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();
        return isRun;
    }

    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.print(title + "명 입력: ");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력해주세요.");
        }
        return value;
    }

    private String duplicateWebToonName(String title) {
        String webToonName = null;
        while(true) {
            webToonName = validateValue("웹툰");
            if(webToonRepository.findWebToonByWebToonName(webToonName) == null) {
                break;
            }
            System.out.println("해당 이름의 웹툰명이 있습니다. 다시 입력해주세요.");
        }
        return webToonName;
    }

    private void registerWebToon() {
        System.out.println("[ 웹툰 등록 ]");
    }
}
