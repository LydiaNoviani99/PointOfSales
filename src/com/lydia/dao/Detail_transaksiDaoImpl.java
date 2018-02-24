/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.dao;

import com.lydia.entity.Detail_transaksi;
import com.lydia.utility.DaoService;
import com.lydia.utility.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lydia (1672014)
 */
public class Detail_transaksiDaoImpl implements
        DaoService<Detail_transaksi> {

    @Override
    public int addData(Detail_transaksi object) {
        int result = 0;
        try {
            try (Connection connection = Koneksi.createConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "INSERT INTO detail_transaksi(transaksi_kd_Transaksi,barang_kd_Barang,jml,saling_price) VALUES (?,?,?,?)";

                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getTransaksi_kd_Transaksi().
                        getKd_Transaksi());
                ps.setInt(2, object.getBarang_kd_Barang().getKd_Barang());
                ps.setInt(3, object.getJml());
                ps.setInt(4, object.getSaling_price());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Detail_transaksiDaoImpl.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int deleteData(Detail_transaksi object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(Detail_transaksi object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detail_transaksi> showAllData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detail_transaksi getData(Detail_transaksi id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
