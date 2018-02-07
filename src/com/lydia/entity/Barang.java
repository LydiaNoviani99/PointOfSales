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
public class Barang {

    String kd_Barang;
    String nm_Barang;
    int jml;
    Double hrg_Beli;
    Double hrg_Jual;
    String kategori;

    public Barang(String kd_Barang, String nm_Barang, int jml, Double hrg_Beli,
            Double hrg_Jual, String kategori) {
        this.kd_Barang = kd_Barang;
        this.nm_Barang = nm_Barang;
        this.jml = jml;
        this.hrg_Beli = hrg_Beli;
        this.hrg_Jual = hrg_Jual;
        this.kategori = kategori;
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

    public Double getHrg_Beli() {
        return hrg_Beli;
    }

    public void setHrg_Beli(Double hrg_Beli) {
        this.hrg_Beli = hrg_Beli;
    }

    public Double getHrg_Jual() {
        return hrg_Jual;
    }

    public void setHrg_Jual(Double hrg_Jual) {
        this.hrg_Jual = hrg_Jual;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

}
