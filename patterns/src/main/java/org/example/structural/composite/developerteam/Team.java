package org.example.structural.composite.developerteam;

import java.util.ArrayList;

public class Team implements Developer {
    private ArrayList<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team createProject");
        for (Developer dev :
                developers) {
            dev.writeCode();
        }
    }
}
