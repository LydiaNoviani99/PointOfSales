/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.dao.RoleDaoImpl;
import com.lydia.dao.UserDaoImpl;
import com.lydia.entity.Role;
import com.lydia.entity.User;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class I_UserKaryawanController implements Initializable {

    @FXML
    private BorderPane bpUser;
    @FXML
    private TextField txtCariUser;
    @FXML
    private Button btnCariUser;
    @FXML
    private TableView<User> tableUser;
    @FXML
    private TableColumn<User, String> colNm_User;
    @FXML
    private TableColumn<User, ?> colJK;
    @FXML
    private TableColumn<User, String> colAgama;
    @FXML
    private TableColumn<User, String> colAlamat;
    @FXML
    private TableColumn<User, String> colNo_HP;
    @FXML
    private TableColumn<User, String> colUsername_Access;
    @FXML
    private TableColumn<User, String> colJabatan;
    @FXML
    private TextField txtNamaUser;
    private RadioButton radioPerempuan;
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
    private TextField txtPasswordAccess;

    @FXML
    private TextField txtVerifyPassword;

    private UserDaoImpl userDaoImpl;
    private ObservableList<User> users;

    private RoleDaoImpl roleDaoImpl;
    private ObservableList<Role> roles;

    public User selectedUser;
    @FXML
    private ComboBox<Role> comboJabatanUser;
    @FXML
    private ToggleGroup jeniskelamin;
    @FXML
    private RadioButton radioPria;
    @FXML
    private RadioButton radioWanita;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableUser.setItems(getUsers());
//        colKd_Barang.
//                setCellValueFactory(data -> data.getValue().
//                kd_BarangProperty().asObject());
        colNm_User.
                setCellValueFactory(data -> data.getValue().
                nm_UserProperty());

//        colJK.
//                setCellValueFactory(data -> data.getValue().
//                jenis_kelaminProperty().asObject());
//        if (users.getValue().getJenisKelamin() == 1) {
//            colJK.setCellValueFactory(
//                    new PropertyValueFactory<>("jenis_kelamin"));
//        } else if (users.getValue().getJenisKelamin() == 2) {
//            colJK.setCellValueFactory(
//                    new PropertyValueFactory<>("jenis_kelamin"));
//        }
        colAgama.
                setCellValueFactory(data -> data.getValue().agamaProperty());
        colAlamat.
                setCellValueFactory(data -> data.getValue().alamatProperty());
        colNo_HP.
                setCellValueFactory(data -> data.getValue().no_HpProperty());
        colUsername_Access.
                setCellValueFactory(data -> data.getValue().
                username_accessProperty());
//        colJabatan.
//                setCellValueFactory(data -> data.getValue().getRole_Id_Role().
//                ket_RoleProperty());
        getRoles();
        comboJabatanUser.setItems(roles);
    }

    @FXML
    private void btnCariUserAction(ActionEvent event) {
    }

    @FXML
    private void btnSimpanUserAcction(ActionEvent event) {
        Utility utility = new Utility();
        if (selectedUser == null) {
            if (!utility.isEmptyField(txtNamaUser, txtAgama,
                    txtAlamat, txtNoHp, txtUsernameAccess, txtPasswordAccess,
                    txtVerifyPassword)) {
                User user = new User();
                Role role = new Role();
                user.setNm_User(txtNamaUser.getText().trim());
//                user.setJenis_kelamin(Integer.
//                        valueOf(txtHargaBeli.getText().trim()));
                user.setAgama(txtAgama.getText().trim());
                user.setAlamat(txtAlamat.getText().trim());
                user.setNo_Hp(txtNoHp.getText().trim());
                user.setUsername_access(txtUsernameAccess.getText().trim());
                user.setPassword_access(txtPasswordAccess.getText().trim());
                role.setId_Role(comboJabatanUser.getValue().getId_Role());
                role.setKet_Role(comboJabatanUser.getValue().
                        getKet_Role());
                user.setRole_Id_Role(role);

                if (jeniskelamin.getSelectedToggle().equals(radioPria)) {
                    user.setJenis_kelamin(1);
                } else if (jeniskelamin.getToggles().equals(radioWanita)) {
                    user.setJenis_kelamin(2);
                }

                if (txtVerifyPassword.getText().equals(txtPasswordAccess.
                        getText())) {
                    if (getUserDao().addData(user) == 1) {
                        getUsers().clear();;
                        getUsers().addAll(getUserDao().showAllData());

                        tableUser.refresh();

//                    tableBarang.getSortOrder().add(colKd_Barang);
                        //mengkosongkan teks field setelah isi data
                        txtNamaUser.clear();
                        txtAgama.clear();
                        txtAlamat.clear();
                        txtNoHp.clear();
                        txtUsernameAccess.clear();
                        txtPasswordAccess.clear();
                        txtVerifyPassword.clear();
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Password Tidak Sama, Isi Lagi!");
                    alert.showAndWait();
                }

                user.setRole_Id_Role(comboJabatanUser.getValue());

            }
        } else {
            if (!utility.isEmptyField(txtNamaUser, txtAgama,
                    txtAlamat, txtNoHp, txtUsernameAccess, txtPasswordAccess,
                    txtVerifyPassword)) {
                User user = new User();
                Role role = new Role();
                user.setNm_User(txtNamaUser.getText().trim());
//                user.setJenis_kelamin(Integer.
//                        valueOf(txtHargaBeli.getText().trim()));
                user.setAgama(txtAgama.getText().trim());
                user.setAlamat(txtAlamat.getText().trim());
                user.setNo_Hp(txtNoHp.getText().trim());
                user.setUsername_access(txtUsernameAccess.getText().trim());
                user.setPassword_access(txtPasswordAccess.getText().trim());
//                user.setVerifyPassword(txtVerifyPassword.getText().trim());
                role.setId_Role(comboJabatanUser.getValue().getId_Role());
                role.setKet_Role(comboJabatanUser.getValue().
                        getKet_Role());
                user.setRole_Id_Role(role);

                if (jeniskelamin.getSelectedToggle().equals(radioPerempuan)) {
                    user.setJenis_kelamin(2);
                } else if (jeniskelamin.getToggles().equals(radioLakiLaki)) {
                    user.setJenis_kelamin(1);
                }

                if (txtVerifyPassword.getText().equals(txtPasswordAccess.
                        getText())) {
                    if (getUserDao().updateData(user) == 1) {
                        getUsers().clear();;
                        getUsers().addAll(getUserDao().showAllData());

                        tableUser.refresh();

//                    tableBarang.getSortOrder().add(colKd_Barang);
                        //mengkosongkan teks field setelah isi data
                        txtNamaUser.clear();
                        txtAgama.clear();
                        txtAlamat.clear();
                        txtNoHp.clear();
                        txtUsernameAccess.clear();
                        txtPasswordAccess.clear();
                        txtVerifyPassword.clear();
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Password Tidak Sama, Isi Lagi!");
                    alert.showAndWait();
                }

                user.setRole_Id_Role(comboJabatanUser.getValue());
            }
        }
    }

    @FXML
    private void btnHapusUserAction(ActionEvent event
    ) {
    }

    @FXML
    private void btnBackAction(ActionEvent event
    ) {
    }

    public ObservableList<User> getUsers() {
        if (users == null) {
            users = FXCollections.observableArrayList();
            users.addAll(getUserDao().showAllData());
        }
        return users;
    }

    public UserDaoImpl getUserDao() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }

    public ObservableList<Role> getRoles() {
        if (roles == null) {
            roles = FXCollections.observableArrayList();
            roles.addAll(getRoleDao().showAllData());
        }
        return roles;
    }

    public RoleDaoImpl getRoleDao() {
        if (roleDaoImpl == null) {
            roleDaoImpl = new RoleDaoImpl();
        }
        return roleDaoImpl;
    }

    @FXML
    private void tableUserOnClicked(MouseEvent event) {
        selectedUser = tableUser.getSelectionModel().getSelectedItem();
//        btnHapusUser.setDisable(false);

        if (selectedUser != null) {
            txtNamaUser.setText(selectedUser.getNm_User());
            txtAgama.setText(selectedUser.getAgama());
            txtAlamat.setText(selectedUser.getAlamat());
            txtNoHp.setText(selectedUser.getNo_Hp());
            txtUsernameAccess.setText(selectedUser.getUsername_access());
            txtPasswordAccess.setText(selectedUser.getPassword_access());
//            txtVerifyPassword.setText(selectedUser.getVerifyPassword());

//            comboKategoriBarang.setValue(selectedUser.
//                    getKategori_Id_Kategori());
        }
    }

}
