package Task1;
import java.util.Scanner;
import java.lang.Math;
import java.util.UUID;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество телефонов");
        int n = in.nextInt();
        System.out.println("Введите имя");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Номер какого телефона из массива вы хотите знать");
        int i1 =in.nextInt();
        System.out.println("Информацию о каком номере телефона из массива вы хотите знать");
        int i2 =in.nextInt();
        Phone[]a = new Phone[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Phone();
            a[i].number = "8911" + Math.round(Math.random() * 10000000);
            a[i].model = UUID.randomUUID().toString();
            a[i].weight = Math.random() * 100;
        }
        Phone t = new Phone();

        //работа метода receiveCall
        System.out.println("Работа метода receiveCall");
        t.receiveCall(name);
        System.out.println();

        //работа метода getNumber
        System.out.println("Работа метода getNumber");
        System.out.println(a[i1].getNumber());
        System.out.println();

        //работа метода sendMessage
        System.out.println("Раббота метода sendMessage");
        t.sendMessage(a);
        System.out.println();

        //работа метода toString1
        System.out.println("Работа метода toString1");
        a[i2].toString1();
        System.out.println();
    }
}
