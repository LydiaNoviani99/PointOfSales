/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.MainApp;
import com.lydia.dao.UserDaoImpl;
import com.lydia.entity.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
    private Menu menuAbout;
    @FXML
    private BorderPane bpHome;

    private Stage homeStage;
    private Stage barangStage;
    private Stage userStage;
    private Stage transaksiStage;

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

    }

    //FILE
    @FXML
    private void menuFileOnAction(ActionEvent event) {
    }

    @FXML
    private void menuLogoutOnAction(ActionEvent event) {
        try {
            homeStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/i_Login.fxml"));
            BorderPane borderPane = loader.load();
            Scene scene = new Scene(borderPane);
            I_LoginController i_LoginController = loader.getController();
            homeStage.setScene(scene);
            homeStage.showAndWait();

            bpHome.getScene().getWindow().hide();
        } catch (IOException ex) {
            Logger.getLogger(I_LoginController.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void menuExitOnAction(ActionEvent event) {
        Platform.exit();
    }

    //DATA BARANG
    @FXML
    private void menuDataBarangOnAction(ActionEvent event) {
    }

    @FXML
    private void menuKelolaDataBarangOnAction(ActionEvent event) {
        try {
            barangStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/i_Barang.fxml"));
            BorderPane borderPane = loader.load();
            Scene scene = new Scene(borderPane);
            I_BarangController i_BarangController = loader.getController();

            barangStage.initOwner(bpHome.getScene().getWindow());
            barangStage.initModality(Modality.WINDOW_MODAL);

            barangStage.setScene(scene);
            barangStage.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(I_LoginController.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void menuCetakBarangOnAction(ActionEvent event) {
    }

    //USER
    @FXML
    private void menuDataUserOnAction(ActionEvent event) {
    }

    @FXML
    private void menuKelolaDataUserOnAction(ActionEvent event) {
        try {
            userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/i_User.fxml"));
            BorderPane borderPane = loader.load();
            Scene scene = new Scene(borderPane);
            I_UserController i_UserController = loader.getController();

            userStage.initOwner(bpHome.getScene().getWindow());
            userStage.initModality(Modality.WINDOW_MODAL);

            userStage.setScene(scene);
            userStage.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(I_LoginController.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void menuCetakUserOnAction(ActionEvent event) {
    }

    //DATA TRANSAKSI
    @FXML
    private void menuTransaksiOnAction(ActionEvent event) {
    }

    @FXML
    private void menuKelolaDataTransaksiOnAction(ActionEvent event) {
        try {
            transaksiStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.
                    setLocation(MainApp.class.
                            getResource("view/i_Transaksi.fxml"));
            BorderPane borderPane = loader.load();
            Scene scene = new Scene(borderPane);
            I_TransaksiController i_TransaksiController = loader.getController();

            transaksiStage.initOwner(bpHome.getScene().getWindow());
            transaksiStage.initModality(Modality.WINDOW_MODAL);

            transaksiStage.setScene(scene);
            transaksiStage.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(I_LoginController.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void menuCetakTransaksiOnAction(ActionEvent event) {
    }

    //LAPORAN
    @FXML
    private void menuLaporanOnAction(ActionEvent event) {
    }

    @FXML
    private void menuLaporanPenjualanOnAction(ActionEvent event) {
    }

    //ABOUT
    @FXML
    private void menuAboutOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Lydia - 1672014");
        alert.show();
    }

    public void setLoginController(I_LoginController aThis) {
        this.i_LoginController = aThis;
        if (i_LoginController.getSelectedUser().getRoleProperty().getId_Role()
                == 1) {
            menuFile.setDisable(false);
            menuDataBarang.setDisable(false);
            menuDataUser.setDisable(false);
            menuTransaksi.setDisable(true);
            menuLaporan.setDisable(false);

        } else if (i_LoginController.getSelectedUser().getRoleProperty().
                getId_Role() == 2) {
            menuFile.setDisable(false);
            menuDataBarang.setDisable(true);
            menuDataUser.setDisable(true);
            menuTransaksi.setDisable(false);
            menuLaporan.setDisable(true);
        }
    }

    public void setListUserController(I_LoginController i_LoginController) {
        this.i_LoginController = i_LoginController;

    }

}
