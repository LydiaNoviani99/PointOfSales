/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class I_TransaksiController implements Initializable {

    @FXML
    private TableView<?> tableTransaksi;
    @FXML
    private TextField txtCariTransaksi;
    @FXML
    private TextField txtTglTransaksi;
    @FXML
    private TextField txtNoTransaksi;
    @FXML
    private TextField txtKodeBarang;
    @FXML
    private TextField txtNamaBarang;
    @FXML
    private TextField txtJumlah;
    @FXML
    private TextField txtHarga;
    @FXML
    private TextField txtKembalian;
    @FXML
    private TextField txtBayar;
    @FXML
    private TextField txtTotalBelanja;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnSimpanTransaksiAction(ActionEvent event) {
    }

    @FXML
    private void btnHapusTransaksiAction(ActionEvent event) {
    }

    @FXML
    private void btnCariTransaksiAction(ActionEvent event) {
    }

}
