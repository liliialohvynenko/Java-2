import Barriers.Barrier;
import Barriers.Track;
import Barriers.Wall;
import Participant.Cat;
import Participant.Human;
import Participant.Movable;
import Participant.Robot;

import java.awt.datatransfer.SystemFlavorMap;

public class Race {

    public static void main(String[] args) {

        Movable[] participants = {
                new Cat("Мурзик"),
                new Human("Олег"),
                new Robot("2000"),
                new Cat("Муся"),
                new Human("Алёна"),
                new Robot("х5000"),

        };

        Barrier[] barriers = {
                new Wall(),
                new Track(),
        };


        for (Movable participant : participants) {
            for (int i = 0; i < barriers.length; i++) {
                if (barriers[i] instanceof Wall) {

                    if (participant.jump((Wall) barriers[i])) {
                        System.out.println("У " + participant  + " получилось перепрыгнуть стену.");
                    }

                } else if (barriers[i] instanceof Track) {
                    if (participant.walk((Track) barriers[i])) {
                        System.out.println("У " + participant  + " получилось пробежать по беговой дорожке.");
                    }
                }

            }
        }

    }
}
