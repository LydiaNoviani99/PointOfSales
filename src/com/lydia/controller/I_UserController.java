/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.entity.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
 * @author Lydia (1672014)
 */
public class I_UserController implements Initializable {

    @FXML
    private TextField txtCariUser;
    @FXML
    private TableView<User> tableUser;
    @FXML
    private TextField txtKodeUser;
    @FXML
    private TextField txtNamaUser;
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
    @FXML
    private BorderPane bpUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnCariUserAction(ActionEvent event) {
    }

    @FXML
    private void btnSimpanUserAcction(ActionEvent event) {
    }

    @FXML
    private void btnUbahUserAction(ActionEvent event) {
    }

    @FXML
    private void btnHapusUserAction(ActionEvent event) {
    }

    @FXML
    private void btnBackAction(ActionEvent event) {
    }

}
