
package com.mycompany.pottergame;
import com.mycompany.pottergame.Spells.OculusReparo;
import com.mycompany.pottergame.Wizards.HermioneGranger;
import com.mycompany.pottergame.Wizards.Wizard;

public class PotterGame {
    public static void main(String[] args) {
        
        Wizard Hermione = new HermioneGranger();
        Hermione.display();
        Hermione.performSpell(); 

        System.out.println("New Spell");

        Hermione.setSpellsUse(new OculusReparo()); 
        Hermione.performSpell();   
    }
}
