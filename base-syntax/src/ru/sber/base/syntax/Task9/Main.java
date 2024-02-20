package ru.sber.base.syntax.Task9;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char simbol = (char) (r.nextInt(26) + 'A');
        System.out.print(simbol);
        char as;
        do {
            as = sc.next().charAt(0);
            if ('A' <= as && as <= 'Z' || 'a' <= as && as <= 'z') {
                if (as >= 'a') {
                    as = (char) (as + (int) ('A') - (int) ('a'));
                }
                if (as == simbol) {
                    System.out.print("Верно!");
                    break;
                } else if (as < simbol) {
                    System.out.print("Ищи букву, которая после нее в алфавите");
                } else {
                    System.out.print("Ищи букву, которая до нее в алфавите");
                }
            } else {
                System.out.print("Введен недопустимый символ");
            }
        } while (true);
    }
}