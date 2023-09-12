package org.example.Model;

public class Administrator extends User {

    public int ID;
    public Boolean permission;

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public Boolean getPermission() {
        return permission;
    }

    public void setPermission(Boolean permission) {
        this.permission = permission;
    }

    public Administrator(int ID, Boolean permission) {
        this.ID = ID;
        this.permission = permission;
    }

    public Administrator() {

    }
}
