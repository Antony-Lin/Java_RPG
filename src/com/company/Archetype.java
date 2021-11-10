package com.company;


//Création d'une classe non statique
public class Archetype {

    private String name; // Création attributs privés pour le nom, les dégâts, points de vie et initiative
    private int damage;
    private int hp;
    private String initiative;

    public String getName() { //Création méthode publique qui récupère valeurs des attributs
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public int getHp() {
        return hp;
    }
    public String getInitiative() {
        return initiative;
    }
    public int hitCharacter(){
        return damage;
    }

     Archetype(String name, int damage,int hp,String initiative){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.initiative = initiative;
    }
     //Surchage de la méthode toString


    @Override
    public String toString() {
        return "Archetype{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", initiative='" + initiative + '\'' +
                '}';
    }

    public static void main(String args[]){
        Archetype d1 = new Archetype("rogue", 12, 13, "rogue");
        Archetype d2 = new Archetype("warrior", 12, 13, "warrior");
        Archetype d3 =  new Archetype("maje", 12, 13, "maje");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}





