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
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Lydia (1672014)
 */
public class User {

    private final IntegerProperty kd_Pegawai = new SimpleIntegerProperty();
    private final IntegerProperty jenis_kelamin = new SimpleIntegerProperty();
    private final StringProperty alamat = new SimpleStringProperty();
    private final StringProperty agama = new SimpleStringProperty();
    private final StringProperty no_Hp = new SimpleStringProperty();
    private final StringProperty username_access = new SimpleStringProperty();
    private final StringProperty password_access = new SimpleStringProperty();

    private final ObjectProperty<Role> roleProperty
            = new SimpleObjectProperty<>();

    private final StringProperty nm_Pegawai = new SimpleStringProperty();

    public int getKd_Pegawai() {
        return kd_Pegawai.get();
    }

    public void setKd_Pegawai(int value) {
        kd_Pegawai.set(value);
    }

    public IntegerProperty kd_PegawaiProperty() {
        return kd_Pegawai;
    }

    public int getJenis_kelamin() {
        return jenis_kelamin.get();
    }

    public void setJenis_kelamin(int value) {
        jenis_kelamin.set(value);
    }

    public IntegerProperty jenis_kelaminProperty() {
        return jenis_kelamin;
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String value) {
        alamat.set(value);
    }

    public StringProperty alamatProperty() {
        return alamat;
    }

    public String getAgama() {
        return agama.get();
    }

    public void setAgama(String value) {
        agama.set(value);
    }

    public StringProperty agamaProperty() {
        return agama;
    }

    public String getNo_Hp() {
        return no_Hp.get();
    }

    public void setNo_Hp(String value) {
        no_Hp.set(value);
    }

    public StringProperty no_HpProperty() {
        return no_Hp;
    }

    public String getUsername_access() {
        return username_access.get();
    }

    public void setUsername_access(String value) {
        username_access.set(value);
    }

    public StringProperty username_accessProperty() {
        return username_access;
    }

    public String getPassword_access() {
        return password_access.get();
    }

    public void setPassword_access(String value) {
        password_access.set(value);
    }

    public StringProperty password_accessProperty() {
        return password_access;
    }

    public Role getRoleProperty() {
        return roleProperty.get();
    }

    public void setRoleProperty(Role value) {
        roleProperty.set(value);
    }

    public ObjectProperty rolePropertyProperty() {
        return roleProperty;
    }

    public String getNm_Pegawai() {
        return nm_Pegawai.get();
    }

    public void setNm_Pegawai(String value) {
        nm_Pegawai.set(value);
    }

    public StringProperty nm_PegawaiProperty() {
        return nm_Pegawai;
    }

}
