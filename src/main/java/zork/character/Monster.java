package zork.character;

import zork.item.Item;

import java.io.Serializable;
import java.util.Random;

public class Monster implements Serializable {

    protected int maxHealthPoints;
    protected int healthPoints;
    protected int damage;
    protected String name;
    protected String description;
    protected Item stone;
    protected Random random = new Random();

    public void setHealthPoints(int newHealthPoints) {
        this.healthPoints = newHealthPoints;
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

    public boolean isMonster(String nameMonster) {
        return this.name.equals(nameMonster);
    }

}
