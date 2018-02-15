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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Lydia (1672014)
 */
public class I_BarangController implements Initializable {

    @FXML
    private TableView<?> tableBarang;
    @FXML
    private TextField txtCariBarang;
    @FXML
    private TextField txtKodeBarang;
    @FXML
    private TextField txtNamaBarang;
    @FXML
    private TextField txtJumlah;
    @FXML
    private TextField txtHargaBeli;
    @FXML
    private TextField txtHargaJual;
    @FXML
    private ComboBox<?> comboKategoriBarang;
    @FXML
    private BorderPane bpBarang;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnCariBarangAction(ActionEvent event) {
    }

    @FXML
    private void btnSimpanBarangAction(ActionEvent event) {
    }

    @FXML
    private void btnUbahBarangAction(ActionEvent event) {
    }

    @FXML
    private void btnHapusBarangAction(ActionEvent event) {
    }

    @FXML
    private void btnBackAction(ActionEvent event) {
    }

}
