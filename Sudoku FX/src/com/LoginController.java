/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class LoginController extends FirstStage implements Initializable{
    @FXML
    private ImageView ivRubel ;

    @FXML
    private Label lblMessage;
    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnEnter;
    @FXML
    private void btnEnterAction(ActionEvent event)  throws Exception {
           txtUsername.getText();
           user_name  = txtUsername.getText() ;
       if ( user_name.length() >=1 ) {
            
            root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
            scene = new Scene(root);
        //    stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Sudoko");
            stage.show();  
        //    ((Node) (event.getSource())).getScene().getWindow().hide(); // for hiding previous scene 
        } else {    
            lblMessage.setText("User Name Invalid ! ");
        }
    }

    @FXML
    private void btnQuitAction(ActionEvent event) throws Exception {
        System.exit(0);
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        lblMessage.setText("Welcome !") ;
        // TODO
    }

}
