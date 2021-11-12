package com.company;
import java.util.Scanner;
import com.company.Archetype;

public class Main {

    public static void main(String[] args) {
        //Scanner nickname = new Scanner(System.in);
        //System.out.println("What's your nickname? Must be between 2 and 16 characters.");
        //String username = nickname.next();

        System.out.println("Hello! Welcome to our RPG game!\n" + "so wha' we doin' today?");
        menu();
    }


    static void retour_menu() { //function that'll allow the user to choose in the menus with 1, 2, 3 and 4.
        System.out.println("if u wanna return to the menu, tap 0 and enter!");
        Scanner comeBack = new Scanner(System.in);
        String returnToMenu = comeBack.nextLine();
        String cutUserInput = returnToMenu.substring(0, 1);

        if (returnToMenu.equals("0")){
            menu();
        }
        else if (returnToMenu.length()>1){
            returnToMenu = cutUserInput;
            System.out.println("Dude... There's only one number to enter and u still said '" + returnToMenu + "' (yeah cutted it out cuz it was too frickin' long \n" +
                    "(didn't said the other 'F' word cuz family friendly LETS GOOOOO)). Anyway, say 0 next time :/\n");
            retour_menu();
        }
        else{
            System.out.println("Dude... There's only one number to enter and u still said '" + returnToMenu + "' Say 0 next time :/\n");
            retour_menu();
        }
    }



    public static void menu() {
        System.out.println("1. Let's play! :D\n" +
                "2. How to play? \n" +
                "3. Who are the playable characters? \n" +
                "4. I changed my mind, i don't want to play...");

        boolean fight = false;

        Scanner choose = new Scanner(System.in);
        String choice = choose.nextLine();

        switch (choice) {

            case "1":
                System.out.println("Aight then, let's do this!");
                Create_and_display.Create();
                while (fight != true){
                    if(Archetype.getHp() > 0 && Archetype.getMonsterhp() > 0) {
                        System.out.println(Archetype.getName());
                        Archetype.getdmg();
                        if (Archetype.getMonsterhp() > 0 && Archetype.getHp() > 0) {
                            System.out.println("monster");
                            Archetype.getdmgmonster();
                            System.out.println("\n");
                        }
                        else{
                            fight = true;
                                System.out.println("you lose");
                            }
                    }
                    else{
                        fight = true;
                            System.out.println("you win");
                        }
                    }
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
                System.out.println("YOU: Seems cool! Thanks :)\n");
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
                else if (choice.equals("and") || choice.equals("And") || choice.equals("AND") || choice.equals("ANd") || choice.equals("aNd") || choice.equals("AnD") || choice.equals("aND") || choice.equals("anD")){
                    System.out.println("LMAO 'and' isn't an option, but good joke \uD83D\uDC80 \n");
                }
                else{
                    System.out.println("Nope! You gotta chose between 1 and 4 lol\n");
                }
                menu();
        }

    }
}