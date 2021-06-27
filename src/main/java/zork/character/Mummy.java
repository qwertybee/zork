package zork.character;

import zork.item.Item;

public class Mummy extends Monster {


    public Mummy() {
        super.maxHealthPoints = 30;
        super.healthPoints = 30;
        super.damage = -40;
        super.name = "Mummy";
        super.description = "Mummified corpse - no wonder the place reeks.";
    }

}
