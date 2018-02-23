/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.entity.Barang;
import com.lydia.entity.Transaksi;
import java.net.URL;
import java.util.ResourceBundle;
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
    private TableColumn<Barang, Integer> colKd_Barang;
    @FXML
    private TableColumn<Barang, Integer> colNm_Barang;
    @FXML
    private TableColumn<Transaksi, Integer> colJumlah;
    @FXML
    private TableColumn<Barang, Integer> colHarga;
    @FXML
    private TableColumn<Transaksi, Integer> colTotal;
    @FXML
    private ComboBox<Barang> comboListBarang;
    @FXML
    private Button btnAddToCart;
    @FXML
    private Button btnHapusCart;
    @FXML
    private Button btnSubmit;

    @FXML
    private TableView<Transaksi> tableTransaksi;
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

    public void setHomeController(
            I_HomeController i_homeController) {
        this.i_homeController = i_homeController;
        tableTransaksi.setItems(i_homeController.getCarts());
//        comboListBarang.setItems(i_homeController.getBarangs());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colKd_Barang.
                setCellValueFactory(data -> data.getValue().
                kd_BarangProperty().asObject());
        colNm_Barang.
                setCellValueFactory(data -> data.getValue().
                nm_BarangProperty());
        colJumlah.setCellValueFactory(data -> data.getValue().
                jmlProperty().asObject);
        colHarga.setCellValueFactory(data -> data.getValue().
                jmlProperty().asObject);
        colTotal.setCellValueFactory(data -> data.getValue().
                jmlProperty().asObject);
    }

    @FXML
    private void btnAddToCartOnAction(ActionEvent event) {
    }

    @FXML
    private void btnHapusTCartOnAction(ActionEvent event) {
    }

    @FXML
    private void btnSubmitOnAction(ActionEvent event) {
    }

}
