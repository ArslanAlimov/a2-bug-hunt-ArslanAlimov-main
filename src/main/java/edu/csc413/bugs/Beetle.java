package edu.csc413.bugs;

/** Represents a Beetle, which is a type of Bug. */
public class Beetle extends Bug {
    //private String name;

    public Beetle(String name) {
        super(name, 6);
    }

    // TODO ERROR: This returns the instance variable stored in the Beetle class.
    // TODO ERROR: There's redundancy in having this method which is already inherited.

    /*
    Junk Method
    public String getName() {
    return name;
    }*/

    /** Some beetles can fly. */
    public boolean canFly() {
        return true;
    }

    public String specialTrait() {
        return "strong";
    }
}
