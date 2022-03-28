package com.example.lab4;

public class SanPham {
    private int id;
    private String ten;
    private String shop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public SanPham(int id, String ten, String shop) {
        this.id = id;
        this.ten = ten;
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", shop='" + shop + '\'' +
                '}';
    }
}
