package zork.item;

import java.io.Serializable;

public class Knife extends Weapon implements Serializable {

    public Knife() {
        super.name = "knife";
        super.type = "weapon";
        super.usage = "attack with";
        super.description = "A long-bladed knife - the machete.\n"
                +"Deals an average of -10 damage to foe";
        super.damage = -20;
        super.rounds = Integer.MAX_VALUE;
    }

}
