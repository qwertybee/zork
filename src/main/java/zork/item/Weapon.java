package zork.item;

import java.io.Serializable;
import java.util.Random;

public class Weapon extends Item implements Serializable {

    protected Random random = new Random();
    protected int damage;
    protected Integer rounds;

    public float getDamage() {
        return damage*random.nextFloat();
    }

    public int getRounds() {
        return this.rounds;
    }

    public void decreaseRounds() {
        this.rounds = this.rounds-1;
    }

}
