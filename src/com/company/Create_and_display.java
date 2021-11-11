package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Class.*;

public class Create_and_display extends Main {



    public static void main(int args) {

        System.out.println("select your class : thief - warrior - wizard");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();

        Warrior warrior = new Warrior();
        Thief thief = new Thief();
        Wizard wizard = new Wizard();

        List<Archetype> character = new ArrayList();
        character.add(thief);
        character.add(warrior);
        character.add(wizard);

        switch(select) {

            case "thief":
                System.out.println(thief);
                break;

            case "warrior":
                System.out.println(warrior);
                break;

            case "wizard":
                System.out.println(wizard);
                break;

            default:
                main(0);
        }
    }
}


    /*for (int name = 0; name < character.size(); name++) {
        Archetype str = character.get(name);
        System.out.println(str);
        }*/