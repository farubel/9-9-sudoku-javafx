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
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class SolveController extends FirstStage implements Initializable {

    @FXML
    private TextField arr00, arr01, arr02, arr03, arr04, arr05, arr06, arr07, arr08,
            arr10, arr11, arr12, arr13, arr14, arr15, arr16, arr17, arr18,
            arr20, arr21, arr22, arr23, arr24, arr25, arr26, arr27, arr28,
            arr30, arr31, arr32, arr33, arr34, arr35, arr36, arr37, arr38,
            arr40, arr41, arr42, arr43, arr44, arr45, arr46, arr47, arr48,
            arr50, arr51, arr52, arr53, arr54, arr55, arr56, arr57, arr58,
            arr60, arr61, arr62, arr63, arr64, arr65, arr66, arr67, arr68,
            arr70, arr71, arr72, arr73, arr74, arr75, arr76, arr77, arr78,
            arr80, arr81, arr82, arr83, arr84, arr85, arr86, arr87, arr88;
    @FXML
    private Button btnQuit;
    @FXML
    private Button btnPlayAgain;
    @FXML
    private Button btnPrevious;
    @FXML
    private void btnPreviousAction(ActionEvent event) throws Exception {
         leaderboard = "" ;
        root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
        scene = new Scene(root);
        //    stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
        //    ((Node) (event.getSource())).getScene().getWindow().hide(); // for hiding previous scene 

    }

    @FXML
    private void btnPlayAgainAction(ActionEvent event) throws Exception {
        if (flag == 1) {
            root = FXMLLoader.load(getClass().getResource("/com/Easy.fxml"));
        } else if (flag == 2) {
            root = FXMLLoader.load(getClass().getResource("/com/Medium.fxml"));
        } else if (flag == 3) {
            root = FXMLLoader.load(getClass().getResource("/com/Hard.fxml"));
        }
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

    private void gamePlan() {
        String S = "" + result[0][0];
        arr00.setText(S);
        arr00.setEditable(false);
        arr00.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][1];
        arr01.setText(S);
        arr01.setEditable(false);
        arr01.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][2];
        arr02.setText(S);
        arr02.setEditable(false);
        arr02.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][3];
        arr03.setText(S);
        arr03.setEditable(false);
        arr03.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][4];
        arr04.setText(S);
        arr04.setEditable(false);
        arr04.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][5];
        arr05.setText(S);
        arr05.setEditable(false);
        arr05.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][6];
        arr06.setText(S);
        arr06.setEditable(false);
        arr06.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][7];
        arr07.setText(S);
        arr07.setEditable(false);
        arr07.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[0][8];
        arr08.setText(S);
        arr08.setEditable(false);
        arr08.setStyle("-fx-text-inner-color: blue;");

        S = "" + result[1][0];
        arr10.setText(S);
        arr10.setEditable(false);
        arr10.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][1];
        arr11.setText(S);
        arr11.setEditable(false);
        arr11.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][2];
        arr12.setText(S);
        arr12.setEditable(false);
        arr12.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][3];
        arr13.setText(S);
        arr13.setEditable(false);
        arr13.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][4];
        arr14.setText(S);
        arr14.setEditable(false);
        arr14.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][5];
        arr15.setText(S);
        arr15.setEditable(false);
        arr15.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][6];
        arr16.setText(S);
        arr16.setEditable(false);
        arr16.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][7];
        arr17.setText(S);
        arr17.setEditable(false);
        arr17.setStyle("-fx-text-inner-color: black;");
        S = "" + result[1][8];
        arr18.setText(S);
        arr18.setEditable(false);
        arr18.setStyle("-fx-text-inner-color: black;");

        S = "" + result[2][0];
        arr20.setText(S);
        arr20.setEditable(false);
        arr20.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][1];
        arr21.setText(S);
        arr21.setEditable(false);
        arr21.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][2];
        arr22.setText(S);
        arr22.setEditable(false);
        arr22.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][3];
        arr23.setText(S);
        arr23.setEditable(false);
        arr23.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][4];
        arr24.setText(S);
        arr24.setEditable(false);
        arr24.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][5];
        arr25.setText(S);
        arr25.setEditable(false);
        arr25.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][6];
        arr26.setText(S);
        arr26.setEditable(false);
        arr26.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][7];
        arr27.setText(S);
        arr27.setEditable(false);
        arr27.setStyle("-fx-text-inner-color: red;");
        S = "" + result[2][8];
        arr28.setText(S);
        arr28.setEditable(false);
        arr28.setStyle("-fx-text-inner-color: red;");

        S = "" + result[3][0];
        arr30.setText(S);
        arr30.setEditable(false);
        arr30.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][1];
        arr31.setText(S);
        arr31.setEditable(false);
        arr31.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][2];
        arr32.setText(S);
        arr32.setEditable(false);
        arr32.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][3];
        arr33.setText(S);
        arr33.setEditable(false);
        arr33.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][4];
        arr34.setText(S);
        arr34.setEditable(false);
        arr34.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][5];
        arr35.setText(S);
        arr35.setEditable(false);
        arr35.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][6];
        arr36.setText(S);
        arr36.setEditable(false);
        arr36.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][7];
        arr37.setText(S);
        arr37.setEditable(false);
        arr37.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[3][8];
        arr38.setText(S);
        arr38.setEditable(false);
        arr38.setStyle("-fx-text-inner-color: blue;");

        S = "" + result[4][0];
        arr40.setText(S);
        arr40.setEditable(false);
        arr40.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][1];
        arr41.setText(S);
        arr41.setEditable(false);
        arr41.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][2];
        arr42.setText(S);
        arr42.setEditable(false);
        arr42.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][3];
        arr43.setText(S);
        arr43.setEditable(false);
        arr43.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][4];
        arr44.setText(S);
        arr44.setEditable(false);
        arr44.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][5];
        arr45.setText(S);
        arr45.setEditable(false);
        arr45.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][6];
        arr46.setText(S);
        arr46.setEditable(false);
        arr46.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][7];
        arr47.setText(S);
        arr47.setEditable(false);
        arr47.setStyle("-fx-text-inner-color: black;");
        S = "" + result[4][8];
        arr48.setText(S);
        arr48.setEditable(false);
        arr48.setStyle("-fx-text-inner-color: black;");

        S = "" + result[5][0];
        arr50.setText(S);
        arr50.setEditable(false);
        arr50.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][1];
        arr51.setText(S);
        arr51.setEditable(false);
        arr51.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][2];
        arr52.setText(S);
        arr52.setEditable(false);
        arr52.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][3];
        arr53.setText(S);
        arr53.setEditable(false);
        arr53.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][4];
        arr54.setText(S);
        arr54.setEditable(false);
        arr54.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][5];
        arr55.setText(S);
        arr55.setEditable(false);
        arr55.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][6];
        arr56.setText(S);
        arr56.setEditable(false);
        arr56.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][7];
        arr57.setText(S);
        arr57.setEditable(false);
        arr57.setStyle("-fx-text-inner-color: red;");
        S = "" + result[5][8];
        arr58.setText(S);
        arr58.setEditable(false);
        arr58.setStyle("-fx-text-inner-color: red;");

        S = "" + result[6][0];
        arr60.setText(S);
        arr60.setEditable(false);
        arr60.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][1];
        arr61.setText(S);
        arr61.setEditable(false);
        arr61.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][2];
        arr62.setText(S);
        arr62.setEditable(false);
        arr62.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][3];
        arr63.setText(S);
        arr63.setEditable(false);
        arr63.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][4];
        arr64.setText(S);
        arr64.setEditable(false);
        arr64.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][5];
        arr65.setText(S);
        arr65.setEditable(false);
        arr65.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][6];
        arr66.setText(S);
        arr66.setEditable(false);
        arr66.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][7];
        arr67.setText(S);
        arr67.setEditable(false);
        arr67.setStyle("-fx-text-inner-color: blue;");
        S = "" + result[6][8];
        arr68.setText(S);
        arr68.setEditable(false);
        arr68.setStyle("-fx-text-inner-color: blue;");

        S = "" + result[7][0];
        arr70.setText(S);
        arr70.setEditable(false);
        arr70.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][1];
        arr71.setText(S);
        arr71.setEditable(false);
        arr71.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][2];
        arr72.setText(S);
        arr72.setEditable(false);
        arr72.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][3];
        arr73.setText(S);
        arr73.setEditable(false);
        arr73.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][4];
        arr74.setText(S);
        arr74.setEditable(false);
        arr74.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][5];
        arr75.setText(S);
        arr75.setEditable(false);
        arr75.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][6];
        arr76.setText(S);
        arr76.setEditable(false);
        arr76.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][7];
        arr77.setText(S);
        arr77.setEditable(false);
        arr77.setStyle("-fx-text-inner-color: black;");
        S = "" + result[7][8];
        arr78.setText(S);
        arr78.setEditable(false);
        arr78.setStyle("-fx-text-inner-color: black;");

        S = "" + result[8][0];
        arr80.setText(S);
        arr80.setEditable(false);
        arr80.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][1];
        arr81.setText(S);
        arr81.setEditable(false);
        arr81.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][2];
        arr82.setText(S);
        arr82.setEditable(false);
        arr82.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][3];
        arr83.setText(S);
        arr83.setEditable(false);
        arr83.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][4];
        arr84.setText(S);
        arr84.setEditable(false);
        arr84.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][5];
        arr85.setText(S);
        arr85.setEditable(false);
        arr85.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][6];
        arr86.setText(S);
        arr86.setEditable(false);
        arr86.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][7];
        arr87.setText(S);
        arr87.setEditable(false);
        arr87.setStyle("-fx-text-inner-color: red;");
        S = "" + result[8][8];
        arr88.setText(S);
        arr88.setEditable(false);
        arr88.setStyle("-fx-text-inner-color: red;");
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        print_a();
        print_result();
        gamePlan();
        // TODO      
    }

}
