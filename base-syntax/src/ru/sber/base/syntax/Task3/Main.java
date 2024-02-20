package ru.sber.base.syntax.Task3;
public class Main {
    public static class Task3 {
        public static void main(String[] args){
            for (int i=1; i<=6; i++){
                for (int j=1; j<=19; j++){
                    if (i%2!=0){
                        if (j%2!=0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if (j%2!=0){
                            System.out.print(" ");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
