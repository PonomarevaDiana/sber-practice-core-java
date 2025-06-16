package org.example;

import java.io.*;

public class Task3 {


    public static void main(String[] args) throws Exception {
        class Weapon implements Serializable {
            private final String name;

            public Weapon(String name) {
                this.name = name;
            }

        }
        class Armor implements Serializable {
            private final String name;

            public Armor(String name) {
                this.name = name;
            }



        }
        class Hero implements Serializable {

            private String name = "рыцарь";
            private int lvl = 10;
            private Weapon weapon = new Weapon("меч");
            private Armor armor = new Armor("латы");
            public Hero(String name,
                        int lvl,
                        Weapon weapon,
                        Armor armor) {
                this.name = name;
                this.lvl = lvl;
                this.weapon = weapon;
                this.armor = armor;
            }
            public Hero() {
            }

        }
        // Создаем объект класса Hero
        Hero hero = new Hero();
        hero.name = "солдат";
        hero.lvl = 5;
        hero.weapon = new Weapon("ружье");
        hero.armor = new Armor("форма");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hero.txt"));
        oos.writeObject(hero);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hero.txt"));
        Hero s = (Hero) ois.readObject();
        System.out.println(s.name + "\n" + s.lvl + "\n" + s.weapon.name + "\n" + s.armor.name);

    }


}

