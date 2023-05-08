package org.example.behavioral.memento.svc;

import java.util.Date;

public class Project {
    // Это Originator

    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        date = new Date();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
