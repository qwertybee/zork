package zork.item;

public class Medkit extends Item {

    public int heal = 100;

    public Medkit() {
        super.name = "Medkit";
        super.type = "Edible";
        super.usage = "Eat";
        super.description = "Your medkit's actually a protein bar topped with nuts." +
                "Use wisely! - there's only one medkit provided. " +
                "This will (still) restore you to full health in no time!";
    }

    public int getHeal() {
        return this.heal;
    }

}
