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
public class User {

    String kd_Pegawai;
    String nm_Pegawai;
    char jenis_kelamin;
    String alamat;
    String agama;
    int no_Hp;
    String username_access;
    String password_access;
    int Role_id_Role;

    public User(String kd_Pegawai, String nm_Pegawai, char jenis_kelamin,
            String alamat, String agama, int no_Hp, String username_access,
            String password_access, int Role_id_Role) {
        this.kd_Pegawai = kd_Pegawai;
        this.nm_Pegawai = nm_Pegawai;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.no_Hp = no_Hp;
        this.username_access = username_access;
        this.password_access = password_access;
        this.Role_id_Role = Role_id_Role;
    }

    public String getKd_Pegawai() {
        return kd_Pegawai;
    }

    public void setKd_Pegawai(String kd_Pegawai) {
        this.kd_Pegawai = kd_Pegawai;
    }

    public String getNm_Pegawai() {
        return nm_Pegawai;
    }

    public void setNm_Pegawai(String nm_Pegawai) {
        this.nm_Pegawai = nm_Pegawai;
    }

    public char getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public int getNo_Hp() {
        return no_Hp;
    }

    public void setNo_Hp(int no_Hp) {
        this.no_Hp = no_Hp;
    }

    public String getUsername_access() {
        return username_access;
    }

    public void setUsername_access(String username_access) {
        this.username_access = username_access;
    }

    public String getPassword_access() {
        return password_access;
    }

    public void setPassword_access(String password_access) {
        this.password_access = password_access;
    }

    public int getRole_id_Role() {
        return Role_id_Role;
    }

    public void setRole_id_Role(int Role_id_Role) {
        this.Role_id_Role = Role_id_Role;
    }

}
