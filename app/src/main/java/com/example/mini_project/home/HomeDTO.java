package com.example.mini_project.home;

public class HomeDTO {
    private int imgs;
    private String tv_sale, tv_area, tv_price, tv_num1, tv_num2;

    public int getImgs() {
        return imgs;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }

    public String getTv_sale() {
        return tv_sale;
    }

    public void setTv_sale(String tv_sale) {
        this.tv_sale = tv_sale;
    }

    public String getTv_area() {
        return tv_area;
    }

    public void setTv_area(String tv_area) {
        this.tv_area = tv_area;
    }

    public String getTv_price() {
        return tv_price;
    }

    public void setTv_price(String tv_price) {
        this.tv_price = tv_price;
    }

    public String getTv_num1() {
        return tv_num1;
    }

    public void setTv_num1(String tv_num1) {
        this.tv_num1 = tv_num1;
    }

    public String getTv_num2() {
        return tv_num2;
    }

    public void setTv_num2(String tv_num2) {
        this.tv_num2 = tv_num2;
    }

    public HomeDTO(int imgs, String tv_sale, String tv_area, String tv_price, String tv_num1, String tv_num2) {
        this.imgs = imgs;
        this.tv_sale = tv_sale;
        this.tv_area = tv_area;
        this.tv_price = tv_price;
        this.tv_num1 = tv_num1;
        this.tv_num2 = tv_num2;
    }
}
