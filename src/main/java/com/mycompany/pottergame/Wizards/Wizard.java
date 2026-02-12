/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pottergame.Wizards;
import com.mycompany.pottergame.Spells.SpellsUse;

public abstract class Wizard {
    protected SpellsUse spellsUse;
    public void performSpell(){
        spellsUse.spell();
    }

  
    public void setSpellsUse(SpellsUse su){
        this.spellsUse = su;
    }
    public abstract void display();
}


