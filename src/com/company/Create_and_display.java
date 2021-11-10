package com.company;

import java.util.ArrayList;
import java.util.List;
import Class.*;

public class Create_and_display extends Main {

    public static void main(String[] args) {
        Thief thief = new Thief();
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        List<Archetype> character = new ArrayList();
        character.add(thief);
        character.add(warrior);
        character.add(wizard);

        for (int name = 0; name < character.size(); name++){
            Archetype str = character.get(name);
            System.out.println(str);
        }
    }
}
