package org.example.Model;

public class User {

    public int ID;
    public String name;
    public String phoneNumber;
    public String emailAddress;
    public String password;

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int ID, String name, String phoneNumber, String emailAddress, String password) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public User() {

    }

    public Boolean LogIn(String phoneNumber) {
        if (phoneNumber.length() == 9) {
            System.out.println("Número cadastrado");
            return true;
        }else {
            System.out.println("Número inválido");
            return false;
        }
    }

    Boolean LogOut() {
        System.out.println("Sistema fechado.");

        return true;
    }




}