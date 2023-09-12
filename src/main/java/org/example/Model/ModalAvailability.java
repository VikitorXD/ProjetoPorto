package org.example.Model;

public class ModalAvailability {

    public int ID;
    public int quantity;
    public Modal modal;
    public PointAvailability pointAvailability;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Modal getModal() {
        return modal;
    }

    public void setModal(Modal modal) {
        this.modal = modal;
    }

    public PointAvailability getPointAvailability() {
        return pointAvailability;
    }

    public void setPointAvailability(PointAvailability pointAvailability) {
        this.pointAvailability = pointAvailability;
    }

    public ModalAvailability(int ID, int quantity, Modal modal, PointAvailability pointAvailability) {
        this.ID = ID;
        this.quantity = quantity;
        this.modal = modal;
        this.pointAvailability = pointAvailability;
    }

    public ModalAvailability() {

    }
}
