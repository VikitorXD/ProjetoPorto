package org.example.Model;

public class City {

    public int ID;
    public String name;
    public State state;

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City(int ID, String name, State state) {
        this.ID = ID;
        this.name = name;
        this.state = state;
    }

    public City() {

    }
}
