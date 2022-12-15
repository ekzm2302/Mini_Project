package com.example.mini_project.location;

public class ItemDTO {
    private int imga;
    private String lolo, km, name, won, love;

    public int getImga() {
        return imga;
    }

    public void setImga(int imga) {
        this.imga = imga;
    }

    public String getLolo() {
        return lolo;
    }

    public void setLolo(String lolo) {
        this.lolo = lolo;
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

    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public ItemDTO(int imga, String lolo, String km, String name, String won, String love) {
        this.imga = imga;
        this.lolo = lolo;
        this.km = km;
        this.name = name;
        this.won = won;
        this.love = love;
    }
}
