package zork.character;

import zork.item.*;

import java.io.Serializable;
import java.util.HashMap;

public class Player implements Serializable {

    private int healthPoints;
    private int maxHealthPoints;
    private String name;
    private HashMap<String, Item> inventory;
    private int damage;

    public Player() {
        damage = 0;
        healthPoints = 100;
        maxHealthPoints = 100;
        name = "player";
        inventory = new HashMap<>();
        inventory.put("gun", new Gun());
        inventory.put("knife", new Knife());
        inventory.put("medkit", new Medkit());
        inventory.put("book", new Book());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int newDamage) {
        this.damage = newDamage;// plus 5 in damage everytime monster's killed
    }

    public void setHealthPoints(int newHealthPoints) {
        if (newHealthPoints<=100) {
            this.healthPoints = newHealthPoints;
        }
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getMaxHealthPoints() {
        return this.maxHealthPoints;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Item> getInventory() {
        return inventory;
    }

}
