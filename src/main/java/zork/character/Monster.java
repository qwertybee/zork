package zork.character;

import zork.item.Item;

import java.util.Random;

public class Monster {

    protected int maxHealthPoints;
    protected int healthPoints;
    protected int damage;
    protected String name;
    protected String description;
    protected Item stone;
    protected Random random = new Random();

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public float getDamage() {
        return damage*random.nextFloat();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Item getStone() {
        return stone;
    }

    public void setStone(Item stone) {
        this.stone = stone;
    }

}
