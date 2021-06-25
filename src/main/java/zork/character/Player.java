package zork.character;

import zork.item.Gun;
import zork.item.Item;
import zork.item.Knife;
import zork.item.ProteinBar;

import java.util.HashMap;

public class Player {

    private int healthPoints;
    private int maxHealthPoints;
    private String name;
    private HashMap<String, Item> inventory;

    public Player() {
        healthPoints = 100;
        maxHealthPoints = 100;
        name = "Player";
        inventory = new HashMap<>();
        inventory.put("Gun", new Gun());
        inventory.put("Knife", new Knife());
        inventory.put("Protein bar", new ProteinBar());
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public String getName() {
        return name;
    }

    public Item getInventory(String itemName) {
        return inventory.get(itemName);
    }

    public void setInventory(String itemName, Item item) {
        inventory.put(itemName, item);
    }

    public void dropInventory(String itemName) {
        inventory.remove(itemName);
    }

}
