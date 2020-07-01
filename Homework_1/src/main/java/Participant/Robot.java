package Participant;

import Barriers.Track;
import Barriers.Wall;

public class Robot implements Movable {

    private String name;

    public Robot(String name) {
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
        return "робота модели " + name;
    }
}
