package org.team100.roboticists;

import java.util.ArrayList;
import java.util.List;

public class AllRoboticists {
    private final List<Roboticist> all;

    public AllRoboticists() {
        all = new ArrayList<>();
        all.add(new Joel());
        all.add(new Aydan());
        all.add(new Om());
        all.add(new Peter());
        all.add(new Matthew());
    }

    public List<Roboticist> getAll() {
        return all;
    }

}
