package com.meirusfandi.ecosmartphone;

public class Models {

    private String merk;
    private String title;
    private String price;
    private String stock;
    private String detail_display;
    private String detail_body;
    private String detail_battery;
    private String main_content;
    private String sellername;
    private String sellerimage;
    private String productimage;

    public Models(){

    }

    public Models(String merk, String title, String price, String stock, String detail_display, String detail_body, String detail_battery, String main_content, String sellername, String sellerimage, String productimage) {
        this.merk = merk;
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.detail_display = detail_display;
        this.detail_body = detail_body;
        this.detail_battery = detail_battery;
        this.main_content = main_content;
        this.sellername = sellername;
        this.sellerimage = sellerimage;
        this.productimage = productimage;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDetail_display() {
        return detail_display;
    }

    public void setDetail_display(String detail_display) {
        this.detail_display = detail_display;
    }

    public String getDetail_body() {
        return detail_body;
    }

    public void setDetail_body(String detail_body) {
        this.detail_body = detail_body;
    }

    public String getDetail_battery() {
        return detail_battery;
    }

    public void setDetail_battery(String detail_battery) {
        this.detail_battery = detail_battery;
    }

    public String getMain_content() {
        return main_content;
    }

    public void setMain_content(String main_content) {
        this.main_content = main_content;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getSellerimage() {
        return sellerimage;
    }

    public void setSellerimage(String sellerimage) {
        this.sellerimage = sellerimage;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }
}
