package zork.character;

import zork.Game;
import zork.item.CreateStone;
import zork.item.Item;
import zork.item.RubyStone;

import java.util.Random;

public class CreateMonster {

    private static final Random RANDOM = new Random();

    public Monster createMonster(Game game) {

        double generateMonster = RANDOM.nextFloat();
        Item stone = game.getCreateStone().createStone(game);

        if (generateMonster >= 0.6) { // prob of spawning when going to new room
            Mummy mummy = new Mummy();
            if (stone != null)
                mummy.setStone(stone);
            return mummy;
        }
        else if (generateMonster >= 0.5) {
            return new Bat();
        }
        else {
            return null;
        }

    }

}
