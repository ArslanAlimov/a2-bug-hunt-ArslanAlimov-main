package edu.csc413.bugs;

/** Represents a Spider, which is a type of Bug (sorta technically not, but this isn't a Biology class). */
public class Spider extends Bug {
    public Spider(String name) {
        // TODO ERROR: Wrong number of legs! Should be 8.
        super(name, 8);// Fixed super(name, 10)
    }

    public String specialTrait() {
        return "webs";
    }
}
