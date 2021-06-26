package zork.item;

public class Gun extends Weapon {

    public int rounds;

    public Gun() {
        super.name = "Gun";
        this.rounds = 7;
        super.damage = -20;
        super.usage = "Attack with";
        super.type = "Weapon";
        super.description = "A handy snub-nose revolver with "+ this.rounds +" available. " +
                "Use wisely! - there will be no ammos lying around" +
                " in a temple in the middle of a jungle of all places." +
                "Deals -20 in damage to foe";
    }

}
