
package com.mycompany.pottergame.Wizards;
import com.mycompany.pottergame.Spells.WingardiumLeviosa;

public class HermioneGranger extends Wizard{

    public HermioneGranger() {
        spellsUse = new WingardiumLeviosa();  
    }
    public void display() {
        System.out.println("Hermione showing his spells");
    }
}
