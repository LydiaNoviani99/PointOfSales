/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.dao;

import com.lydia.entity.Role;
import com.lydia.entity.User;
import com.lydia.utility.DaoService;
import com.lydia.utility.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Lydia (1672014)
 */
public class UserDaoImpl implements DaoService<User> {

    @Override
    public int addData(User object) {
        Timestamp t = new Timestamp(System.currentTimeMillis());
        int result = 0;
        try {
            try (Connection connection = Koneksi.createConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "INSERT INTO user(kd_User, nm_User, jenis_kelamin, alamat, agama, no_Hp,username_access, password_access, role_id_Role) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getKd_User());
                ps.setString(2, object.getNm_User());
                ps.setInt(3, object.getJenis_kelamin());
                ps.setString(4, object.getAlamat());
                ps.setString(5, object.getAgama());
                ps.setString(6, object.getNo_Hp());
                ps.setString(7, object.getUsername_access());
                ps.setString(8, object.getPassword_access());
                ps.setInt(9, object.getRole_Id_Role().getId_Role());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int deleteData(User object) {
        int result = 0;
        try {
            try (Connection connection = Koneksi.createConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "DELETE FROM user WHERE kd_User = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getKd_User());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int updateData(User object) {
        int result = 0;
        try {
            try (Connection connection = Koneksi.createConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "UPDATE barang SET kd_User = ?, nm_User = ?, jenis_kelamin = ?, alamat = ?, agama = ?, no_Hp = ?, username_access = ?, password_access = ?, role_Id_Role = ? WHERE kd_User = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getKd_User());
                ps.setString(2, object.getNm_User());
                ps.setInt(3, object.getJenis_kelamin());
                ps.setString(4, object.getAlamat());
                ps.setString(5, object.getAgama());
                ps.setString(6, object.getNo_Hp());
                ps.setString(7, object.getUsername_access());
                ps.setString(8, object.getPassword_access());
                ps.setInt(9, object.getRole_Id_Role().getId_Role());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public List<User> showAllData() {
        ObservableList<User> user = FXCollections.observableArrayList();
        try {
            try (Connection connection = Koneksi.createConnection()) {
                String query
                        = "SELECT * FROM user u JOIN role r WHERE u.role_Id_Role = r.id_Role";
                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    User userObject = new User();
                    Role roleObject = new Role();
                    userObject.setKd_User(rs.getInt("kd_User"));
                    userObject.setNm_User(rs.getString("nm_User"));
                    userObject.setJenis_kelamin(rs.getInt("jenis_Kelamin"));
                    userObject.setAlamat(rs.getString(
                            "alamat"));
                    userObject.setAgama(rs.getString("agama"));
                    userObject.setNo_Hp(rs.getString("no_Hp"));
                    userObject.setUsername_access(rs.
                            getString("username_access"));
                    userObject.setPassword_access(rs.
                            getString("password_access"));
                    roleObject.setId_Role(rs.getInt("id_Role"));

                    user.add(userObject);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BarangDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        return user;
    }

    @Override
    public User getData(User id) {
        try (Connection connection = Koneksi.createConnection()) {

            String query
                    = "SELECT u.username_access, u.password_access, u.role_id_Role FROM user u join role r on u.role_id_Role = r.id_Role WHERE u.username_access = ? AND u.password_access = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id.getUsername_access());
            ps.setString(2, id.getPassword_access());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUsername_access(rs.getString("u.username_access"));

                user.setPassword_access(rs.getString("u.password_access"));
//                    user.setRole_id_Role(rs.get);
                Role role = new Role();
                role.setId_Role(rs.getInt("role_id_Role"));
                user.setRole_Id_Role(role);
                return user;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return (null);
    }

}
