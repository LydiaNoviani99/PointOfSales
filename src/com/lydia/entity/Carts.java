/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author USER
 */
public class Carts {

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
    private final IntegerProperty jumlah = new SimpleIntegerProperty();

    public int getJumlah() {
        return jumlah.get();
    }

    public void setJumlah(int value) {
        jumlah.set(value);
    }

    public IntegerProperty jumlahProperty() {
        return jumlah;
    }
    private final IntegerProperty saling_Price = new SimpleIntegerProperty();

    public int getSaling_Price() {
        return saling_Price.get();
    }

    public void setSaling_Price(int value) {
        saling_Price.set(value);
    }

    public IntegerProperty saling_PriceProperty() {
        return saling_Price;
    }

    public Carts() {
    }

    public Carts(int kd_Barang, String nm_Barang, int jumlah, int saling_Price) {
        this.setKd_Barang(kd_Barang);
        this.setNm_Barang(nm_Barang);
        this.setJumlah(jumlah);
        this.setSaling_Price(saling_Price);
    }

    @Override
    public String toString() {
        return String.valueOf(getKd_Barang()) + " - " + getNm_Barang();
    }

    public Object getBarang_kd_Barang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
