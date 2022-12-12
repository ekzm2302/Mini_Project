package com.example.mini_project.chat;

public class ChatDTO {
    private int img, img2;
    private String name, msg, time;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ChatDTO(int img, int img2, String name, String msg, String time) {
        this.img = img;
        this.img2 = img2;
        this.name = name;
        this.msg = msg;
        this.time = time;
    }
}
