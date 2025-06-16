package org.example;

import java.math.BigInteger;
import java.util.*;


public class Task5plus {
    public static void main(String[] args) {
        Map<BigInteger,String> telephoneBook = new HashMap<>();
        telephoneBook.put(new BigInteger("89217255054"),"Сидоров Агафон Никанорович");
        telephoneBook.put(new BigInteger("89535720971"),"Петров Петр Петрович");
        telephoneBook.put(new BigInteger("89103315675"),"Иванов Иван Иванович");
        telephoneBook.put(new BigInteger("89297255382"),"Александров Алексей Николаевич");
        telephoneBook.put(new BigInteger("89535729876"),"Павлов Михаил Петрович");
        telephoneBook.put(new BigInteger("89123785603"),"Смирнов Илья Михайлович");
        List<Map.Entry<BigInteger,String>> list = new ArrayList<>(telephoneBook.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (int i=0; i<list.size(); i++ ){
            System.out.print(list.get(i).getKey()+" ");
            System.out.println(list.get(i).getValue());

        }
    }


}
