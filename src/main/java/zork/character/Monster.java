package zork.character;

public class Monster {

    protected int maxHealthPoints;
    protected int healthPoints;
    protected int damage;
    protected String name;
    protected String description;

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
