package org.example.Model;

public class Modal {

    public int ID;
    public String name;
    public ModalType type;

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

    public ModalType getType() {
        return type;
    }

    public void setType(ModalType type) {
        this.type = type;
    }

    public Modal(int ID, String name, ModalType type) {
        this.ID = ID;
        this.name = name;
        this.type = type;
    }

    public Modal() {

    }
}
