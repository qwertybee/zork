package zork.item;

public class Medkit extends Item {

    public int heal = 100;

    public Medkit() {
        super.name = "Protein Bar";
        super.type = "Edible";
        super.usage = "Eat";
        super.description = "A chocolate, caramel-covered protein bar topped with nuts." +
                "Unfortunately melted in the Egyptian sun..." +
                "this will (still) restore you to full health in no time!";
    }

}
