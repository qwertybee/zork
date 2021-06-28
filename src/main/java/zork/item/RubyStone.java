package zork.item;

import java.io.Serializable;

public class RubyStone extends Item implements Serializable {

    public RubyStone() {
        super.name = "ruby stone";
        super.type = "stone";
        super.usage = "place";
        super.description = "A red ruby with fire-like glow";
    }

}
