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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lydia (1672014)
 */
public class I_LoginController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private BorderPane bpLogin;
    private Stage i_homeController;
    private I_HomeController i_HomeController;

    public I_HomeController getI_HomeController() {
        if (i_HomeController == null) {
            i_HomeController = new I_HomeController();
        }
        return i_HomeController;
    }

    public void setI_HomeController(I_HomeController i_HomeController) {
        this.i_HomeController = i_HomeController;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLoginAction(ActionEvent event) throws IOException {
        User user = new User();
        user.setUsername_access(txtUsername.getText());
        user.setPassword_access(txtPassword.getText());
        if (txtUsername.getText().trim().isEmpty() || txtPassword.getText().
                trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all field");
            alert.showAndWait();
        } else if (getUserDao().getData(user) != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Login berhasil");
            alert.showAndWait();
            try {
                if (i_homeController == null) {
                    i_homeController = new Stage();
                    i_homeController.setTitle("Home Controller");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource(
                            "view/i_Home.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root);
                    I_HomeController i_HomeController = loader.
                            getController();
                    i_HomeController.setLoginController(this);
                    i_homeController.setScene(scene);
                    i_homeController.initOwner(bpLogin.getScene().getWindow());
                    i_homeController.initModality(Modality.WINDOW_MODAL);
                }
                if (!i_homeController.isShowing()) {
                    i_homeController.show();
                } else {
                    i_homeController.toFront();
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            //Close login stage
            //bpLogin.getScene().getWindow().hide();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid username or password");
            alert.showAndWait();
        }
    }

    public UserDaoImpl getUserDao() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

    private ObservableList<User> users;

    public ObservableList<User> getUser() {
        if (users == null) {
            users = FXCollections.observableArrayList();
            users.addAll(getUserDao().showAllData());
        }
        return users;
    }
    private UserDaoImpl userDao;
}
