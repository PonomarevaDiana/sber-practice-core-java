package ru.sber.base.syntax.Task4;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static class Task4
    {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 2;
            while(i<=Math.round(Math.sqrt(n)) && n%i!=0){
                i++;
            }
            if (i>Math.round(Math.sqrt(n))){
                System.out.print("Да");
            }
            else {
                System.out.println("Нет");
            }
        }
    }
}
