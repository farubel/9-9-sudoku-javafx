/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.FirstStage.stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class ScoreBoardController extends FirstStage implements Initializable {
    @FXML
    private Label score ;
    @FXML
    private void btnPreviousAction(ActionEvent event) throws Exception {
        leaderboard = "";
        root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();

    }
    @FXML
    private void btnQuitAction(ActionEvent event) throws Exception {
        //    System.out.println(leaderboard);
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
        score.setText(CongratsController.leaderboard);
        CongratsController.leaderboard = "";
    }

}
