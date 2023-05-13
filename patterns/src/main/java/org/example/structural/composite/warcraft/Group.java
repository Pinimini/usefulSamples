package org.example.structural.composite.warcraft;

import java.util.ArrayList;

public class Group implements Unit {

    ArrayList<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    @Override
    public void move() {
        units.forEach(Unit::move);
    }
}
