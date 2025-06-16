package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

import static java.lang.System.exit;


public class Store {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        new Thread(new ShopAssistant(shelf)).start();
        new Thread(new Customer(shelf)).start();

    }
}


class Shelf {
    private static final Lock lock = new ReentrantLock();
    private int count;

    Shelf() {
        count = 0;
    }

    public synchronized void put() throws InterruptedException {
        if (count < 5) {
            count++;
            notify();
            System.out.println("Продавец положил товар. Теперь на полке " + count + " товаров");
        } else
            wait();
    }

    public synchronized void get() throws InterruptedException {
        if (count > 0) {
            count--;
            notify();
            System.out.println("Покупатель забрал товар. Теперь на полке " + count + " товаров");
        } else
            wait();
    }
}

class Customer implements Runnable {
    private Shelf shelf;

    public Customer(Shelf shelf) {
        this.shelf = shelf;
    }

    @Override
    public void run() {
        int n = 0;
        boolean t = true;
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            try {
                n = sc1.nextInt();
            } catch (Exception e) {
                t = false;
                System.out.println("Неизвестная команда");
                exit(0);
            }
            if (t) {
                for (int i = 0; i < n; i++) {
                    try {
                        shelf.get();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class ShopAssistant implements Runnable {
    private Shelf shelf;

    public ShopAssistant(Shelf shelf) {
        this.shelf = shelf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                shelf.put();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
