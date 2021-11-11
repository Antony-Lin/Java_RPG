package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Scanner nickname = new Scanner(System.in);
        //System.out.println("What's your nickname? Must be between 2 and 16 characters.");
        //String username = nickname.next();

        System.out.println("Hello! Welcome to our RPG game!\n" + "so wha' we doin' today?");
        menu();
    }

    static void player(){

    }


    static void retour_menu() { //Fonction qui va permettre au joueur de retourner au menu du jeu
        System.out.println("\nreturn to menu, write 10!");
        java.util.Scanner rt;
        rt = new Scanner(System.in);
        int retour = Integer.parseInt(rt.nextLine());
        if (retour == 10) {
            menu();
        }
        System.out.println("Nope! You gotta chose between 10\n");
        retour_menu();
    }


    public static void menu() {
        System.out.println("1. Let's play! :D\n" +
                "2. How to play? \n" +
                "3. Who are the playable characters? \n" +
                "4. I changed my mind, i don't want to play...");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {

            case "1":
                System.out.println("Aight then, let's do this!");
                Create_and_display.main(0);
                break;

            case "2":
                System.out.println("Honestly, there's not really a way to play... You choose both characters that gon' fight\n" +
                        "and the battle goes by its own, it's automatic, you don't have any control on any of the characters you've choosed.\n");
                System.out.println("YOU: Alright, thanks!\n");
                retour_menu();
                break;

            case "3":
                System.out.println("Currently, there's only 3 character which are:\n" +
                        "The Warrior\n" +
                        "The Mage\n" +
                        "And the Thief\n" +
                        "Each one of 'em as unique passive abilities!\n" +
                        "The Warrior got a shield that will block a certain amount of damage for the WHOLE match.\n" +
                        "The Mage can deal a BIG but like really big amount of damage on his first turns as he has two type damage which are: Magic and Normal damage.\n" +
                        "His damage is his normal damage AND magic damage together. His magic damage will decrease by 50% at each attack.\n" +
                        "The Thief has a chance of 25% to dodge opponent's attack and a 10% chance to deal 200% of damage.\n");
                System.out.println("Seems cool! Thanks.\n");
                retour_menu();
                break;

            case "4":
                System.out.println("It's okay man, have a great day! Take care.\n" +
                        "YOU: Thanks, you too!");
                System.out.println("Thanks.");
                System.exit(0);

            default:
                if (choice == "" || choice == " "){
                    System.out.println("Too lazy to say something? XD\n" +
                            "You can choose between 1 and 4\n");
                }
                else{
                    System.out.println("Nope! You gotta chose between 1 and 4 lol\n");
                }
                menu();
        }

    }
}