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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Lydia (1672014)
 */
public class I_HomeController implements Initializable {

    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu menuFile;
    @FXML
    private MenuItem menuLogout;
    @FXML
    private MenuItem menuExit;
    @FXML
    private Menu menuDataBarang;
    @FXML
    private MenuItem menuKelolaDataBarang;
    @FXML
    private MenuItem menuCetakBarang;
    @FXML
    private Menu menuDataUser;
    @FXML
    private MenuItem menuKelolaDataUser;
    @FXML
    private MenuItem menuCetakUser;
    @FXML
    private Menu menuTransaksi;
    @FXML
    private MenuItem menuKelolaDataTransaksi;
    @FXML
    private MenuItem menuCetakTransaksi;
    @FXML
    private Menu menuLaporan;
    @FXML
    private MenuItem menuLaporanPenjualan;
    @FXML
    private ImageView imgLogo;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
