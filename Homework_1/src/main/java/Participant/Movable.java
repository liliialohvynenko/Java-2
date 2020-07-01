package Participant;

import Barriers.Track;
import Barriers.Wall;

public interface Movable {

    boolean walk(Track track);

    boolean jump(Wall wall);

}
