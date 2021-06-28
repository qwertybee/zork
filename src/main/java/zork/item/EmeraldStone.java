package zork.item;

import java.io.Serializable;

public class EmeraldStone extends Item implements Serializable {

    public EmeraldStone() {
        super.name = "emerald stone";
        super.type = "stone";
        super.usage = "place";
        super.description = "A green emerald with foresty hue";
    }

}
