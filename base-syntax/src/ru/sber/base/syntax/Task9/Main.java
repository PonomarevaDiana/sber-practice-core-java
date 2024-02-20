package ru.sber.base.syntax.Task9;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static class Task9{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            char simbol = (char)(r.nextInt(26) + 'A');
            System.out.print(simbol);
            char as = sc.next().charAt(0);
            do {
                if (((int)('A')<=(int)as && (int)as<=(int)('Z')) || ((int)('a')<=(int)as && (int)as<=(int)('z'))) {
                    if ((int)as>=(int)('a')){
                        as = (char) (as + (int)('A')-(int)('a'));
                    }
                    if ((int)as == (int)simbol) {
                        System.out.print("Верно!");
                        break;
                    }
                    else if ((int)as<(int)simbol){
                        System.out.print("Ищи букву, которая после нее в алфавите");
                    }
                    else{
                        System.out.print("Ищи букву, которая до нее в алфавите");
                    }
                }
                else {
                    System.out.print("Введен недопустимый символ");
                }
                as = sc.next().charAt(0);
            } while (true);
        }
    }
}