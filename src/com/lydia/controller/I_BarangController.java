/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.dao.BarangDaoImpl;
import com.lydia.dao.KategoriDaoImpl;
import com.lydia.entity.Barang;
import com.lydia.entity.Kategori;
import com.lydia.utility.Utility;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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
    private TextField txtKodeBarang;
    @FXML
    private TextField txtNamaBarang;
    @FXML
    private TextField txtHargaBeli;
    @FXML
    private TextField txtHargaJual;
    @FXML
    private ComboBox<Kategori> comboKategoriBarang;
    @FXML
    private BorderPane bpBarang;

    private Stage homeStage;
    private BarangDaoImpl barangDaoImpl;
    private ObservableList<Barang> barangs;

    private KategoriDaoImpl kategoriDaoImpl;
    private ObservableList<Kategori> kategoris;

    @FXML
    private TableColumn<Barang, Integer> colKd_Barang;
    @FXML
    private TableColumn<Barang, String> colNm_Barang;
    @FXML
    private TableColumn<Barang, Integer> colHrg_Beli;
    @FXML
    private TableColumn<Barang, Integer> colHrg_Jual;
    @FXML
    private TableColumn<Barang, String> col_Kategori;

    public Barang selectedBarang;
    @FXML
    private Button btnSimpanBarang;
    @FXML
    private Button btnUbahBarang;
    @FXML
    private Button btnHapusBarang;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableBarang.setItems(getBarangs());
        colKd_Barang.
                setCellValueFactory(data -> data.getValue().
                kd_BarangProperty().asObject());
        colHrg_Beli.
                setCellValueFactory(data -> data.getValue().
                hrg_BeliProperty().asObject());
        colHrg_Jual.
                setCellValueFactory(data -> data.getValue().
                hrg_JualProperty().asObject());
        colNm_Barang.
                setCellValueFactory(data -> data.getValue().nm_BarangProperty());
        col_Kategori.
                setCellValueFactory(data -> data.getValue().
                getKategori_Id_Kategori().ket_KategoriProperty());
        getKategoris();
        comboKategoriBarang.setItems(kategoris);
    }

    @FXML
    private void btnCariBarangAction(ActionEvent event) {
    }

    @FXML
    private void btnSimpanBarangAction(ActionEvent event) {
        Utility utility = new Utility();
        if (selectedBarang == null) {
            if (!utility.isEmptyField(txtNamaBarang, txtHargaBeli,
                    txtHargaJual)) {
                Barang barang = new Barang();
                Kategori kategori = new Kategori();
                barang.setNm_Barang(txtNamaBarang.getText().trim());
                barang.setHrg_Beli(Integer.
                        valueOf(txtHargaBeli.getText().trim()));
                barang.setHrg_Jual(Integer.
                        valueOf(txtHargaJual.getText().trim()));
                kategori.setId_Kategori(comboKategoriBarang.getValue().
                        getId_Kategori());
                kategori.setKet_Kategori(comboKategoriBarang.getValue().
                        getKet_Kategori());
                barang.setKategori_Id_Kategori(kategori);
                if (getBarangDao().addData(barang) == 1) {
                    getBarangs().clear();;
                    getBarangs().addAll(getBarangDao().showAllData());
//
//                barangs.addAll(getBarangDao().showAllData());
                    tableBarang.refresh();
                }

//            mengkosongkan teks field setelah isi data
                txtNamaBarang.clear();
                txtHargaBeli.clear();
                txtHargaJual.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Isi semua terlebih dahulu");
                alert.showAndWait();
            }
        } else {
            if (!utility.isEmptyField(txtNamaBarang, txtHargaBeli,
                    txtHargaJual)) {
                Barang barang = new Barang();
                Kategori kategori = new Kategori();
                barang.setKd_Barang(selectedBarang.getKd_Barang());
                barang.setNm_Barang(txtNamaBarang.getText().trim());
                barang.setHrg_Beli(Integer.
                        valueOf(txtHargaBeli.getText().trim()));
                barang.setHrg_Jual(Integer.
                        valueOf(txtHargaJual.getText().trim()));
                kategori.setId_Kategori(comboKategoriBarang.getValue().
                        getId_Kategori());
                kategori.setKet_Kategori(comboKategoriBarang.getValue().
                        getKet_Kategori());
                barang.setKategori_Id_Kategori(kategori);
                if (getBarangDao().updateData(barang) == 1) {
                    getBarangs().clear();;
                    getBarangs().addAll(getBarangDao().showAllData());
//
//                barangs.addAll(getBarangDao().showAllData());
                    tableBarang.refresh();
                }

//            mengkosongkan teks field setelah isi data
                txtNamaBarang.clear();
                txtHargaBeli.clear();
                txtHargaJual.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Isi semua terlebih dahulu");
                alert.showAndWait();
            }
        }

    }

    @FXML
    private void btnUbahBarangAction(ActionEvent event
    ) {
//
    }

    @FXML
    private void btnHapusBarangAction(ActionEvent event
    ) {
        Utility utility = new Utility();
        if (!utility.isEmptyField(txtNamaBarang, txtHargaBeli,
                txtHargaJual)) {
            Barang barang = new Barang();
            Kategori kategori = new Kategori();
            barang.setKd_Barang(selectedBarang.getKd_Barang());
            barang.setNm_Barang(txtNamaBarang.getText().trim());
            barang.setHrg_Beli(Integer.
                    valueOf(txtHargaBeli.getText().trim()));
            barang.setHrg_Jual(Integer.
                    valueOf(txtHargaJual.getText().trim()));
            kategori.setId_Kategori(comboKategoriBarang.getValue().
                    getId_Kategori());
            kategori.setKet_Kategori(comboKategoriBarang.getValue().
                    getKet_Kategori());
            barang.setKategori_Id_Kategori(kategori);
            if (getBarangDao().deleteData(barang) == 1) {
                getBarangs().clear();;
                getBarangs().addAll(getBarangDao().showAllData());
//
//                barangs.addAll(getBarangDao().showAllData());
                tableBarang.refresh();
            }

//            mengkosongkan teks field setelah isi data
            txtNamaBarang.clear();
            txtHargaBeli.clear();
            txtHargaJual.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Isi semua terlebih dahulu");
            alert.showAndWait();
        }

    }

    @FXML
    private void btnBackOnAction(ActionEvent event
    ) {
//        try {
//            homeStage = new Stage();
//            FXMLLoader loader = new FXMLLoader();
//            loader setLocation(MainApp.class getResource("view/i_Home.fxml")
//            );
//            BorderPane borderPane = loader.load();
//            Scene scene = new Scene(borderPane);
//            I_HomeController i_HomeController = loader.getController();
//
//            homeStage.setScene(scene);
//            homeStage.show();
//
//            bpBarang.getScene().getWindow().hide();
//
//        } catch (IOException ex) {
//            Logger.getLogger(I_LoginController.class
//                    .getName()).log(
//                            Level.SEVERE, null, ex);
//        }
    }

    public ObservableList<Barang> getBarangs() {
        if (barangs == null) {
            barangs = FXCollections.observableArrayList();
            barangs.addAll(getBarangDao().showAllData());
        }
        return barangs;
    }

    public BarangDaoImpl getBarangDao() {
        if (barangDaoImpl == null) {
            barangDaoImpl = new BarangDaoImpl();
        }
        return barangDaoImpl;
    }

    public ObservableList<Kategori> getKategoris() {
        if (kategoris == null) {
            kategoris = FXCollections.observableArrayList();
            kategoris.addAll(getKategoriDao().showAllData());
        }
        return kategoris;
    }

    public KategoriDaoImpl getKategoriDao() {
        if (kategoriDaoImpl == null) {
            kategoriDaoImpl = new KategoriDaoImpl();
        }
        return kategoriDaoImpl;
    }

    @FXML
    private void tableBarangOnClicked(MouseEvent event) {
        selectedBarang = tableBarang.getSelectionModel().getSelectedItem();
        btnHapusBarang.setDisable(false);

        if (selectedBarang != null) {
            txtNamaBarang.setText(selectedBarang.getNm_Barang());
            txtHargaBeli.setText(String.valueOf(selectedBarang.getHrg_Beli()));
            txtHargaJual.setText(String.valueOf(selectedBarang.getHrg_Jual()));
            comboKategoriBarang.setValue(selectedBarang.
                    getKategori_Id_Kategori());
        }

    }

}
