package Participant;

import Barriers.Track;
import Barriers.Wall;
import Participant.Movable;

public class Cat implements Movable {

    private String name;

    public Cat(String name) {
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
        return "кота по кличке " + name;
    }
}
