package ru.sber.base.syntax.Task7;
import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static class Task6
    {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите a =");
            double a = sc.nextDouble();
            System.out.print("Введите b =");
            double b = sc.nextDouble();
            System.out.print("Введите c =");
            double c = sc.nextDouble();
            double d = b*b-4*a*c;
            double x1 = (-b+Math.sqrt(d))/(2*a);
            double x2 = (-b-Math.sqrt(d))/(2*a);
            if (d<0) {
                System.out.println("Нет корней");
            }
            else if (x1==x2){
                System.out.println("X = " + x1);
            }
            else{
                System.out.println("X1 = " + x1 + " X2 = "+x2);
            }

        }
    }
}
