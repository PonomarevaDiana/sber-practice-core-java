package ru.sber.base.syntax.Task5;
import java.util.Scanner;
public class Main {
    public static class Task5
    {
        public static void main(String[] args){
            int a,b,c;
            Scanner sc = new Scanner(System.in);
            System.out.println(" Введите n");
            System.out.print(" n = ");
            int n = sc.nextInt();
            if (n>=2 && n<=100) {
                a = 1;
                b = 1;
                System.out.print(a + " "+ b + " ");
                for (int i = 0; i<n-2; i++){
                    c = b;
                    b = a + b;
                    System.out.print(b + " ");
                    a = c;
                }
            }
            else{
                System.out.print(" Допустимые значения 2<=n<=100");
            }
        }
    }
}
