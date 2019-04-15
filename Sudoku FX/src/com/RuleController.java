/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class RuleController extends FirstStage implements Initializable {

    @FXML
    private Button btnPrevious;
    @FXML
    private Button btnQuit;

    @FXML
    private void btnPreviousAction(ActionEvent event) throws Exception {
        leaderboard = "";
        root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
        scene = new Scene(root);
    //    stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Sudoku");
        stage.show();
    //    ((Node) (event.getSource())).getScene().getWindow().hide(); // for hiding previous scene 

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
        // TODO
    }

}
