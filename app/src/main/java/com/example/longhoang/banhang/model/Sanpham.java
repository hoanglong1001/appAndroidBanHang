package com.example.longhoang.banhang.model;

import java.io.Serializable;

/**
 * Created by Long Hoang on 3/16/2019.
 */

public class Sanpham implements Serializable{
    public int ID;
    public String Tensanpham;
    public String Hinhanhsanpham;
    public Integer Giasanpham;
    public String Motasanpham;
    public int IDLoaisanpham;

    public Sanpham(int ID, String tensanpham, String hinhanhsanpham, Integer giasanpham, String motasanpham, int IDLoaisanpham) {
        this.ID = ID;
        Tensanpham = tensanpham;
        Hinhanhsanpham = hinhanhsanpham;
        Giasanpham = giasanpham;
        Motasanpham = motasanpham;
        this.IDLoaisanpham = IDLoaisanpham;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTensanpham() {
        return Tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        Tensanpham = tensanpham;
    }

    public String getHinhanhsanpham() {
        return Hinhanhsanpham;
    }

    public void setHinhanhsanpham(String hinhanhsanpham) {
        Hinhanhsanpham = hinhanhsanpham;
    }

    public Integer getGiasanpham() {
        return Giasanpham;
    }

    public void setGiasanpham(Integer giasanpham) {
        Giasanpham = giasanpham;
    }

    public String getMotasanpham() {
        return Motasanpham;
    }

    public void setMotasanpham(String motasanpham) {
        Motasanpham = motasanpham;
    }

    public int getIDLoaisanpham() {
        return IDLoaisanpham;
    }

    public void setIDLoaisanpham(int IDLoaisanpham) {
        this.IDLoaisanpham = IDLoaisanpham;
    }
}
