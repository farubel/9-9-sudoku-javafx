/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.FirstStage.required_time;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class EasyController extends FirstStage implements Initializable {

    private int checker;
    @FXML
    private TextField tfield00, tfield01, tfield02, tfield03, tfield04, tfield05, tfield06, tfield07, tfield08,
            tfield10, tfield11, tfield12, tfield13, tfield14, tfield15, tfield16, tfield17, tfield18,
            tfield20, tfield21, tfield22, tfield23, tfield24, tfield25, tfield26, tfield27, tfield28,
            tfield30, tfield31, tfield32, tfield33, tfield34, tfield35, tfield36, tfield37, tfield38,
            tfield40, tfield41, tfield42, tfield43, tfield44, tfield45, tfield46, tfield47, tfield48,
            tfield50, tfield51, tfield52, tfield53, tfield54, tfield55, tfield56, tfield57, tfield58,
            tfield60, tfield61, tfield62, tfield63, tfield64, tfield65, tfield66, tfield67, tfield68,
            tfield70, tfield71, tfield72, tfield73, tfield74, tfield75, tfield76, tfield77, tfield78,
            tfield80, tfield81, tfield82, tfield83, tfield84, tfield85, tfield86, tfield87, tfield88;
    @FXML
    private Label lblname;
    @FXML
    private Button btnPrevious;
    @FXML
    private Button btnSolve;
    @FXML
    private Button btnQuit;
    @FXML
    private Button btnCheckResult;

    private int num[][] = new int[9][9];
    @FXML
    private Label time;
    private Label mode;

    private boolean timerStats;
    private Timer timer;
    private int timersec;
    private int timermin;
    private int timerhr;

    @FXML
    private void btnPreviousAction(ActionEvent event) throws Exception {
        leaderboard = "";
        root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
        scene = new Scene(root);
       
        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
        
     timer.cancel();
    }

    @FXML
    private void btnSolveAction(ActionEvent event) throws Exception {
        flag = 1; //set flag for easy level
        root = FXMLLoader.load(getClass().getResource("/com/Solve.fxml"));
        scene = new Scene(root);
       
        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
        
        timer.cancel();
    }
    private void Congrats()throws Exception{
        flag = 1; //set flag for easy level
        root = FXMLLoader.load(getClass().getResource("/com/Congrats.fxml"));
        scene = new Scene(root);
       
        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
        
    }
    @FXML
    private void btnCheckResultAction(ActionEvent event) throws Exception {
        flag = 1;
        tfieldPlan();
    }

    private void tfieldPlan() {
        tfield00.setText("" + a[0][0]);
        if (a[0][0] == result[0][0]) {
        //    tfield00.setDisable(true);
            tfield00.setStyle("-fx-text-inner-color: blue ; ");
        } else {
            tfield00.setEditable(false);
            tfield00.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield01.setText("" + a[0][1]);
        if (a[0][1] == result[0][1]) {
        //    tfield01.setDisable(true);
            tfield01.setStyle("-fx-text-inner-color: blue ; ");
        } else {
            tfield01.setEditable(false);
            tfield01.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield02.setText("" + a[0][2]);
        if (a[0][2] == result[0][2]) {
        //    tfield02.setDisable(true);
            tfield02.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield02.setEditable(false);
            tfield02.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield03.setText("" + a[0][3]);
        if (a[0][3] == result[0][3]) {
        //    tfield03.setDisable(true);
            tfield03.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield03.setEditable(false);
            tfield03.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield04.setText("" + a[0][4]);
        if (a[0][4] == result[0][4]) {
        //    tfield04.setDisable(true);
            tfield04.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield04.setEditable(false);
            tfield04.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield05.setText("" + a[0][5]);
        if (a[0][5] == result[0][5]) {
        //    tfield05.setDisable(true);
            tfield05.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield05.setEditable(false);
            tfield05.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield06.setText("" + a[0][6]);
        if (a[0][6] == result[0][6]) {
        //    tfield06.setDisable(true);
            tfield06.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield06.setEditable(false);
            tfield06.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield07.setText("" + a[0][7]);
        if (a[0][7] == result[0][7]) {
        //    tfield07.setDisable(true);
            tfield07.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield07.setEditable(false);
            tfield07.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield08.setText("" + a[0][8]);
        if (a[0][8] == result[0][8]) {
        //    tfield08.setDisable(true);
            tfield08.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield08.setEditable(false);
            tfield08.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield10.setText("" + a[1][0]);
        if (a[1][0] == result[1][0]) {
        //    tfield10.setDisable(true);
            tfield10.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield10.setEditable(false);
            tfield10.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield11.setText("" + a[1][1]);
        if (a[1][1] == result[1][1]) {
        //    tfield11.setDisable(true);
            tfield11.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield11.setEditable(false);
            tfield11.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield12.setText("" + a[1][2]);
        if (a[1][2] == result[1][2]) {
        //    tfield12.setDisable(true);
            tfield12.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield12.setEditable(false);
            tfield12.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield13.setText("" + a[1][3]);
        if (a[1][3] == result[1][3]) {
        //    tfield13.setDisable(true);
            tfield13.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield13.setEditable(false);
            tfield13.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield14.setText("" + a[1][4]);
        if (a[1][4] == result[1][4]) {
        //    tfield14.setDisable(true);
            tfield14.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield14.setEditable(false);
            tfield14.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield15.setText("" + a[1][5]);
        if (a[1][5] == result[1][5]) {
        //    tfield15.setDisable(true);
            tfield15.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield15.setEditable(false);
            tfield15.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield16.setText("" + a[1][6]);
        if (a[1][6] == result[1][6]) {
        //    tfield16.setDisable(true);
            tfield16.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield16.setEditable(false);
            tfield16.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield17.setText("" + a[1][7]);
        if (a[1][7] == result[1][7]) {
        //    tfield17.setDisable(true);
            tfield17.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield17.setEditable(false);
            tfield17.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield18.setText("" + a[1][8]);
        if (a[1][8] == result[1][8]) {
        //    tfield18.setDisable(true);
            tfield18.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield18.setEditable(false);
            tfield18.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield20.setText("" + a[2][0]);
        if (a[2][0] == result[2][0]) {
        //    tfield20.setDisable(true);
            tfield20.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield20.setEditable(false);
            tfield20.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield21.setText("" + a[2][1]);
        if (a[2][1] == result[2][1]) {
        //    tfield21.setDisable(true);
            tfield21.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield21.setEditable(false);
            tfield21.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield22.setText("" + a[2][2]);
        if (a[2][2] == result[2][2]) {
        //    tfield22.setDisable(true);
            tfield22.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield22.setEditable(false);
            tfield22.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield23.setText("" + a[2][3]);
        if (a[2][3] == result[2][3]) {
        //    tfield23.setDisable(true);
            tfield23.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield23.setEditable(false);
            tfield23.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield24.setText("" + a[2][4]);
        if (a[2][4] == result[2][4]) {
        //    tfield24.setDisable(true);
            tfield24.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield24.setEditable(false);
            tfield24.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield25.setText("" + a[2][5]);
        if (a[2][5] == result[2][5]) {
        //    tfield25.setDisable(true);
            tfield25.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield25.setEditable(false);
            tfield25.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield26.setText("" + a[2][6]);
        if (a[2][6] == result[2][6]) {
        //    tfield26.setDisable(true);
            tfield26.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield26.setEditable(false);
            tfield26.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield27.setText("" + a[2][7]);
        if (a[2][7] == result[2][7]) {
        //    tfield27.setDisable(true);
            tfield27.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield27.setEditable(false);
            tfield27.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield28.setText("" + a[2][8]);
        if (a[2][8] == result[2][8]) {
        //    tfield28.setDisable(true);
            tfield28.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield28.setEditable(false);
            tfield28.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield30.setText("" + a[3][0]);
        if (a[3][0] == result[3][0]) {
        //    tfield30.setDisable(true);
            tfield30.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield30.setEditable(false);
            tfield30.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield31.setText("" + a[3][1]);
        if (a[3][1] == result[3][1]) {
        //    tfield31.setDisable(true);
            tfield31.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield31.setEditable(false);
            tfield31.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield32.setText("" + a[3][2]);
        if (a[3][2] == result[3][2]) {
        //    tfield32.setDisable(true);
            tfield32.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield32.setEditable(false);
            tfield32.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield33.setText("" + a[3][3]);
        if (a[3][3] == result[3][3]) {
        //    tfield33.setDisable(true);
            tfield33.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield33.setEditable(false);
            tfield33.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield34.setText("" + a[3][4]);
        if (a[3][4] == result[3][4]) {
        //    tfield34.setDisable(true);
            tfield34.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield34.setEditable(false);
            tfield34.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield35.setText("" + a[3][5]);
        if (a[3][5] == result[3][5]) {
        //    tfield35.setDisable(true);
            tfield35.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield35.setEditable(false);
            tfield35.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield36.setText("" + a[3][6]);
        if (a[3][6] == result[3][6]) {
        //    tfield36.setDisable(true);
            tfield36.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield36.setEditable(false);
            tfield36.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield37.setText("" + a[3][7]);
        if (a[3][7] == result[3][7]) {
        //    tfield37.setDisable(true);
            tfield37.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield37.setEditable(false);
            tfield37.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield38.setText("" + a[3][8]);
        if (a[3][8] == result[3][8]) {
        //    tfield38.setDisable(true);
            tfield38.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield38.setEditable(false);
            tfield38.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield40.setText("" + a[4][0]);
        if (a[4][0] == result[4][0]) {
        //    tfield40.setDisable(true);
            tfield40.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield40.setEditable(false);
            tfield40.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield41.setText("" + a[4][1]);
        if (a[4][1] == result[4][1]) {
        //    tfield41.setDisable(true);
            tfield41.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield41.setEditable(false);
            tfield41.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield42.setText("" + a[4][2]);
        if (a[4][2] == result[4][2]) {
        //    tfield42.setDisable(true);
            tfield42.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield42.setEditable(false);
            tfield42.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield43.setText("" + a[4][3]);
        if (a[4][3] == result[4][3]) {
        //    tfield43.setDisable(true);
            tfield43.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield43.setEditable(false);
            tfield43.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield44.setText("" + a[4][4]);
        if (a[4][4] == result[4][4]) {
        //    tfield44.setDisable(true);
            tfield44.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield44.setEditable(false);
            tfield44.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield45.setText("" + a[4][5]);
        if (a[4][5] == result[4][5]) {
        //    tfield45.setDisable(true);
            tfield45.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield45.setEditable(false);
            tfield45.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield46.setText("" + a[4][6]);
        if (a[4][6] == result[4][6]) {
        //    tfield46.setDisable(true);
            tfield46.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield46.setEditable(false);
            tfield46.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield47.setText("" + a[4][7]);
        if (a[4][7] == result[4][7]) {
        //    tfield47.setDisable(true);
            tfield47.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield47.setEditable(false);
            tfield47.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield48.setText("" + a[4][8]);
        if (a[4][8] == result[4][8]) {
        //    tfield48.setDisable(true);
            tfield48.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield48.setEditable(false);
            tfield48.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield50.setText("" + a[5][0]);
        if (a[5][0] == result[5][0]) {
        //    tfield50.setDisable(true);
            tfield50.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield50.setEditable(false);
            tfield50.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield51.setText("" + a[5][1]);
        if (a[5][1] == result[5][1]) {
        //    tfield51.setDisable(true);
            tfield51.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield51.setEditable(false);
            tfield51.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield52.setText("" + a[5][2]);
        if (a[5][2] == result[5][2]) {
        //    tfield52.setDisable(true);
            tfield52.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield52.setEditable(false);
            tfield52.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield53.setText("" + a[5][3]);
        if (a[5][3] == result[5][3]) {
        //    tfield53.setDisable(true);
            tfield53.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield53.setEditable(false);
            tfield53.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield54.setText("" + a[5][4]);
        if (a[5][4] == result[5][4]) {
        //    tfield54.setDisable(true);
            tfield54.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield54.setEditable(false);
            tfield54.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield55.setText("" + a[5][5]);
        if (a[5][5] == result[5][5]) {
        //    tfield55.setDisable(true);
            tfield55.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield55.setEditable(false);
            tfield55.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield56.setText("" + a[5][6]);
        if (a[5][6] == result[5][6]) {
        //    tfield56.setDisable(true);
            tfield56.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield56.setEditable(false);
            tfield56.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield57.setText("" + a[5][7]);
        if (a[5][7] == result[5][7]) {
        //    tfield57.setDisable(true);
            tfield57.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield57.setEditable(false);
            tfield57.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield58.setText("" + a[5][8]);
        if (a[5][8] == result[5][8]) {
        //    tfield58.setDisable(true);
            tfield58.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield58.setEditable(false);
            tfield58.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield60.setText("" + a[6][0]);
        if (a[6][0] == result[6][0]) {
        //    tfield60.setDisable(true);
            tfield60.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield60.setEditable(false);
            tfield60.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield61.setText("" + a[6][1]);
        if (a[6][1] == result[6][1]) {
        //    tfield61.setDisable(true);
            tfield61.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield61.setEditable(false);
            tfield61.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield62.setText("" + a[6][2]);
        if (a[6][2] == result[6][2]) {
        //    tfield62.setDisable(true);
            tfield62.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield62.setEditable(false);
            tfield62.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield63.setText("" + a[6][3]);
        if (a[6][3] == result[6][3]) {
        //    tfield63.setDisable(true);
            tfield63.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield63.setEditable(false);
            tfield63.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield64.setText("" + a[6][4]);
        if (a[6][4] == result[6][4]) {
        //    tfield64.setDisable(true);
            tfield64.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield64.setEditable(false);
            tfield64.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield65.setText("" + a[6][5]);
        if (a[6][5] == result[6][5]) {
        //    tfield65.setDisable(true);
            tfield65.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield65.setEditable(false);
            tfield65.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield66.setText("" + a[6][6]);
        if (a[6][6] == result[6][6]) {
        //    tfield66.setDisable(true);
            tfield66.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield66.setEditable(false);
            tfield66.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield67.setText("" + a[6][7]);
        if (a[6][7] == result[6][7]) {
        //    tfield67.setDisable(true);
            tfield67.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield67.setEditable(false);
            tfield67.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield68.setText("" + a[6][8]);
        if (a[6][8] == result[6][8]) {
        //    tfield68.setDisable(true);
            tfield68.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield68.setEditable(false);
            tfield68.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield70.setText("" + a[7][0]);
        if (a[7][0] == result[7][0]) {
        //    tfield70.setDisable(true);
            tfield70.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield70.setEditable(false);
            tfield70.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield71.setText("" + a[7][1]);
        if (a[7][1] == result[7][1]) {
        //    tfield71.setDisable(true);
            tfield71.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield71.setEditable(false);
            tfield71.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield72.setText("" + a[7][2]);
        if (a[7][2] == result[7][2]) {
        //    tfield72.setDisable(true);
            tfield72.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield72.setEditable(false);
            tfield72.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield73.setText("" + a[7][3]);
        if (a[7][3] == result[7][3]) {
        //    tfield73.setDisable(true);
            tfield73.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield73.setEditable(false);
            tfield73.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield74.setText("" + a[7][4]);
        if (a[7][4] == result[7][4]) {
        //    tfield74.setDisable(true);
            tfield74.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield74.setEditable(false);
            tfield74.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield75.setText("" + a[7][5]);
        if (a[7][5] == result[7][5]) {
        //    tfield75.setDisable(true);
            tfield75.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield75.setEditable(false);
            tfield75.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield76.setText("" + a[7][6]);
        if (a[7][6] == result[7][6]) {
        //    tfield76.setDisable(true);
            tfield76.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield76.setEditable(false);
            tfield76.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield77.setText("" + a[7][7]);
        if (a[7][7] == result[7][7]) {
        //    tfield77.setDisable(true);
            tfield77.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield77.setEditable(false);
            tfield77.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield78.setText("" + a[7][8]);
        if (a[7][8] == result[7][8]) {
        //    tfield78.setDisable(true);
            tfield78.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield78.setEditable(false);
            tfield78.setStyle("-fx-text-inner-color: red ; ");
        }

        tfield80.setText("" + a[8][0]);
        if (a[8][0] == result[8][0]) {
        //    tfield80.setDisable(true);
            tfield80.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield80.setEditable(false);
            tfield80.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield81.setText("" + a[8][1]);
        if (a[8][1] == result[8][1]) {
        //    tfield81.setDisable(true);
            tfield81.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield81.setEditable(false);
            tfield81.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield82.setText("" + a[8][2]);
        if (a[8][2] == result[8][2]) {
        //    tfield82.setDisable(true);
            tfield82.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield82.setEditable(false);
            tfield82.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield83.setText("" + a[8][3]);
        if (a[8][3] == result[8][3]) {
        //    tfield83.setDisable(true);
            tfield83.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield83.setEditable(false);
            tfield83.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield84.setText("" + a[8][4]);
        if (a[8][4] == result[8][4]) {
        //    tfield84.setDisable(true);
            tfield84.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield84.setEditable(false);
            tfield84.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield85.setText("" + a[8][5]);
        if (a[8][5] == result[8][5]) {
        //    tfield85.setDisable(true);
            tfield85.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield85.setEditable(false);
            tfield85.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield86.setText("" + a[8][6]);
        if (a[8][6] == result[8][6]) {
        //    tfield86.setDisable(true);
            tfield86.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield86.setEditable(false);
            tfield86.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield87.setText("" + a[8][7]);
        if (a[8][7] == result[8][7]) {
        //    tfield87.setDisable(true);
            tfield87.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield87.setEditable(false);
            tfield87.setStyle("-fx-text-inner-color: red ; ");
        }
        tfield88.setText("" + a[8][8]);
        if (a[8][8] == result[8][8]) {
        //    tfield88.setDisable(true);
            tfield88.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tfield88.setEditable(false);
            tfield88.setStyle("-fx-text-inner-color: red ; ");
        }

    }

    @FXML
    private void btnQuitAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void tfield00Action(MouseEvent event) throws Exception {
        if (tfield00.isDisable() == false) {
            num[0][0]++;
            if (num[0][0] > 9) {
                num[0][0] = 0;
            }
            if (num[0][0] == 0) {
                tfield00.setText("0");
                a[0][0] = 0;
                tfield00.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield00.setText(Integer.toString(num[0][0]));
                a[0][0] = num[0][0];
                tfield00.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield01Action(MouseEvent event) throws Exception {
        if (tfield01.isDisable() == false) {
            num[0][1]++;
            if (num[0][1] > 9) {
                num[0][1] = 0;
            }
            if (num[0][1] == 0) {
                tfield01.setText("0");
                a[0][1] = 0;
                tfield01.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield01.setText(Integer.toString(num[0][1]));
                a[0][1] = num[0][1];
                tfield01.setStyle("-fx-text-inner-color: red ;");
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
            System.out.println(required_time);
            Congrats();
            //btnCheckResult.setVisible(false);
            //btnSolve.setVisible(false);
        }
        checker = 0;
    }

    @FXML
    private void tfield02Action(MouseEvent event) throws Exception {
        if (tfield02.isDisable() == false) {
            num[0][2]++;
            if (num[0][2] > 9) {
                num[0][2] = 0;
            }
            if (num[0][2] == 0) {
                tfield02.setText("0");
                a[0][2] = 0;
                tfield02.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield02.setText(Integer.toString(num[0][2]));
                a[0][2] = num[0][2];
                tfield02.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield03Action(MouseEvent event) throws Exception {
        if (tfield03.isDisable() == false) {
            num[0][3]++;
            if (num[0][3] > 9) {
                num[0][3] = 0;
            }
            if (num[0][3] == 0) {
                tfield03.setText("0");
                a[0][3] = 0;
                tfield03.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield03.setText(Integer.toString(num[0][3]));
                a[0][3] = num[0][3];
                tfield03.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield04Action(MouseEvent event) throws Exception {
        if (tfield04.isDisable() == false) {
            num[0][4]++;
            if (num[0][4] > 9) {
                num[0][4] = 0;
            }
            if (num[0][4] == 0) {
                tfield04.setText("0");
                a[0][4] = 0;
                tfield04.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield04.setText(Integer.toString(num[0][4]));
                a[0][4] = num[0][4];
                tfield04.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield05Action(MouseEvent event) throws Exception {
        if (tfield05.isDisable() == false) {
            num[0][5]++;
            if (num[0][5] > 9) {
                num[0][5] = 0;
            }
            if (num[0][5] == 0) {
                tfield05.setText("0");
                a[0][5] = 0;
                tfield05.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield05.setText(Integer.toString(num[0][5]));
                a[0][5] = num[0][5];
                tfield05.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield06Action(MouseEvent event) throws Exception {
        if (tfield06.isDisable() == false) {
            num[0][6]++;
            if (num[0][6] > 9) {
                num[0][6] = 0;
            }
            if (num[0][6] == 0) {
                tfield06.setText("0");
                a[0][6] = 0;
                tfield06.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield06.setText(Integer.toString(num[0][6]));
                a[0][6] = num[0][6];
                tfield06.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield07Action(MouseEvent event) throws Exception {
        if (tfield07.isDisable() == false) {
            num[0][7]++;
            if (num[0][7] > 9) {
                num[0][7] = 0;
            }
            if (num[0][7] == 0) {
                tfield07.setText("0");
                a[0][7] = 0;
                tfield07.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield07.setText(Integer.toString(num[0][7]));
                a[0][7] = num[0][7];
                tfield07.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield08Action(MouseEvent event) throws Exception {
        if (tfield08.isDisable() == false) {
            num[0][8]++;
            if (num[0][8] > 9) {
                num[0][8] = 0;
            }
            if (num[0][8] == 0) {
                tfield08.setText("0");
                a[0][8] = 0;
                tfield08.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield08.setText(Integer.toString(num[0][8]));
                a[0][8] = num[0][8];
                tfield08.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield10Action(MouseEvent event) throws Exception {
        if (tfield10.isDisable() == false) {
            num[1][0]++;
            if (num[1][0] > 9) {
                num[1][0] = 0;
            }
            if (num[1][0] == 0) {
                tfield10.setText("0");
                a[1][0] = 0;
                tfield10.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield10.setText(Integer.toString(num[1][0]));
                a[1][0] = num[1][0];
                tfield10.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield11Action(MouseEvent event) throws Exception {
        if (tfield11.isDisable() == false) {
            num[1][1]++;
            if (num[1][1] > 9) {
                num[1][1] = 0;
            }
            if (num[1][1] == 0) {
                tfield11.setText("0");
                a[1][1] = 0;
                tfield11.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield11.setText(Integer.toString(num[1][1]));
                a[1][1] = num[1][1];
                tfield11.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield12Action(MouseEvent event) throws Exception {
        if (tfield12.isDisable() == false) {
            num[1][2]++;
            if (num[1][2] > 9) {
                num[1][2] = 0;
            }
            if (num[1][2] == 0) {
                tfield12.setText("0");
                a[1][2] = 0;
                tfield12.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield12.setText(Integer.toString(num[1][2]));
                a[1][2] = num[1][2];
                tfield12.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield13Action(MouseEvent event) throws Exception {
        if (tfield13.isDisable() == false) {
            num[1][3]++;
            if (num[1][3] > 9) {
                num[1][3] = 0;
            }
            if (num[1][3] == 0) {
                tfield13.setText("0");
                a[1][3] = 0;
                tfield13.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield13.setText(Integer.toString(num[1][3]));
                a[1][3] = num[1][3];
                tfield13.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield14Action(MouseEvent event) throws Exception {
        if (tfield14.isDisable() == false) {
            num[1][4]++;
            if (num[1][4] > 9) {
                num[1][4] = 0;
            }
            if (num[1][4] == 0) {
                tfield14.setText("0");
                a[1][4] = 0;
                tfield14.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield14.setText(Integer.toString(num[1][4]));
                a[1][4] = num[1][4];
                tfield14.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield15Action(MouseEvent event) throws Exception {
        if (tfield15.isDisable() == false) {
            num[1][5]++;
            if (num[1][5] > 9) {
                num[1][5] = 0;
            }
            if (num[1][5] == 0) {
                tfield15.setText("0");
                a[1][5] = 0;
                tfield15.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield15.setText(Integer.toString(num[1][5]));
                a[1][5] = num[1][5];
                tfield15.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield16Action(MouseEvent event) throws Exception {
        if (tfield16.isDisable() == false) {
            num[1][6]++;
            if (num[1][6] > 9) {
                num[1][6] = 0;
            }
            if (num[1][6] == 0) {
                tfield16.setText("0");
                a[1][6] = 0;
                tfield16.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield16.setText(Integer.toString(num[1][6]));
                a[1][6] = num[1][6];
                tfield16.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield17Action(MouseEvent event) throws Exception {
        if (tfield17.isDisable() == false) {
            num[1][7]++;
            if (num[1][7] > 9) {
                num[1][7] = 0;
            }
            if (num[1][7] == 0) {
                tfield17.setText("0");
                a[1][7] = 0;
                tfield17.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield17.setText(Integer.toString(num[1][7]));
                a[1][7] = num[1][7];
                tfield17.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield18Action(MouseEvent event) throws Exception {
        if (tfield18.isDisable() == false) {
            num[1][8]++;
            if (num[1][8] > 9) {
                num[1][8] = 0;
            }
            if (num[1][8] == 0) {
                tfield18.setText("0");
                a[1][8] = 0;
                tfield18.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield18.setText(Integer.toString(num[1][8]));
                a[1][8] = num[1][8];
                tfield18.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield20Action(MouseEvent event) throws Exception {
        if (tfield20.isDisable() == false) {
            num[2][0]++;
            if (num[2][0] > 9) {
                num[2][0] = 0;
            }
            if (num[2][0] == 0) {
                tfield20.setText("0");
                a[2][0] = 0;
                tfield20.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield20.setText(Integer.toString(num[2][0]));
                a[2][0] = num[2][0];
                tfield20.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield21Action(MouseEvent event) throws Exception {
        if (tfield21.isDisable() == false) {
            num[2][1]++;
            if (num[2][1] > 9) {
                num[2][1] = 0;
            }
            if (num[2][1] == 0) {
                tfield21.setText("0");
                a[2][1] = 0;
                tfield21.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield21.setText(Integer.toString(num[2][1]));
                a[2][1] = num[2][1];
                tfield21.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield22Action(MouseEvent event) throws Exception {
        if (tfield22.isDisable() == false) {
            num[2][2]++;
            if (num[2][2] > 9) {
                num[2][2] = 0;
            }
            if (num[2][2] == 0) {
                tfield22.setText("0");
                a[2][2] = 0;
                tfield22.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield22.setText(Integer.toString(num[2][2]));
                a[2][2] = num[2][2];
                tfield22.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield23Action(MouseEvent event) throws Exception {
        if (tfield23.isDisable() == false) {
            num[2][3]++;
            if (num[2][3] > 9) {
                num[2][3] = 0;
            }
            if (num[2][3] == 0) {
                tfield23.setText("0");
                a[2][3] = 0;
                tfield23.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield23.setText(Integer.toString(num[2][3]));
                a[2][3] = num[2][3];
                tfield23.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield24Action(MouseEvent event) throws Exception {
        if (tfield24.isDisable() == false) {
            num[2][4]++;
            if (num[2][4] > 9) {
                num[2][4] = 0;
            }
            if (num[2][4] == 0) {
                tfield24.setText("0");
                a[2][4] = 0;
                tfield24.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield24.setText(Integer.toString(num[2][4]));
                a[2][4] = num[2][4];
                tfield24.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield25Action(MouseEvent event) throws Exception {
        if (tfield25.isDisable() == false) {
            num[2][5]++;
            if (num[2][5] > 9) {
                num[2][5] = 0;
            }
            if (num[2][5] == 0) {
                tfield25.setText("0");
                a[2][5] = 0;
                tfield25.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield25.setText(Integer.toString(num[2][5]));
                a[2][5] = num[2][5];
                tfield25.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield26Action(MouseEvent event) throws Exception {
        if (tfield26.isDisable() == false) {
            num[2][6]++;
            if (num[2][6] > 9) {
                num[2][6] = 0;
            }
            if (num[2][6] == 0) {
                tfield26.setText("0");
                a[2][6] = 0;
                tfield26.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield26.setText(Integer.toString(num[2][6]));
                a[2][6] = num[2][6];
                tfield26.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield27Action(MouseEvent event) throws Exception {
        if (tfield27.isDisable() == false) {
            num[2][7]++;
            if (num[2][7] > 9) {
                num[2][7] = 0;
            }
            if (num[2][7] == 0) {
                tfield27.setText("0");
                a[2][7] = 0;
                tfield27.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield27.setText(Integer.toString(num[2][7]));
                a[2][7] = num[2][7];
                tfield27.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield28Action(MouseEvent event) throws Exception {
        if (tfield28.isDisable() == false) {
            num[2][8]++;
            if (num[2][8] > 9) {
                num[2][8] = 0;
            }
            if (num[2][8] == 0) {
                tfield28.setText("0");
                a[2][8] = 0;
                tfield28.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield28.setText(Integer.toString(num[2][8]));
                a[2][8] = num[2][8];
                tfield28.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield30Action(MouseEvent event) throws Exception {
        if (tfield30.isDisable() == false) {
            num[3][0]++;
            if (num[3][0] > 9) {
                num[3][0] = 0;
            }
            if (num[3][0] == 0) {
                tfield30.setText("0");
                a[3][0] = 0;
                tfield30.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield30.setText(Integer.toString(num[3][0]));
                a[3][0] = num[3][0];
                tfield30.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield31Action(MouseEvent event) throws Exception {
        if (tfield31.isDisable() == false) {
            num[3][1]++;
            if (num[3][1] > 9) {
                num[3][1] = 0;
            }
            if (num[3][1] == 0) {
                tfield31.setText("0");
                a[3][1] = 0;
                tfield31.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield31.setText(Integer.toString(num[3][1]));
                a[3][1] = num[3][1];
                tfield31.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield32Action(MouseEvent event) throws Exception {
        if (tfield32.isDisable() == false) {
            num[3][2]++;
            if (num[3][2] > 9) {
                num[3][2] = 0;
            }
            if (num[3][2] == 0) {
                tfield32.setText("0");
                a[3][2] = 0;
                tfield32.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield32.setText(Integer.toString(num[3][2]));
                a[3][2] = num[3][2];
                tfield32.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield33Action(MouseEvent event) throws Exception {
        if (tfield33.isDisable() == false) {
            num[3][3]++;
            if (num[3][3] > 9) {
                num[3][3] = 0;
            }
            if (num[3][3] == 0) {
                tfield33.setText("0");
                a[3][3] = 0;
                tfield33.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield33.setText(Integer.toString(num[3][3]));
                a[3][3] = num[3][3];
                tfield33.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield34Action(MouseEvent event) throws Exception {
        if (tfield34.isDisable() == false) {
            num[3][4]++;
            if (num[3][4] > 9) {
                num[3][4] = 0;
            }
            if (num[3][4] == 0) {
                tfield34.setText("0");
                a[3][4] = 0;
                tfield34.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield34.setText(Integer.toString(num[3][4]));
                a[3][4] = num[3][4];
                tfield34.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield35Action(MouseEvent event) throws Exception {
        if (tfield35.isDisable() == false) {
            num[3][5]++;
            if (num[3][5] > 9) {
                num[3][5] = 0;
            }
            if (num[3][5] == 0) {
                tfield35.setText("0");
                a[3][5] = 0;
                tfield35.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield35.setText(Integer.toString(num[3][5]));
                a[3][5] = num[3][5];
                tfield35.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield36Action(MouseEvent event) throws Exception {
        if (tfield36.isDisable() == false) {
            num[3][6]++;
            if (num[3][6] > 9) {
                num[3][6] = 0;
            }
            if (num[3][6] == 0) {
                tfield36.setText("0");
                a[3][6] = 0;
                tfield36.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield36.setText(Integer.toString(num[3][6]));
                a[3][6] = num[3][6];
                tfield36.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield37Action(MouseEvent event) throws Exception {
        if (tfield37.isDisable() == false) {
            num[3][7]++;
            if (num[3][7] > 9) {
                num[3][7] = 0;
            }
            if (num[3][7] == 0) {
                tfield37.setText("0");
                a[3][7] = 0;
                tfield37.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield37.setText(Integer.toString(num[3][7]));
                a[3][7] = num[3][7];
                tfield37.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield38Action(MouseEvent event) throws Exception {
        if (tfield38.isDisable() == false) {
            num[3][8]++;
            if (num[3][8] > 9) {
                num[3][8] = 0;
            }
            if (num[3][8] == 0) {
                tfield38.setText("0");
                a[3][8] = 0;
                tfield38.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield38.setText(Integer.toString(num[3][8]));
                a[3][8] = num[3][8];
                tfield38.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield40Action(MouseEvent event) throws Exception {
        if (tfield40.isDisable() == false) {
            num[4][0]++;
            if (num[4][0] > 9) {
                num[4][0] = 0;
            }
            if (num[4][0] == 0) {
                tfield40.setText("0");
                a[4][0] = 0;
                tfield40.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield40.setText(Integer.toString(num[4][0]));
                a[4][0] = num[4][0];
                tfield40.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield41Action(MouseEvent event) throws Exception {
        if (tfield41.isDisable() == false) {
            num[4][1]++;
            if (num[4][1] > 9) {
                num[4][1] = 0;
            }
            if (num[4][1] == 0) {
                tfield41.setText("0");
                a[4][1] = 0;
                tfield41.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield41.setText(Integer.toString(num[4][1]));
                a[4][1] = num[4][1];
                tfield41.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield42Action(MouseEvent event) throws Exception {
        if (tfield42.isDisable() == false) {
            num[4][2]++;
            if (num[4][2] > 9) {
                num[4][2] = 0;
            }
            if (num[4][2] == 0) {
                tfield42.setText("0");
                a[4][2] = 0;
                tfield42.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield42.setText(Integer.toString(num[4][2]));
                a[4][2] = num[4][2];
                tfield42.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield43Action(MouseEvent event) throws Exception {
        if (tfield43.isDisable() == false) {
            num[4][3]++;
            if (num[4][3] > 9) {
                num[4][3] = 0;
            }
            if (num[4][3] == 0) {
                tfield43.setText("0");
                a[4][3] = 0;
                tfield43.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield43.setText(Integer.toString(num[4][3]));
                a[4][3] = num[4][3];
                tfield43.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield44Action(MouseEvent event) throws Exception {
        if (tfield44.isDisable() == false) {
            num[4][4]++;
            if (num[4][4] > 9) {
                num[4][4] = 0;
            }
            if (num[4][4] == 0) {
                tfield44.setText("0");
                a[4][4] = 0;
                tfield44.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield44.setText(Integer.toString(num[4][4]));
                a[4][4] = num[4][4];
                tfield44.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield45Action(MouseEvent event) throws Exception {
        if (tfield45.isDisable() == false) {
            num[4][5]++;
            if (num[4][5] > 9) {
                num[4][5] = 0;
            }
            if (num[4][5] == 0) {
                tfield45.setText("0");
                a[4][5] = 0;
                tfield45.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield45.setText(Integer.toString(num[4][5]));
                a[4][5] = num[4][5];
                tfield45.setStyle("-fx-text-inner-color: red ;");
            }
        }
    }

    @FXML
    private void tfield46Action(MouseEvent event) throws Exception {
        if (tfield46.isDisable() == false) {
            num[4][6]++;
            if (num[4][6] > 9) {
                num[4][6] = 0;
            }
            if (num[4][6] == 0) {
                tfield46.setText("0");
                a[4][6] = 0;
                tfield46.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield46.setText(Integer.toString(num[4][6]));
                a[4][6] = num[4][6];
                tfield46.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield47Action(MouseEvent event) throws Exception {
        if (tfield47.isDisable() == false) {
            num[4][7]++;
            if (num[4][7] > 9) {
                num[4][7] = 0;
            }
            if (num[4][7] == 0) {
                tfield47.setText("0");
                a[4][7] = 0;
                tfield47.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield47.setText(Integer.toString(num[4][7]));
                a[4][7] = num[4][7];
                tfield47.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield48Action(MouseEvent event) throws Exception {
        if (tfield48.isDisable() == false) {
            num[4][8]++;
            if (num[4][8] > 9) {
                num[4][8] = 0;
            }
            if (num[4][8] == 0) {
                tfield48.setText("0");
                a[4][8] = 0;
                tfield48.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield48.setText(Integer.toString(num[4][8]));
                a[4][8] = num[4][8];
                tfield48.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield50Action(MouseEvent event) throws Exception {
        if (tfield50.isDisable() == false) {
            num[5][0]++;
            if (num[5][0] > 9) {
                num[5][0] = 0;
            }
            if (num[5][0] == 0) {
                tfield50.setText("0");
                a[5][0] = 0;
                tfield50.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield50.setText(Integer.toString(num[5][0]));
                a[5][0] = num[5][0];
                tfield50.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield51Action(MouseEvent event) throws Exception {
        if (tfield51.isDisable() == false) {
            num[5][1]++;
            if (num[5][1] > 9) {
                num[5][1] = 0;
            }
            if (num[5][1] == 0) {
                tfield51.setText("0");
                a[5][1] = 0;
                tfield51.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield51.setText(Integer.toString(num[5][1]));
                a[5][1] = num[5][1];
                tfield51.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield52Action(MouseEvent event) throws Exception {
        if (tfield52.isDisable() == false) {
            num[5][2]++;
            if (num[5][2] > 9) {
                num[5][2] = 0;
            }
            if (num[5][2] == 0) {
                tfield52.setText("0");
                a[5][2] = 0;
                tfield52.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield52.setText(Integer.toString(num[5][2]));
                a[5][2] = num[5][2];
                tfield52.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield53Action(MouseEvent event) throws Exception {
        if (tfield53.isDisable() == false) {
            num[5][3]++;
            if (num[5][3] > 9) {
                num[5][3] = 0;
            }
            if (num[5][3] == 0) {
                tfield53.setText("0");
                a[5][3] = 0;
                tfield53.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield53.setText(Integer.toString(num[5][3]));
                a[5][3] = num[5][3];
                tfield53.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield54Action(MouseEvent event) throws Exception {
        if (tfield54.isDisable() == false) {
            num[5][4]++;
            if (num[5][4] > 9) {
                num[5][4] = 0;
            }
            if (num[5][4] == 0) {
                tfield54.setText("0");
                a[5][4] = 0;
                tfield54.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield54.setText(Integer.toString(num[5][4]));
                a[5][4] = num[5][4];
                tfield54.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield55Action(MouseEvent event) throws Exception {
        if (tfield55.isDisable() == false) {
            num[5][5]++;
            if (num[5][5] > 9) {
                num[5][5] = 0;
            }
            if (num[5][5] == 0) {
                tfield55.setText("0");
                a[5][5] = 0;
                tfield55.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield55.setText(Integer.toString(num[5][5]));
                a[5][5] = num[5][5];
                tfield55.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield56Action(MouseEvent event) throws Exception {
        if (tfield56.isDisable() == false) {
            num[5][6]++;
            if (num[5][6] > 9) {
                num[5][6] = 0;
            }
            if (num[5][6] == 0) {
                tfield56.setText("0");
                a[5][6] = 0;
                tfield56.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield56.setText(Integer.toString(num[5][6]));
                a[5][6] = num[5][6];
                tfield56.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield57Action(MouseEvent event) throws Exception {
        if (tfield57.isDisable() == false) {
            num[5][7]++;
            if (num[5][7] > 9) {
                num[5][7] = 0;
            }
            if (num[5][7] == 0) {
                tfield57.setText("0");
                a[5][7] = 0;
                tfield57.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield57.setText(Integer.toString(num[5][7]));
                a[5][7] = num[5][7];
                tfield57.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield58Action(MouseEvent event) throws Exception {
        if (tfield58.isDisable() == false) {
            num[5][8]++;
            if (num[5][8] > 9) {
                num[5][8] = 0;
            }
            if (num[5][8] == 0) {
                tfield58.setText("0");
                a[5][8] = 0;
                tfield58.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield58.setText(Integer.toString(num[5][8]));
                a[5][8] = num[5][8];
                tfield58.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield60Action(MouseEvent event) throws Exception {
        if (tfield60.isDisable() == false) {
            num[6][0]++;
            if (num[6][0] > 9) {
                num[6][0] = 0;
            }
            if (num[6][0] == 0) {
                tfield60.setText("0");
                a[6][0] = 0;
                tfield60.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield60.setText(Integer.toString(num[6][0]));
                a[6][0] = num[6][0];
                tfield60.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield61Action(MouseEvent event) throws Exception {
        if (tfield61.isDisable() == false) {
            num[6][1]++;
            if (num[6][1] > 9) {
                num[6][1] = 0;
            }
            if (num[6][1] == 0) {
                tfield61.setText("0");
                a[6][1] = 0;
                tfield61.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield61.setText(Integer.toString(num[6][1]));
                a[6][1] = num[6][1];
                tfield61.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield62Action(MouseEvent event) throws Exception {
        if (tfield62.isDisable() == false) {
            num[6][2]++;
            if (num[6][2] > 9) {
                num[6][2] = 0;
            }
            if (num[6][2] == 0) {
                tfield62.setText("0");
                a[6][2] = 0;
                tfield62.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield62.setText(Integer.toString(num[6][2]));
                a[6][2] = num[6][2];
                tfield62.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield63Action(MouseEvent event) throws Exception {
        if (tfield63.isDisable() == false) {
            num[6][3]++;
            if (num[6][3] > 9) {
                num[6][3] = 0;
            }
            if (num[6][3] == 0) {
                tfield63.setText("0");
                a[6][3] = 0;
                tfield63.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield63.setText(Integer.toString(num[6][3]));
                a[6][3] = num[6][3];
                tfield63.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield64Action(MouseEvent event) throws Exception {
        if (tfield64.isDisable() == false) {
            num[6][4]++;
            if (num[6][4] > 9) {
                num[6][4] = 0;
            }
            if (num[6][4] == 0) {
                tfield64.setText("0");
                a[6][4] = 0;
                tfield64.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield64.setText(Integer.toString(num[6][4]));
                a[6][4] = num[6][4];
                tfield64.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield65Action(MouseEvent event) throws Exception {
        if (tfield65.isDisable() == false) {
            num[6][5]++;
            if (num[6][5] > 9) {
                num[6][5] = 0;
            }
            if (num[6][5] == 0) {
                tfield65.setText("0");
                a[6][5] = 0;
                tfield65.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield65.setText(Integer.toString(num[6][5]));
                a[6][5] = num[6][5];
                tfield65.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield66Action(MouseEvent event) throws Exception {
        if (tfield66.isDisable() == false) {
            num[6][6]++;
            if (num[6][6] > 9) {
                num[6][6] = 0;
            }
            if (num[6][6] == 0) {
                tfield66.setText("0");
                a[6][6] = 0;
                tfield66.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield66.setText(Integer.toString(num[6][6]));
                a[6][6] = num[6][6];
                tfield66.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield67Action(MouseEvent event) throws Exception {
        if (tfield67.isDisable() == false) {
            num[6][7]++;
            if (num[6][7] > 9) {
                num[6][7] = 0;
            }
            if (num[6][7] == 0) {
                tfield67.setText("0");
                a[6][7] = 0;
                tfield67.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield67.setText(Integer.toString(num[6][7]));
                a[6][7] = num[6][7];
                tfield67.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield68Action(MouseEvent event) throws Exception {
        if (tfield68.isDisable() == false) {
            num[6][8]++;
            if (num[6][8] > 9) {
                num[6][8] = 0;
            }
            if (num[6][8] == 0) {
                tfield68.setText("0");
                a[6][8] = 0;
                tfield68.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield68.setText(Integer.toString(num[6][8]));
                a[6][8] = num[6][8];
                tfield68.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield70Action(MouseEvent event) throws Exception {
        if (tfield70.isDisable() == false) {
            num[7][0]++;
            if (num[7][0] > 9) {
                num[7][0] = 0;
            }
            if (num[7][0] == 0) {
                tfield70.setText("0");
                a[7][0] = 0;
                tfield70.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield70.setText(Integer.toString(num[7][0]));
                a[7][0] = num[7][0];
                tfield70.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield71Action(MouseEvent event) throws Exception {
        if (tfield71.isDisable() == false) {
            num[7][1]++;
            if (num[7][1] > 9) {
                num[7][1] = 0;
            }
            if (num[7][1] == 0) {
                tfield71.setText("0");
                a[7][1] = 0;
                tfield71.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield71.setText(Integer.toString(num[7][1]));
                a[7][1] = num[7][1];
                tfield71.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield72Action(MouseEvent event) throws Exception {
        if (tfield72.isDisable() == false) {
            num[7][2]++;
            if (num[7][2] > 9) {
                num[7][2] = 0;
            }
            if (num[7][2] == 0) {
                tfield72.setText("0");
                a[7][2] = 0;
                tfield72.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield72.setText(Integer.toString(num[7][2]));
                a[7][2] = num[7][2];
                tfield72.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield73Action(MouseEvent event) throws Exception {
        if (tfield73.isDisable() == false) {
            num[7][3]++;
            if (num[7][3] > 9) {
                num[7][3] = 0;
            }
            if (num[7][3] == 0) {
                tfield73.setText("0");
                a[7][3] = 0;
                tfield73.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield73.setText(Integer.toString(num[7][3]));
                a[7][3] = num[7][3];
                tfield73.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield74Action(MouseEvent event) throws Exception {
        if (tfield74.isDisable() == false) {
            num[7][4]++;
            if (num[7][4] > 9) {
                num[7][4] = 0;
            }
            if (num[7][4] == 0) {
                tfield74.setText("0");
                a[7][4] = 0;
                tfield74.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield74.setText(Integer.toString(num[7][4]));
                a[7][4] = num[7][4];
                tfield74.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield75Action(MouseEvent event) throws Exception {
        if (tfield75.isDisable() == false) {
            num[7][5]++;
            if (num[7][5] > 9) {
                num[7][5] = 0;
            }
            if (num[7][5] == 0) {
                tfield75.setText("0");
                a[7][5] = 0;
                tfield75.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield75.setText(Integer.toString(num[7][5]));
                a[7][5] = num[7][5];
                tfield75.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield76Action(MouseEvent event) throws Exception {
        if (tfield76.isDisable() == false) {
            num[7][6]++;
            if (num[7][6] > 9) {
                num[7][6] = 0;
            }
            if (num[7][6] == 0) {
                tfield76.setText("0");
                a[7][6] = 0;
                tfield76.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield76.setText(Integer.toString(num[7][6]));
                a[7][6] = num[7][6];
                tfield76.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield77Action(MouseEvent event) throws Exception {
        if (tfield77.isDisable() == false) {
            num[7][7]++;
            if (num[7][7] > 9) {
                num[7][7] = 0;
            }
            if (num[7][7] == 0) {
                tfield77.setText("0");
                a[7][7] = 0;
                tfield77.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield77.setText(Integer.toString(num[7][7]));
                a[7][7] = num[7][7];
                tfield77.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield78Action(MouseEvent event) throws Exception {
        if (tfield78.isDisable() == false) {
            num[7][8]++;
            if (num[7][8] > 9) {
                num[7][8] = 0;
            }
            if (num[7][8] == 0) {
                tfield78.setText("0");
                a[7][8] = 0;
                tfield78.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield78.setText(Integer.toString(num[7][8]));
                a[7][8] = num[7][8];
                tfield78.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield80Action(MouseEvent event) throws Exception {
        if (tfield80.isDisable() == false) {
            num[8][0]++;
            if (num[8][0] > 9) {
                num[8][0] = 0;
            }
            if (num[8][0] == 0) {
                tfield80.setText("0");
                a[8][0] = 0;
                tfield80.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield80.setText(Integer.toString(num[8][0]));
                a[8][0] = num[8][0];
                tfield80.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield81Action(MouseEvent event) throws Exception {
        if (tfield81.isDisable() == false) {
            num[8][1]++;
            if (num[8][1] > 9) {
                num[8][1] = 0;
            }
            if (num[8][1] == 0) {
                tfield81.setText("0");
                a[8][1] = 0;
                tfield81.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield81.setText(Integer.toString(num[8][1]));
                a[8][1] = num[8][1];
                tfield81.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield82Action(MouseEvent event) throws Exception {
        if (tfield82.isDisable() == false) {
            num[8][2]++;
            if (num[8][2] > 9) {
                num[8][2] = 0;
            }
            if (num[8][2] == 0) {
                tfield82.setText("0");
                a[8][2] = 0;
                tfield82.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield82.setText(Integer.toString(num[8][2]));
                a[8][2] = num[8][2];
                tfield82.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield83Action(MouseEvent event) throws Exception {
        if (tfield83.isDisable() == false) {
            num[8][3]++;
            if (num[8][3] > 9) {
                num[8][3] = 0;
            }
            if (num[8][3] == 0) {
                tfield83.setText("0");
                a[8][3] = 0;
                tfield83.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield83.setText(Integer.toString(num[8][3]));
                a[8][3] = num[8][3];
                tfield83.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield84Action(MouseEvent event) throws Exception {
        if (tfield84.isDisable() == false) {
            num[8][4]++;
            if (num[8][4] > 9) {
                num[8][4] = 0;
            }
            if (num[8][4] == 0) {
                tfield84.setText("0");
                a[8][4] = 0;
                tfield84.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield84.setText(Integer.toString(num[8][4]));
                a[8][4] = num[8][4];
                tfield84.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield85Action(MouseEvent event) throws Exception {
        if (tfield85.isDisable() == false) {
            num[8][5]++;
            if (num[8][5] > 9) {
                num[8][5] = 0;
            }
            if (num[8][5] == 0) {
                tfield85.setText("0");
                a[8][5] = 0;
                tfield85.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield85.setText(Integer.toString(num[8][5]));
                a[8][5] = num[8][5];
                tfield85.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield86Action(MouseEvent event) throws Exception {
        if (tfield86.isDisable() == false) {
            num[8][6]++;
            if (num[8][6] > 9) {
                num[8][6] = 0;
            }
            if (num[8][6] == 0) {
                tfield86.setText("0");
                a[8][6] = 0;
                tfield86.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield86.setText(Integer.toString(num[8][6]));
                a[8][6] = num[8][6];
                tfield86.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield87Action(MouseEvent event) throws Exception {
        if (tfield87.isDisable() == false) {
            num[8][7]++;
            if (num[8][7] > 9) {
                num[8][7] = 0;
            }
            if (num[8][7] == 0) {
                tfield87.setText("0");
                a[8][7] = 0;
                tfield87.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield87.setText(Integer.toString(num[8][7]));
                a[8][7] = num[8][7];
                tfield87.setStyle("-fx-text-inner-color: red ;");
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
    private void tfield88Action(MouseEvent event) throws Exception {
        if (tfield88.isDisable() == false) {
            num[8][8]++;
            if (num[8][8] > 9) {
                num[8][8] = 0;
            }
            if (num[8][8] == 0) {
                tfield88.setText("0");
                a[8][8] = 0;
                tfield88.setStyle("-fx-text-inner-color: black ;");
            } else {
                tfield88.setText(Integer.toString(num[8][8]));
                a[8][8] = num[8][8];
                tfield88.setStyle("-fx-text-inner-color: red ;");
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
        tfield00.setText("" + a[0][0]);
        tfield00.setEditable(false);
        if (a[0][0] == result[0][0]) {
            tfield00.setDisable(true);
            tfield00.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield01.setText("" + a[0][1]);
        tfield01.setEditable(false);
        if (a[0][1] == result[0][1]) {
            tfield01.setDisable(true);
            tfield01.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield02.setText("" + a[0][2]);
        tfield02.setEditable(false);
        if (a[0][2] == result[0][2]) {
            tfield02.setDisable(true);
            tfield02.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield03.setText("" + a[0][3]);
        tfield03.setEditable(false);
        if (a[0][3] == result[0][3]) {
            tfield03.setDisable(true);
            tfield03.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield04.setText("" + a[0][4]);
        tfield04.setEditable(false);
        if (a[0][4] == result[0][4]) {
            tfield04.setDisable(true);
            tfield04.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield05.setText("" + a[0][5]);
        tfield05.setEditable(false);
        if (a[0][5] == result[0][5]) {
            tfield05.setDisable(true);
            tfield05.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield06.setText("" + a[0][6]);
        tfield06.setEditable(false);
        if (a[0][6] == result[0][6]) {
            tfield06.setDisable(true);
            tfield06.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield07.setText("" + a[0][7]);
        tfield07.setEditable(false);
        if (a[0][7] == result[0][7]) {
            tfield07.setDisable(true);
            tfield07.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield08.setText("" + a[0][8]);
        tfield08.setEditable(false);
        if (a[0][8] == result[0][8]) {
            tfield08.setDisable(true);
            tfield08.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield10.setText("" + a[1][0]);
        tfield10.setEditable(false);
        if (a[1][0] == result[1][0]) {
            tfield10.setDisable(true);
            tfield10.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield11.setText("" + a[1][1]);
        tfield11.setEditable(false);
        if (a[1][1] == result[1][1]) {
            tfield11.setDisable(true);
            tfield11.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield12.setText("" + a[1][2]);
        tfield12.setEditable(false);
        if (a[1][2] == result[1][2]) {
            tfield12.setDisable(true);
            tfield12.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield13.setText("" + a[1][3]);
        tfield13.setEditable(false);
        if (a[1][3] == result[1][3]) {
            tfield13.setDisable(true);
            tfield13.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield14.setText("" + a[1][4]);
        tfield14.setEditable(false);
        if (a[1][4] == result[1][4]) {
            tfield14.setDisable(true);
            tfield14.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield15.setText("" + a[1][5]);
        tfield15.setEditable(false);
        if (a[1][5] == result[1][5]) {
            tfield15.setDisable(true);
            tfield15.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield16.setText("" + a[1][6]);
        tfield16.setEditable(false);
        if (a[1][6] == result[1][6]) {
            tfield16.setDisable(true);
            tfield16.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield17.setText("" + a[1][7]);
        tfield17.setEditable(false);
        if (a[1][7] == result[1][7]) {
            tfield17.setDisable(true);
            tfield17.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield18.setText("" + a[1][8]);
        tfield18.setEditable(false);
        if (a[1][8] == result[1][8]) {
            tfield18.setDisable(true);
            tfield18.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield20.setText("" + a[2][0]);
        tfield20.setEditable(false);
        if (a[2][0] == result[2][0]) {
            tfield20.setDisable(true);
            tfield20.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield21.setText("" + a[2][1]);
        tfield21.setEditable(false);
        if (a[2][1] == result[2][1]) {
            tfield21.setDisable(true);
            tfield21.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield22.setText("" + a[2][2]);
        tfield22.setEditable(false);
        if (a[2][2] == result[2][2]) {
            tfield22.setDisable(true);
            tfield22.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield23.setText("" + a[2][3]);
        tfield23.setEditable(false);
        if (a[2][3] == result[2][3]) {
            tfield23.setDisable(true);
            tfield23.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield24.setText("" + a[2][4]);
        tfield24.setEditable(false);
        if (a[2][4] == result[2][4]) {
            tfield24.setDisable(true);
            tfield24.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield25.setText("" + a[2][5]);
        tfield25.setEditable(false);
        if (a[2][5] == result[2][5]) {
            tfield25.setDisable(true);
            tfield25.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield26.setText("" + a[2][6]);
        tfield26.setEditable(false);
        if (a[2][6] == result[2][6]) {
            tfield26.setDisable(true);
            tfield26.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield27.setText("" + a[2][7]);
        tfield27.setEditable(false);
        if (a[2][7] == result[2][7]) {
            tfield27.setDisable(true);
            tfield27.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield28.setText("" + a[2][8]);
        tfield28.setEditable(false);
        if (a[2][8] == result[2][8]) {
            tfield28.setDisable(true);
            tfield28.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield30.setText("" + a[3][0]);
        tfield30.setEditable(false);
        if (a[3][0] == result[3][0]) {
            tfield30.setDisable(true);
            tfield30.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield31.setText("" + a[3][1]);
        tfield31.setEditable(false);
        if (a[3][1] == result[3][1]) {
            tfield31.setDisable(true);
            tfield31.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield32.setText("" + a[3][2]);
        tfield32.setEditable(false);
        if (a[3][2] == result[3][2]) {
            tfield32.setDisable(true);
            tfield32.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield33.setText("" + a[3][3]);
        tfield33.setEditable(false);
        if (a[3][3] == result[3][3]) {
            tfield33.setDisable(true);
            tfield33.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield34.setText("" + a[3][4]);
        tfield34.setEditable(false);
        if (a[3][4] == result[3][4]) {
            tfield34.setDisable(true);
            tfield34.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield35.setText("" + a[3][5]);
        tfield35.setEditable(false);
        if (a[3][5] == result[3][5]) {
            tfield35.setDisable(true);
            tfield35.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield36.setText("" + a[3][6]);
        tfield36.setEditable(false);
        if (a[3][6] == result[3][6]) {
            tfield36.setDisable(true);
            tfield36.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield37.setText("" + a[3][7]);
        tfield37.setEditable(false);
        if (a[3][7] == result[3][7]) {
            tfield37.setDisable(true);
            tfield37.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield38.setText("" + a[3][8]);
        tfield38.setEditable(false);
        if (a[3][8] == result[3][8]) {
            tfield38.setDisable(true);
            tfield38.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield40.setText("" + a[4][0]);
        tfield40.setEditable(false);
        if (a[4][0] == result[4][0]) {
            tfield40.setDisable(true);
            tfield40.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield41.setText("" + a[4][1]);
        tfield41.setEditable(false);
        if (a[4][1] == result[4][1]) {
            tfield41.setDisable(true);
            tfield41.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield42.setText("" + a[4][2]);
        tfield42.setEditable(false);
        if (a[4][2] == result[4][2]) {
            tfield42.setDisable(true);
            tfield42.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield43.setText("" + a[4][3]);
        tfield43.setEditable(false);
        if (a[4][3] == result[4][3]) {
            tfield43.setDisable(true);
            tfield43.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield44.setText("" + a[4][4]);
        tfield44.setEditable(false);
        if (a[4][4] == result[4][4]) {
            tfield44.setDisable(true);
            tfield44.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield45.setText("" + a[4][5]);
        tfield45.setEditable(false);
        if (a[4][5] == result[4][5]) {
            tfield45.setDisable(true);
            tfield45.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield46.setText("" + a[4][6]);
        tfield46.setEditable(false);
        if (a[4][6] == result[4][6]) {
            tfield46.setDisable(true);
            tfield46.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield47.setText("" + a[4][7]);
        tfield47.setEditable(false);
        if (a[4][7] == result[4][7]) {
            tfield47.setDisable(true);
            tfield47.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield48.setText("" + a[4][8]);
        tfield48.setEditable(false);
        if (a[4][8] == result[4][8]) {
            tfield48.setDisable(true);
            tfield48.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield50.setText("" + a[5][0]);
        tfield50.setEditable(false);
        if (a[5][0] == result[5][0]) {
            tfield50.setDisable(true);
            tfield50.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield51.setText("" + a[5][1]);
        tfield51.setEditable(false);
        if (a[5][1] == result[5][1]) {
            tfield51.setDisable(true);
            tfield51.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield52.setText("" + a[5][2]);
        tfield52.setEditable(false);
        if (a[5][2] == result[5][2]) {
            tfield52.setDisable(true);
            tfield52.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield53.setText("" + a[5][3]);
        tfield53.setEditable(false);
        if (a[5][3] == result[5][3]) {
            tfield53.setDisable(true);
            tfield53.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield54.setText("" + a[5][4]);
        tfield54.setEditable(false);
        if (a[5][4] == result[5][4]) {
            tfield54.setDisable(true);
            tfield54.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield55.setText("" + a[5][5]);
        tfield55.setEditable(false);
        if (a[5][5] == result[5][5]) {
            tfield55.setDisable(true);
            tfield55.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield56.setText("" + a[5][6]);
        tfield56.setEditable(false);
        if (a[5][6] == result[5][6]) {
            tfield56.setDisable(true);
            tfield56.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield57.setText("" + a[5][7]);
        tfield57.setEditable(false);
        if (a[5][7] == result[5][7]) {
            tfield57.setDisable(true);
            tfield57.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield58.setText("" + a[5][8]);
        tfield58.setEditable(false);
        if (a[5][8] == result[5][8]) {
            tfield58.setDisable(true);
            tfield58.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield60.setText("" + a[6][0]);
        tfield60.setEditable(false);
        if (a[6][0] == result[6][0]) {
            tfield60.setDisable(true);
            tfield60.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield61.setText("" + a[6][1]);
        tfield61.setEditable(false);
        if (a[6][1] == result[6][1]) {
            tfield61.setDisable(true);
            tfield61.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield62.setText("" + a[6][2]);
        tfield62.setEditable(false);
        if (a[6][2] == result[6][2]) {
            tfield62.setDisable(true);
            tfield62.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield63.setText("" + a[6][3]);
        tfield63.setEditable(false);
        if (a[6][3] == result[6][3]) {
            tfield63.setDisable(true);
            tfield63.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield64.setText("" + a[6][4]);
        tfield64.setEditable(false);
        if (a[6][4] == result[6][4]) {
            tfield64.setDisable(true);
            tfield64.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield65.setText("" + a[6][5]);
        tfield65.setEditable(false);
        if (a[6][5] == result[6][5]) {
            tfield65.setDisable(true);
            tfield65.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield66.setText("" + a[6][6]);
        tfield66.setEditable(false);
        if (a[6][6] == result[6][6]) {
            tfield66.setDisable(true);
            tfield66.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield67.setText("" + a[6][7]);
        tfield67.setEditable(false);
        if (a[6][7] == result[6][7]) {
            tfield67.setDisable(true);
            tfield67.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield68.setText("" + a[6][8]);
        tfield68.setEditable(false);
        if (a[6][8] == result[6][8]) {
            tfield68.setDisable(true);
            tfield68.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield70.setText("" + a[7][0]);
        tfield70.setEditable(false);
        if (a[7][0] == result[7][0]) {
            tfield70.setDisable(true);
            tfield70.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield71.setText("" + a[7][1]);
        tfield71.setEditable(false);
        if (a[7][1] == result[7][1]) {
            tfield71.setDisable(true);
            tfield71.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield72.setText("" + a[7][2]);
        tfield72.setEditable(false);
        if (a[7][2] == result[7][2]) {
            tfield72.setDisable(true);
            tfield72.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield73.setText("" + a[7][3]);
        tfield73.setEditable(false);
        if (a[7][3] == result[7][3]) {
            tfield73.setDisable(true);
            tfield73.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield74.setText("" + a[7][4]);
        tfield74.setEditable(false);
        if (a[7][4] == result[7][4]) {
            tfield74.setDisable(true);
            tfield74.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield75.setText("" + a[7][5]);
        tfield75.setEditable(false);
        if (a[7][5] == result[7][5]) {
            tfield75.setDisable(true);
            tfield75.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield76.setText("" + a[7][6]);
        tfield76.setEditable(false);
        if (a[7][6] == result[7][6]) {
            tfield76.setDisable(true);
            tfield76.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield77.setText("" + a[7][7]);
        tfield77.setEditable(false);
        if (a[7][7] == result[7][7]) {
            tfield77.setDisable(true);
            tfield77.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield78.setText("" + a[7][8]);
        tfield78.setEditable(false);
        if (a[7][8] == result[7][8]) {
            tfield78.setDisable(true);
            tfield78.setStyle("-fx-text-inner-color: blue ; ");
        }

        tfield80.setText("" + a[8][0]);
        tfield80.setEditable(false);
        if (a[8][0] == result[8][0]) {
            tfield80.setDisable(true);
            tfield80.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield81.setText("" + a[8][1]);
        tfield81.setEditable(false);
        if (a[8][1] == result[8][1]) {
            tfield81.setDisable(true);
            tfield81.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield82.setText("" + a[8][2]);
        tfield82.setEditable(false);
        if (a[8][2] == result[8][2]) {
            tfield82.setDisable(true);
            tfield82.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield83.setText("" + a[8][3]);
        tfield83.setEditable(false);
        if (a[8][3] == result[8][3]) {
            tfield83.setDisable(true);
            tfield83.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield84.setText("" + a[8][4]);
        tfield84.setEditable(false);
        if (a[8][4] == result[8][4]) {
            tfield84.setDisable(true);
            tfield84.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield85.setText("" + a[8][5]);
        tfield85.setEditable(false);
        if (a[8][5] == result[8][5]) {
            tfield85.setDisable(true);
            tfield85.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield86.setText("" + a[8][6]);
        tfield86.setEditable(false);
        if (a[8][6] == result[8][6]) {
            tfield86.setDisable(true);
            tfield86.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield87.setText("" + a[8][7]);
        tfield87.setEditable(false);
        if (a[8][7] == result[8][7]) {
            tfield87.setDisable(true);
            tfield87.setStyle("-fx-text-inner-color: blue ; ");
        }
        tfield88.setText("" + a[8][8]);
        tfield88.setEditable(false);
        if (a[8][8] == result[8][8]) {
            tfield88.setDisable(true);
            tfield88.setStyle("-fx-text-inner-color: blue ; ");
        }

    }

    private void startTime() {
        if (timerStats == false) {
            timerStats = true;
            timer = new Timer();
            TimerTask timerTask = new TimerTask() {

                @Override
                public void run() {

                    //    System.out.println("working" );
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

    /*
             * Initializes the controller class.
             *
             * @param url
             * @param rb
             *
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generate_random_suduko();
        save_result();
        easy_randomly_insert_zero();
        lblname.setText("Player:" + user_name);
        gamePlan();
        startTime();
    }
}
