package zork.command;

import zork.Game;
import zork.character.Monster;
import zork.character.Player;
import zork.item.Item;
import zork.item.Weapon;

import java.util.HashMap;
import java.util.List;

public class AttackCommand implements Command {
    @Override
    public void description() {
        System.out.println("Input usage: > attack with [insert weapon name]");
        System.out.println("Description: Attacks foe with said weapon from inventory.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String weaponKey = args.get(0);
        Weapon weapon = (Weapon) game.getPlayer().getInventory().get(weaponKey);
        Monster monster = game.getCurrentArea().getMonster();
        if (weapon!=null) {
            if (monster!=null) {
                int newHealthPoints = monster.getHealthPoints()+weapon.getDamage();
                if (newHealthPoints <= 0) {
                    game.getCurrentArea().spawnMonster(null);
                }
                else {
                    monster.setHealthPoints(newHealthPoints);
                }
            }
            else {
                System.out.println("No monster in the area.");
            }
        }
        else {
            System.out.println("'attack with' what? Please insert available weapon.");
            System.out.println("Type 'help' for commands and its usage.");
        }
    }

    @Override
    public String getCommand() {
        return "attack with";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
