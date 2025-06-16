package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static class Pair<String, Integer> {
        String key;
        Integer value;

        public <String, Integer> Pair() {
        }

        ;

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;

        }

        public void setKey(String key) {
            this.key = key;

        }

        public void setValue(Integer value) {
            this.value = value;

        }

        public java.lang.String toString(boolean t) {
            if (t == true) {
                System.out.print(key + "=" + value + " ");
            } else
                System.out.print(value + "=" + key + " ");
            return null;
        }
    }

    public static void main(String[] args) {
        List<String> month = new ArrayList<String>();
        month.add("Январь");
        month.add("Февраль");
        month.add("Март");
        month.add("Апрель");
        month.add("Май");
        month.add("Июнь");
        month.add("Июль");
        month.add("Август");
        month.add("Сентябрь");
        month.add("Октябрь");
        month.add("Ноябрь");
        month.add("Декабрь");

        List<Integer> dayMonth = new ArrayList<Integer>();
        dayMonth.add(31);
        dayMonth.add(28);
        dayMonth.add(31);
        dayMonth.add(30);
        dayMonth.add(31);
        dayMonth.add(30);
        dayMonth.add(31);
        dayMonth.add(31);
        dayMonth.add(30);
        dayMonth.add(31);
        dayMonth.add(30);
        dayMonth.add(31);

        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Pair<String, Integer> p = new Pair<>();
            p.setKey(month.get(i));
            p.setValue(dayMonth.get(i));
            list.add(p);
            list.get(i).toString(true);
        }

        List<Pair> list1 = new ArrayList<>();
        List<String> countries = new ArrayList<String>();
        countries.add("Россия");
        countries.add("США");
        countries.add("Китай");
        countries.add("Италия");
        countries.add("Франция");

        List<Integer> codes = new ArrayList<Integer>();
        codes.add(7);
        codes.add(1);
        codes.add(86);
        codes.add(39);
        codes.add(33);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            Pair<String, Integer> p = new Pair<>();
            p.setKey(countries.get(i));
            p.setValue(codes.get(i));
            list1.add(p);
            list1.get(i).toString(false);
        }
    }
}