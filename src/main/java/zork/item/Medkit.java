package zork.item;

import java.io.Serializable;

public class Medkit extends Item implements Serializable {

    public int heal = 100;

    public Medkit() {
        super.name = "medkit";
        super.type = "edible";
        super.usage = "use";
        super.description = "Your medkit's actually a protein bar.\n" +
                "Use wisely! - there's only one 'medkit' provided.\n" +
                "This will restore you to full health in no time!";
    }

    public int getHeal() {
        return this.heal;
    }

}
