package zork.item;

import java.io.Serializable;

public class Gun extends Weapon implements Serializable {

    public Gun() {
        super.name = "gun";
        super.rounds = 7;
        super.damage = -40;
        super.usage = "attack with";
        super.type = "weapon";
        super.description = "A handy snub-nose revolver with "+ getRounds() +" rounds available. " +
                "Use wisely! - there will be no ammos lying around. " +
                "Deals an average of -20 in damage to foe";
    }
}
