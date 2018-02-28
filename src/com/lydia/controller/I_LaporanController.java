/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.entity.Detail_transaksi;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Lydia (1672014)
 */
public class I_LaporanController implements Initializable {

    @FXML
    private TableView<Detail_transaksi> tableLaporanPenjualan;
    @FXML
    private TableView<Detail_transaksi> tableLaporanPenjualanTertinggi;
    @FXML
    private BorderPane borderPane;
    @FXML
    private DatePicker dpDari;
    @FXML
    private DatePicker dpSampai;
    @FXML
    private Button btnLapor;
    @FXML
    private TableColumn<Detail_transaksi, String> colTglLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colNoTransaksiLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colKdBarangLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colNmBarangLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colHargaLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colJmlTerjualLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colTotalLaporan;
    @FXML
    private TableColumn<Detail_transaksi, String> colTglTertinggi;
    @FXML
    private TableColumn<Detail_transaksi, String> colNoTransaksiTertinggi;
    @FXML
    private TableColumn<Detail_transaksi, String> colKdBarangTertinggi;
    @FXML
    private TableColumn<Detail_transaksi, String> colNmBarangTertingi;
    @FXML
    private TableColumn<Detail_transaksi, String> colHargaTertinggi;
    @FXML
    private TableColumn<Detail_transaksi, String> colJmlTerjualTertinggi;
    @FXML
    private TableColumn<Detail_transaksi, String> colTotalTertinggi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colTglLaporan.setCellValueFactory((
                TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getTgl_Transaksi())));

        colNoTransaksiLaporan.setCellValueFactory((
                TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getTransaksi_kd_Transaksi())));
        colKdBarangLaporan.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getBarang_kd_Barang())));

        colNmBarangLaporan.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getBarang_kd_Barang().getNm_Barang())));

        colHargaLaporan.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getSaling_price())));

        colJmlTerjualLaporan.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getJml())));

        colTotalLaporan.
                setCellValueFactory((
                        TableColumn.CellDataFeatures<Detail_transaksi, String> param)
                        -> new SimpleStringProperty(String.valueOf(param.
                        getValue().getBarang_kd_Barang())));
    }

    @FXML
    private void btnBackAction(ActionEvent event) {
    }

    @FXML
    private void btnLaporOnAction(ActionEvent event) {
    }

}
