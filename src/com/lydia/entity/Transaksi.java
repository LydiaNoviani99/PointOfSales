/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

import java.sql.Timestamp;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author Lydia (1672014)
 */
public class Transaksi {

    private final IntegerProperty id_Transaksi = new SimpleIntegerProperty();

    public int getId_Transaksi() {
        return id_Transaksi.get();
    }

    public void setId_Transaksi(int value) {
        id_Transaksi.set(value);
    }

    public IntegerProperty id_TransaksiProperty() {
        return id_Transaksi;
    }

    private final IntegerProperty user_kd_Pegawai = new SimpleIntegerProperty();

    public int getUser_kd_Pegawai() {
        return user_kd_Pegawai.get();
    }

    public void setUser_kd_Pegawai(int value) {
        user_kd_Pegawai.set(value);
    }

    public IntegerProperty user_kd_PegawaiProperty() {
        return user_kd_Pegawai;
    }
    private final ObjectProperty<Timestamp> tgl_Transaksi
            = new SimpleObjectProperty<>();

    public Timestamp getTgl_Transaksi() {
        return tgl_Transaksi.get();
    }

    public void setTgl_Transaksi(Timestamp value) {
        tgl_Transaksi.set(value);
    }

    public ObjectProperty tgl_TransaksiProperty() {
        return tgl_Transaksi;
    }

}
