package org.example.Model;

public class State {

    public int ID;
    public String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public State() {

    }
}
