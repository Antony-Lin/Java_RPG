package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Class.*;

public class Create_and_display extends Main {



    public static void main(int args) {

        System.out.println("(Choose between 1 and 3)\nSelect your fighter:\n" +
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
                        "Y: Yes, N: No.");
                Scanner character1 = new Scanner(System.in);
                String selectAgain = character1.nextLine();
                if (selectAgain.equals("Y") || selectAgain.equals("y")){
                    System.out.println(thief);
                    System.out.println("Let's goooo!!\n");
                }
                else if (selectAgain.equals("N") || selectAgain.equals("n")) {
                    main(0);
                }
                else{
                    System.out.println("Imma act like u said no, aight?\n");
                    main(0);
                }

                break;

            case "2":
                System.out.println("Do you want to play as the Warrior?\n" +
                        "Y: Yes, N: No.");
                Scanner character2 = new Scanner(System.in);
                String selectAgain2 = character2.nextLine();

                if (selectAgain2.equals("Y") || selectAgain2.equals("y")){
                    System.out.println(warrior);
                    System.out.println("Let's goooo!!\n");
                }
                else if (selectAgain2.equals("N") || selectAgain2.equals("n")) {
                    main(0);
                }
                else{
                    System.out.println("Imma act like u said no, aight?\n");
                    main(0);
                }
                break;

            case "3":
                System.out.println("Do you want to play as the Wizard?\n" +
                        "Y: Yes, N: No.");
                Scanner character3 = new Scanner(System.in);
                String selectAgain3 = character3.nextLine();

                if (selectAgain3.equals("Y") || selectAgain3.equals("y")){
                    System.out.println(wizard);
                    System.out.println("Let's goooo!!\n");
                }
                else if (selectAgain3.equals("N") || selectAgain3.equals("n")) {
                    main(0);
                }
                else{
                    System.out.println("Imma act like u said no, aight?\n");
                    main(0);
                }
                break;

            default:
                if (select.equals("") || select.equals(" ")) {
                    System.out.println("Bro... Choose between 1 and 3, it's ez, right? xD\n");
                    main(0);
                }
                else if (select.equals("and") || select.equals("And") || select.equals("AND") || select.equals("ANd") || select.equals("aNd") || select.equals("AnD") || select.equals("aND") || select.equals("anD")){
                    System.out.println("Sir... 'and' still ain't an option xd\n");
                    main(0);
                }
                else {
                    System.out.println("I'm boutta break everything... U gotta choose between: 1 and 3. You missclicked... Right? xD\n" +
                            "Anyway...\n");
                    main(0);
                }
        }
    }
}


    /*for (int name = 0; name < character.size(); name++) {
        Archetype str = character.get(name);
        System.out.println(str);
        }*/