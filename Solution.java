package com.company;

import java.util.*;

public class Solution {
    static final int SIZE = 100;

    static int arr1[] = new int[SIZE];
    static int arr2[] = new int[SIZE];
    static int arr3[] = new int[SIZE];
    static int top1 = -1;
    static int top2 = -1;
    static int top3 = -1;

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int T, N;

        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            N = scanner.nextInt();

            String P;
            P = scanner.next();

            operation(N, P);
        }
    }
    public static int operation(int N, String P){

        int stroke = 0;

        for (int i = 0; i < N; i++) {
            char ch;
            int j  = i;
            ch = P.charAt(i);
            switch (ch){
                case 'R':
                    while (P.charAt(j) == 'R' || P.charAt(j) == 'O' || P.charAt(j) == 'P' || P.charAt(j) == 'A'){

                    }
                    stroke++;
                    break;

                case 'Y':
                    while (P.charAt(j) == 'Y' || P.charAt(j) == 'O' || P.charAt(j) == 'G' || P.charAt(j) == 'A'){

                    }
                    stroke++;
                    break;

                case 'B':
                    while (P.charAt(j) == 'B' || P.charAt(j) == 'P' || P.charAt(j) == 'G' || P.charAt(j) == 'A'){

                    }
                    stroke++;
                    break;
            }
            i = j;
        }
        return stroke;
    }
}
