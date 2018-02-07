/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.entity;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Transaksi {

    int no_Transaksi;
    Date tgl_TransaksiDate;
    String kd_Barang;
    String nm_Barang;
    int jml;
    Double harga_satuan;
    Double total;
    String User_kd_Pegawai;

    public Transaksi(int no_Transaksi, Date tgl_TransaksiDate, String kd_Barang,
            String nm_Barang, int jml, Double harga_satuan, Double total,
            String User_kd_Pegawai) {
        this.no_Transaksi = no_Transaksi;
        this.tgl_TransaksiDate = tgl_TransaksiDate;
        this.kd_Barang = kd_Barang;
        this.nm_Barang = nm_Barang;
        this.jml = jml;
        this.harga_satuan = harga_satuan;
        this.total = total;
        this.User_kd_Pegawai = User_kd_Pegawai;
    }

    public int getNo_Transaksi() {
        return no_Transaksi;
    }

    public void setNo_Transaksi(int no_Transaksi) {
        this.no_Transaksi = no_Transaksi;
    }

    public Date getTgl_TransaksiDate() {
        return tgl_TransaksiDate;
    }

    public void setTgl_TransaksiDate(Date tgl_TransaksiDate) {
        this.tgl_TransaksiDate = tgl_TransaksiDate;
    }

    public String getKd_Barang() {
        return kd_Barang;
    }

    public void setKd_Barang(String kd_Barang) {
        this.kd_Barang = kd_Barang;
    }

    public String getNm_Barang() {
        return nm_Barang;
    }

    public void setNm_Barang(String nm_Barang) {
        this.nm_Barang = nm_Barang;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    public Double getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(Double harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getUser_kd_Pegawai() {
        return User_kd_Pegawai;
    }

    public void setUser_kd_Pegawai(String User_kd_Pegawai) {
        this.User_kd_Pegawai = User_kd_Pegawai;
    }

}
