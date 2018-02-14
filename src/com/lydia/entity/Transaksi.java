/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

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

//    int id_Transaksi;
//    Timestamp tgl_TransaksiDate;
//    int user_kd_Pegawai;
//
//    public Transaksi() {
//    }
//
//    public Transaksi(int id_Transaksi, Timestamp tgl_TransaksiDate,
//            int User_kd_Pegawai) {
//        this.id_Transaksi = id_Transaksi;
//        this.tgl_TransaksiDate = tgl_TransaksiDate;
//        this.user_kd_Pegawai = User_kd_Pegawai;
//    }
//
//    public int getId_Transaksi() {
//        return id_Transaksi;
//    }
//
//    public void setId_Transaksi(int id_Transaksi) {
//        this.id_Transaksi = id_Transaksi;
//    }
//
//    public Timestamp getTgl_TransaksiDate() {
//        return tgl_TransaksiDate;
//    }
//
//    public void setTgl_TransaksiDate(Timestamp tgl_TransaksiDate) {
//        this.tgl_TransaksiDate = tgl_TransaksiDate;
//    }
//
//    public int getUser_kd_Pegawai() {
//        return user_kd_Pegawai;
//    }
//
//    public void setUser_kd_Pegawai(int User_kd_Pegawai) {
//        this.user_kd_Pegawai = User_kd_Pegawai;
//    }
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

}
