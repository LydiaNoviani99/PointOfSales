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
public class Kategori {

    private final IntegerProperty id_Kategori = new SimpleIntegerProperty();

    public int getId_Kategori() {
        return id_Kategori.get();
    }

    public void setId_Kategori(int value) {
        id_Kategori.set(value);
    }

    public IntegerProperty id_KategoriProperty() {
        return id_Kategori;
    }

//    int id_Kategori;
//    String ket_Kategori;
//
//    public Kategori() {
//    }
//
//    public Kategori(int id_Kategori, String ket_Kategori) {
//        this.id_Kategori = id_Kategori;
//        this.ket_Kategori = ket_Kategori;
//    }
//
//    public int getId_Kategori() {
//        return id_Kategori;
//    }
//
//    public void setId_Kategori(int id_Kategori) {
//        this.id_Kategori = id_Kategori;
//    }
//
//    public String getKet_Kategori() {
//        return ket_Kategori;
//    }
//
//    public void setKet_Kategori(String ket_Kategori) {
//        this.ket_Kategori = ket_Kategori;
//    }
    private final StringProperty ket_Kategori = new SimpleStringProperty();

    public String getKet_Kategori() {
        return ket_Kategori.get();
    }

    public void setKet_Kategori(String value) {
        ket_Kategori.set(value);
    }

    public StringProperty ket_KategoriProperty() {
        return ket_Kategori;
    }

}
