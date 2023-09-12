package org.example.Model;

public class Solicitation {

    public int ID;
    public Solicitation progress;
    public String color;
    public String length;
    public String height;
    public int axle_nums;
    public boolean has_cargo;
    public Vehicle vehicle;
    public Address address;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Solicitation getProgress() {
        return progress;
    }

    public void setProgress(Solicitation progress) {
        this.progress = progress;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getAxle_nums() {
        return axle_nums;
    }

    public void setAxle_nums(int axle_nums) {
        this.axle_nums = axle_nums;
    }

    public boolean isHas_cargo() {
        return has_cargo;
    }

    public void setHas_cargo(boolean has_cargo) {
        this.has_cargo = has_cargo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Solicitation(int ID, Solicitation progress, String color, String length, String height, int axle_nums, boolean has_cargo, Vehicle vehicle, Address address) {
        this.ID = ID;
        this.progress = progress;
        this.color = color;
        this.length = length;
        this.height = height;
        this.axle_nums = axle_nums;
        this.has_cargo = has_cargo;
        this.vehicle = vehicle;
        this.address = address;
    }

    public Solicitation() {

    }

}
