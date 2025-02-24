package org.example.behavioral.memento.svc;

public class GithubRepo {
    //это Caretaker
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
