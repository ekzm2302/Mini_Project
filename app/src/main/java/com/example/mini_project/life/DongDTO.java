package com.example.mini_project.life;

public class DongDTO {
    private  int imgs;
    private String title, name, nic, dong, time;

    public int getImgs() {
        return imgs;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DongDTO(int imgs, String title, String name, String nic, String dong, String time) {
        this.imgs = imgs;
        this.title = title;
        this.name = name;
        this.nic = nic;
        this.dong = dong;
        this.time = time;
    }
}
