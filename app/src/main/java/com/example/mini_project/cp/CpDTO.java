package com.example.mini_project.cp;

public class CpDTO {
    private int imga;
    private String title, km, sale, nic, msg ;

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

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CpDTO(int imga, String title, String km, String sale, String nic, String msg) {
        this.imga = imga;
        this.title = title;
        this.km = km;
        this.sale = sale;
        this.nic = nic;
        this.msg = msg;
    }
}
