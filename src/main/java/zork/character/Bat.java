package zork.character;

public class Bat extends Monster {

    public Bat() {
        super.maxHealthPoints = 20;
        super.healthPoints = 20;
        super.damage = -5;
        super.name = "Bat";
        super.description = "Here to suck your blood, vampiristic ol' bat";
    }

}
