/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.dao;

import com.lydia.entity.Barang;
import com.lydia.entity.Kategori;
import com.lydia.utility.DaoService;
import com.lydia.utility.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Lydia (1672014)
 */
public class BarangDaoImpl implements DaoService<Barang> {

    @Override
    public int addData(Barang object) {
        int result = 0;
        try {
            try (Connection connection = Koneksi.createConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "INSERT INTO barang(kd_Barang, nm_Barang, hrg_Beli, hrg_Jual, kategori_id_Kategori) VALUES (?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getKd_Barang());
                ps.setString(2, object.getNm_Barang());
                ps.setDouble(3, object.getHrg_Beli());
                ps.setDouble(4, object.getHrg_Jual());
                ps.setInt(5, object.getKategori_Id_Kategori().getId_Kategori());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BarangDaoImpl.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int deleteData(Barang object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(Barang object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Barang> showAllData() {
        ObservableList<Barang> barang = FXCollections.observableArrayList();
        try {
            try (Connection connection = Koneksi.createConnection()) {
                String query
                        = "SELECT * FROM barang barang JOIN kategori kategori where barang.kategori_id_Kategori = kategori.id_Kategori";
                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Barang barangObject = new Barang();
                    Kategori kategoriObject = new Kategori();
                    barangObject.setKd_Barang(rs.getInt("kd_Barang"));
                    barangObject.setNm_Barang(rs.getString("nm_Barang"));
                    barangObject.setHrg_Beli(rs.getInt("hrg_Beli"));
                    barangObject.setHrg_Jual(rs.getInt("hrg_Jual"));
                    kategoriObject.setKet_Kategori(rs.getString("ket_Kategori"));
                    barang.add(barangObject);

                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BarangDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        return barang;
    }

    @Override
    public Barang getData(Barang id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
