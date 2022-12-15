package com.example.mini_project.location;

public class JobDTO {
    private int imga;
    private String title, dong, km, name, money;

    public int getImga() {
        return imga;
    }

    public void setImga(int imga) {
        this.imga = imga;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public JobDTO(int imga, String title, String dong, String km, String name, String money) {
        this.imga = imga;
        this.title = title;
        this.dong = dong;
        this.km = km;
        this.name = name;
        this.money = money;
    }
}
