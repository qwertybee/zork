package zork.item;

import java.io.Serializable;

public class Gun extends Weapon implements Serializable {

    public Gun() {
        super.name = "gun";
        super.rounds = 100;
        super.damage = -40;
        super.usage = "attack with";
        super.type = "weapon";
        super.description = "A handy snub-nose revolver with "+ getRounds() +" rounds available.\n" +
                "Use wisely! - there will be no ammos lying around.\n" +
                "Deals an average of -20 in damage to foe";
    }
}
