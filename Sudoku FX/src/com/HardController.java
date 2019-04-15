/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.FirstStage.user_name;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class HardController extends FirstStage implements Initializable {

    @FXML
    private TextField thard00, thard01, thard02, thard03, thard04, thard05, thard06, thard07, thard08,
            thard10, thard11, thard12, thard13, thard14, thard15, thard16, thard17, thard18,
            thard20, thard21, thard22, thard23, thard24, thard25, thard26, thard27, thard28,
            thard30, thard31, thard32, thard33, thard34, thard35, thard36, thard37, thard38,
            thard40, thard41, thard42, thard43, thard44, thard45, thard46, thard47, thard48,
            thard50, thard51, thard52, thard53, thard54, thard55, thard56, thard57, thard58,
            thard60, thard61, thard62, thard63, thard64, thard65, thard66, thard67, thard68,
            thard70, thard71, thard72, thard73, thard74, thard75, thard76, thard77, thard78,
            thard80, thard81, thard82, thard83, thard84, thard85, thard86, thard87, thard88;
    @FXML
    private Label lblhard;
    @FXML
    private Button btnPreviousHard;
    @FXML
    private Button btnSolveHard;
    @FXML
    private Button btnQuit;
    @FXML
    private Button btnCheckResultHard;
    private int num[][] = new int[9][9];
    @FXML
    private Label time;
    private Label mode;
    private boolean timerStats;
    private Timer timer;
    private int timersec;
    private int timermin;
    private int timerhr;
    private int checker;

    @FXML
    private void btnPreviousHardAction(ActionEvent event) throws Exception {
        leaderboard = "";
        root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");
        stage.show();

        timer.cancel();
    }

    @FXML
    private void btnSolveHardAction(ActionEvent event) throws Exception {
        flag = 3;         //set flag for hard level
        root = FXMLLoader.load(getClass().getResource("/com/Solve.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");
        stage.show();

        timer.cancel();
    }

    private void Congrats() throws Exception {
        flag = 3; //set flag for hard level
        root = FXMLLoader.load(getClass().getResource("/com/Congrats.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();

    }

    @FXML
    private void btnCheckResultHardAction(ActionEvent event) throws Exception {
        flag = 3;
        thardPlan();
    }

    private void thardPlan() {
        thard00.setText("" + a[0][0]);
        if (a[0][0] == result[0][0]) {
            //    thard00.setDisable(true);
            thard00.setStyle("-fx-text-inner-color: blue ; ");
        } else {
            thard00.setEditable(false);
            thard00.setStyle("-fx-text-inner-color: red ; ");
        }
        thard01.setText("" + a[0][1]);
        if (a[0][1] == result[0][1]) {
            //    thard01.setDisable(true);
            thard01.setStyle("-fx-text-inner-color: blue ; ");
        } else {
            thard01.setEditable(false);
            thard01.setStyle("-fx-text-inner-color: red ; ");
        }
        thard02.setText("" + a[0][2]);
        if (a[0][2] == result[0][2]) {
            //    thard02.setDisable(true);
            thard02.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard02.setEditable(false);
            thard02.setStyle("-fx-text-inner-color: red ; ");
        }
        thard03.setText("" + a[0][3]);
        if (a[0][3] == result[0][3]) {
            //    thard03.setDisable(true);
            thard03.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard03.setEditable(false);
            thard03.setStyle("-fx-text-inner-color: red ; ");
        }
        thard04.setText("" + a[0][4]);
        if (a[0][4] == result[0][4]) {
            //    thard04.setDisable(true);
            thard04.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard04.setEditable(false);
            thard04.setStyle("-fx-text-inner-color: red ; ");
        }
        thard05.setText("" + a[0][5]);
        if (a[0][5] == result[0][5]) {
            //    thard05.setDisable(true);
            thard05.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard05.setEditable(false);
            thard05.setStyle("-fx-text-inner-color: red ; ");
        }
        thard06.setText("" + a[0][6]);
        if (a[0][6] == result[0][6]) {
            //    thard06.setDisable(true);
            thard06.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard06.setEditable(false);
            thard06.setStyle("-fx-text-inner-color: red ; ");
        }
        thard07.setText("" + a[0][7]);
        if (a[0][7] == result[0][7]) {
            //    thard07.setDisable(true);
            thard07.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard07.setEditable(false);
            thard07.setStyle("-fx-text-inner-color: red ; ");
        }
        thard08.setText("" + a[0][8]);
        if (a[0][8] == result[0][8]) {
            //    thard08.setDisable(true);
            thard08.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard08.setEditable(false);
            thard08.setStyle("-fx-text-inner-color: red ; ");
        }

        thard10.setText("" + a[1][0]);
        if (a[1][0] == result[1][0]) {
            //    thard10.setDisable(true);
            thard10.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard10.setEditable(false);
            thard10.setStyle("-fx-text-inner-color: red ; ");
        }
        thard11.setText("" + a[1][1]);
        if (a[1][1] == result[1][1]) {
            //    thard11.setDisable(true);
            thard11.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard11.setEditable(false);
            thard11.setStyle("-fx-text-inner-color: red ; ");
        }
        thard12.setText("" + a[1][2]);
        if (a[1][2] == result[1][2]) {
            //    thard12.setDisable(true);
            thard12.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard12.setEditable(false);
            thard12.setStyle("-fx-text-inner-color: red ; ");
        }
        thard13.setText("" + a[1][3]);
        if (a[1][3] == result[1][3]) {
            //    thard13.setDisable(true);
            thard13.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard13.setEditable(false);
            thard13.setStyle("-fx-text-inner-color: red ; ");
        }
        thard14.setText("" + a[1][4]);
        if (a[1][4] == result[1][4]) {
            //    thard14.setDisable(true);
            thard14.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard14.setEditable(false);
            thard14.setStyle("-fx-text-inner-color: red ; ");
        }
        thard15.setText("" + a[1][5]);
        if (a[1][5] == result[1][5]) {
            //    thard15.setDisable(true);
            thard15.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard15.setEditable(false);
            thard15.setStyle("-fx-text-inner-color: red ; ");
        }
        thard16.setText("" + a[1][6]);
        if (a[1][6] == result[1][6]) {
            //    thard16.setDisable(true);
            thard16.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard16.setEditable(false);
            thard16.setStyle("-fx-text-inner-color: red ; ");
        }
        thard17.setText("" + a[1][7]);
        if (a[1][7] == result[1][7]) {
            //    thard17.setDisable(true);
            thard17.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard17.setEditable(false);
            thard17.setStyle("-fx-text-inner-color: red ; ");
        }
        thard18.setText("" + a[1][8]);
        if (a[1][8] == result[1][8]) {
            //    thard18.setDisable(true);
            thard18.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard18.setEditable(false);
            thard18.setStyle("-fx-text-inner-color: red ; ");
        }

        thard20.setText("" + a[2][0]);
        if (a[2][0] == result[2][0]) {
            //    thard20.setDisable(true);
            thard20.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard20.setEditable(false);
            thard20.setStyle("-fx-text-inner-color: red ; ");
        }
        thard21.setText("" + a[2][1]);
        if (a[2][1] == result[2][1]) {
            //    thard21.setDisable(true);
            thard21.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard21.setEditable(false);
            thard21.setStyle("-fx-text-inner-color: red ; ");
        }
        thard22.setText("" + a[2][2]);
        if (a[2][2] == result[2][2]) {
            //    thard22.setDisable(true);
            thard22.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard22.setEditable(false);
            thard22.setStyle("-fx-text-inner-color: red ; ");
        }
        thard23.setText("" + a[2][3]);
        if (a[2][3] == result[2][3]) {
            //    thard23.setDisable(true);
            thard23.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard23.setEditable(false);
            thard23.setStyle("-fx-text-inner-color: red ; ");
        }
        thard24.setText("" + a[2][4]);
        if (a[2][4] == result[2][4]) {
            //    thard24.setDisable(true);
            thard24.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard24.setEditable(false);
            thard24.setStyle("-fx-text-inner-color: red ; ");
        }
        thard25.setText("" + a[2][5]);
        if (a[2][5] == result[2][5]) {
            //    thard25.setDisable(true);
            thard25.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard25.setEditable(false);
            thard25.setStyle("-fx-text-inner-color: red ; ");
        }
        thard26.setText("" + a[2][6]);
        if (a[2][6] == result[2][6]) {
            //    thard26.setDisable(true);
            thard26.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard26.setEditable(false);
            thard26.setStyle("-fx-text-inner-color: red ; ");
        }
        thard27.setText("" + a[2][7]);
        if (a[2][7] == result[2][7]) {
            //    thard27.setDisable(true);
            thard27.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard27.setEditable(false);
            thard27.setStyle("-fx-text-inner-color: red ; ");
        }
        thard28.setText("" + a[2][8]);
        if (a[2][8] == result[2][8]) {
            //    thard28.setDisable(true);
            thard28.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard28.setEditable(false);
            thard28.setStyle("-fx-text-inner-color: red ; ");
        }

        thard30.setText("" + a[3][0]);
        if (a[3][0] == result[3][0]) {
            //    thard30.setDisable(true);
            thard30.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard30.setEditable(false);
            thard30.setStyle("-fx-text-inner-color: red ; ");
        }
        thard31.setText("" + a[3][1]);
        if (a[3][1] == result[3][1]) {
            //    thard31.setDisable(true);
            thard31.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard31.setEditable(false);
            thard31.setStyle("-fx-text-inner-color: red ; ");
        }
        thard32.setText("" + a[3][2]);
        if (a[3][2] == result[3][2]) {
            //    thard32.setDisable(true);
            thard32.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard32.setEditable(false);
            thard32.setStyle("-fx-text-inner-color: red ; ");
        }
        thard33.setText("" + a[3][3]);
        if (a[3][3] == result[3][3]) {
            //    thard33.setDisable(true);
            thard33.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard33.setEditable(false);
            thard33.setStyle("-fx-text-inner-color: red ; ");
        }
        thard34.setText("" + a[3][4]);
        if (a[3][4] == result[3][4]) {
            //    thard34.setDisable(true);
            thard34.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard34.setEditable(false);
            thard34.setStyle("-fx-text-inner-color: red ; ");
        }
        thard35.setText("" + a[3][5]);
        if (a[3][5] == result[3][5]) {
            //    thard35.setDisable(true);
            thard35.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard35.setEditable(false);
            thard35.setStyle("-fx-text-inner-color: red ; ");
        }
        thard36.setText("" + a[3][6]);
        if (a[3][6] == result[3][6]) {
            //    thard36.setDisable(true);
            thard36.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard36.setEditable(false);
            thard36.setStyle("-fx-text-inner-color: red ; ");
        }
        thard37.setText("" + a[3][7]);
        if (a[3][7] == result[3][7]) {
            //    thard37.setDisable(true);
            thard37.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard37.setEditable(false);
            thard37.setStyle("-fx-text-inner-color: red ; ");
        }
        thard38.setText("" + a[3][8]);
        if (a[3][8] == result[3][8]) {
            //    thard38.setDisable(true);
            thard38.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard38.setEditable(false);
            thard38.setStyle("-fx-text-inner-color: red ; ");
        }

        thard40.setText("" + a[4][0]);
        if (a[4][0] == result[4][0]) {
            //    thard40.setDisable(true);
            thard40.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard40.setEditable(false);
            thard40.setStyle("-fx-text-inner-color: red ; ");
        }
        thard41.setText("" + a[4][1]);
        if (a[4][1] == result[4][1]) {
            //    thard41.setDisable(true);
            thard41.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard41.setEditable(false);
            thard41.setStyle("-fx-text-inner-color: red ; ");
        }
        thard42.setText("" + a[4][2]);
        if (a[4][2] == result[4][2]) {
            //    thard42.setDisable(true);
            thard42.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard42.setEditable(false);
            thard42.setStyle("-fx-text-inner-color: red ; ");
        }
        thard43.setText("" + a[4][3]);
        if (a[4][3] == result[4][3]) {
            //    thard43.setDisable(true);
            thard43.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard43.setEditable(false);
            thard43.setStyle("-fx-text-inner-color: red ; ");
        }
        thard44.setText("" + a[4][4]);
        if (a[4][4] == result[4][4]) {
            //    thard44.setDisable(true);
            thard44.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard44.setEditable(false);
            thard44.setStyle("-fx-text-inner-color: red ; ");
        }
        thard45.setText("" + a[4][5]);
        if (a[4][5] == result[4][5]) {
            //    thard45.setDisable(true);
            thard45.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard45.setEditable(false);
            thard45.setStyle("-fx-text-inner-color: red ; ");
        }
        thard46.setText("" + a[4][6]);
        if (a[4][6] == result[4][6]) {
            //    thard46.setDisable(true);
            thard46.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard46.setEditable(false);
            thard46.setStyle("-fx-text-inner-color: red ; ");
        }
        thard47.setText("" + a[4][7]);
        if (a[4][7] == result[4][7]) {
            //    thard47.setDisable(true);
            thard47.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard47.setEditable(false);
            thard47.setStyle("-fx-text-inner-color: red ; ");
        }
        thard48.setText("" + a[4][8]);
        if (a[4][8] == result[4][8]) {
            //    thard48.setDisable(true);
            thard48.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard48.setEditable(false);
            thard48.setStyle("-fx-text-inner-color: red ; ");
        }

        thard50.setText("" + a[5][0]);
        if (a[5][0] == result[5][0]) {
            //    thard50.setDisable(true);
            thard50.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard50.setEditable(false);
            thard50.setStyle("-fx-text-inner-color: red ; ");
        }
        thard51.setText("" + a[5][1]);
        if (a[5][1] == result[5][1]) {
            //    thard51.setDisable(true);
            thard51.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard51.setEditable(false);
            thard51.setStyle("-fx-text-inner-color: red ; ");
        }
        thard52.setText("" + a[5][2]);
        if (a[5][2] == result[5][2]) {
            //    thard52.setDisable(true);
            thard52.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard52.setEditable(false);
            thard52.setStyle("-fx-text-inner-color: red ; ");
        }
        thard53.setText("" + a[5][3]);
        if (a[5][3] == result[5][3]) {
            //    thard53.setDisable(true);
            thard53.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard53.setEditable(false);
            thard53.setStyle("-fx-text-inner-color: red ; ");
        }
        thard54.setText("" + a[5][4]);
        if (a[5][4] == result[5][4]) {
            //    thard54.setDisable(true);
            thard54.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard54.setEditable(false);
            thard54.setStyle("-fx-text-inner-color: red ; ");
        }
        thard55.setText("" + a[5][5]);
        if (a[5][5] == result[5][5]) {
            //    thard55.setDisable(true);
            thard55.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard55.setEditable(false);
            thard55.setStyle("-fx-text-inner-color: red ; ");
        }
        thard56.setText("" + a[5][6]);
        if (a[5][6] == result[5][6]) {
            //    thard56.setDisable(true);
            thard56.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard56.setEditable(false);
            thard56.setStyle("-fx-text-inner-color: red ; ");
        }
        thard57.setText("" + a[5][7]);
        if (a[5][7] == result[5][7]) {
            //    thard57.setDisable(true);
            thard57.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard57.setEditable(false);
            thard57.setStyle("-fx-text-inner-color: red ; ");
        }
        thard58.setText("" + a[5][8]);
        if (a[5][8] == result[5][8]) {
            //    thard58.setDisable(true);
            thard58.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard58.setEditable(false);
            thard58.setStyle("-fx-text-inner-color: red ; ");
        }

        thard60.setText("" + a[6][0]);
        if (a[6][0] == result[6][0]) {
            //    thard60.setDisable(true);
            thard60.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard60.setEditable(false);
            thard60.setStyle("-fx-text-inner-color: red ; ");
        }
        thard61.setText("" + a[6][1]);
        if (a[6][1] == result[6][1]) {
            //    thard61.setDisable(true);
            thard61.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard61.setEditable(false);
            thard61.setStyle("-fx-text-inner-color: red ; ");
        }
        thard62.setText("" + a[6][2]);
        if (a[6][2] == result[6][2]) {
            //    thard62.setDisable(true);
            thard62.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard62.setEditable(false);
            thard62.setStyle("-fx-text-inner-color: red ; ");
        }
        thard63.setText("" + a[6][3]);
        if (a[6][3] == result[6][3]) {
            //    thard63.setDisable(true);
            thard63.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard63.setEditable(false);
            thard63.setStyle("-fx-text-inner-color: red ; ");
        }
        thard64.setText("" + a[6][4]);
        if (a[6][4] == result[6][4]) {
            //    thard64.setDisable(true);
            thard64.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard64.setEditable(false);
            thard64.setStyle("-fx-text-inner-color: red ; ");
        }
        thard65.setText("" + a[6][5]);
        if (a[6][5] == result[6][5]) {
            //    thard65.setDisable(true);
            thard65.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard65.setEditable(false);
            thard65.setStyle("-fx-text-inner-color: red ; ");
        }
        thard66.setText("" + a[6][6]);
        if (a[6][6] == result[6][6]) {
            //    thard66.setDisable(true);
            thard66.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard66.setEditable(false);
            thard66.setStyle("-fx-text-inner-color: red ; ");
        }
        thard67.setText("" + a[6][7]);
        if (a[6][7] == result[6][7]) {
            //    thard67.setDisable(true);
            thard67.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard67.setEditable(false);
            thard67.setStyle("-fx-text-inner-color: red ; ");
        }
        thard68.setText("" + a[6][8]);
        if (a[6][8] == result[6][8]) {
            //    thard68.setDisable(true);
            thard68.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard68.setEditable(false);
            thard68.setStyle("-fx-text-inner-color: red ; ");
        }

        thard70.setText("" + a[7][0]);
        if (a[7][0] == result[7][0]) {
            //    thard70.setDisable(true);
            thard70.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard70.setEditable(false);
            thard70.setStyle("-fx-text-inner-color: red ; ");
        }
        thard71.setText("" + a[7][1]);
        if (a[7][1] == result[7][1]) {
            //    thard71.setDisable(true);
            thard71.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard71.setEditable(false);
            thard71.setStyle("-fx-text-inner-color: red ; ");
        }
        thard72.setText("" + a[7][2]);
        if (a[7][2] == result[7][2]) {
            //    thard72.setDisable(true);
            thard72.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard72.setEditable(false);
            thard72.setStyle("-fx-text-inner-color: red ; ");
        }
        thard73.setText("" + a[7][3]);
        if (a[7][3] == result[7][3]) {
            //    thard73.setDisable(true);
            thard73.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard73.setEditable(false);
            thard73.setStyle("-fx-text-inner-color: red ; ");
        }
        thard74.setText("" + a[7][4]);
        if (a[7][4] == result[7][4]) {
            //    thard74.setDisable(true);
            thard74.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard74.setEditable(false);
            thard74.setStyle("-fx-text-inner-color: red ; ");
        }
        thard75.setText("" + a[7][5]);
        if (a[7][5] == result[7][5]) {
            //    thard75.setDisable(true);
            thard75.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard75.setEditable(false);
            thard75.setStyle("-fx-text-inner-color: red ; ");
        }
        thard76.setText("" + a[7][6]);
        if (a[7][6] == result[7][6]) {
            //    thard76.setDisable(true);
            thard76.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard76.setEditable(false);
            thard76.setStyle("-fx-text-inner-color: red ; ");
        }
        thard77.setText("" + a[7][7]);
        if (a[7][7] == result[7][7]) {
            //    thard77.setDisable(true);
            thard77.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard77.setEditable(false);
            thard77.setStyle("-fx-text-inner-color: red ; ");
        }
        thard78.setText("" + a[7][8]);
        if (a[7][8] == result[7][8]) {
            //    thard78.setDisable(true);
            thard78.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard78.setEditable(false);
            thard78.setStyle("-fx-text-inner-color: red ; ");
        }

        thard80.setText("" + a[8][0]);
        if (a[8][0] == result[8][0]) {
            //    thard80.setDisable(true);
            thard80.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard80.setEditable(false);
            thard80.setStyle("-fx-text-inner-color: red ; ");
        }
        thard81.setText("" + a[8][1]);
        if (a[8][1] == result[8][1]) {
            //    thard81.setDisable(true);
            thard81.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard81.setEditable(false);
            thard81.setStyle("-fx-text-inner-color: red ; ");
        }
        thard82.setText("" + a[8][2]);
        if (a[8][2] == result[8][2]) {
            //    thard82.setDisable(true);
            thard82.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard82.setEditable(false);
            thard82.setStyle("-fx-text-inner-color: red ; ");
        }
        thard83.setText("" + a[8][3]);
        if (a[8][3] == result[8][3]) {
            //    thard83.setDisable(true);
            thard83.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard83.setEditable(false);
            thard83.setStyle("-fx-text-inner-color: red ; ");
        }
        thard84.setText("" + a[8][4]);
        if (a[8][4] == result[8][4]) {
            //    thard84.setDisable(true);
            thard84.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard84.setEditable(false);
            thard84.setStyle("-fx-text-inner-color: red ; ");
        }
        thard85.setText("" + a[8][5]);
        if (a[8][5] == result[8][5]) {
            //    thard85.setDisable(true);
            thard85.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard85.setEditable(false);
            thard85.setStyle("-fx-text-inner-color: red ; ");
        }
        thard86.setText("" + a[8][6]);
        if (a[8][6] == result[8][6]) {
            //    thard86.setDisable(true);
            thard86.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard86.setEditable(false);
            thard86.setStyle("-fx-text-inner-color: red ; ");
        }
        thard87.setText("" + a[8][7]);
        if (a[8][7] == result[8][7]) {
            //    thard87.setDisable(true);
            thard87.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard87.setEditable(false);
            thard87.setStyle("-fx-text-inner-color: red ; ");
        }
        thard88.setText("" + a[8][8]);
        if (a[8][8] == result[8][8]) {
            //    thard88.setDisable(true);
            thard88.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            thard88.setEditable(false);
            thard88.setStyle("-fx-text-inner-color: red ; ");
        }

    }

    @FXML
    private void btnQuitAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void thard00Action(MouseEvent event) throws Exception {
        if (thard00.isDisable() == false) {
            num[0][0]++;
            if (num[0][0] > 9) {
                num[0][0] = 0;
            }
            if (num[0][0] == 0) {
                thard00.setText("0");
                a[0][0] = 0;
                thard00.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard00.setText(Integer.toString(num[0][0]));
                a[0][0] = num[0][0];
                thard00.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard01Action(MouseEvent event) throws Exception {
        if (thard01.isDisable() == false) {
            num[0][1]++;
            if (num[0][1] > 9) {
                num[0][1] = 0;
            }
            if (num[0][1] == 0) {
                thard01.setText("0");
                a[0][1] = 0;
                thard01.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard01.setText(Integer.toString(num[0][1]));
                a[0][1] = num[0][1];
                thard01.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard02Action(MouseEvent event) throws Exception {
        if (thard02.isDisable() == false) {
            num[0][2]++;
            if (num[0][2] > 9) {
                num[0][2] = 0;
            }
            if (num[0][2] == 0) {
                thard02.setText("0");
                a[0][2] = 0;
                thard02.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard02.setText(Integer.toString(num[0][2]));
                a[0][2] = num[0][2];
                thard02.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard03Action(MouseEvent event) throws Exception {
        if (thard03.isDisable() == false) {
            num[0][3]++;
            if (num[0][3] > 9) {
                num[0][3] = 0;
            }
            if (num[0][3] == 0) {
                thard03.setText("0");
                a[0][3] = 0;
                thard03.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard03.setText(Integer.toString(num[0][3]));
                a[0][3] = num[0][3];
                thard03.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard04Action(MouseEvent event) throws Exception {
        if (thard04.isDisable() == false) {
            num[0][4]++;
            if (num[0][4] > 9) {
                num[0][4] = 0;
            }
            if (num[0][4] == 0) {
                thard04.setText("0");
                a[0][4] = 0;
                thard04.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard04.setText(Integer.toString(num[0][4]));
                a[0][4] = num[0][4];
                thard04.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard05Action(MouseEvent event) throws Exception {
        if (thard05.isDisable() == false) {
            num[0][5]++;
            if (num[0][5] > 9) {
                num[0][5] = 0;
            }
            if (num[0][5] == 0) {
                thard05.setText("0");
                a[0][5] = 0;
                thard05.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard05.setText(Integer.toString(num[0][5]));
                a[0][5] = num[0][5];
                thard05.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard06Action(MouseEvent event) throws Exception {
        if (thard06.isDisable() == false) {
            num[0][6]++;
            if (num[0][6] > 9) {
                num[0][6] = 0;
            }
            if (num[0][6] == 0) {
                thard06.setText("0");
                a[0][6] = 0;
                thard06.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard06.setText(Integer.toString(num[0][6]));
                a[0][6] = num[0][6];
                thard06.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard07Action(MouseEvent event) throws Exception {
        if (thard07.isDisable() == false) {
            num[0][7]++;
            if (num[0][7] > 9) {
                num[0][7] = 0;
            }
            if (num[0][7] == 0) {
                thard07.setText("0");
                a[0][7] = 0;
                thard07.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard07.setText(Integer.toString(num[0][7]));
                a[0][7] = num[0][7];
                thard07.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard08Action(MouseEvent event) throws Exception {
        if (thard08.isDisable() == false) {
            num[0][8]++;
            if (num[0][8] > 9) {
                num[0][8] = 0;
            }
            if (num[0][8] == 0) {
                thard08.setText("0");
                a[0][8] = 0;
                thard08.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard08.setText(Integer.toString(num[0][8]));
                a[0][8] = num[0][8];
                thard08.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard10Action(MouseEvent event) throws Exception {
        if (thard10.isDisable() == false) {
            num[1][0]++;
            if (num[1][0] > 9) {
                num[1][0] = 0;
            }
            if (num[1][0] == 0) {
                thard10.setText("0");
                a[1][0] = 0;
                thard10.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard10.setText(Integer.toString(num[1][0]));
                a[1][0] = num[1][0];
                thard10.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard11Action(MouseEvent event) throws Exception {
        if (thard11.isDisable() == false) {
            num[1][1]++;
            if (num[1][1] > 9) {
                num[1][1] = 0;
            }
            if (num[1][1] == 0) {
                thard11.setText("0");
                a[1][1] = 0;
                thard11.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard11.setText(Integer.toString(num[1][1]));
                a[1][1] = num[1][1];
                thard11.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard12Action(MouseEvent event) throws Exception {
        if (thard12.isDisable() == false) {
            num[1][2]++;
            if (num[1][2] > 9) {
                num[1][2] = 0;
            }
            if (num[1][2] == 0) {
                thard12.setText("0");
                a[1][2] = 0;
                thard12.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard12.setText(Integer.toString(num[1][2]));
                a[1][2] = num[1][2];
                thard12.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard13Action(MouseEvent event) throws Exception {
        if (thard13.isDisable() == false) {
            num[1][3]++;
            if (num[1][3] > 9) {
                num[1][3] = 0;
            }
            if (num[1][3] == 0) {
                thard13.setText("0");
                a[1][3] = 0;
                thard13.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard13.setText(Integer.toString(num[1][3]));
                a[1][3] = num[1][3];
                thard13.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard14Action(MouseEvent event) throws Exception {
        if (thard14.isDisable() == false) {
            num[1][4]++;
            if (num[1][4] > 9) {
                num[1][4] = 0;
            }
            if (num[1][4] == 0) {
                thard14.setText("0");
                a[1][4] = 0;
                thard14.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard14.setText(Integer.toString(num[1][4]));
                a[1][4] = num[1][4];
                thard14.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard15Action(MouseEvent event) throws Exception {
        if (thard15.isDisable() == false) {
            num[1][5]++;
            if (num[1][5] > 9) {
                num[1][5] = 0;
            }
            if (num[1][5] == 0) {
                thard15.setText("0");
                a[1][5] = 0;
                thard15.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard15.setText(Integer.toString(num[1][5]));
                a[1][5] = num[1][5];
                thard15.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard16Action(MouseEvent event) throws Exception {
        if (thard16.isDisable() == false) {
            num[1][6]++;
            if (num[1][6] > 9) {
                num[1][6] = 0;
            }
            if (num[1][6] == 0) {
                thard16.setText("0");
                a[1][6] = 0;
                thard16.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard16.setText(Integer.toString(num[1][6]));
                a[1][6] = num[1][6];
                thard16.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard17Action(MouseEvent event) throws Exception {
        if (thard17.isDisable() == false) {
            num[1][7]++;
            if (num[1][7] > 9) {
                num[1][7] = 0;
            }
            if (num[1][7] == 0) {
                thard17.setText("0");
                a[1][7] = 0;
                thard17.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard17.setText(Integer.toString(num[1][7]));
                a[1][7] = num[1][7];
                thard17.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard18Action(MouseEvent event) throws Exception {
        if (thard18.isDisable() == false) {
            num[1][8]++;
            if (num[1][8] > 9) {
                num[1][8] = 0;
            }
            if (num[1][8] == 0) {
                thard18.setText("0");
                a[1][8] = 0;
                thard18.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard18.setText(Integer.toString(num[1][8]));
                a[1][8] = num[1][8];
                thard18.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard20Action(MouseEvent event) throws Exception {
        if (thard20.isDisable() == false) {
            num[2][0]++;
            if (num[2][0] > 9) {
                num[2][0] = 0;
            }
            if (num[2][0] == 0) {
                thard20.setText("0");
                a[2][0] = 0;
                thard20.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard20.setText(Integer.toString(num[2][0]));
                a[2][0] = num[2][0];
                thard20.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard21Action(MouseEvent event) throws Exception {
        if (thard21.isDisable() == false) {
            num[2][1]++;
            if (num[2][1] > 9) {
                num[2][1] = 0;
            }
            if (num[2][1] == 0) {
                thard21.setText("0");
                a[2][1] = 0;
                thard21.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard21.setText(Integer.toString(num[2][1]));
                a[2][1] = num[2][1];
                thard21.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard22Action(MouseEvent event) throws Exception {
        if (thard22.isDisable() == false) {
            num[2][2]++;
            if (num[2][2] > 9) {
                num[2][2] = 0;
            }
            if (num[2][2] == 0) {
                thard22.setText("0");
                a[2][2] = 0;
                thard22.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard22.setText(Integer.toString(num[2][2]));
                a[2][2] = num[2][2];
                thard22.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard23Action(MouseEvent event) throws Exception {
        if (thard23.isDisable() == false) {
            num[2][3]++;
            if (num[2][3] > 9) {
                num[2][3] = 0;
            }
            if (num[2][3] == 0) {
                thard23.setText("0");
                a[2][3] = 0;
                thard23.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard23.setText(Integer.toString(num[2][3]));
                a[2][3] = num[2][3];
                thard23.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard24Action(MouseEvent event) throws Exception {
        if (thard24.isDisable() == false) {
            num[2][4]++;
            if (num[2][4] > 9) {
                num[2][4] = 0;
            }
            if (num[2][4] == 0) {
                thard24.setText("0");
                a[2][4] = 0;
                thard24.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard24.setText(Integer.toString(num[2][4]));
                a[2][4] = num[2][4];
                thard24.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard25Action(MouseEvent event) throws Exception {
        if (thard25.isDisable() == false) {
            num[2][5]++;
            if (num[2][5] > 9) {
                num[2][5] = 0;
            }
            if (num[2][5] == 0) {
                thard25.setText("0");
                a[2][5] = 0;
                thard25.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard25.setText(Integer.toString(num[2][5]));
                a[2][5] = num[2][5];
                thard25.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard26Action(MouseEvent event) throws Exception {
        if (thard26.isDisable() == false) {
            num[2][6]++;
            if (num[2][6] > 9) {
                num[2][6] = 0;
            }
            if (num[2][6] == 0) {
                thard26.setText("0");
                a[2][6] = 0;
                thard26.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard26.setText(Integer.toString(num[2][6]));
                a[2][6] = num[2][6];
                thard26.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard27Action(MouseEvent event) throws Exception {
        if (thard27.isDisable() == false) {
            num[2][7]++;
            if (num[2][7] > 9) {
                num[2][7] = 0;
            }
            if (num[2][7] == 0) {
                thard27.setText("0");
                a[2][7] = 0;
                thard27.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard27.setText(Integer.toString(num[2][7]));
                a[2][7] = num[2][7];
                thard27.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard28Action(MouseEvent event) throws Exception {
        if (thard28.isDisable() == false) {
            num[2][8]++;
            if (num[2][8] > 9) {
                num[2][8] = 0;
            }
            if (num[2][8] == 0) {
                thard28.setText("0");
                a[2][8] = 0;
                thard28.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard28.setText(Integer.toString(num[2][8]));
                a[2][8] = num[2][8];
                thard28.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard30Action(MouseEvent event) throws Exception {
        if (thard30.isDisable() == false) {
            num[3][0]++;
            if (num[3][0] > 9) {
                num[3][0] = 0;
            }
            if (num[3][0] == 0) {
                thard30.setText("0");
                a[3][0] = 0;
                thard30.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard30.setText(Integer.toString(num[3][0]));
                a[3][0] = num[3][0];
                thard30.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard31Action(MouseEvent event) throws Exception {
        if (thard31.isDisable() == false) {
            num[3][1]++;
            if (num[3][1] > 9) {
                num[3][1] = 0;
            }
            if (num[3][1] == 0) {
                thard31.setText("0");
                a[3][1] = 0;
                thard31.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard31.setText(Integer.toString(num[3][1]));
                a[3][1] = num[3][1];
                thard31.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard32Action(MouseEvent event) throws Exception {
        if (thard32.isDisable() == false) {
            num[3][2]++;
            if (num[3][2] > 9) {
                num[3][2] = 0;
            }
            if (num[3][2] == 0) {
                thard32.setText("0");
                a[3][2] = 0;
                thard32.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard32.setText(Integer.toString(num[3][2]));
                a[3][2] = num[3][2];
                thard32.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard33Action(MouseEvent event) throws Exception {
        if (thard33.isDisable() == false) {
            num[3][3]++;
            if (num[3][3] > 9) {
                num[3][3] = 0;
            }
            if (num[3][3] == 0) {
                thard33.setText("0");
                a[3][3] = 0;
                thard33.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard33.setText(Integer.toString(num[3][3]));
                a[3][3] = num[3][3];
                thard33.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard34Action(MouseEvent event) throws Exception {
        if (thard34.isDisable() == false) {
            num[3][4]++;
            if (num[3][4] > 9) {
                num[3][4] = 0;
            }
            if (num[3][4] == 0) {
                thard34.setText("0");
                a[3][4] = 0;
                thard34.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard34.setText(Integer.toString(num[3][4]));
                a[3][4] = num[3][4];
                thard34.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard35Action(MouseEvent event) throws Exception {
        if (thard35.isDisable() == false) {
            num[3][5]++;
            if (num[3][5] > 9) {
                num[3][5] = 0;
            }
            if (num[3][5] == 0) {
                thard35.setText("0");
                a[3][5] = 0;
                thard35.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard35.setText(Integer.toString(num[3][5]));
                a[3][5] = num[3][5];
                thard35.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard36Action(MouseEvent event) throws Exception {
        if (thard36.isDisable() == false) {
            num[3][6]++;
            if (num[3][6] > 9) {
                num[3][6] = 0;
            }
            if (num[3][6] == 0) {
                thard36.setText("0");
                a[3][6] = 0;
                thard36.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard36.setText(Integer.toString(num[3][6]));
                a[3][6] = num[3][6];
                thard36.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard37Action(MouseEvent event) throws Exception {
        if (thard37.isDisable() == false) {
            num[3][7]++;
            if (num[3][7] > 9) {
                num[3][7] = 0;
            }
            if (num[3][7] == 0) {
                thard37.setText("0");
                a[3][7] = 0;
                thard37.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard37.setText(Integer.toString(num[3][7]));
                a[3][7] = num[3][7];
                thard37.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard38Action(MouseEvent event) throws Exception {
        if (thard38.isDisable() == false) {
            num[3][8]++;
            if (num[3][8] > 9) {
                num[3][8] = 0;
            }
            if (num[3][8] == 0) {
                thard38.setText("0");
                a[3][8] = 0;
                thard38.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard38.setText(Integer.toString(num[3][8]));
                a[3][8] = num[3][8];
                thard38.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard40Action(MouseEvent event) throws Exception {
        if (thard40.isDisable() == false) {
            num[4][0]++;
            if (num[4][0] > 9) {
                num[4][0] = 0;
            }
            if (num[4][0] == 0) {
                thard40.setText("0");
                a[4][0] = 0;
                thard40.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard40.setText(Integer.toString(num[4][0]));
                a[4][0] = num[4][0];
                thard40.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard41Action(MouseEvent event) throws Exception {
        if (thard41.isDisable() == false) {
            num[4][1]++;
            if (num[4][1] > 9) {
                num[4][1] = 0;
            }
            if (num[4][1] == 0) {
                thard41.setText("0");
                a[4][1] = 0;
                thard41.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard41.setText(Integer.toString(num[4][1]));
                a[4][1] = num[4][1];
                thard41.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard42Action(MouseEvent event) throws Exception {
        if (thard42.isDisable() == false) {
            num[4][2]++;
            if (num[4][2] > 9) {
                num[4][2] = 0;
            }
            if (num[4][2] == 0) {
                thard42.setText("0");
                a[4][2] = 0;
                thard42.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard42.setText(Integer.toString(num[4][2]));
                a[4][2] = num[4][2];
                thard42.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard43Action(MouseEvent event) throws Exception {
        if (thard43.isDisable() == false) {
            num[4][3]++;
            if (num[4][3] > 9) {
                num[4][3] = 0;
            }
            if (num[4][3] == 0) {
                thard43.setText("0");
                a[4][3] = 0;
                thard43.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard43.setText(Integer.toString(num[4][3]));
                a[4][3] = num[4][3];
                thard43.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard44Action(MouseEvent event) throws Exception {
        if (thard44.isDisable() == false) {
            num[4][4]++;
            if (num[4][4] > 9) {
                num[4][4] = 0;
            }
            if (num[4][4] == 0) {
                thard44.setText("0");
                a[4][4] = 0;
                thard44.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard44.setText(Integer.toString(num[4][4]));
                a[4][4] = num[4][4];
                thard44.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard45Action(MouseEvent event) throws Exception {
        if (thard45.isDisable() == false) {
            num[4][5]++;
            if (num[4][5] > 9) {
                num[4][5] = 0;
            }
            if (num[4][5] == 0) {
                thard45.setText("0");
                a[4][5] = 0;
                thard45.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard45.setText(Integer.toString(num[4][5]));
                a[4][5] = num[4][5];
                thard45.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard46Action(MouseEvent event) throws Exception {
        if (thard46.isDisable() == false) {
            num[4][6]++;
            if (num[4][6] > 9) {
                num[4][6] = 0;
            }
            if (num[4][6] == 0) {
                thard46.setText("0");
                a[4][6] = 0;
                thard46.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard46.setText(Integer.toString(num[4][6]));
                a[4][6] = num[4][6];
                thard46.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard47Action(MouseEvent event) throws Exception {
        if (thard47.isDisable() == false) {
            num[4][7]++;
            if (num[4][7] > 9) {
                num[4][7] = 0;
            }
            if (num[4][7] == 0) {
                thard47.setText("0");
                a[4][7] = 0;
                thard47.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard47.setText(Integer.toString(num[4][7]));
                a[4][7] = num[4][7];
                thard47.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard48Action(MouseEvent event) throws Exception {
        if (thard48.isDisable() == false) {
            num[4][8]++;
            if (num[4][8] > 9) {
                num[4][8] = 0;
            }
            if (num[4][8] == 0) {
                thard48.setText("0");
                a[4][8] = 0;
                thard48.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard48.setText(Integer.toString(num[4][8]));
                a[4][8] = num[4][8];
                thard48.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard50Action(MouseEvent event) throws Exception {
        if (thard50.isDisable() == false) {
            num[5][0]++;
            if (num[5][0] > 9) {
                num[5][0] = 0;
            }
            if (num[5][0] == 0) {
                thard50.setText("0");
                a[5][0] = 0;
                thard50.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard50.setText(Integer.toString(num[5][0]));
                a[5][0] = num[5][0];
                thard50.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard51Action(MouseEvent event) throws Exception {
        if (thard51.isDisable() == false) {
            num[5][1]++;
            if (num[5][1] > 9) {
                num[5][1] = 0;
            }
            if (num[5][1] == 0) {
                thard51.setText("0");
                a[5][1] = 0;
                thard51.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard51.setText(Integer.toString(num[5][1]));
                a[5][1] = num[5][1];
                thard51.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard52Action(MouseEvent event) throws Exception {
        if (thard52.isDisable() == false) {
            num[5][2]++;
            if (num[5][2] > 9) {
                num[5][2] = 0;
            }
            if (num[5][2] == 0) {
                thard52.setText("0");
                a[5][2] = 0;
                thard52.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard52.setText(Integer.toString(num[5][2]));
                a[5][2] = num[5][2];
                thard52.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard53Action(MouseEvent event) throws Exception {
        if (thard53.isDisable() == false) {
            num[5][3]++;
            if (num[5][3] > 9) {
                num[5][3] = 0;
            }
            if (num[5][3] == 0) {
                thard53.setText("0");
                a[5][3] = 0;
                thard53.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard53.setText(Integer.toString(num[5][3]));
                a[5][3] = num[5][3];
                thard53.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard54Action(MouseEvent event) throws Exception {
        if (thard54.isDisable() == false) {
            num[5][4]++;
            if (num[5][4] > 9) {
                num[5][4] = 0;
            }
            if (num[5][4] == 0) {
                thard54.setText("0");
                a[5][4] = 0;
                thard54.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard54.setText(Integer.toString(num[5][4]));
                a[5][4] = num[5][4];
                thard54.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard55Action(MouseEvent event) throws Exception {
        if (thard55.isDisable() == false) {
            num[5][5]++;
            if (num[5][5] > 9) {
                num[5][5] = 0;
            }
            if (num[5][5] == 0) {
                thard55.setText("0");
                a[5][5] = 0;
                thard55.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard55.setText(Integer.toString(num[5][5]));
                a[5][5] = num[5][5];
                thard55.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard56Action(MouseEvent event) throws Exception {
        if (thard56.isDisable() == false) {
            num[5][6]++;
            if (num[5][6] > 9) {
                num[5][6] = 0;
            }
            if (num[5][6] == 0) {
                thard56.setText("0");
                a[5][6] = 0;
                thard56.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard56.setText(Integer.toString(num[5][6]));
                a[5][6] = num[5][6];
                thard56.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard57Action(MouseEvent event) throws Exception {
        if (thard57.isDisable() == false) {
            num[5][7]++;
            if (num[5][7] > 9) {
                num[5][7] = 0;
            }
            if (num[5][7] == 0) {
                thard57.setText("0");
                a[5][7] = 0;
                thard57.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard57.setText(Integer.toString(num[5][7]));
                a[5][7] = num[5][7];
                thard57.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard58Action(MouseEvent event) throws Exception {
        if (thard58.isDisable() == false) {
            num[5][8]++;
            if (num[5][8] > 9) {
                num[5][8] = 0;
            }
            if (num[5][8] == 0) {
                thard58.setText("0");
                a[5][8] = 0;
                thard58.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard58.setText(Integer.toString(num[5][8]));
                a[5][8] = num[5][8];
                thard58.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard60Action(MouseEvent event) throws Exception {
        if (thard60.isDisable() == false) {
            num[6][0]++;
            if (num[6][0] > 9) {
                num[6][0] = 0;
            }
            if (num[6][0] == 0) {
                thard60.setText("0");
                a[6][0] = 0;
                thard60.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard60.setText(Integer.toString(num[6][0]));
                a[6][0] = num[6][0];
                thard60.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard61Action(MouseEvent event) throws Exception {
        if (thard61.isDisable() == false) {
            num[6][1]++;
            if (num[6][1] > 9) {
                num[6][1] = 0;
            }
            if (num[6][1] == 0) {
                thard61.setText("0");
                a[6][1] = 0;
                thard61.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard61.setText(Integer.toString(num[6][1]));
                a[6][1] = num[6][1];
                thard61.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard62Action(MouseEvent event) throws Exception {
        if (thard62.isDisable() == false) {
            num[6][2]++;
            if (num[6][2] > 9) {
                num[6][2] = 0;
            }
            if (num[6][2] == 0) {
                thard62.setText("0");
                a[6][2] = 0;
                thard62.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard62.setText(Integer.toString(num[6][2]));
                a[6][2] = num[6][2];
                thard62.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard63Action(MouseEvent event) throws Exception {
        if (thard63.isDisable() == false) {
            num[6][3]++;
            if (num[6][3] > 9) {
                num[6][3] = 0;
            }
            if (num[6][3] == 0) {
                thard63.setText("0");
                a[6][3] = 0;
                thard63.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard63.setText(Integer.toString(num[6][3]));
                a[6][3] = num[6][3];
                thard63.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard64Action(MouseEvent event) throws Exception {
        if (thard64.isDisable() == false) {
            num[6][4]++;
            if (num[6][4] > 9) {
                num[6][4] = 0;
            }
            if (num[6][4] == 0) {
                thard64.setText("0");
                a[6][4] = 0;
                thard64.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard64.setText(Integer.toString(num[6][4]));
                a[6][4] = num[6][4];
                thard64.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard65Action(MouseEvent event) throws Exception {
        if (thard65.isDisable() == false) {
            num[6][5]++;
            if (num[6][5] > 9) {
                num[6][5] = 0;
            }
            if (num[6][5] == 0) {
                thard65.setText("0");
                a[6][5] = 0;
                thard65.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard65.setText(Integer.toString(num[6][5]));
                a[6][5] = num[6][5];
                thard65.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard66Action(MouseEvent event) throws Exception {
        if (thard66.isDisable() == false) {
            num[6][6]++;
            if (num[6][6] > 9) {
                num[6][6] = 0;
            }
            if (num[6][6] == 0) {
                thard66.setText("0");
                a[6][6] = 0;
                thard66.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard66.setText(Integer.toString(num[6][6]));
                a[6][6] = num[6][6];
                thard66.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard67Action(MouseEvent event) throws Exception {
        if (thard67.isDisable() == false) {
            num[6][7]++;
            if (num[6][7] > 9) {
                num[6][7] = 0;
            }
            if (num[6][7] == 0) {
                thard67.setText("0");
                a[6][7] = 0;
                thard67.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard67.setText(Integer.toString(num[6][7]));
                a[6][7] = num[6][7];
                thard67.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard68Action(MouseEvent event) throws Exception {
        if (thard68.isDisable() == false) {
            num[6][8]++;
            if (num[6][8] > 9) {
                num[6][8] = 0;
            }
            if (num[6][8] == 0) {
                thard68.setText("0");
                a[6][8] = 0;
                thard68.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard68.setText(Integer.toString(num[6][8]));
                a[6][8] = num[6][8];
                thard68.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard70Action(MouseEvent event) throws Exception {
        if (thard70.isDisable() == false) {
            num[7][0]++;
            if (num[7][0] > 9) {
                num[7][0] = 0;
            }
            if (num[7][0] == 0) {
                thard70.setText("0");
                a[7][0] = 0;
                thard70.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard70.setText(Integer.toString(num[7][0]));
                a[7][0] = num[7][0];
                thard70.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard71Action(MouseEvent event) throws Exception {
        if (thard71.isDisable() == false) {
            num[7][1]++;
            if (num[7][1] > 9) {
                num[7][1] = 0;
            }
            if (num[7][1] == 0) {
                thard71.setText("0");
                a[7][1] = 0;
                thard71.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard71.setText(Integer.toString(num[7][1]));
                a[7][1] = num[7][1];
                thard71.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard72Action(MouseEvent event) throws Exception {
        if (thard72.isDisable() == false) {
            num[7][2]++;
            if (num[7][2] > 9) {
                num[7][2] = 0;
            }
            if (num[7][2] == 0) {
                thard72.setText("0");
                a[7][2] = 0;
                thard72.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard72.setText(Integer.toString(num[7][2]));
                a[7][2] = num[7][2];
                thard72.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard73Action(MouseEvent event) throws Exception {
        if (thard73.isDisable() == false) {
            num[7][3]++;
            if (num[7][3] > 9) {
                num[7][3] = 0;
            }
            if (num[7][3] == 0) {
                thard73.setText("0");
                a[7][3] = 0;
                thard73.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard73.setText(Integer.toString(num[7][3]));
                a[7][3] = num[7][3];
                thard73.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard74Action(MouseEvent event) throws Exception {
        if (thard74.isDisable() == false) {
            num[7][4]++;
            if (num[7][4] > 9) {
                num[7][4] = 0;
            }
            if (num[7][4] == 0) {
                thard74.setText("0");
                a[7][4] = 0;
                thard74.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard74.setText(Integer.toString(num[7][4]));
                a[7][4] = num[7][4];
                thard74.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard75Action(MouseEvent event) throws Exception {
        if (thard75.isDisable() == false) {
            num[7][5]++;
            if (num[7][5] > 9) {
                num[7][5] = 0;
            }
            if (num[7][5] == 0) {
                thard75.setText("0");
                a[7][5] = 0;
                thard75.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard75.setText(Integer.toString(num[7][5]));
                a[7][5] = num[7][5];
                thard75.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard76Action(MouseEvent event) throws Exception {
        if (thard76.isDisable() == false) {
            num[7][6]++;
            if (num[7][6] > 9) {
                num[7][6] = 0;
            }
            if (num[7][6] == 0) {
                thard76.setText("0");
                a[7][6] = 0;
                thard76.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard76.setText(Integer.toString(num[7][6]));
                a[7][6] = num[7][6];
                thard76.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard77Action(MouseEvent event) throws Exception {
        if (thard77.isDisable() == false) {
            num[7][7]++;
            if (num[7][7] > 9) {
                num[7][7] = 0;
            }
            if (num[7][7] == 0) {
                thard77.setText("0");
                a[7][7] = 0;
                thard77.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard77.setText(Integer.toString(num[7][7]));
                a[7][7] = num[7][7];
                thard77.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard78Action(MouseEvent event) throws Exception {
        if (thard78.isDisable() == false) {
            num[7][8]++;
            if (num[7][8] > 9) {
                num[7][8] = 0;
            }
            if (num[7][8] == 0) {
                thard78.setText("0");
                a[7][8] = 0;
                thard78.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard78.setText(Integer.toString(num[7][8]));
                a[7][8] = num[7][8];
                thard78.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard80Action(MouseEvent event) throws Exception {
        if (thard80.isDisable() == false) {
            num[8][0]++;
            if (num[8][0] > 9) {
                num[8][0] = 0;
            }
            if (num[8][0] == 0) {
                thard80.setText("0");
                a[8][0] = 0;
                thard80.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard80.setText(Integer.toString(num[8][0]));
                a[8][0] = num[8][0];
                thard80.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard81Action(MouseEvent event) throws Exception {
        if (thard81.isDisable() == false) {
            num[8][1]++;
            if (num[8][1] > 9) {
                num[8][1] = 0;
            }
            if (num[8][1] == 0) {
                thard81.setText("0");
                a[8][1] = 0;
                thard81.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard81.setText(Integer.toString(num[8][1]));
                a[8][1] = num[8][1];
                thard81.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard82Action(MouseEvent event) throws Exception {
        if (thard82.isDisable() == false) {
            num[8][2]++;
            if (num[8][2] > 9) {
                num[8][2] = 0;
            }
            if (num[8][2] == 0) {
                thard82.setText("0");
                a[8][2] = 0;
                thard82.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard82.setText(Integer.toString(num[8][2]));
                a[8][2] = num[8][2];
                thard82.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard83Action(MouseEvent event) throws Exception {
        if (thard83.isDisable() == false) {
            num[8][3]++;
            if (num[8][3] > 9) {
                num[8][3] = 0;
            }
            if (num[8][3] == 0) {
                thard83.setText("0");
                a[8][3] = 0;
                thard83.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard83.setText(Integer.toString(num[8][3]));
                a[8][3] = num[8][3];
                thard83.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard84Action(MouseEvent event) throws Exception {
        if (thard84.isDisable() == false) {
            num[8][4]++;
            if (num[8][4] > 9) {
                num[8][4] = 0;
            }
            if (num[8][4] == 0) {
                thard84.setText("0");
                a[8][4] = 0;
                thard84.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard84.setText(Integer.toString(num[8][4]));
                a[8][4] = num[8][4];
                thard84.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard85Action(MouseEvent event) throws Exception {
        if (thard85.isDisable() == false) {
            num[8][5]++;
            if (num[8][5] > 9) {
                num[8][5] = 0;
            }
            if (num[8][5] == 0) {
                thard85.setText("0");
                a[8][5] = 0;
                thard85.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard85.setText(Integer.toString(num[8][5]));
                a[8][5] = num[8][5];
                thard85.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard86Action(MouseEvent event) throws Exception {
        if (thard86.isDisable() == false) {
            num[8][6]++;
            if (num[8][6] > 9) {
                num[8][6] = 0;
            }
            if (num[8][6] == 0) {
                thard86.setText("0");
                a[8][6] = 0;
                thard86.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard86.setText(Integer.toString(num[8][6]));
                a[8][6] = num[8][6];
                thard86.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard87Action(MouseEvent event) throws Exception {
        if (thard87.isDisable() == false) {
            num[8][7]++;
            if (num[8][7] > 9) {
                num[8][7] = 0;
            }
            if (num[8][7] == 0) {
                thard87.setText("0");
                a[8][7] = 0;
                thard87.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard87.setText(Integer.toString(num[8][7]));
                a[8][7] = num[8][7];
                thard87.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void thard88Action(MouseEvent event) throws Exception {
        if (thard88.isDisable() == false) {
            num[8][8]++;
            if (num[8][8] > 9) {
                num[8][8] = 0;
            }
            if (num[8][8] == 0) {
                thard88.setText("0");
                a[8][8] = 0;
                thard88.setStyle("-fx-text-inner-color: black ;");
            } else {
                thard88.setText(Integer.toString(num[8][8]));
                a[8][8] = num[8][8];
                thard88.setStyle("-fx-text-inner-color: red ;");
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == result[i][j]) {
                    checker++;
                }
            }
        }
        if (checker == 81) {
            
            time.setVisible(false);
            //congrats.setVisible(true);
            required_time = time.getText();
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    private void gamePlan() {
        thard00.setText("" + a[0][0]);
        thard00.setEditable(false);
        if (a[0][0] == result[0][0]) {
            thard00.setDisable(true);
            thard00.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard01.setText("" + a[0][1]);
        thard01.setEditable(false);
        if (a[0][1] == result[0][1]) {
            thard01.setDisable(true);
            thard01.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard02.setText("" + a[0][2]);
        thard02.setEditable(false);
        if (a[0][2] == result[0][2]) {
            thard02.setDisable(true);
            thard02.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard03.setText("" + a[0][3]);
        thard03.setEditable(false);
        if (a[0][3] == result[0][3]) {
            thard03.setDisable(true);
            thard03.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard04.setText("" + a[0][4]);
        thard04.setEditable(false);
        if (a[0][4] == result[0][4]) {
            thard04.setDisable(true);
            thard04.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard05.setText("" + a[0][5]);
        thard05.setEditable(false);
        if (a[0][5] == result[0][5]) {
            thard05.setDisable(true);
            thard05.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard06.setText("" + a[0][6]);
        thard06.setEditable(false);
        if (a[0][6] == result[0][6]) {
            thard06.setDisable(true);
            thard06.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard07.setText("" + a[0][7]);
        thard07.setEditable(false);
        if (a[0][7] == result[0][7]) {
            thard07.setDisable(true);
            thard07.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard08.setText("" + a[0][8]);
        thard08.setEditable(false);
        if (a[0][8] == result[0][8]) {
            thard08.setDisable(true);
            thard08.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard10.setText("" + a[1][0]);
        thard10.setEditable(false);
        if (a[1][0] == result[1][0]) {
            thard10.setDisable(true);
            thard10.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard11.setText("" + a[1][1]);
        thard11.setEditable(false);
        if (a[1][1] == result[1][1]) {
            thard11.setDisable(true);
            thard11.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard12.setText("" + a[1][2]);
        thard12.setEditable(false);
        if (a[1][2] == result[1][2]) {
            thard12.setDisable(true);
            thard12.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard13.setText("" + a[1][3]);
        thard13.setEditable(false);
        if (a[1][3] == result[1][3]) {
            thard13.setDisable(true);
            thard13.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard14.setText("" + a[1][4]);
        thard14.setEditable(false);
        if (a[1][4] == result[1][4]) {
            thard14.setDisable(true);
            thard14.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard15.setText("" + a[1][5]);
        thard15.setEditable(false);
        if (a[1][5] == result[1][5]) {
            thard15.setDisable(true);
            thard15.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard16.setText("" + a[1][6]);
        thard16.setEditable(false);
        if (a[1][6] == result[1][6]) {
            thard16.setDisable(true);
            thard16.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard17.setText("" + a[1][7]);
        thard17.setEditable(false);
        if (a[1][7] == result[1][7]) {
            thard17.setDisable(true);
            thard17.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard18.setText("" + a[1][8]);
        thard18.setEditable(false);
        if (a[1][8] == result[1][8]) {
            thard18.setDisable(true);
            thard18.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard20.setText("" + a[2][0]);
        thard20.setEditable(false);
        if (a[2][0] == result[2][0]) {
            thard20.setDisable(true);
            thard20.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard21.setText("" + a[2][1]);
        thard21.setEditable(false);
        if (a[2][1] == result[2][1]) {
            thard21.setDisable(true);
            thard21.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard22.setText("" + a[2][2]);
        thard22.setEditable(false);
        if (a[2][2] == result[2][2]) {
            thard22.setDisable(true);
            thard22.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard23.setText("" + a[2][3]);
        thard23.setEditable(false);
        if (a[2][3] == result[2][3]) {
            thard23.setDisable(true);
            thard23.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard24.setText("" + a[2][4]);
        thard24.setEditable(false);
        if (a[2][4] == result[2][4]) {
            thard24.setDisable(true);
            thard24.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard25.setText("" + a[2][5]);
        thard25.setEditable(false);
        if (a[2][5] == result[2][5]) {
            thard25.setDisable(true);
            thard25.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard26.setText("" + a[2][6]);
        thard26.setEditable(false);
        if (a[2][6] == result[2][6]) {
            thard26.setDisable(true);
            thard26.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard27.setText("" + a[2][7]);
        thard27.setEditable(false);
        if (a[2][7] == result[2][7]) {
            thard27.setDisable(true);
            thard27.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard28.setText("" + a[2][8]);
        thard28.setEditable(false);
        if (a[2][8] == result[2][8]) {
            thard28.setDisable(true);
            thard28.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard30.setText("" + a[3][0]);
        thard30.setEditable(false);
        if (a[3][0] == result[3][0]) {
            thard30.setDisable(true);
            thard30.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard31.setText("" + a[3][1]);
        thard31.setEditable(false);
        if (a[3][1] == result[3][1]) {
            thard31.setDisable(true);
            thard31.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard32.setText("" + a[3][2]);
        thard32.setEditable(false);
        if (a[3][2] == result[3][2]) {
            thard32.setDisable(true);
            thard32.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard33.setText("" + a[3][3]);
        thard33.setEditable(false);
        if (a[3][3] == result[3][3]) {
            thard33.setDisable(true);
            thard33.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard34.setText("" + a[3][4]);
        thard34.setEditable(false);
        if (a[3][4] == result[3][4]) {
            thard34.setDisable(true);
            thard34.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard35.setText("" + a[3][5]);
        thard35.setEditable(false);
        if (a[3][5] == result[3][5]) {
            thard35.setDisable(true);
            thard35.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard36.setText("" + a[3][6]);
        thard36.setEditable(false);
        if (a[3][6] == result[3][6]) {
            thard36.setDisable(true);
            thard36.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard37.setText("" + a[3][7]);
        thard37.setEditable(false);
        if (a[3][7] == result[3][7]) {
            thard37.setDisable(true);
            thard37.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard38.setText("" + a[3][8]);
        thard38.setEditable(false);
        if (a[3][8] == result[3][8]) {
            thard38.setDisable(true);
            thard38.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard40.setText("" + a[4][0]);
        thard40.setEditable(false);
        if (a[4][0] == result[4][0]) {
            thard40.setDisable(true);
            thard40.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard41.setText("" + a[4][1]);
        thard41.setEditable(false);
        if (a[4][1] == result[4][1]) {
            thard41.setDisable(true);
            thard41.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard42.setText("" + a[4][2]);
        thard42.setEditable(false);
        if (a[4][2] == result[4][2]) {
            thard42.setDisable(true);
            thard42.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard43.setText("" + a[4][3]);
        thard43.setEditable(false);
        if (a[4][3] == result[4][3]) {
            thard43.setDisable(true);
            thard43.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard44.setText("" + a[4][4]);
        thard44.setEditable(false);
        if (a[4][4] == result[4][4]) {
            thard44.setDisable(true);
            thard44.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard45.setText("" + a[4][5]);
        thard45.setEditable(false);
        if (a[4][5] == result[4][5]) {
            thard45.setDisable(true);
            thard45.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard46.setText("" + a[4][6]);
        thard46.setEditable(false);
        if (a[4][6] == result[4][6]) {
            thard46.setDisable(true);
            thard46.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard47.setText("" + a[4][7]);
        thard47.setEditable(false);
        if (a[4][7] == result[4][7]) {
            thard47.setDisable(true);
            thard47.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard48.setText("" + a[4][8]);
        thard48.setEditable(false);
        if (a[4][8] == result[4][8]) {
            thard48.setDisable(true);
            thard48.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard50.setText("" + a[5][0]);
        thard50.setEditable(false);
        if (a[5][0] == result[5][0]) {
            thard50.setDisable(true);
            thard50.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard51.setText("" + a[5][1]);
        thard51.setEditable(false);
        if (a[5][1] == result[5][1]) {
            thard51.setDisable(true);
            thard51.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard52.setText("" + a[5][2]);
        thard52.setEditable(false);
        if (a[5][2] == result[5][2]) {
            thard52.setDisable(true);
            thard52.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard53.setText("" + a[5][3]);
        thard53.setEditable(false);
        if (a[5][3] == result[5][3]) {
            thard53.setDisable(true);
            thard53.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard54.setText("" + a[5][4]);
        thard54.setEditable(false);
        if (a[5][4] == result[5][4]) {
            thard54.setDisable(true);
            thard54.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard55.setText("" + a[5][5]);
        thard55.setEditable(false);
        if (a[5][5] == result[5][5]) {
            thard55.setDisable(true);
            thard55.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard56.setText("" + a[5][6]);
        thard56.setEditable(false);
        if (a[5][6] == result[5][6]) {
            thard56.setDisable(true);
            thard56.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard57.setText("" + a[5][7]);
        thard57.setEditable(false);
        if (a[5][7] == result[5][7]) {
            thard57.setDisable(true);
            thard57.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard58.setText("" + a[5][8]);
        thard58.setEditable(false);
        if (a[5][8] == result[5][8]) {
            thard58.setDisable(true);
            thard58.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard60.setText("" + a[6][0]);
        thard60.setEditable(false);
        if (a[6][0] == result[6][0]) {
            thard60.setDisable(true);
            thard60.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard61.setText("" + a[6][1]);
        thard61.setEditable(false);
        if (a[6][1] == result[6][1]) {
            thard61.setDisable(true);
            thard61.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard62.setText("" + a[6][2]);
        thard62.setEditable(false);
        if (a[6][2] == result[6][2]) {
            thard62.setDisable(true);
            thard62.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard63.setText("" + a[6][3]);
        thard63.setEditable(false);
        if (a[6][3] == result[6][3]) {
            thard63.setDisable(true);
            thard63.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard64.setText("" + a[6][4]);
        thard64.setEditable(false);
        if (a[6][4] == result[6][4]) {
            thard64.setDisable(true);
            thard64.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard65.setText("" + a[6][5]);
        thard65.setEditable(false);
        if (a[6][5] == result[6][5]) {
            thard65.setDisable(true);
            thard65.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard66.setText("" + a[6][6]);
        thard66.setEditable(false);
        if (a[6][6] == result[6][6]) {
            thard66.setDisable(true);
            thard66.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard67.setText("" + a[6][7]);
        thard67.setEditable(false);
        if (a[6][7] == result[6][7]) {
            thard67.setDisable(true);
            thard67.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard68.setText("" + a[6][8]);
        thard68.setEditable(false);
        if (a[6][8] == result[6][8]) {
            thard68.setDisable(true);
            thard68.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard70.setText("" + a[7][0]);
        thard70.setEditable(false);
        if (a[7][0] == result[7][0]) {
            thard70.setDisable(true);
            thard70.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard71.setText("" + a[7][1]);
        thard71.setEditable(false);
        if (a[7][1] == result[7][1]) {
            thard71.setDisable(true);
            thard71.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard72.setText("" + a[7][2]);
        thard72.setEditable(false);
        if (a[7][2] == result[7][2]) {
            thard72.setDisable(true);
            thard72.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard73.setText("" + a[7][3]);
        thard73.setEditable(false);
        if (a[7][3] == result[7][3]) {
            thard73.setDisable(true);
            thard73.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard74.setText("" + a[7][4]);
        thard74.setEditable(false);
        if (a[7][4] == result[7][4]) {
            thard74.setDisable(true);
            thard74.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard75.setText("" + a[7][5]);
        thard75.setEditable(false);
        if (a[7][5] == result[7][5]) {
            thard75.setDisable(true);
            thard75.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard76.setText("" + a[7][6]);
        thard76.setEditable(false);
        if (a[7][6] == result[7][6]) {
            thard76.setDisable(true);
            thard76.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard77.setText("" + a[7][7]);
        thard77.setEditable(false);
        if (a[7][7] == result[7][7]) {
            thard77.setDisable(true);
            thard77.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard78.setText("" + a[7][8]);
        thard78.setEditable(false);
        if (a[7][8] == result[7][8]) {
            thard78.setDisable(true);
            thard78.setStyle("-fx-text-inner-color: blue ; ");
        }

        thard80.setText("" + a[8][0]);
        thard80.setEditable(false);
        if (a[8][0] == result[8][0]) {
            thard80.setDisable(true);
            thard80.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard81.setText("" + a[8][1]);
        thard81.setEditable(false);
        if (a[8][1] == result[8][1]) {
            thard81.setDisable(true);
            thard81.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard82.setText("" + a[8][2]);
        thard82.setEditable(false);
        if (a[8][2] == result[8][2]) {
            thard82.setDisable(true);
            thard82.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard83.setText("" + a[8][3]);
        thard83.setEditable(false);
        if (a[8][3] == result[8][3]) {
            thard83.setDisable(true);
            thard83.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard84.setText("" + a[8][4]);
        thard84.setEditable(false);
        if (a[8][4] == result[8][4]) {
            thard84.setDisable(true);
            thard84.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard85.setText("" + a[8][5]);
        thard85.setEditable(false);
        if (a[8][5] == result[8][5]) {
            thard85.setDisable(true);
            thard85.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard86.setText("" + a[8][6]);
        thard86.setEditable(false);
        if (a[8][6] == result[8][6]) {
            thard86.setDisable(true);
            thard86.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard87.setText("" + a[8][7]);
        thard87.setEditable(false);
        if (a[8][7] == result[8][7]) {
            thard87.setDisable(true);
            thard87.setStyle("-fx-text-inner-color: blue ; ");
        }
        thard88.setText("" + a[8][8]);
        thard88.setEditable(false);
        if (a[8][8] == result[8][8]) {
            thard88.setDisable(true);
            thard88.setStyle("-fx-text-inner-color: blue ; ");
        }

    }

    private void startTime() {
        if (timerStats == false) {
            timerStats = true;
            timer = new Timer();
            TimerTask timerTask = new TimerTask() {

                @Override
                public void run() {

                    //    System.out.println("working");
                    timersec += 3;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                            if (timersec >= 60) {
                                timersec = 0;
                                timermin++;
                            }
                            if (timermin >= 60) {
                                timermin = 0;
                                timerhr++;
                            }

                            String seconds = Integer.toString(timersec);
                            String minutes = Integer.toString(timermin);
                            String hours = Integer.toString(timerhr);

                            if (timersec <= 9) {
                                seconds = "0" + Integer.toString(timersec);
                            }
                            if (timermin <= 9) {
                                minutes = "0" + Integer.toString(timermin);
                            }
                            if (timerhr <= 9) {
                                hours = "0" + Integer.toString(timerhr);
                            }

                            time.setText("Time :" + hours + ":" + minutes + ":" + seconds.charAt(0) + "" + seconds.charAt(1));
                            //    System.out.println(time.getText());
                        }

                    });

                }

            };
            timer.schedule(timerTask, 50, 50); //lastone is time, milli second

        }

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generate_random_suduko();
        save_result();
        hard_randomly_insert_zero();

        lblhard.setText("Name:" + user_name);
        gamePlan();
        startTime();
    }

}
