package ru.sber.base.syntax.Task9;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char simbol = (char) (r.nextInt(26) + 'A');
        System.out.println("Загаданный символ: " + simbol);
        char as;
        do {
            System.out.println("Введите символ в строку ниже: ");
            as=sc.nextLine().toUpperCase().charAt(0);
            if ('A' <= as && as <= 'Z') {
                if (as == simbol) {
                    System.out.println("Верно!");
                    break;
                } else if (as < simbol) {
                    System.out.println("Ищи букву, которая после нее в алфавите");
                } else {
                    System.out.println("Ищи букву, которая до нее в алфавите");
                }
            } else {
                System.out.println("Введен недопустимый символ");
            }
        }  while (true);
    }
}