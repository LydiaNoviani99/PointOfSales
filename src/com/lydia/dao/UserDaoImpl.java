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
                        = "INSERT INTO user(kd_Pegawai, nm_Pegawai, jenis_kelamin, alamat, agama, no_HP,username_access, password_access, role_id_Role) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getKd_Pegawai());
                ps.setString(2, object.getNm_Pegawai());
                ps.setInt(3, object.getJenis_kelamin());
                ps.setString(4, object.getAlamat());
                ps.setString(5, object.getAgama());
                ps.setString(6, object.getNo_Hp());
                ps.setString(7, object.getUsername_access());
                ps.setString(8, object.getPassword_access());
                ps.setInt(9, object.getRoleProperty().getId_Role());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDaoImpl.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int deleteData(User object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(User object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> showAllData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                user.setRoleProperty(role);
                return user;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return (null);
    }

}
