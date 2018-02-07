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
public class Role {

    int id_Role;
    String ket_Role;

    public Role(int id_Role, String ket_Role) {
        this.id_Role = id_Role;
        this.ket_Role = ket_Role;
    }

    public int getId_Role() {
        return id_Role;
    }

    public void setId_Role(int id_Role) {
        this.id_Role = id_Role;
    }

    public String getKet_Role() {
        return ket_Role;
    }

    public void setKet_Role(String ket_Role) {
        this.ket_Role = ket_Role;
    }

}
