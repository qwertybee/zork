package zork.item;

import java.io.Serializable;

public class Item implements Serializable {

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUsage() {
        return usage;
    }

    public String getDescription() {
        return description;
    }

    public boolean isItem(String nameItem) {
        return this.name.equals(nameItem);
    }

    protected String name;
    protected String type;
    protected String usage;
    protected String description;

}
