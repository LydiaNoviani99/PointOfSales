/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author Lydia (1672014)
 */
public class Detail_transaksi {

    private final ObjectProperty<Transaksi> transaksi_kd_Transaksi
            = new SimpleObjectProperty<>();
    private final ObjectProperty<Barang> barang_kd_Barang
            = new SimpleObjectProperty<>();
    private final IntegerProperty jml = new SimpleIntegerProperty();
    private final IntegerProperty saling_price = new SimpleIntegerProperty();

    public Transaksi getTransaksi_kd_Transaksi() {
        return transaksi_kd_Transaksi.get();
    }

    public void setTransaksi_kd_Transaksi(Transaksi value) {
        transaksi_kd_Transaksi.set(value);
    }

    public ObjectProperty transaksi_kd_TransaksiProperty() {
        return transaksi_kd_Transaksi;
    }

    public Barang getBarang_kd_Barang() {
        return barang_kd_Barang.get();
    }

    public void setBarang_kd_Barang(Barang value) {
        barang_kd_Barang.set(value);
    }

    public ObjectProperty barang_kd_BarangProperty() {
        return barang_kd_Barang;
    }

    public int getJml() {
        return jml.get();
    }

    public void setJml(int value) {
        jml.set(value);
    }

    public IntegerProperty jmlProperty() {
        return jml;
    }

    public int getSaling_price() {
        return saling_price.get();
    }

    public void setSaling_price(int value) {
        saling_price.set(value);
    }

    public IntegerProperty saling_priceProperty() {
        return saling_price;
    }

}
