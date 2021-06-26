package zork.character;

import zork.item.Item;

public class Mummy extends Monster {

    private Item stone;

    public Mummy() {
        super.maxHealthPoints = 30;
        super.healthPoints = 30;
        super.damage = -10;
        super.name = "Mummy";
        super.description = "Mummified corpse - no wonder the place reeks.";
    }

    public Item getStone() {
        return stone;
    }

    public void setStone(Item stone) {
        this.stone = stone;
    }

}
