package com.company;


//creation of a non-static class
public class Archetype {

    private String name; // Creation of private attributes for the name, damage, health points (hp) and initiative.
    private int damage;
    private int hp;
    private int initiative;
    private int shield;
    private int magicDamage;

    public String getName() { //creation of a public method which will get the value of the attributes.
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public int getHp() {
        return hp;
    }
    public int getInitiative() {
        return initiative;
    }
    public int hitCharacter(){
        return damage;
    }
    public int protectWarrior(){
        return shield;
    }
    public int damageIncrease(){
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
        if (shield >= 1) {
            return "Name: " + name + "\n" +
                    "Damage: " + damage + "\n" +
                    "HP: " + hp + "\n" +
                    "Initiative:  " + initiative + "\n" +
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
    }

    public static void main(String args[]){
    }
}





