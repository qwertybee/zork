package zork.item;

import java.io.Serializable;

public class Book extends Item implements Serializable {

    public Book() {
        super.name = "book";
        super.type = "readable";
        super.usage = "use";
        super.description = "The mythical place - the Valley of the Kings - is said to hold\n"
                +"secret that lies in the tomb of the palace. Its mural wall \n"
                +"depicts the 3 everseeing 'stone' eyes of Egyptian Gods.\n"
        +"After thousands of years however, it went missing and is believed to have\n"
        +"been taken hold by creatures living in the palace. There's only one way to find out!";
    }

}
