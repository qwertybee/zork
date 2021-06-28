package zork.character;

import zork.item.Item;

import java.io.Serializable;

public class Mummy extends Monster implements Serializable {

    public Mummy() {
        super.maxHealthPoints = 30;
        super.healthPoints = 30;
        super.damage = -40;
        super.name = "mummy";
        super.description = "Mummified corpse - no wonder the place reeks.";
    }

}
