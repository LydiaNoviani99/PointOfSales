/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.dao.UserDaoImpl;
import com.lydia.entity.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    private ObservableList<User> users;

    private UserDaoImpl userDaoImpl;

    private I_LoginController i_LoginController;

    public ObservableList<User> getUsers() {
        if (users == null) {
            users = FXCollections.observableArrayList();
            users.addAll(getUserDaoImpl().showAllData());
        }
        return users;
    }

    public UserDaoImpl getUserDaoImpl() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }

    /**
     * 11 Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //        if (role == 1) {
        //            menuKelolaDataBarang.setDisable(true);
        //            menuCetakBarang.setDisable(true);
        //            menuKelolaDataUser.setDisable(true);
        //            menuCetakUser.setDisable(true);
        //            menuKelolaDataTransaksi.setDisable(true);
        //            menuCetakTransaksi.setDisable(true);
        //
        //        }
    }

    public void setLoginController(I_LoginController i_LoginController) {
        this.i_LoginController = i_LoginController;
    }

    private Object getCategoryDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
