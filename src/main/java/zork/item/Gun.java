package zork.item;

public class Gun extends Weapon {

    public Gun() {
        super.name = "Gun";
        super.rounds = 7;
        super.damage = -40;
        super.usage = "Attack with";
        super.type = "Weapon";
        super.description = "A handy snub-nose revolver with "+ getRounds() +" rounds available. " +
                "Use wisely! - there will be no ammos lying around. " +
                "Deals an average of -20 in damage to foe";
    }
}
