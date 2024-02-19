package ru.sber.base.syntax.Task2;
import java.util.Scanner;
public class Main {
    public static class Task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Введите количество чисел: ");
            int n = sc.nextInt();
            if (n>=1 && n<=500){
                for (int i=0; i<n; i++){
                    int a = 7*(i+1) ;
                    System.out.print(a);
                    System.out.print(" ");
                }
            }
            else {
                System.out.print(" Введено недопустимое число ");
                System.out.print(n);
                System.out.println(". Допустимый диапазон значений: 1 - 500");
            }
        }
    }
}
