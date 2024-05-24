package com.study.java_study.ch04_제어;

public class Star {

    public static void main(String[] args) {

        /*

        *
        **
        ***
        ****
        *****

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *****
         ****
         ***
         **
         *

         */

        for(int k = 0; k < 5; k++) {
            for(int l = 0; l < 5 - k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int m = 0; m < 5; m++) {
            for(int n = 0; n < 4 - m; n++) {
                System.out.print(" ");
            }
            for(int o = 0; o < m + 1; o++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int p = 0; p < 5; p++) {
            for(int q = 0; q < p; q++) {
                System.out.print(" ");
            }
            for(int r = 0; r < 5 - p; r++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int s = 0; s < 5; s++) {
            for(int t = 0; t < 5 - s - 1; t++) {
                System.out.print(" ");
            }
            for(int u = 0; u < (2 * s + 1); u++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
