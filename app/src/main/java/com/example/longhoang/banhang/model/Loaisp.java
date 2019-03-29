package com.example.longhoang.banhang.model;

/**
 * Created by Long Hoang on 3/15/2019.
 */

public class Loaisp {
    public int Id;
    public String Ten;
    public String Hinhanh;

    public Loaisp(int id, String ten, String hinhanh) {
        Id = id;
        Ten = ten;
        Hinhanh = hinhanh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        Hinhanh = hinhanh;
    }
}
