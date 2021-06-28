package zork.item;

import java.io.Serializable;

public class SapphireStone extends Item implements Serializable {

    public SapphireStone() {
        super.name = "sapphire stone";
        super.type = "stone";
        super.usage = "place";
        super.description = "A sapphire stone with wave-like luster";
    }

}
