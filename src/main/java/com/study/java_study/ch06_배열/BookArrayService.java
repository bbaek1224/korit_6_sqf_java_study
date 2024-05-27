package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {

        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[나만의 도서관]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.println("5. 전체조회");
            System.out.println("q. 나가기");
            System.out.print("메뉴 선택: ");

            String selectMenu = scanner.nextLine();
            String[] newBook = null;
            int findIndex = -1;

            switch (selectMenu) {
                case "1":
                    System.out.println("[책 등록]");
                    newBook = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBook[i] = books[i];
                    }
                    books = newBook;
                    System.out.print("등록 할 책: ");
                    books[books.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[책 수정]");
                    System.out.print("수정 할 책: ");
                    String modifyBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBook(books, modifyBook);
                    if(findIndex == -1) {
                        System.out.println("해당 이름의 책은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("책 이름: ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[책 삭제]");
                    System.out.print("삭제 할 책: ");
                    String removeBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBook(books, removeBook);
                    if(findIndex == -1) {
                        System.out.println("해당 이름의 책은 존재하지 않습니다.");
                        break;
                    }
                    newBook = new String[books.length - 1];
                    for(int i = 0; i < newBook.length; i++) {
                        if(i < findIndex) {
                            newBook[i] = books[i];
                            continue;
                        }
                        newBook[i] = books[i + 1];
                    }
                    books = newBook;
                    System.out.println("삭제 완료!");
                    break;
                case "4":
                    System.out.println("[책 조회]");
                    System.out.print("조회 할 책: ");
                    String findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBook(books, findBook);
                    if(findIndex == -1) {
                        System.out.println("해당 이름의 책은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println("조회 완료!");
                    System.out.println(findBook);
                    break;
                case "5":
                    for(int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + "." + books[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
            System.out.println();
        }
    }
}
