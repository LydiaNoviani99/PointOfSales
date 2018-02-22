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

    private final IntegerProperty kd_Transaksi = new SimpleIntegerProperty();
    private final IntegerProperty user_kd_User = new SimpleIntegerProperty();
    private final ObjectProperty<Timestamp> tgl_Transaksi
            = new SimpleObjectProperty<>();

    public int getKd_Transaksi() {
        return kd_Transaksi.get();
    }

    public void setKd_Transaksi(int value) {
        kd_Transaksi.set(value);
    }

    public IntegerProperty Kd_TransaksiProperty() {
        return kd_Transaksi;
    }

    public int getUser_kd_User() {
        return user_kd_User.get();
    }

    public void setUser_kd_User(int value) {
        user_kd_User.set(value);
    }

    public IntegerProperty user_kd_UserProperty() {
        return user_kd_User;
    }

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
