package com.example.mini_project;

public class PopupDTO {
    private int imga, titleimg;

    public int getImga() {
        return imga;
    }

    public void setImga(int imga) {
        this.imga = imga;
    }

    public int getTitleimg() {
        return titleimg;
    }

    public void setTitleimg(int titleimg) {
        this.titleimg = titleimg;
    }

    public PopupDTO(int imga, int titleimg) {
        this.imga = imga;
        this.titleimg = titleimg;
    }
}
