/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.MainApp;
import com.lydia.dao.BarangDaoImpl;
import com.lydia.entity.Barang;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lydia (1672014)
 */
public class I_BarangController implements Initializable {

    @FXML
    private TableView<Barang> tableBarang;
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

    private Stage homeStage;
    private BarangDaoImpl barangDaoImpl;
    private ObservableList<Barang> barangs;
    @FXML
    private TableColumn<Barang, Integer> colKd_Barang;
    @FXML
    private TableColumn<Barang, String> colNm_Barang;
    @FXML
    private TableColumn<Barang, Integer> colHrg_Beli;
    @FXML
    private TableColumn<Barang, Integer> colHrg_Jual;
    @FXML
    private TableColumn<Barang, Integer> col_Kategori;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableBarang.setItems(getBarangs());
        colKd_Barang.
                setCellValueFactory(param -> param.getValue().
                kd_BarangProperty().asObject());
        colHrg_Beli.
                setCellValueFactory(param -> param.getValue().
                hrg_BeliProperty().asObject());
        colHrg_Jual.
                setCellValueFactory(param -> param.getValue().
                hrg_JualProperty().asObject());
        colNm_Barang.
                setCellValueFactory(data -> data.getValue().nm_BarangProperty());
        col_Kategori.
                setCellValueFactory(data -> data.getValue().
                kategori_Id_KategoriProperty());

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
    private void btnBackOnAction(ActionEvent event) {
        try {
            homeStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.
                    setLocation(MainApp.class.
                            getResource("view/i_Home.fxml"));
            BorderPane borderPane = loader.load();
            Scene scene = new Scene(borderPane);
            I_HomeController i_HomeController = loader.getController();

            homeStage.setScene(scene);
            homeStage.show();

            bpBarang.getScene().getWindow().hide();
        } catch (IOException ex) {
            Logger.getLogger(I_LoginController.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    public ObservableList<Barang> getBarangs() {
        if (barangs == null) {
            barangs = FXCollections.observableArrayList();
            barangs.addAll(getBarangDaoImpl().showAllData());
            System.out.println("barang : " + barangs.size());
        }
        return barangs;
    }

    public BarangDaoImpl getBarangDaoImpl() {
        if (barangDaoImpl == null) {
            barangDaoImpl = new BarangDaoImpl();
        }
        return barangDaoImpl;
    }

}
