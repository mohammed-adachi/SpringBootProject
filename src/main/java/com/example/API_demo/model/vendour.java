package com.example.API_demo.model;

public class vendour {
    private String id;
    private String name;
    private String adress;
    private String phone;

    public vendour(String id, String name, String adress, String phone) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }
    public vendour() {
        this.id = "vendour id";
        this.name = "vendour name";
        this.adress = "vendour adress";
        this.phone = "vendour phone";
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "vendour [adress=" + adress + ", id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }


}
