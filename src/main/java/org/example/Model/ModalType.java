package org.example.Model;

public class ModalType {

    public int ID;
    public String type;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModalType(int ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    public ModalType() {

    }
}
