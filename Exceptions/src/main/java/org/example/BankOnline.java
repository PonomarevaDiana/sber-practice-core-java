package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankOnline {
    public static void send(String cardNumber, Double money) {
        System.out.println("Номер карты: " + cardNumber + " Сумма перевода: " + money);
    }

    static class BankOnlineException extends Exception {

    }

    static class InvalidСardNumberException extends BankOnlineException {
        public String toString() {
            return "Неправильный номер карты";
        }
    }

    static class BlockedСardNumberException extends BankOnlineException {
        public String toString() {
            return "Перевод на заблокированную карту";
        }
    }

    static class NegativeTransferAmountException extends BankOnlineException {
        public String toString() {
            return "Отрицательная сумма перевода";
        }

    }

    static class OutOfLimitTransferException extends BankOnlineException {
        public String toString() {
            return "Превышен лимит суммы перевода";
        }

    }

    static class MyNullPointerException extends BankOnlineException {

    }

    //проверка на валидность
    static boolean isValid(String s) {
        Pattern sPattern = Pattern.compile("([2-6]([0-9]{3}) ?)(([0-9]{4} ?){3})");
        Matcher sMatcher = sPattern.matcher(s);
        if (sMatcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //String cardNumber = "6475488897657458";
        String cardNumber = "1111111111111119";
        Double money = 456.0;
        //Double money = null;
        try {
            if (cardNumber != null) {
                Boolean t = true;
                for (int i = cardNumber.length() - 1; i >= 0; i--) {
                    int d = cardNumber.charAt(i);
                    if (d < 48 || d > 57) {
                        t = false;
                    }
                }
                if ((cardNumber.length() == 16 && t == true && isValid(cardNumber)) != true) {
                    throw new InvalidСardNumberException();
                }
                BufferedReader reader = new BufferedReader(new FileReader("Blocked.txt"));
                Boolean t1 = true;
                String line = " ";
                do {
                    line = reader.readLine();
                    if (line != null) {
                        if (line.equals(cardNumber)) {
                            t1 = false;
                        }
                    }
                } while (line != null);
                if (t1 == false) {
                    throw new BlockedСardNumberException();
                }
                if (money < 0) {
                    throw new NegativeTransferAmountException();
                }
                if (money > 50000) {
                    throw new OutOfLimitTransferException();
                }
            }
            if (cardNumber == null || money == null) {
                throw new MyNullPointerException();
            }
            send(cardNumber, money);
        } catch (InvalidСardNumberException exp) {
            System.out.println(exp);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BlockedСardNumberException exp) {
            System.out.println(exp);
        } catch (NegativeTransferAmountException exp) {
            System.out.println(exp);
        } catch (OutOfLimitTransferException exp) {
            System.out.println(exp);
        } catch (MyNullPointerException exp) {
            throw new RuntimeException(exp);
        }
    }
}
