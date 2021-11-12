package com.company;


<<<<<<< HEAD
//Création d'une classe non statique
public class Archetype extends Main{

    private static String name; // Création attributs privés pour le nom, les dégâts, points de vie et initiative
    private static int damage;
    private static int hp;
    private static int initiative;
    private static int shield;
    private static int magicDamage;
    private static int monsterdmg = 1;
    private static int monsterhp = 1000;
    private static int monsterinit = 0;


    public static String getName() { //Création méthode publique qui récupère valeurs des attributs
=======
//creation of a non-static class
public class Archetype {

    private String name; // Creation of private attributes for the name, damage, health points (hp) and initiative.
    private int damage;
    private int hp;
    private int initiative;
    private int shield;
    private int magicDamage;

    public String getName() { //creation of a public method which will get the value of the attributes.
>>>>>>> ce535b9a017f9730963ff93afd7b0e5594f668ef
        return name;
    }
    public static int getHp() {
        return hp;
    }
    public static int getDamage() {
        return damage;
    }
    public static int getInitiative() {
        return initiative;
    }
    public int hitCharacter(){
        return damage;
    }
<<<<<<< HEAD
    public static int getMonsterdmg(){
        return monsterdmg;
    }
    public static int getMonsterhp(){
        return monsterhp;
    }
    public static int getMonsterinit(){
        return monsterinit;
    }
    public static int protectWarrior(){
        return shield;
    }
    public static int damageIncrease(){
=======
    public int protectWarrior(){
        return shield;
    }
    public int damageIncrease(){
>>>>>>> ce535b9a017f9730963ff93afd7b0e5594f668ef
        return magicDamage;
    }

     public Archetype(String name, int damage, int hp, int initiative, int shield, int magicDamage){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.initiative = initiative;
        this.shield = shield;
        this.magicDamage = magicDamage;
    }
     //Overload of the toString method


    @Override
    public String toString() {
<<<<<<< HEAD
        if(shield >= 1) {
            return "Archetype " + "\n" +
                    "Name: " + name + "\n" +
                    "Damage: " + damage + "\n" +
                    "HP: " + hp + "\n" +
                    "Initiative:  " + initiative + "\n" +
                    "Shield: " + shield + "\n";
        }
        else if (magicDamage >=1) {
=======
        if (shield >= 1) {
>>>>>>> ce535b9a017f9730963ff93afd7b0e5594f668ef
            return "Name: " + name + "\n" +
                    "Damage: " + damage + "\n" +
                    "HP: " + hp + "\n" +
                    "Initiative:  " + initiative + "\n" +
<<<<<<< HEAD
                    "Magic Damage: " + magicDamage + "\n";
        }
        else {
            return "Name: " + name + "\n" +
                    "Damage: " + damage + "\n" +
                    "HP: " + hp + "\n" +
                    "Initiative:  " + initiative + "\n";
        }
    }

    public static void monster(){
        String name = "monster";
        System.out.println(name +"\n" + monsterdmg + "\n" + monsterhp + "\n" + monsterinit + "\n");
    }

    public static void getdmg(){
        hp = hp - monsterdmg;
        System.out.println(monsterdmg + " monster damage" );
        System.out.println(hp + " " + getName() + " hp");
    }

    public static void getdmgmonster(){
        monsterhp = monsterhp - (damage + magicDamage);
        magicDamage = magicDamage / 2;
        System.out.println(damage + magicDamage + " " + getName() + " damage");
        System.out.println(monsterhp + " monster hp");
=======
                    "Shield: " + shield + "\n";
        }
        else if (magicDamage >=1){
                return "Name: " + name + "\n" +
                        "Damage: " + damage + "\n" +
                        "HP: " + hp + "\n" +
                        "Initiative:  " + initiative + "\n" +
                        "Magic Damage: " + magicDamage + "\n";
            }
            else{
            return  "Name: " + name + "\n" +
                "Damage: " + damage + "\n" +
                "HP: " + hp + "\n" +
                "Initiative:  " + initiative + "\n";
        }
>>>>>>> ce535b9a017f9730963ff93afd7b0e5594f668ef
    }

    public static void main(String args[]){
    }
}





