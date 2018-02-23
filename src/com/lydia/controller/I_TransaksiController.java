/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.dao.BarangDaoImpl;
import com.lydia.dao.TransaksiDaoImpl;
import com.lydia.entity.Barang;
import com.lydia.entity.Carts;
import com.lydia.entity.Detail_transaksi;
import com.lydia.entity.Transaksi;
import com.lydia.entity.User;
import com.lydia.utility.Utility;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Lydia (1672014)
 */
public class I_TransaksiController implements Initializable {

    @FXML
    private TableColumn<Carts, String> colKd_Barang;
    @FXML
    private TableColumn<Carts, String> colNm_Barang;
    @FXML
    private TableColumn<Carts, String> colJumlah;
    @FXML
    private TableColumn<Carts, String> colHarga;
    @FXML
    private TableColumn<Carts, String> colTotal;
    @FXML
    private ComboBox<Barang> comboListBarang;
    @FXML
    private Button btnAddToCart;
    @FXML
    private Button btnSubmit;

    @FXML
    private TableView<Detail_transaksi> tableTransaksi;
    @FXML
    private TextField txtTglTransaksi;
    @FXML
    private TextField txtNoTransaksi;
    @FXML
    private TextField txtJumlah;
    @FXML
    private TextField txtKembalian;
    @FXML
    private TextField txtTotalBelanja;
    @FXML
    private TextField txtNamaKasir;
    @FXML
    private BorderPane bpTransaksi;
    @FXML
    private TextField txtPembayaran;

    /**
     * Initializes the controller class.
     */
    private I_HomeController i_homeController;
    @FXML
    private TextField txtIdKasir;
    @FXML
    private Button btnCancelCart;

    public void setHomeController(
            I_HomeController i_homeController) {
        this.i_homeController = i_homeController;
        tableTransaksi.setItems(getCarts());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboListBarang.setItems(getBarangs());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        colKd_Barang.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Carts, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getKd_Barang())));
//                        + param.getValue().getBarang_kd_Barang().getNm_Barang()));
        colNm_Barang.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Carts, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getNm_Barang())));
        colJumlah.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Carts, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getJumlah())));
        colHarga.setCellValueFactory((
                TableColumn.CellDataFeatures<Carts, String> param)
                -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getSaling_Price())));
        colTotal.setCellValueFactory((
                TableColumn.CellDataFeatures<Carts, String> param)
                -> new SimpleStringProperty(String.valueOf(param.getValue().
                        getSaling_Price() * param.getValue().getJumlah())));

        txtTglTransaksi.setText(dateFormat.format(date));
//        txtIdKasir.setText(i_homeController.getSelectedUser().
//                getUsername_access());
//        txtNamaKasir.setText(i_homeController.getSelectedUser().getNm_User());
        txtNoTransaksi.setText("");
//        txtTotalBelanja.setText(Integer.valueOf());
//        txtKembalian.setText(Integer.valueOf());
    }

    @FXML
    private void btnAddToCartOnAction(ActionEvent event) {
        if (!Utility.isEmptyField(txtTglTransaksi, txtIdKasir, txtNamaKasir,
                txtNoTransaksi,
                txtJumlah, txtTotalBelanja, txtPembayaran, txtKembalian)) {
            Detail_transaksi detail_transaksi = new Detail_transaksi();
            Transaksi transaksi = new Transaksi();
            User user = new User();

            transaksi.setTgl_Transaksi(Timestamp.valueOf(txtTglTransaksi.
                    getText().trim()));
            user.setKd_User(Integer.valueOf(txtIdKasir.getText().trim()));
            user.setNm_User(txtNamaKasir.getText().trim());
            transaksi.setKd_Transaksi(Integer.valueOf(txtNoTransaksi.getText().
                    trim()));
            detail_transaksi.setJml(Integer.valueOf(txtJumlah.getText().trim()));
            // Total belanja
            transaksi.setPembayaran(Integer.valueOf(txtPembayaran.getText().
                    trim()));
            //Kembalian

            if (getTransactionDao().addData(transaksi) == 1) {
                getTransaksis().clear();
                getTransaksis().addAll(
                        getTransactionDao().showAllData());

                tableTransaksi.refresh();
            }
        }
    }

    @FXML
    private void btnSubmitOnAction(ActionEvent event) {
    }

    @FXML
    private void btnCancelCartOnAction(ActionEvent event) {
    }

    private ObservableList<Barang> barangs;
    private BarangDaoImpl barangDao;

    public BarangDaoImpl getBarangDao() {
        if (barangDao == null) {
            barangDao = new BarangDaoImpl();
        }
        return barangDao;
    }

    public ObservableList<Barang> getBarangs() {
        if (barangs == null) {
            barangs = FXCollections.observableArrayList();
            barangs.addAll(getBarangDao().showAllData());
        }
        return barangs;
    }

    private ObservableList<Transaksi> transaksis;
    private TransaksiDaoImpl transaksiDao;

    public TransaksiDaoImpl getTransactionDao() {
        if (transaksiDao == null) {
            transaksiDao = new TransaksiDaoImpl();
        }
        return transaksiDao;
    }

    public ObservableList<Transaksi> getTransaksis() {
        if (transaksis == null) {
            transaksis = FXCollections.observableArrayList();
            transaksis.addAll(getTransactionDao().showAllData());
        }
        return transaksis;
    }

    public ObservableList<Carts> getCarts() {
        if (carts == null) {
            carts = FXCollections.observableArrayList();
        }
        return carts;
    }

}
