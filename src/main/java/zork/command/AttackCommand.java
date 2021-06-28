package zork.command;

import zork.Game;
import zork.character.Monster;
import zork.character.Player;
import zork.item.Item;
import zork.item.Weapon;

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
        String weaponKey = args.get(0).trim().toLowerCase();
        Weapon weapon = (Weapon) game.getPlayer().getInventory().get(weaponKey);
        Monster monster = game.getCurrentArea().getMonster();
        Player player = game.getPlayer();
        if (weapon != null && (weapon.getRounds() != 0)) {
            if (monster != null) {
                System.out.println(player.getDamage());
                System.out.println("Monster current HP"+monster.getHealthPoints());
                int newMonsterHealthPoints = (int) (monster.getHealthPoints()+weapon.getDamage()+player.getDamage());
                weapon.decreaseRounds();
                if (newMonsterHealthPoints <= 0) {
                    Item stone = game.getCurrentArea().getMonster().getStone();
                    if (stone != null) {
                        // if monster have stone, when dead, drop the stone.
                        String stoneName = stone.getName();
                        game.getCurrentArea().getDroppedItems().put(stoneName, stone);
                        System.out.println(stoneName+" dropped.");
                    }
                    System.out.println();
                    System.out.println("Monster killed.");
                    game.getCurrentArea().spawnMonster(null);
                    int currentAttackPoints = game.getPlayer().getDamage();
                    game.getPlayer().setDamage(currentAttackPoints-5);// attack points increase from killing monster
                }
                else {
                    monster.setHealthPoints(newMonsterHealthPoints);
                    int newPlayerHealthPoints = (int) (player.getHealthPoints() + monster.getDamage());
                    if (newPlayerHealthPoints <= 0) {
                        System.out.println();
                        System.out.println("You were killed by the monster.");
                        System.out.println("GAME OVER");
                        game.run(); // back to welcome page
                        System.out.println();
                    }
                    else {
                        player.setHealthPoints(newPlayerHealthPoints);
                        System.out.println();
                        System.out.println("Monster attacked you back!");
                    }
                }
            }
            else {
                System.out.println();
                System.out.println("No monster in the area.");
            }
        }
        else if (weapon != null && weapon.getRounds() <= 0) {
            System.out.println();
            System.out.println("Out of ammo. Attack with other weapon(s)");
        }
        else {
            System.out.println();
            System.out.println("'attack with' what? Please insert available weapon in inventory.");
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
