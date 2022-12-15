package com.example.mini_project.location;

public class ShopDTO {
    private int imga;
    private String title, msg, km, hoo, best, nic, msg2;

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getHoo() {
        return hoo;
    }

    public void setHoo(String hoo) {
        this.hoo = hoo;
    }

    public String getBest() {
        return best;
    }

    public void setBest(String best) {
        this.best = best;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public ShopDTO(int imga, String title, String msg, String km, String hoo, String best, String nic, String msg2) {
        this.imga = imga;
        this.title = title;
        this.msg = msg;
        this.km = km;
        this.hoo = hoo;
        this.best = best;
        this.nic = nic;
        this.msg2 = msg2;
    }
}
