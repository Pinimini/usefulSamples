package org.example.behavioral.memento.svc;

import java.util.Date;

public class Save {
    //Это Memento

    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
