package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

public class Imp extends Monster{

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        str = super.getAttribute(this.str, maxStr);
        def = super.getAttribute(this.def, maxDef);
        agi = super.getAttribute(this.agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Imp has : " + super.toString();
    }
}
