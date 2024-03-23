package edu.csc413.bugs;

/** Represents a generic Bug. It is an abstract class, so users cannot instantiate a Bug directly. */
public abstract class Bug {
    // Instance variables: every bug has a name and a number of legs.
    private String name;
    private int numLegs;

    /** Creates a Bug with the provided name and number of legs. */
    public Bug(String name, int numLegs) {
        // TODO ERROR: assignment for both instance variables written incorrectly
        this.name = name; // fixed name = this.name
        this.numLegs = numLegs; //fixed numlegs = this.numlegs
    }

    /** Returns the Bug's name. */
    public String getName() {
        return name;
    }

    /** Returns the number of legs this Bug has. */
    public int getNumLegs() {
        return numLegs;
    }

    /** Returns true if the Bug can fly, and false otherwise. May be overridden for a Bug type that can fly. */
    public boolean canFly() {
        return false;
    }

    /**
     * Returns a String describing this Bug's special trait. It varies based on the specific type of Bug, so it is an
     * abstract method.
     */
    public abstract String specialTrait();
}
