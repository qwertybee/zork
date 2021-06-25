package zork.character;

public class Mummy extends Monster {

    public Mummy() {
        super.maxHealthPoints = 30;
        super.healthPoints = 30;
        super.damage = -10;
        super.name = "Mummy";
        super.description = "Mummified corpse - no wonder the place reeks.";
    }

}
