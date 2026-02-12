
package com.mycompany.pottergame.Wizards;
import com.mycompany.pottergame.Spells.Expelliarmus;

public class RonWeasley extends Wizard{

    public RonWeasley() {
        spellsUse = new Expelliarmus();  
    }
    public void display() {
        System.out.println("Ron showing his spells");
    }
}