package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Class.*;

public class Create_and_display extends Main {



    public static void main(int args) {

        System.out.println("Select your fighter:\n" +
                "1. Thief\n" +
                "2. Warrior\n" +
                "3. Wizard");
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

            case "1":
                System.out.println("Do you want to play as the Thief?\n" +
                        " Y: Yes, N: No.");
                Scanner perso = new Scanner(System.in);
                String selectAgain = perso.nextLine();
                if (selectAgain == "Y"){
                    System.out.println(thief);
                }
                else if (select == "N") {
                    main(0);
                }
                else{
                    System.out.println("Imma act like u said no, aight?");
                    main(0);
                }

                break;

            case "2":
                System.out.println("Do you want to play as the Warrior?\n" +
                        " Y: Yes, N: No.");
                Scanner perso2 = new Scanner(System.in);
                String selectAgain2 = perso2.nextLine();

                if (selectAgain2 == "Y"){
                    System.out.println(warrior);
                }
                else if (selectAgain2 == "N") {
                    main(0);
                }
                else{
                    System.out.println("Imma act like u said no, aight?");
                    main(0);
                }
                break;

            case "3":
                System.out.println("Do you want to play as the Wizard?\n" +
                        " Y: Yes, N: No.");
                Scanner perso3 = new Scanner(System.in);
                String selectAgain3 = perso3.nextLine();

                if (selectAgain3 == "Y"){
                    System.out.println(wizard);
                }
                else if (selectAgain3 == "N") {
                    main(0);
                }
                else{
                    System.out.println("Imma act like u said no, aight?");
                    main(0);
                }
                break;

            default:
                System.out.println("I'm boutta break everything... U gotta choose between: 1; 2 or 3. You missclicked... Right? xD\n" +
                        "Anyway...\n");
                main(0);
        }
    }
}


    /*for (int name = 0; name < character.size(); name++) {
        Archetype str = character.get(name);
        System.out.println(str);
        }*/