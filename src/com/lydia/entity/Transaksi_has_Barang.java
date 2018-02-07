/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

/**
 *
 * @author USER
 */
public class Transaksi_has_Barang {

    int Transaksi_no_Transaksi;
    String Barang_kd_Barang;

    public Transaksi_has_Barang(int Transaksi_no_Transaksi,
            String Barang_kd_Barang) {
        this.Transaksi_no_Transaksi = Transaksi_no_Transaksi;
        this.Barang_kd_Barang = Barang_kd_Barang;
    }

    public int getTransaksi_no_Transaksi() {
        return Transaksi_no_Transaksi;
    }

    public void setTransaksi_no_Transaksi(int Transaksi_no_Transaksi) {
        this.Transaksi_no_Transaksi = Transaksi_no_Transaksi;
    }

    public String getBarang_kd_Barang() {
        return Barang_kd_Barang;
    }

    public void setBarang_kd_Barang(String Barang_kd_Barang) {
        this.Barang_kd_Barang = Barang_kd_Barang;
    }

}
