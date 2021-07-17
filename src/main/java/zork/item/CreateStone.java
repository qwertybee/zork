package zork.item;

import zork.Game;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

public class CreateStone implements Serializable {

    private static final Random RANDOM = new Random();
    HashMap<String, Item> inventory;
    Item stoneLeft;

    public Item createStone(Game game) {
        inventory = game.getPlayer().getInventory();
        if (!haveStones(inventory)) {
            double generateStone = RANDOM.nextFloat();
            if (generateStone >= 0.5) {
                return stoneLeft;
            }
        }
        return null;
    }

    public boolean haveStones(HashMap<String, Item> storage) {
        if (storage.get("ruby stone") == null) {
            stoneLeft = new RubyStone();
            return false;
        }
        if (storage.get("sapphire stone") == null) {
            stoneLeft = new SapphireStone();
            return false;
        }
        if (storage.get("emerald stone") == null) {
            stoneLeft = new EmeraldStone();
            return false;
        }
        stoneLeft = null;
        return true;
    }

}
