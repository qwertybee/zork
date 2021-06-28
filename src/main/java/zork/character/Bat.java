package zork.character;

import java.io.Serializable;

public class Bat extends Monster implements Serializable {

    public Bat() {
        super.maxHealthPoints = 20;
        super.healthPoints = 20;
        super.damage = -20;
        super.name = "bat";
        super.description = "Here to suck your blood, vampiristic ol' bat";
    }

}
