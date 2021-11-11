package com.company;


//Création d'une classe non statique
public class Archetype {

    private String name; // Création attributs privés pour le nom, les dégâts, points de vie et initiative
    private int damage;
    private int hp;
    private int initiative;

    public String getName() { //Création méthode publique qui récupère valeurs des attributs
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

     public Archetype(String name, int damage, int hp, int initiative){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.initiative = initiative;
    }
     //Surchage de la méthode toString


    @Override
    public String toString() {
        return "Archetype " + "\n" +
                "name = " + name + "\n" +
                "damage = " + damage + "\n" +
                "hp = " + hp + "\n" +
                "initiative =  " + initiative + "\n";
    }

    public static void main(String args[]){
    }
}





