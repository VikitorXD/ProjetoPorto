package org.example.Model;

public class TowTruckOperator extends User {

    public int ID;
    public String CNH;
    public String license_category;
    public PointAvailability pointAvailability;

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getLicense_category() {
        return license_category;
    }

    public void setLicense_category(String license_category) {
        this.license_category = license_category;
    }

    public PointAvailability getPointAvailability() {
        return pointAvailability;
    }

    public void setPointAvailability(PointAvailability pointAvailability) {
        this.pointAvailability = pointAvailability;
    }

    public TowTruckOperator(int ID, String CNH, String license_category, PointAvailability pointAvailability) {
        this.ID = ID;
        this.CNH = CNH;
        this.license_category = license_category;
        this.pointAvailability = pointAvailability;
    }

    public TowTruckOperator() {

    }
}
