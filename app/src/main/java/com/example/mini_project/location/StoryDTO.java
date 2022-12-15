package com.example.mini_project.location;

public class StoryDTO {
    private int imgs, imgs2;

    public int getImgs() {
        return imgs;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }

    public int getImgs2() {
        return imgs2;
    }

    public void setImgs2(int imgs2) {
        this.imgs2 = imgs2;
    }

    public StoryDTO(int imgs, int imgs2) {
        this.imgs = imgs;
        this.imgs2 = imgs2;
    }
}