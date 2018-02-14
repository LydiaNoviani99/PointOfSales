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
 * @author Lydia (1672014)
 */
public class User {

    private final IntegerProperty kd_Pegawai = new SimpleIntegerProperty();

    public int getKd_Pegawai() {
        return kd_Pegawai.get();
    }

    public void setKd_Pegawai(int value) {
        kd_Pegawai.set(value);
    }

    public IntegerProperty kd_PegawaiProperty() {
        return kd_Pegawai;
    }
    private final IntegerProperty jenis_kelamin = new SimpleIntegerProperty();

    public int getJenis_kelamin() {
        return jenis_kelamin.get();
    }

    public void setJenis_kelamin(int value) {
        jenis_kelamin.set(value);
    }

    public IntegerProperty jenis_kelaminProperty() {
        return jenis_kelamin;
    }
    private final StringProperty alamat = new SimpleStringProperty();

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String value) {
        alamat.set(value);
    }

    public StringProperty alamatProperty() {
        return alamat;
    }
    private final StringProperty agama = new SimpleStringProperty();

    public String getAgama() {
        return agama.get();
    }

    public void setAgama(String value) {
        agama.set(value);
    }

    public StringProperty agamaProperty() {
        return agama;
    }
    private final StringProperty no_Hp = new SimpleStringProperty();

    public String getNo_Hp() {
        return no_Hp.get();
    }

    public void setNo_Hp(String value) {
        no_Hp.set(value);
    }

    public StringProperty no_HpProperty() {
        return no_Hp;
    }
    private final StringProperty username_access = new SimpleStringProperty();

    public String getUsername_access() {
        return username_access.get();
    }

    public void setUsername_access(String value) {
        username_access.set(value);
    }

    public StringProperty username_accessProperty() {
        return username_access;
    }
    private final StringProperty password_access = new SimpleStringProperty();

    public String getPassword_access() {
        return password_access.get();
    }

    public void setPassword_access(String value) {
        password_access.set(value);
    }

    public StringProperty password_accessProperty() {
        return password_access;
    }
    private final IntegerProperty role_id_Role = new SimpleIntegerProperty();

    public int getRole_id_Role() {
        return role_id_Role.get();
    }

    public void setRole_id_Role(int value) {
        role_id_Role.set(value);
    }

    public IntegerProperty role_id_RoleProperty() {
        return role_id_Role;
    }

//    int kd_Pegawai;
//    String nm_Pegawai;
//    int jenis_kelamin;
//    String alamat;
//    String agama;
//    String no_Hp;
//    String username_access;
//    String password_access;
//    int role_id_Role;
//
//    public User() {
//    }
//
//    public User(int kd_Pegawai, String nm_Pegawai, int jenis_kelamin,
//            String alamat, String agama, String no_Hp, String username_access,
//            String password_access, int role_id_Role) {
//        this.kd_Pegawai = kd_Pegawai;
//        this.nm_Pegawai = nm_Pegawai;
//        this.jenis_kelamin = jenis_kelamin;
//        this.alamat = alamat;
//        this.agama = agama;
//        this.no_Hp = no_Hp;
//        this.username_access = username_access;
//        this.password_access = password_access;
//        this.role_id_Role = role_id_Role;
//    }
//
//    public int getKd_Pegawai() {
//        return kd_Pegawai;
//    }
//
//    public void setKd_Pegawai(int kd_Pegawai) {
//        this.kd_Pegawai = kd_Pegawai;
//    }
//
//    public String getNm_Pegawai() {
//        return nm_Pegawai;
//    }
//
//    public void setNm_Pegawai(String nm_Pegawai) {
//        this.nm_Pegawai = nm_Pegawai;
//    }
//
//    public int getJenis_kelamin() {
//        return jenis_kelamin;
//    }
//
//    public void setJenis_kelamin(int jenis_kelamin) {
//        this.jenis_kelamin = jenis_kelamin;
//    }
//
//    public String getAlamat() {
//        return alamat;
//    }
//
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
//
//    public String getAgama() {
//        return agama;
//    }
//
//    public void setAgama(String agama) {
//        this.agama = agama;
//    }
//
//    public String getNo_Hp() {
//        return no_Hp;
//    }
//
//    public void setNo_Hp(String no_Hp) {
//        this.no_Hp = no_Hp;
//    }
//
//    public String getUsername_access() {
//        return username_access;
//    }
//
//    public void setUsername_access(String username_access) {
//        this.username_access = username_access;
//    }
//
//    public String getPassword_access() {
//        return password_access;
//    }
//
//    public void setPassword_access(String password_access) {
//        this.password_access = password_access;
//    }
//
//    public int getRole_id_Role() {
//        return role_id_Role;
//    }
//
//    public void setRole_id_Role(int role_id_Role) {
//        this.role_id_Role = role_id_Role;
//    }
    private final StringProperty nm_Pegawai = new SimpleStringProperty();

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
