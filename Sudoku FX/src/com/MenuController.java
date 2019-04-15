/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.CongratsController.leaderboard;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class MenuController extends FirstStage implements Initializable {

    @FXML
    private Button btnEasy;
    @FXML
    private Button btnMedium;
    @FXML
    private Button btnHard;
    @FXML
    private Button btnRule;
    @FXML
    private Button btnQuit;
    @FXML
    private Label name;

    @FXML
    private void btnEasyAction(ActionEvent event) throws Exception {
        flag = 1;
        root = FXMLLoader.load(getClass().getResource("/com/Easy.fxml"));
        scene = new Scene(root);
        //    stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Play !");
        stage.show();
        //    ((Node) (event.getSource())).getScene().getWindow().hide(); // for hiding previous scene 
    }

    @FXML
    private void btnMediumAction(ActionEvent event) throws Exception {
        flag = 2;
        root = FXMLLoader.load(getClass().getResource("/com/Medium.fxml"));
        scene = new Scene(root);
        //    stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Play !");
        stage.show();
        //    ((Node) (event.getSource())).getScene().getWindow().hide(); // for hiding previous scene 
    }

    @FXML
    private void btnHardAction(ActionEvent event) throws Exception {
        flag = 3;
        root = FXMLLoader.load(getClass().getResource("/com/Hard.fxml"));
        scene = new Scene(root);
        //    stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Play !");
        stage.show();
        //    ((Node) (event.getSource())).getScene().getWindow().hide(); // for hiding previous scene 
    }

    @FXML
    private void btnBoardAction(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/com/ScoreBoard.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
    }

    @FXML
    private void btnRuleAction(ActionEvent event) throws Exception {

        root = FXMLLoader.load(getClass().getResource("/com/Rule.fxml"));
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
        name.setText("Hello " + user_name + " !");
        try {
            BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                leaderboard = leaderboard + str;
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

    }
}
