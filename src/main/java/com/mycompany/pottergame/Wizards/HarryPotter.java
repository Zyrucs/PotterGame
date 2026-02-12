
package com.mycompany.pottergame.Wizards;
import com.mycompany.pottergame.Spells.ExpectoPatronum;

public class HarryPotter extends Wizard{

    public HarryPotter() {
        spellsUse = new ExpectoPatronum();  
    }
    public void display() {
        System.out.println("Harry showing his spells");
    }
}