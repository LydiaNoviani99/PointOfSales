/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class I_KaryawanController implements Initializable {

    @FXML
    private BorderPane bpUser;
    @FXML
    private TextField txtCariUser;
    @FXML
    private TableView<?> tableUser;
    @FXML
    private TextField txtKodePegawai;
    @FXML
    private TextField txtNamaPegawai;
    @FXML
    private RadioButton radioPerempuan;
    @FXML
    private RadioButton radioLakiLaki;
    @FXML
    private TextField txtAgama;
    @FXML
    private TextField txtAlamat;
    @FXML
    private TextField txtNoHp;
    @FXML
    private TextField txtUsernameAccess;
    @FXML
    private ComboBox<?> comboDivisi;
    @FXML
    private TextField txtPasswordAccess;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
