package ru.sber.base.syntax.Task7;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static class Task7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите a =");
            double a = sc.nextDouble();
            System.out.print("Введите b =");
            double b = sc.nextDouble();
            System.out.print("Введите c =");
            double c = sc.nextDouble();
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("Нет корней");
            } else {
                if (d == 0) {
                    double x = (-b) / (2 * a);
                    System.out.println("x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("x1 = " + x1 + " x2 = " + x2);
                }
            }
        }
    }
}
