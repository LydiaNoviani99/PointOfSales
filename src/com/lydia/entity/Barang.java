/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Lydia (1672014)
 */
public class Barang {

    private final IntegerProperty kd_Barang = new SimpleIntegerProperty();

    public int getKd_Barang() {
        return kd_Barang.get();
    }

    public void setKd_Barang(int value) {
        kd_Barang.set(value);
    }

    public IntegerProperty kd_BarangProperty() {
        return kd_Barang;
    }
    private final StringProperty nm_Barang = new SimpleStringProperty();

    public String getNm_Barang() {
        return nm_Barang.get();
    }

    public void setNm_Barang(String value) {
        nm_Barang.set(value);
    }

    public StringProperty nm_BarangProperty() {
        return nm_Barang;
    }

    private final DoubleProperty hrg_Beli = new SimpleDoubleProperty();

    public double getHrg_Beli() {
        return hrg_Beli.get();
    }

    public void setHrg_Beli(double value) {
        hrg_Beli.set(value);
    }

    public DoubleProperty hrg_BeliProperty() {
        return hrg_Beli;
    }
    private final DoubleProperty hrg_Jual = new SimpleDoubleProperty();

    public double getHrg_Jual() {
        return hrg_Jual.get();
    }

    public void setHrg_Jual(double value) {
        hrg_Jual.set(value);
    }

    public DoubleProperty hrg_JualProperty() {
        return hrg_Jual;
    }

    private final IntegerProperty kategori_id_Kategori
            = new SimpleIntegerProperty();

    public int getKategori_id_Kategori() {
        return kategori_id_Kategori.get();
    }

    public void setKategori_id_Kategori(int value) {
        kategori_id_Kategori.set(value);
    }

    public IntegerProperty kategori_id_KategoriProperty() {
        return kategori_id_Kategori;
    }

//    int kd_Barang;
//    String nm_Barang;
//    Double hrg_Beli;
//    Double hrg_Jual;
//    int kategori_id_Kategoti;
//
//    public Barang() {
//    }
//
//    public Barang(int kd_Barang, String nm_Barang, Double hrg_Beli,
//            Double hrg_Jual, int kategori_id_Kategoti) {
//        this.kd_Barang = kd_Barang;
//        this.nm_Barang = nm_Barang;
//        this.hrg_Beli = hrg_Beli;
//        this.hrg_Jual = hrg_Jual;
//        this.kategori_id_Kategoti = kategori_id_Kategoti;
//    }
//
//    public int getKd_Barang() {
//        return kd_Barang;
//    }
//
//    public void setKd_Barang(int kd_Barang) {
//        this.kd_Barang = kd_Barang;
//    }
//
//    public String getNm_Barang() {
//        return nm_Barang;
//    }
//
//    public void setNm_Barang(String nm_Barang) {
//        this.nm_Barang = nm_Barang;
//    }
//
//    public Double getHrg_Beli() {
//        return hrg_Beli;
//    }
//
//    public void setHrg_Beli(Double hrg_Beli) {
//        this.hrg_Beli = hrg_Beli;
//    }
//
//    public Double getHrg_Jual() {
//        return hrg_Jual;
//    }
//
//    public void setHrg_Jual(Double hrg_Jual) {
//        this.hrg_Jual = hrg_Jual;
//    }
//
//    public int getKategori_id_Kategoti() {
//        return kategori_id_Kategoti;
//    }
//
//    public void setKategori_id_Kategoti(int kategori_id_Kategoti) {
//        this.kategori_id_Kategoti = kategori_id_Kategoti;
//    }
}
