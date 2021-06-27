package zork.item;

public class Knife extends Weapon{

    public Knife() {
        super.name = "Knife";
        super.type = "Weapon";
        super.usage = "Attack with";
        super.description = "A long-bladed knife - the machete. Deals an average of -10 damage to foe";
        super.damage = -20;
        super.rounds = Integer.MAX_VALUE;
    }

}
