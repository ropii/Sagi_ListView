package com.example.listviews;

public class Flower {
    private int price;
    private String title;
    private String subTitle;
    private int imageId;

    public Flower(int price, String title, String subTitle, int imageId) {
        this.price = price;
        this.title = title;
        this.subTitle = subTitle;
        this.imageId = imageId;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImageId() { return imageId; }
    public void setImageId(int imageId) { this.imageId = imageId; }
}
