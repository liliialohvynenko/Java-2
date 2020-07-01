package Participant;

import Barriers.Track;
import Barriers.Wall;
import Participant.Movable;

public class Human implements Movable {

    private String name;

    public Human (String name) {
        this.name = name;

    }

    @Override
    public boolean walk(Track track) {
        return true;
    }

    @Override
    public boolean jump(Wall wall) {
        return true;
    }

    @Override
    public String toString() {
        return "человека по имени " + name;
    }
}
