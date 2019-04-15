/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class MediumController extends FirstStage implements Initializable {

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
    private TextField tf00, tf01, tf02, tf03, tf04, tf05, tf06, tf07, tf08,
            tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18,
            tf20, tf21, tf22, tf23, tf24, tf25, tf26, tf27, tf28,
            tf30, tf31, tf32, tf33, tf34, tf35, tf36, tf37, tf38,
            tf40, tf41, tf42, tf43, tf44, tf45, tf46, tf47, tf48,
            tf50, tf51, tf52, tf53, tf54, tf55, tf56, tf57, tf58,
            tf60, tf61, tf62, tf63, tf64, tf65, tf66, tf67, tf68,
            tf70, tf71, tf72, tf73, tf74, tf75, tf76, tf77, tf78,
            tf80, tf81, tf82, tf83, tf84, tf85, tf86, tf87, tf88;

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
        flag = 2; //set flag for medium level
        root = FXMLLoader.load(getClass().getResource("/com/Solve.fxml"));
        scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
       
        timer.cancel();
    }
    private void Congrats() throws Exception{
        flag = 2; //set flag for medium level
        root = FXMLLoader.load(getClass().getResource("/com/Congrats.fxml"));
        scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
       
    }
    @FXML
    private void btnCheckResultAction(ActionEvent event) throws Exception {
        flag = 2;
        tfPlan();

    }

    private void tfPlan() {
        tf00.setText("" + a[0][0]);
        if (a[0][0] == result[0][0]) {
            //    tf00.setDisable(true);
            tf00.setStyle("-fx-text-inner-color: blue ; ");
        } else {
            tf00.setEditable(false);
            tf00.setStyle("-fx-text-inner-color: red ; ");
        }
        tf01.setText("" + a[0][1]);
        if (a[0][1] == result[0][1]) {
            //    tf01.setDisable(true);
            tf01.setStyle("-fx-text-inner-color: blue ; ");
        } else {
            tf01.setEditable(false);
            tf01.setStyle("-fx-text-inner-color: red ; ");
        }
        tf02.setText("" + a[0][2]);
        if (a[0][2] == result[0][2]) {
            //    tf02.setDisable(true);
            tf02.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf02.setEditable(false);
            tf02.setStyle("-fx-text-inner-color: red ; ");
        }
        tf03.setText("" + a[0][3]);
        if (a[0][3] == result[0][3]) {
            //    tf03.setDisable(true);
            tf03.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf03.setEditable(false);
            tf03.setStyle("-fx-text-inner-color: red ; ");
        }
        tf04.setText("" + a[0][4]);
        if (a[0][4] == result[0][4]) {
            //    tf04.setDisable(true);
            tf04.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf04.setEditable(false);
            tf04.setStyle("-fx-text-inner-color: red ; ");
        }
        tf05.setText("" + a[0][5]);
        if (a[0][5] == result[0][5]) {
            //    tf05.setDisable(true);
            tf05.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf05.setEditable(false);
            tf05.setStyle("-fx-text-inner-color: red ; ");
        }
        tf06.setText("" + a[0][6]);
        if (a[0][6] == result[0][6]) {
            //    tf06.setDisable(true);
            tf06.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf06.setEditable(false);
            tf06.setStyle("-fx-text-inner-color: red ; ");
        }
        tf07.setText("" + a[0][7]);
        if (a[0][7] == result[0][7]) {
            //    tf07.setDisable(true);
            tf07.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf07.setEditable(false);
            tf07.setStyle("-fx-text-inner-color: red ; ");
        }
        tf08.setText("" + a[0][8]);
        if (a[0][8] == result[0][8]) {
            //    tf08.setDisable(true);
            tf08.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf08.setEditable(false);
            tf08.setStyle("-fx-text-inner-color: red ; ");
        }

        tf10.setText("" + a[1][0]);
        if (a[1][0] == result[1][0]) {
            //    tf10.setDisable(true);
            tf10.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf10.setEditable(false);
            tf10.setStyle("-fx-text-inner-color: red ; ");
        }
        tf11.setText("" + a[1][1]);
        if (a[1][1] == result[1][1]) {
            //    tf11.setDisable(true);
            tf11.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf11.setEditable(false);
            tf11.setStyle("-fx-text-inner-color: red ; ");
        }
        tf12.setText("" + a[1][2]);
        if (a[1][2] == result[1][2]) {
            //    tf12.setDisable(true);
            tf12.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf12.setEditable(false);
            tf12.setStyle("-fx-text-inner-color: red ; ");
        }
        tf13.setText("" + a[1][3]);
        if (a[1][3] == result[1][3]) {
            //    tf13.setDisable(true);
            tf13.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf13.setEditable(false);
            tf13.setStyle("-fx-text-inner-color: red ; ");
        }
        tf14.setText("" + a[1][4]);
        if (a[1][4] == result[1][4]) {
            //    tf14.setDisable(true);
            tf14.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf14.setEditable(false);
            tf14.setStyle("-fx-text-inner-color: red ; ");
        }
        tf15.setText("" + a[1][5]);
        if (a[1][5] == result[1][5]) {
            //    tf15.setDisable(true);
            tf15.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf15.setEditable(false);
            tf15.setStyle("-fx-text-inner-color: red ; ");
        }
        tf16.setText("" + a[1][6]);
        if (a[1][6] == result[1][6]) {
            //    tf16.setDisable(true);
            tf16.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf16.setEditable(false);
            tf16.setStyle("-fx-text-inner-color: red ; ");
        }
        tf17.setText("" + a[1][7]);
        if (a[1][7] == result[1][7]) {
            //    tf17.setDisable(true);
            tf17.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf17.setEditable(false);
            tf17.setStyle("-fx-text-inner-color: red ; ");
        }
        tf18.setText("" + a[1][8]);
        if (a[1][8] == result[1][8]) {
            //    tf18.setDisable(true);
            tf18.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf18.setEditable(false);
            tf18.setStyle("-fx-text-inner-color: red ; ");
        }

        tf20.setText("" + a[2][0]);
        if (a[2][0] == result[2][0]) {
            //    tf20.setDisable(true);
            tf20.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf20.setEditable(false);
            tf20.setStyle("-fx-text-inner-color: red ; ");
        }
        tf21.setText("" + a[2][1]);
        if (a[2][1] == result[2][1]) {
            //    tf21.setDisable(true);
            tf21.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf21.setEditable(false);
            tf21.setStyle("-fx-text-inner-color: red ; ");
        }
        tf22.setText("" + a[2][2]);
        if (a[2][2] == result[2][2]) {
            //    tf22.setDisable(true);
            tf22.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf22.setEditable(false);
            tf22.setStyle("-fx-text-inner-color: red ; ");
        }
        tf23.setText("" + a[2][3]);
        if (a[2][3] == result[2][3]) {
            //    tf23.setDisable(true);
            tf23.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf23.setEditable(false);
            tf23.setStyle("-fx-text-inner-color: red ; ");
        }
        tf24.setText("" + a[2][4]);
        if (a[2][4] == result[2][4]) {
            //    tf24.setDisable(true);
            tf24.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf24.setEditable(false);
            tf24.setStyle("-fx-text-inner-color: red ; ");
        }
        tf25.setText("" + a[2][5]);
        if (a[2][5] == result[2][5]) {
            //    tf25.setDisable(true);
            tf25.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf25.setEditable(false);
            tf25.setStyle("-fx-text-inner-color: red ; ");
        }
        tf26.setText("" + a[2][6]);
        if (a[2][6] == result[2][6]) {
            //    tf26.setDisable(true);
            tf26.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf26.setEditable(false);
            tf26.setStyle("-fx-text-inner-color: red ; ");
        }
        tf27.setText("" + a[2][7]);
        if (a[2][7] == result[2][7]) {
            //    tf27.setDisable(true);
            tf27.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf27.setEditable(false);
            tf27.setStyle("-fx-text-inner-color: red ; ");
        }
        tf28.setText("" + a[2][8]);
        if (a[2][8] == result[2][8]) {
            //    tf28.setDisable(true);
            tf28.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf28.setEditable(false);
            tf28.setStyle("-fx-text-inner-color: red ; ");
        }

        tf30.setText("" + a[3][0]);
        if (a[3][0] == result[3][0]) {
            //    tf30.setDisable(true);
            tf30.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf30.setEditable(false);
            tf30.setStyle("-fx-text-inner-color: red ; ");
        }
        tf31.setText("" + a[3][1]);
        if (a[3][1] == result[3][1]) {
            //    tf31.setDisable(true);
            tf31.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf31.setEditable(false);
            tf31.setStyle("-fx-text-inner-color: red ; ");
        }
        tf32.setText("" + a[3][2]);
        if (a[3][2] == result[3][2]) {
            //    tf32.setDisable(true);
            tf32.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf32.setEditable(false);
            tf32.setStyle("-fx-text-inner-color: red ; ");
        }
        tf33.setText("" + a[3][3]);
        if (a[3][3] == result[3][3]) {
            //    tf33.setDisable(true);
            tf33.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf33.setEditable(false);
            tf33.setStyle("-fx-text-inner-color: red ; ");
        }
        tf34.setText("" + a[3][4]);
        if (a[3][4] == result[3][4]) {
            //    tf34.setDisable(true);
            tf34.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf34.setEditable(false);
            tf34.setStyle("-fx-text-inner-color: red ; ");
        }
        tf35.setText("" + a[3][5]);
        if (a[3][5] == result[3][5]) {
            //    tf35.setDisable(true);
            tf35.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf35.setEditable(false);
            tf35.setStyle("-fx-text-inner-color: red ; ");
        }
        tf36.setText("" + a[3][6]);
        if (a[3][6] == result[3][6]) {
            //    tf36.setDisable(true);
            tf36.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf36.setEditable(false);
            tf36.setStyle("-fx-text-inner-color: red ; ");
        }
        tf37.setText("" + a[3][7]);
        if (a[3][7] == result[3][7]) {
            //    tf37.setDisable(true);
            tf37.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf37.setEditable(false);
            tf37.setStyle("-fx-text-inner-color: red ; ");
        }
        tf38.setText("" + a[3][8]);
        if (a[3][8] == result[3][8]) {
            //    tf38.setDisable(true);
            tf38.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf38.setEditable(false);
            tf38.setStyle("-fx-text-inner-color: red ; ");
        }

        tf40.setText("" + a[4][0]);
        if (a[4][0] == result[4][0]) {
            //    tf40.setDisable(true);
            tf40.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf40.setEditable(false);
            tf40.setStyle("-fx-text-inner-color: red ; ");
        }
        tf41.setText("" + a[4][1]);
        if (a[4][1] == result[4][1]) {
            //    tf41.setDisable(true);
            tf41.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf41.setEditable(false);
            tf41.setStyle("-fx-text-inner-color: red ; ");
        }
        tf42.setText("" + a[4][2]);
        if (a[4][2] == result[4][2]) {
            //    tf42.setDisable(true);
            tf42.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf42.setEditable(false);
            tf42.setStyle("-fx-text-inner-color: red ; ");
        }
        tf43.setText("" + a[4][3]);
        if (a[4][3] == result[4][3]) {
            //    tf43.setDisable(true);
            tf43.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf43.setEditable(false);
            tf43.setStyle("-fx-text-inner-color: red ; ");
        }
        tf44.setText("" + a[4][4]);
        if (a[4][4] == result[4][4]) {
            //    tf44.setDisable(true);
            tf44.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf44.setEditable(false);
            tf44.setStyle("-fx-text-inner-color: red ; ");
        }
        tf45.setText("" + a[4][5]);
        if (a[4][5] == result[4][5]) {
            //    tf45.setDisable(true);
            tf45.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf45.setEditable(false);
            tf45.setStyle("-fx-text-inner-color: red ; ");
        }
        tf46.setText("" + a[4][6]);
        if (a[4][6] == result[4][6]) {
            //    tf46.setDisable(true);
            tf46.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf46.setEditable(false);
            tf46.setStyle("-fx-text-inner-color: red ; ");
        }
        tf47.setText("" + a[4][7]);
        if (a[4][7] == result[4][7]) {
            //    tf47.setDisable(true);
            tf47.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf47.setEditable(false);
            tf47.setStyle("-fx-text-inner-color: red ; ");
        }
        tf48.setText("" + a[4][8]);
        if (a[4][8] == result[4][8]) {
            //    tf48.setDisable(true);
            tf48.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf48.setEditable(false);
            tf48.setStyle("-fx-text-inner-color: red ; ");
        }

        tf50.setText("" + a[5][0]);
        if (a[5][0] == result[5][0]) {
            //    tf50.setDisable(true);
            tf50.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf50.setEditable(false);
            tf50.setStyle("-fx-text-inner-color: red ; ");
        }
        tf51.setText("" + a[5][1]);
        if (a[5][1] == result[5][1]) {
            //    tf51.setDisable(true);
            tf51.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf51.setEditable(false);
            tf51.setStyle("-fx-text-inner-color: red ; ");
        }
        tf52.setText("" + a[5][2]);
        if (a[5][2] == result[5][2]) {
            //    tf52.setDisable(true);
            tf52.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf52.setEditable(false);
            tf52.setStyle("-fx-text-inner-color: red ; ");
        }
        tf53.setText("" + a[5][3]);
        if (a[5][3] == result[5][3]) {
            //    tf53.setDisable(true);
            tf53.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf53.setEditable(false);
            tf53.setStyle("-fx-text-inner-color: red ; ");
        }
        tf54.setText("" + a[5][4]);
        if (a[5][4] == result[5][4]) {
            //    tf54.setDisable(true);
            tf54.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf54.setEditable(false);
            tf54.setStyle("-fx-text-inner-color: red ; ");
        }
        tf55.setText("" + a[5][5]);
        if (a[5][5] == result[5][5]) {
            //    tf55.setDisable(true);
            tf55.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf55.setEditable(false);
            tf55.setStyle("-fx-text-inner-color: red ; ");
        }
        tf56.setText("" + a[5][6]);
        if (a[5][6] == result[5][6]) {
            //    tf56.setDisable(true);
            tf56.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf56.setEditable(false);
            tf56.setStyle("-fx-text-inner-color: red ; ");
        }
        tf57.setText("" + a[5][7]);
        if (a[5][7] == result[5][7]) {
            //    tf57.setDisable(true);
            tf57.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf57.setEditable(false);
            tf57.setStyle("-fx-text-inner-color: red ; ");
        }
        tf58.setText("" + a[5][8]);
        if (a[5][8] == result[5][8]) {
            //    tf58.setDisable(true);
            tf58.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf58.setEditable(false);
            tf58.setStyle("-fx-text-inner-color: red ; ");
        }

        tf60.setText("" + a[6][0]);
        if (a[6][0] == result[6][0]) {
            //    tf60.setDisable(true);
            tf60.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf60.setEditable(false);
            tf60.setStyle("-fx-text-inner-color: red ; ");
        }
        tf61.setText("" + a[6][1]);
        if (a[6][1] == result[6][1]) {
            //    tf61.setDisable(true);
            tf61.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf61.setEditable(false);
            tf61.setStyle("-fx-text-inner-color: red ; ");
        }
        tf62.setText("" + a[6][2]);
        if (a[6][2] == result[6][2]) {
            //    tf62.setDisable(true);
            tf62.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf62.setEditable(false);
            tf62.setStyle("-fx-text-inner-color: red ; ");
        }
        tf63.setText("" + a[6][3]);
        if (a[6][3] == result[6][3]) {
            //    tf63.setDisable(true);
            tf63.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf63.setEditable(false);
            tf63.setStyle("-fx-text-inner-color: red ; ");
        }
        tf64.setText("" + a[6][4]);
        if (a[6][4] == result[6][4]) {
            //    tf64.setDisable(true);
            tf64.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf64.setEditable(false);
            tf64.setStyle("-fx-text-inner-color: red ; ");
        }
        tf65.setText("" + a[6][5]);
        if (a[6][5] == result[6][5]) {
            //    tf65.setDisable(true);
            tf65.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf65.setEditable(false);
            tf65.setStyle("-fx-text-inner-color: red ; ");
        }
        tf66.setText("" + a[6][6]);
        if (a[6][6] == result[6][6]) {
            //    tf66.setDisable(true);
            tf66.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf66.setEditable(false);
            tf66.setStyle("-fx-text-inner-color: red ; ");
        }
        tf67.setText("" + a[6][7]);
        if (a[6][7] == result[6][7]) {
            //    tf67.setDisable(true);
            tf67.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf67.setEditable(false);
            tf67.setStyle("-fx-text-inner-color: red ; ");
        }
        tf68.setText("" + a[6][8]);
        if (a[6][8] == result[6][8]) {
            //    tf68.setDisable(true);
            tf68.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf68.setEditable(false);
            tf68.setStyle("-fx-text-inner-color: red ; ");
        }

        tf70.setText("" + a[7][0]);
        if (a[7][0] == result[7][0]) {
            //    tf70.setDisable(true);
            tf70.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf70.setEditable(false);
            tf70.setStyle("-fx-text-inner-color: red ; ");
        }
        tf71.setText("" + a[7][1]);
        if (a[7][1] == result[7][1]) {
            //    tf71.setDisable(true);
            tf71.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf71.setEditable(false);
            tf71.setStyle("-fx-text-inner-color: red ; ");
        }
        tf72.setText("" + a[7][2]);
        if (a[7][2] == result[7][2]) {
            //    tf72.setDisable(true);
            tf72.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf72.setEditable(false);
            tf72.setStyle("-fx-text-inner-color: red ; ");
        }
        tf73.setText("" + a[7][3]);
        if (a[7][3] == result[7][3]) {
            //    tf73.setDisable(true);
            tf73.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf73.setEditable(false);
            tf73.setStyle("-fx-text-inner-color: red ; ");
        }
        tf74.setText("" + a[7][4]);
        if (a[7][4] == result[7][4]) {
            //    tf74.setDisable(true);
            tf74.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf74.setEditable(false);
            tf74.setStyle("-fx-text-inner-color: red ; ");
        }
        tf75.setText("" + a[7][5]);
        if (a[7][5] == result[7][5]) {
            //    tf75.setDisable(true);
            tf75.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf75.setEditable(false);
            tf75.setStyle("-fx-text-inner-color: red ; ");
        }
        tf76.setText("" + a[7][6]);
        if (a[7][6] == result[7][6]) {
            //    tf76.setDisable(true);
            tf76.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf76.setEditable(false);
            tf76.setStyle("-fx-text-inner-color: red ; ");
        }
        tf77.setText("" + a[7][7]);
        if (a[7][7] == result[7][7]) {
            //    tf77.setDisable(true);
            tf77.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf77.setEditable(false);
            tf77.setStyle("-fx-text-inner-color: red ; ");
        }
        tf78.setText("" + a[7][8]);
        if (a[7][8] == result[7][8]) {
            //    tf78.setDisable(true);
            tf78.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf78.setEditable(false);
            tf78.setStyle("-fx-text-inner-color: red ; ");
        }

        tf80.setText("" + a[8][0]);
        if (a[8][0] == result[8][0]) {
            //    tf80.setDisable(true);
            tf80.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf80.setEditable(false);
            tf80.setStyle("-fx-text-inner-color: red ; ");
        }
        tf81.setText("" + a[8][1]);
        if (a[8][1] == result[8][1]) {
            //    tf81.setDisable(true);
            tf81.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf81.setEditable(false);
            tf81.setStyle("-fx-text-inner-color: red ; ");
        }
        tf82.setText("" + a[8][2]);
        if (a[8][2] == result[8][2]) {
            //    tf82.setDisable(true);
            tf82.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf82.setEditable(false);
            tf82.setStyle("-fx-text-inner-color: red ; ");
        }
        tf83.setText("" + a[8][3]);
        if (a[8][3] == result[8][3]) {
            //    tf83.setDisable(true);
            tf83.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf83.setEditable(false);
            tf83.setStyle("-fx-text-inner-color: red ; ");
        }
        tf84.setText("" + a[8][4]);
        if (a[8][4] == result[8][4]) {
            //    tf84.setDisable(true);
            tf84.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf84.setEditable(false);
            tf84.setStyle("-fx-text-inner-color: red ; ");
        }
        tf85.setText("" + a[8][5]);
        if (a[8][5] == result[8][5]) {
            //    tf85.setDisable(true);
            tf85.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf85.setEditable(false);
            tf85.setStyle("-fx-text-inner-color: red ; ");
        }
        tf86.setText("" + a[8][6]);
        if (a[8][6] == result[8][6]) {
            //    tf86.setDisable(true);
            tf86.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf86.setEditable(false);
            tf86.setStyle("-fx-text-inner-color: red ; ");
        }
        tf87.setText("" + a[8][7]);
        if (a[8][7] == result[8][7]) {
            //    tf87.setDisable(true);
            tf87.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf87.setEditable(false);
            tf87.setStyle("-fx-text-inner-color: red ; ");
        }
        tf88.setText("" + a[8][8]);
        if (a[8][8] == result[8][8]) {
            //    tf88.setDisable(true);
            tf88.setStyle("-fx-text-inner-color: blue ; ");

        } else {
            tf88.setEditable(false);
            tf88.setStyle("-fx-text-inner-color: red ; ");
        }

    }

    @FXML
    private void btnQuitAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void tf00Action(MouseEvent event) throws Exception {
        if (tf00.isDisable() == false) {
            num[0][0]++;
            if (num[0][0] > 9) {
                num[0][0] = 0;
            }
            if (num[0][0] == 0) {
                tf00.setText("0");
                a[0][0] = 0;
                tf00.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf00.setText(Integer.toString(num[0][0]));
                a[0][0] = num[0][0];
                tf00.setStyle("-fx-text-inner-color: red ;");
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
    private void tf01Action(MouseEvent event) throws Exception {
        if (tf01.isDisable() == false) {
            num[0][1]++;
            if (num[0][1] > 9) {
                num[0][1] = 0;
            }
            if (num[0][1] == 0) {
                tf01.setText("0");
                a[0][1] = 0;
                tf01.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf01.setText(Integer.toString(num[0][1]));
                a[0][1] = num[0][1];
                tf01.setStyle("-fx-text-inner-color: red ;");
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
    private void tf02Action(MouseEvent event) throws Exception {
        if (tf02.isDisable() == false) {
            num[0][2]++;
            if (num[0][2] > 9) {
                num[0][2] = 0;
            }
            if (num[0][2] == 0) {
                tf02.setText("0");
                a[0][2] = 0;
                tf02.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf02.setText(Integer.toString(num[0][2]));
                a[0][2] = num[0][2];
                tf02.setStyle("-fx-text-inner-color: red ;");
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
    private void tf03Action(MouseEvent event) throws Exception {
        if (tf03.isDisable() == false) {
            num[0][3]++;
            if (num[0][3] > 9) {
                num[0][3] = 0;
            }
            if (num[0][3] == 0) {
                tf03.setText("0");
                a[0][3] = 0;
                tf03.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf03.setText(Integer.toString(num[0][3]));
                a[0][3] = num[0][3];
                tf03.setStyle("-fx-text-inner-color: red ;");
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
    private void tf04Action(MouseEvent event) throws Exception {
        if (tf04.isDisable() == false) {
            num[0][4]++;
            if (num[0][4] > 9) {
                num[0][4] = 0;
            }
            if (num[0][4] == 0) {
                tf04.setText("0");
                a[0][4] = 0;
                tf04.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf04.setText(Integer.toString(num[0][4]));
                a[0][4] = num[0][4];
                tf04.setStyle("-fx-text-inner-color: red ;");
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
    private void tf05Action(MouseEvent event) throws Exception {
        if (tf05.isDisable() == false) {
            num[0][5]++;
            if (num[0][5] > 9) {
                num[0][5] = 0;
            }
            if (num[0][5] == 0) {
                tf05.setText("0");
                a[0][5] = 0;
                tf05.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf05.setText(Integer.toString(num[0][5]));
                a[0][5] = num[0][5];
                tf05.setStyle("-fx-text-inner-color: red ;");
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
    private void tf06Action(MouseEvent event) throws Exception {
        if (tf06.isDisable() == false) {
            num[0][6]++;
            if (num[0][6] > 9) {
                num[0][6] = 0;
            }
            if (num[0][6] == 0) {
                tf06.setText("0");
                a[0][6] = 0;
                tf06.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf06.setText(Integer.toString(num[0][6]));
                a[0][6] = num[0][6];
                tf06.setStyle("-fx-text-inner-color: red ;");
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
    private void tf07Action(MouseEvent event) throws Exception {
        if (tf07.isDisable() == false) {
            num[0][7]++;
            if (num[0][7] > 9) {
                num[0][7] = 0;
            }
            if (num[0][7] == 0) {
                tf07.setText("0");
                a[0][7] = 0;
                tf07.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf07.setText(Integer.toString(num[0][7]));
                a[0][7] = num[0][7];
                tf07.setStyle("-fx-text-inner-color: red ;");
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
    private void tf08Action(MouseEvent event) throws Exception {
        if (tf08.isDisable() == false) {
            num[0][8]++;
            if (num[0][8] > 9) {
                num[0][8] = 0;
            }
            if (num[0][8] == 0) {
                tf08.setText("0");
                a[0][8] = 0;
                tf08.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf08.setText(Integer.toString(num[0][8]));
                a[0][8] = num[0][8];
                tf08.setStyle("-fx-text-inner-color: red ;");
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
    private void tf10Action(MouseEvent event) throws Exception {
        if (tf10.isDisable() == false) {
            num[1][0]++;
            if (num[1][0] > 9) {
                num[1][0] = 0;
            }
            if (num[1][0] == 0) {
                tf10.setText("0");
                a[1][0] = 0;
                tf10.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf10.setText(Integer.toString(num[1][0]));
                a[1][0] = num[1][0];
                tf10.setStyle("-fx-text-inner-color: red ;");
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
    private void tf11Action(MouseEvent event) throws Exception {
        if (tf11.isDisable() == false) {
            num[1][1]++;
            if (num[1][1] > 9) {
                num[1][1] = 0;
            }
            if (num[1][1] == 0) {
                tf11.setText("0");
                a[1][1] = 0;
                tf11.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf11.setText(Integer.toString(num[1][1]));
                a[1][1] = num[1][1];
                tf11.setStyle("-fx-text-inner-color: red ;");
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
    private void tf12Action(MouseEvent event) throws Exception {
        if (tf12.isDisable() == false) {
            num[1][2]++;
            if (num[1][2] > 9) {
                num[1][2] = 0;
            }
            if (num[1][2] == 0) {
                tf12.setText("0");
                a[1][2] = 0;
                tf12.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf12.setText(Integer.toString(num[1][2]));
                a[1][2] = num[1][2];
                tf12.setStyle("-fx-text-inner-color: red ;");
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
    private void tf13Action(MouseEvent event) throws Exception {
        if (tf13.isDisable() == false) {
            num[1][3]++;
            if (num[1][3] > 9) {
                num[1][3] = 0;
            }
            if (num[1][3] == 0) {
                tf13.setText("0");
                a[1][3] = 0;
                tf13.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf13.setText(Integer.toString(num[1][3]));
                a[1][3] = num[1][3];
                tf13.setStyle("-fx-text-inner-color: red ;");
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
    private void tf14Action(MouseEvent event) throws Exception {
        if (tf14.isDisable() == false) {
            num[1][4]++;
            if (num[1][4] > 9) {
                num[1][4] = 0;
            }
            if (num[1][4] == 0) {
                tf14.setText("0");
                a[1][4] = 0;
                tf14.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf14.setText(Integer.toString(num[1][4]));
                a[1][4] = num[1][4];
                tf14.setStyle("-fx-text-inner-color: red ;");
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
    private void tf15Action(MouseEvent event) throws Exception {
        if (tf15.isDisable() == false) {
            num[1][5]++;
            if (num[1][5] > 9) {
                num[1][5] = 0;
            }
            if (num[1][5] == 0) {
                tf15.setText("0");
                a[1][5] = 0;
                tf15.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf15.setText(Integer.toString(num[1][5]));
                a[1][5] = num[1][5];
                tf15.setStyle("-fx-text-inner-color: red ;");
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
    private void tf16Action(MouseEvent event) throws Exception {
        if (tf16.isDisable() == false) {
            num[1][6]++;
            if (num[1][6] > 9) {
                num[1][6] = 0;
            }
            if (num[1][6] == 0) {
                tf16.setText("0");
                a[1][6] = 0;
                tf16.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf16.setText(Integer.toString(num[1][6]));
                a[1][6] = num[1][6];
                tf16.setStyle("-fx-text-inner-color: red ;");
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
    private void tf17Action(MouseEvent event) throws Exception {
        if (tf17.isDisable() == false) {
            num[1][7]++;
            if (num[1][7] > 9) {
                num[1][7] = 0;
            }
            if (num[1][7] == 0) {
                tf17.setText("0");
                a[1][7] = 0;
                tf17.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf17.setText(Integer.toString(num[1][7]));
                a[1][7] = num[1][7];
                tf17.setStyle("-fx-text-inner-color: red ;");
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
    private void tf18Action(MouseEvent event) throws Exception {
        if (tf18.isDisable() == false) {
            num[1][8]++;
            if (num[1][8] > 9) {
                num[1][8] = 0;
            }
            if (num[1][8] == 0) {
                tf18.setText("0");
                a[1][8] = 0;
                tf18.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf18.setText(Integer.toString(num[1][8]));
                a[1][8] = num[1][8];
                tf18.setStyle("-fx-text-inner-color: red ;");
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
    private void tf20Action(MouseEvent event) throws Exception {
        if (tf20.isDisable() == false) {
            num[2][0]++;
            if (num[2][0] > 9) {
                num[2][0] = 0;
            }
            if (num[2][0] == 0) {
                tf20.setText("0");
                a[2][0] = 0;
                tf20.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf20.setText(Integer.toString(num[2][0]));
                a[2][0] = num[2][0];
                tf20.setStyle("-fx-text-inner-color: red ;");
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
    private void tf21Action(MouseEvent event) throws Exception {
        if (tf21.isDisable() == false) {
            num[2][1]++;
            if (num[2][1] > 9) {
                num[2][1] = 0;
            }
            if (num[2][1] == 0) {
                tf21.setText("0");
                a[2][1] = 0;
                tf21.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf21.setText(Integer.toString(num[2][1]));
                a[2][1] = num[2][1];
                tf21.setStyle("-fx-text-inner-color: red ;");
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
    private void tf22Action(MouseEvent event) throws Exception {
        if (tf22.isDisable() == false) {
            num[2][2]++;
            if (num[2][2] > 9) {
                num[2][2] = 0;
            }
            if (num[2][2] == 0) {
                tf22.setText("0");
                a[2][2] = 0;
                tf22.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf22.setText(Integer.toString(num[2][2]));
                a[2][2] = num[2][2];
                tf22.setStyle("-fx-text-inner-color: red ;");
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
    private void tf23Action(MouseEvent event) throws Exception {
        if (tf23.isDisable() == false) {
            num[2][3]++;
            if (num[2][3] > 9) {
                num[2][3] = 0;
            }
            if (num[2][3] == 0) {
                tf23.setText("0");
                a[2][3] = 0;
                tf23.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf23.setText(Integer.toString(num[2][3]));
                a[2][3] = num[2][3];
                tf23.setStyle("-fx-text-inner-color: red ;");
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
    private void tf24Action(MouseEvent event) throws Exception {
        if (tf24.isDisable() == false) {
            num[2][4]++;
            if (num[2][4] > 9) {
                num[2][4] = 0;
            }
            if (num[2][4] == 0) {
                tf24.setText("0");
                a[2][4] = 0;
                tf24.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf24.setText(Integer.toString(num[2][4]));
                a[2][4] = num[2][4];
                tf24.setStyle("-fx-text-inner-color: red ;");
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
    private void tf25Action(MouseEvent event) throws Exception {
        if (tf25.isDisable() == false) {
            num[2][5]++;
            if (num[2][5] > 9) {
                num[2][5] = 0;
            }
            if (num[2][5] == 0) {
                tf25.setText("0");
                a[2][5] = 0;
                tf25.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf25.setText(Integer.toString(num[2][5]));
                a[2][5] = num[2][5];
                tf25.setStyle("-fx-text-inner-color: red ;");
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
    private void tf26Action(MouseEvent event) throws Exception {
        if (tf26.isDisable() == false) {
            num[2][6]++;
            if (num[2][6] > 9) {
                num[2][6] = 0;
            }
            if (num[2][6] == 0) {
                tf26.setText("0");
                a[2][6] = 0;
                tf26.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf26.setText(Integer.toString(num[2][6]));
                a[2][6] = num[2][6];
                tf26.setStyle("-fx-text-inner-color: red ;");
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
    private void tf27Action(MouseEvent event) throws Exception {
        if (tf27.isDisable() == false) {
            num[2][7]++;
            if (num[2][7] > 9) {
                num[2][7] = 0;
            }
            if (num[2][7] == 0) {
                tf27.setText("0");
                a[2][7] = 0;
                tf27.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf27.setText(Integer.toString(num[2][7]));
                a[2][7] = num[2][7];
                tf27.setStyle("-fx-text-inner-color: red ;");
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
    private void tf28Action(MouseEvent event) throws Exception {
        if (tf28.isDisable() == false) {
            num[2][8]++;
            if (num[2][8] > 9) {
                num[2][8] = 0;
            }
            if (num[2][8] == 0) {
                tf28.setText("0");
                a[2][8] = 0;
                tf28.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf28.setText(Integer.toString(num[2][8]));
                a[2][8] = num[2][8];
                tf28.setStyle("-fx-text-inner-color: red ;");
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
    private void tf30Action(MouseEvent event) throws Exception {
        if (tf30.isDisable() == false) {
            num[3][0]++;
            if (num[3][0] > 9) {
                num[3][0] = 0;
            }
            if (num[3][0] == 0) {
                tf30.setText("0");
                a[3][0] = 0;
                tf30.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf30.setText(Integer.toString(num[3][0]));
                a[3][0] = num[3][0];
                tf30.setStyle("-fx-text-inner-color: red ;");
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
    private void tf31Action(MouseEvent event) throws Exception {
        if (tf31.isDisable() == false) {
            num[3][1]++;
            if (num[3][1] > 9) {
                num[3][1] = 0;
            }
            if (num[3][1] == 0) {
                tf31.setText("0");
                a[3][1] = 0;
                tf31.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf31.setText(Integer.toString(num[3][1]));
                a[3][1] = num[3][1];
                tf31.setStyle("-fx-text-inner-color: red ;");
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
    private void tf32Action(MouseEvent event) throws Exception {
        if (tf32.isDisable() == false) {
            num[3][2]++;
            if (num[3][2] > 9) {
                num[3][2] = 0;
            }
            if (num[3][2] == 0) {
                tf32.setText("0");
                a[3][2] = 0;
                tf32.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf32.setText(Integer.toString(num[3][2]));
                a[3][2] = num[3][2];
                tf32.setStyle("-fx-text-inner-color: red ;");
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
    private void tf33Action(MouseEvent event) throws Exception {
        if (tf33.isDisable() == false) {
            num[3][3]++;
            if (num[3][3] > 9) {
                num[3][3] = 0;
            }
            if (num[3][3] == 0) {
                tf33.setText("0");
                a[3][3] = 0;
                tf33.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf33.setText(Integer.toString(num[3][3]));
                a[3][3] = num[3][3];
                tf33.setStyle("-fx-text-inner-color: red ;");
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
    private void tf34Action(MouseEvent event) throws Exception {
        if (tf34.isDisable() == false) {
            num[3][4]++;
            if (num[3][4] > 9) {
                num[3][4] = 0;
            }
            if (num[3][4] == 0) {
                tf34.setText("0");
                a[3][4] = 0;
                tf34.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf34.setText(Integer.toString(num[3][4]));
                a[3][4] = num[3][4];
                tf34.setStyle("-fx-text-inner-color: red ;");
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
    private void tf35Action(MouseEvent event) throws Exception {
        if (tf35.isDisable() == false) {
            num[3][5]++;
            if (num[3][5] > 9) {
                num[3][5] = 0;
            }
            if (num[3][5] == 0) {
                tf35.setText("0");
                a[3][5] = 0;
                tf35.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf35.setText(Integer.toString(num[3][5]));
                a[3][5] = num[3][5];
                tf35.setStyle("-fx-text-inner-color: red ;");
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
    private void tf36Action(MouseEvent event) throws Exception {
        if (tf36.isDisable() == false) {
            num[3][6]++;
            if (num[3][6] > 9) {
                num[3][6] = 0;
            }
            if (num[3][6] == 0) {
                tf36.setText("0");
                a[3][6] = 0;
                tf36.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf36.setText(Integer.toString(num[3][6]));
                a[3][6] = num[3][6];
                tf36.setStyle("-fx-text-inner-color: red ;");
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
    private void tf37Action(MouseEvent event) throws Exception {
        if (tf37.isDisable() == false) {
            num[3][7]++;
            if (num[3][7] > 9) {
                num[3][7] = 0;
            }
            if (num[3][7] == 0) {
                tf37.setText("0");
                a[3][7] = 0;
                tf37.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf37.setText(Integer.toString(num[3][7]));
                a[3][7] = num[3][7];
                tf37.setStyle("-fx-text-inner-color: red ;");
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
    private void tf38Action(MouseEvent event) throws Exception {
        if (tf38.isDisable() == false) {
            num[3][8]++;
            if (num[3][8] > 9) {
                num[3][8] = 0;
            }
            if (num[3][8] == 0) {
                tf38.setText("0");
                a[3][8] = 0;
                tf38.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf38.setText(Integer.toString(num[3][8]));
                a[3][8] = num[3][8];
                tf38.setStyle("-fx-text-inner-color: red ;");
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
    private void tf40Action(MouseEvent event) throws Exception {
        if (tf40.isDisable() == false) {
            num[4][0]++;
            if (num[4][0] > 9) {
                num[4][0] = 0;
            }
            if (num[4][0] == 0) {
                tf40.setText("0");
                a[4][0] = 0;
                tf40.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf40.setText(Integer.toString(num[4][0]));
                a[4][0] = num[4][0];
                tf40.setStyle("-fx-text-inner-color: red ;");
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
    private void tf41Action(MouseEvent event) throws Exception {
        if (tf41.isDisable() == false) {
            num[4][1]++;
            if (num[4][1] > 9) {
                num[4][1] = 0;
            }
            if (num[4][1] == 0) {
                tf41.setText("0");
                a[4][1] = 0;
                tf41.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf41.setText(Integer.toString(num[4][1]));
                a[4][1] = num[4][1];
                tf41.setStyle("-fx-text-inner-color: red ;");
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
    private void tf42Action(MouseEvent event) throws Exception {
        if (tf42.isDisable() == false) {
            num[4][2]++;
            if (num[4][2] > 9) {
                num[4][2] = 0;
            }
            if (num[4][2] == 0) {
                tf42.setText("0");
                a[4][2] = 0;
                tf42.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf42.setText(Integer.toString(num[4][2]));
                a[4][2] = num[4][2];
                tf42.setStyle("-fx-text-inner-color: red ;");
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
    private void tf43Action(MouseEvent event) throws Exception {
        if (tf43.isDisable() == false) {
            num[4][3]++;
            if (num[4][3] > 9) {
                num[4][3] = 0;
            }
            if (num[4][3] == 0) {
                tf43.setText("0");
                a[4][3] = 0;
                tf43.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf43.setText(Integer.toString(num[4][3]));
                a[4][3] = num[4][3];
                tf43.setStyle("-fx-text-inner-color: red ;");
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
    private void tf44Action(MouseEvent event) throws Exception {
        if (tf44.isDisable() == false) {
            num[4][4]++;
            if (num[4][4] > 9) {
                num[4][4] = 0;
            }
            if (num[4][4] == 0) {
                tf44.setText("0");
                a[4][4] = 0;
                tf44.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf44.setText(Integer.toString(num[4][4]));
                a[4][4] = num[4][4];
                tf44.setStyle("-fx-text-inner-color: red ;");
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
    private void tf45Action(MouseEvent event) throws Exception {
        if (tf45.isDisable() == false) {
            num[4][5]++;
            if (num[4][5] > 9) {
                num[4][5] = 0;
            }
            if (num[4][5] == 0) {
                tf45.setText("0");
                a[4][5] = 0;
                tf45.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf45.setText(Integer.toString(num[4][5]));
                a[4][5] = num[4][5];
                tf45.setStyle("-fx-text-inner-color: red ;");
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
    private void tf46Action(MouseEvent event) throws Exception {
        if (tf46.isDisable() == false) {
            num[4][6]++;
            if (num[4][6] > 9) {
                num[4][6] = 0;
            }
            if (num[4][6] == 0) {
                tf46.setText("0");
                a[4][6] = 0;
                tf46.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf46.setText(Integer.toString(num[4][6]));
                a[4][6] = num[4][6];
                tf46.setStyle("-fx-text-inner-color: red ;");
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
    private void tf47Action(MouseEvent event) throws Exception {
        if (tf47.isDisable() == false) {
            num[4][7]++;
            if (num[4][7] > 9) {
                num[4][7] = 0;
            }
            if (num[4][7] == 0) {
                tf47.setText("0");
                a[4][7] = 0;
                tf47.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf47.setText(Integer.toString(num[4][7]));
                a[4][7] = num[4][7];
                tf47.setStyle("-fx-text-inner-color: red ;");
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
    private void tf48Action(MouseEvent event) throws Exception {
        if (tf48.isDisable() == false) {
            num[4][8]++;
            if (num[4][8] > 9) {
                num[4][8] = 0;
            }
            if (num[4][8] == 0) {
                tf48.setText("0");
                a[4][8] = 0;
                tf48.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf48.setText(Integer.toString(num[4][8]));
                a[4][8] = num[4][8];
                tf48.setStyle("-fx-text-inner-color: red ;");
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
    private void tf50Action(MouseEvent event) throws Exception {
        if (tf50.isDisable() == false) {
            num[5][0]++;
            if (num[5][0] > 9) {
                num[5][0] = 0;
            }
            if (num[5][0] == 0) {
                tf50.setText("0");
                a[5][0] = 0;
                tf50.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf50.setText(Integer.toString(num[5][0]));
                a[5][0] = num[5][0];
                tf50.setStyle("-fx-text-inner-color: red ;");
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
    private void tf51Action(MouseEvent event) throws Exception {
        if (tf51.isDisable() == false) {
            num[5][1]++;
            if (num[5][1] > 9) {
                num[5][1] = 0;
            }
            if (num[5][1] == 0) {
                tf51.setText("0");
                a[5][1] = 0;
                tf51.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf51.setText(Integer.toString(num[5][1]));
                a[5][1] = num[5][1];
                tf51.setStyle("-fx-text-inner-color: red ;");
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
    private void tf52Action(MouseEvent event) throws Exception {
        if (tf52.isDisable() == false) {
            num[5][2]++;
            if (num[5][2] > 9) {
                num[5][2] = 0;
            }
            if (num[5][2] == 0) {
                tf52.setText("0");
                a[5][2] = 0;
                tf52.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf52.setText(Integer.toString(num[5][2]));
                a[5][2] = num[5][2];
                tf52.setStyle("-fx-text-inner-color: red ;");
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
    private void tf53Action(MouseEvent event) throws Exception {
        if (tf53.isDisable() == false) {
            num[5][3]++;
            if (num[5][3] > 9) {
                num[5][3] = 0;
            }
            if (num[5][3] == 0) {
                tf53.setText("0");
                a[5][3] = 0;
                tf53.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf53.setText(Integer.toString(num[5][3]));
                a[5][3] = num[5][3];
                tf53.setStyle("-fx-text-inner-color: red ;");
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
    private void tf54Action(MouseEvent event) throws Exception {
        if (tf54.isDisable() == false) {
            num[5][4]++;
            if (num[5][4] > 9) {
                num[5][4] = 0;
            }
            if (num[5][4] == 0) {
                tf54.setText("0");
                a[5][4] = 0;
                tf54.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf54.setText(Integer.toString(num[5][4]));
                a[5][4] = num[5][4];
                tf54.setStyle("-fx-text-inner-color: red ;");
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
    private void tf55Action(MouseEvent event) throws Exception {
        if (tf55.isDisable() == false) {
            num[5][5]++;
            if (num[5][5] > 9) {
                num[5][5] = 0;
            }
            if (num[5][5] == 0) {
                tf55.setText("0");
                a[5][5] = 0;
                tf55.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf55.setText(Integer.toString(num[5][5]));
                a[5][5] = num[5][5];
                tf55.setStyle("-fx-text-inner-color: red ;");
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
    private void tf56Action(MouseEvent event) throws Exception {
        if (tf56.isDisable() == false) {
            num[5][6]++;
            if (num[5][6] > 9) {
                num[5][6] = 0;
            }
            if (num[5][6] == 0) {
                tf56.setText("0");
                a[5][6] = 0;
                tf56.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf56.setText(Integer.toString(num[5][6]));
                a[5][6] = num[5][6];
                tf56.setStyle("-fx-text-inner-color: red ;");
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
    private void tf57Action(MouseEvent event) throws Exception {
        if (tf57.isDisable() == false) {
            num[5][7]++;
            if (num[5][7] > 9) {
                num[5][7] = 0;
            }
            if (num[5][7] == 0) {
                tf57.setText("0");
                a[5][7] = 0;
                tf57.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf57.setText(Integer.toString(num[5][7]));
                a[5][7] = num[5][7];
                tf57.setStyle("-fx-text-inner-color: red ;");
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
    private void tf58Action(MouseEvent event) throws Exception {
        if (tf58.isDisable() == false) {
            num[5][8]++;
            if (num[5][8] > 9) {
                num[5][8] = 0;
            }
            if (num[5][8] == 0) {
                tf58.setText("0");
                a[5][8] = 0;
                tf58.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf58.setText(Integer.toString(num[5][8]));
                a[5][8] = num[5][8];
                tf58.setStyle("-fx-text-inner-color: red ;");
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
    private void tf60Action(MouseEvent event) throws Exception {
        if (tf60.isDisable() == false) {
            num[6][0]++;
            if (num[6][0] > 9) {
                num[6][0] = 0;
            }
            if (num[6][0] == 0) {
                tf60.setText("0");
                a[6][0] = 0;
                tf60.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf60.setText(Integer.toString(num[6][0]));
                a[6][0] = num[6][0];
                tf60.setStyle("-fx-text-inner-color: red ;");
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
    private void tf61Action(MouseEvent event) throws Exception {
        if (tf61.isDisable() == false) {
            num[6][1]++;
            if (num[6][1] > 9) {
                num[6][1] = 0;
            }
            if (num[6][1] == 0) {
                tf61.setText("0");
                a[6][1] = 0;
                tf61.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf61.setText(Integer.toString(num[6][1]));
                a[6][1] = num[6][1];
                tf61.setStyle("-fx-text-inner-color: red ;");
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
    private void tf62Action(MouseEvent event) throws Exception {
        if (tf62.isDisable() == false) {
            num[6][2]++;
            if (num[6][2] > 9) {
                num[6][2] = 0;
            }
            if (num[6][2] == 0) {
                tf62.setText("0");
                a[6][2] = 0;
                tf62.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf62.setText(Integer.toString(num[6][2]));
                a[6][2] = num[6][2];
                tf62.setStyle("-fx-text-inner-color: red ;");
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
    private void tf63Action(MouseEvent event) throws Exception {
        if (tf63.isDisable() == false) {
            num[6][3]++;
            if (num[6][3] > 9) {
                num[6][3] = 0;
            }
            if (num[6][3] == 0) {
                tf63.setText("0");
                a[6][3] = 0;
                tf63.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf63.setText(Integer.toString(num[6][3]));
                a[6][3] = num[6][3];
                tf63.setStyle("-fx-text-inner-color: red ;");
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
    private void tf64Action(MouseEvent event) throws Exception {
        if (tf64.isDisable() == false) {
            num[6][4]++;
            if (num[6][4] > 9) {
                num[6][4] = 0;
            }
            if (num[6][4] == 0) {
                tf64.setText("0");
                a[6][4] = 0;
                tf64.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf64.setText(Integer.toString(num[6][4]));
                a[6][4] = num[6][4];
                tf64.setStyle("-fx-text-inner-color: red ;");
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
    private void tf65Action(MouseEvent event) throws Exception {
        if (tf65.isDisable() == false) {
            num[6][5]++;
            if (num[6][5] > 9) {
                num[6][5] = 0;
            }
            if (num[6][5] == 0) {
                tf65.setText("0");
                a[6][5] = 0;
                tf65.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf65.setText(Integer.toString(num[6][5]));
                a[6][5] = num[6][5];
                tf65.setStyle("-fx-text-inner-color: red ;");
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
    private void tf66Action(MouseEvent event) throws Exception {
        if (tf66.isDisable() == false) {
            num[6][6]++;
            if (num[6][6] > 9) {
                num[6][6] = 0;
            }
            if (num[6][6] == 0) {
                tf66.setText("0");
                a[6][6] = 0;
                tf66.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf66.setText(Integer.toString(num[6][6]));
                a[6][6] = num[6][6];
                tf66.setStyle("-fx-text-inner-color: red ;");
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
    private void tf67Action(MouseEvent event) throws Exception {
        if (tf67.isDisable() == false) {
            num[6][7]++;
            if (num[6][7] > 9) {
                num[6][7] = 0;
            }
            if (num[6][7] == 0) {
                tf67.setText("0");
                a[6][7] = 0;
                tf67.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf67.setText(Integer.toString(num[6][7]));
                a[6][7] = num[6][7];
                tf67.setStyle("-fx-text-inner-color: red ;");
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
    private void tf68Action(MouseEvent event) throws Exception {
        if (tf68.isDisable() == false) {
            num[6][8]++;
            if (num[6][8] > 9) {
                num[6][8] = 0;
            }
            if (num[6][8] == 0) {
                tf68.setText("0");
                a[6][8] = 0;
                tf68.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf68.setText(Integer.toString(num[6][8]));
                a[6][8] = num[6][8];
                tf68.setStyle("-fx-text-inner-color: red ;");
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
    private void tf70Action(MouseEvent event) throws Exception {
        if (tf70.isDisable() == false) {
            num[7][0]++;
            if (num[7][0] > 9) {
                num[7][0] = 0;
            }
            if (num[7][0] == 0) {
                tf70.setText("0");
                a[7][0] = 0;
                tf70.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf70.setText(Integer.toString(num[7][0]));
                a[7][0] = num[7][0];
                tf70.setStyle("-fx-text-inner-color: red ;");
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
    private void tf71Action(MouseEvent event) throws Exception {
        if (tf71.isDisable() == false) {
            num[7][1]++;
            if (num[7][1] > 9) {
                num[7][1] = 0;
            }
            if (num[7][1] == 0) {
                tf71.setText("0");
                a[7][1] = 0;
                tf71.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf71.setText(Integer.toString(num[7][1]));
                a[7][1] = num[7][1];
                tf71.setStyle("-fx-text-inner-color: red ;");
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
    private void tf72Action(MouseEvent event) throws Exception {
        if (tf72.isDisable() == false) {
            num[7][2]++;
            if (num[7][2] > 9) {
                num[7][2] = 0;
            }
            if (num[7][2] == 0) {
                tf72.setText("0");
                a[7][2] = 0;
                tf72.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf72.setText(Integer.toString(num[7][2]));
                a[7][2] = num[7][2];
                tf72.setStyle("-fx-text-inner-color: red ;");
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
    private void tf73Action(MouseEvent event) throws Exception {
        if (tf73.isDisable() == false) {
            num[7][3]++;
            if (num[7][3] > 9) {
                num[7][3] = 0;
            }
            if (num[7][3] == 0) {
                tf73.setText("0");
                a[7][3] = 0;
                tf73.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf73.setText(Integer.toString(num[7][3]));
                a[7][3] = num[7][3];
                tf73.setStyle("-fx-text-inner-color: red ;");
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
    private void tf74Action(MouseEvent event) throws Exception {
        if (tf74.isDisable() == false) {
            num[7][4]++;
            if (num[7][4] > 9) {
                num[7][4] = 0;
            }
            if (num[7][4] == 0) {
                tf74.setText("0");
                a[7][4] = 0;
                tf74.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf74.setText(Integer.toString(num[7][4]));
                a[7][4] = num[7][4];
                tf74.setStyle("-fx-text-inner-color: red ;");
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
    private void tf75Action(MouseEvent event) throws Exception {
        if (tf75.isDisable() == false) {
            num[7][5]++;
            if (num[7][5] > 9) {
                num[7][5] = 0;
            }
            if (num[7][5] == 0) {
                tf75.setText("0");
                a[7][5] = 0;
                tf75.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf75.setText(Integer.toString(num[7][5]));
                a[7][5] = num[7][5];
                tf75.setStyle("-fx-text-inner-color: red ;");
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
    private void tf76Action(MouseEvent event) throws Exception {
        if (tf76.isDisable() == false) {
            num[7][6]++;
            if (num[7][6] > 9) {
                num[7][6] = 0;
            }
            if (num[7][6] == 0) {
                tf76.setText("0");
                a[7][6] = 0;
                tf76.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf76.setText(Integer.toString(num[7][6]));
                a[7][6] = num[7][6];
                tf76.setStyle("-fx-text-inner-color: red ;");
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
    private void tf77Action(MouseEvent event) throws Exception {
        if (tf77.isDisable() == false) {
            num[7][7]++;
            if (num[7][7] > 9) {
                num[7][7] = 0;
            }
            if (num[7][7] == 0) {
                tf77.setText("0");
                a[7][7] = 0;
                tf77.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf77.setText(Integer.toString(num[7][7]));
                a[7][7] = num[7][7];
                tf77.setStyle("-fx-text-inner-color: red ;");
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
    private void tf78Action(MouseEvent event) throws Exception {
        if (tf78.isDisable() == false) {
            num[7][8]++;
            if (num[7][8] > 9) {
                num[7][8] = 0;
            }
            if (num[7][8] == 0) {
                tf78.setText("0");
                a[7][8] = 0;
                tf78.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf78.setText(Integer.toString(num[7][8]));
                a[7][8] = num[7][8];
                tf78.setStyle("-fx-text-inner-color: red ;");
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
    private void tf80Action(MouseEvent event) throws Exception {
        if (tf80.isDisable() == false) {
            num[8][0]++;
            if (num[8][0] > 9) {
                num[8][0] = 0;
            }
            if (num[8][0] == 0) {
                tf80.setText("0");
                a[8][0] = 0;
                tf80.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf80.setText(Integer.toString(num[8][0]));
                a[8][0] = num[8][0];
                tf80.setStyle("-fx-text-inner-color: red ;");
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
    private void tf81Action(MouseEvent event) throws Exception {
        if (tf81.isDisable() == false) {
            num[8][1]++;
            if (num[8][1] > 9) {
                num[8][1] = 0;
            }
            if (num[8][1] == 0) {
                tf81.setText("0");
                a[8][1] = 0;
                tf81.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf81.setText(Integer.toString(num[8][1]));
                a[8][1] = num[8][1];
                tf81.setStyle("-fx-text-inner-color: red ;");
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
    private void tf82Action(MouseEvent event) throws Exception {
        if (tf82.isDisable() == false) {
            num[8][2]++;
            if (num[8][2] > 9) {
                num[8][2] = 0;
            }
            if (num[8][2] == 0) {
                tf82.setText("0");
                a[8][2] = 0;
                tf82.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf82.setText(Integer.toString(num[8][2]));
                a[8][2] = num[8][2];
                tf82.setStyle("-fx-text-inner-color: red ;");
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
    private void tf83Action(MouseEvent event) throws Exception {
        if (tf83.isDisable() == false) {
            num[8][3]++;
            if (num[8][3] > 9) {
                num[8][3] = 0;
            }
            if (num[8][3] == 0) {
                tf83.setText("0");
                a[8][3] = 0;
                tf83.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf83.setText(Integer.toString(num[8][3]));
                a[8][3] = num[8][3];
                tf83.setStyle("-fx-text-inner-color: red ;");
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
    private void tf84Action(MouseEvent event) throws Exception {
        if (tf84.isDisable() == false) {
            num[8][4]++;
            if (num[8][4] > 9) {
                num[8][4] = 0;
            }
            if (num[8][4] == 0) {
                tf84.setText("0");
                a[8][4] = 0;
                tf84.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf84.setText(Integer.toString(num[8][4]));
                a[8][4] = num[8][4];
                tf84.setStyle("-fx-text-inner-color: red ;");
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
    private void tf85Action(MouseEvent event) throws Exception {
        if (tf85.isDisable() == false) {
            num[8][5]++;
            if (num[8][5] > 9) {
                num[8][5] = 0;
            }
            if (num[8][5] == 0) {
                tf85.setText("0");
                a[8][5] = 0;
                tf85.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf85.setText(Integer.toString(num[8][5]));
                a[8][5] = num[8][5];
                tf85.setStyle("-fx-text-inner-color: red ;");
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
    private void tf86Action(MouseEvent event) throws Exception {
        if (tf86.isDisable() == false) {
            num[8][6]++;
            if (num[8][6] > 9) {
                num[8][6] = 0;
            }
            if (num[8][6] == 0) {
                tf86.setText("0");
                a[8][6] = 0;
                tf86.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf86.setText(Integer.toString(num[8][6]));
                a[8][6] = num[8][6];
                tf86.setStyle("-fx-text-inner-color: red ;");
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
    private void tf87Action(MouseEvent event) throws Exception {
        if (tf87.isDisable() == false) {
            num[8][7]++;
            if (num[8][7] > 9) {
                num[8][7] = 0;
            }
            if (num[8][7] == 0) {
                tf87.setText("0");
                a[8][7] = 0;
                tf87.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf87.setText(Integer.toString(num[8][7]));
                a[8][7] = num[8][7];
                tf87.setStyle("-fx-text-inner-color: red ;");
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
    private void tf88Action(MouseEvent event) throws Exception {
        if (tf88.isDisable() == false) {
            num[8][8]++;
            if (num[8][8] > 9) {
                num[8][8] = 0;
            }
            if (num[8][8] == 0) {
                tf88.setText("0");
                a[8][8] = 0;
                tf88.setStyle("-fx-text-inner-color: black ;");
            } else {
                tf88.setText(Integer.toString(num[8][8]));
                a[8][8] = num[8][8];
                tf88.setStyle("-fx-text-inner-color: red ;");
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
        tf00.setText("" + a[0][0]);
        tf00.setEditable(false);
        if (a[0][0] == result[0][0]) {
            tf00.setDisable(true);
            tf00.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf01.setText("" + a[0][1]);
        tf01.setEditable(false);
        if (a[0][1] == result[0][1]) {
            tf01.setDisable(true);
            tf01.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf02.setText("" + a[0][2]);
        tf02.setEditable(false);
        if (a[0][2] == result[0][2]) {
            tf02.setDisable(true);
            tf02.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf03.setText("" + a[0][3]);
        tf03.setEditable(false);
        if (a[0][3] == result[0][3]) {
            tf03.setDisable(true);
            tf03.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf04.setText("" + a[0][4]);
        tf04.setEditable(false);
        if (a[0][4] == result[0][4]) {
            tf04.setDisable(true);
            tf04.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf05.setText("" + a[0][5]);
        tf05.setEditable(false);
        if (a[0][5] == result[0][5]) {
            tf05.setDisable(true);
            tf05.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf06.setText("" + a[0][6]);
        tf06.setEditable(false);
        if (a[0][6] == result[0][6]) {
            tf06.setDisable(true);
            tf06.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf07.setText("" + a[0][7]);
        tf07.setEditable(false);
        if (a[0][7] == result[0][7]) {
            tf07.setDisable(true);
            tf07.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf08.setText("" + a[0][8]);
        tf08.setEditable(false);
        if (a[0][8] == result[0][8]) {
            tf08.setDisable(true);
            tf08.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf10.setText("" + a[1][0]);
        tf10.setEditable(false);
        if (a[1][0] == result[1][0]) {
            tf10.setDisable(true);
            tf10.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf11.setText("" + a[1][1]);
        tf11.setEditable(false);
        if (a[1][1] == result[1][1]) {
            tf11.setDisable(true);
            tf11.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf12.setText("" + a[1][2]);
        tf12.setEditable(false);
        if (a[1][2] == result[1][2]) {
            tf12.setDisable(true);
            tf12.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf13.setText("" + a[1][3]);
        tf13.setEditable(false);
        if (a[1][3] == result[1][3]) {
            tf13.setDisable(true);
            tf13.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf14.setText("" + a[1][4]);
        tf14.setEditable(false);
        if (a[1][4] == result[1][4]) {
            tf14.setDisable(true);
            tf14.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf15.setText("" + a[1][5]);
        tf15.setEditable(false);
        if (a[1][5] == result[1][5]) {
            tf15.setDisable(true);
            tf15.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf16.setText("" + a[1][6]);
        tf16.setEditable(false);
        if (a[1][6] == result[1][6]) {
            tf16.setDisable(true);
            tf16.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf17.setText("" + a[1][7]);
        tf17.setEditable(false);
        if (a[1][7] == result[1][7]) {
            tf17.setDisable(true);
            tf17.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf18.setText("" + a[1][8]);
        tf18.setEditable(false);
        if (a[1][8] == result[1][8]) {
            tf18.setDisable(true);
            tf18.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf20.setText("" + a[2][0]);
        tf20.setEditable(false);
        if (a[2][0] == result[2][0]) {
            tf20.setDisable(true);
            tf20.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf21.setText("" + a[2][1]);
        tf21.setEditable(false);
        if (a[2][1] == result[2][1]) {
            tf21.setDisable(true);
            tf21.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf22.setText("" + a[2][2]);
        tf22.setEditable(false);
        if (a[2][2] == result[2][2]) {
            tf22.setDisable(true);
            tf22.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf23.setText("" + a[2][3]);
        tf23.setEditable(false);
        if (a[2][3] == result[2][3]) {
            tf23.setDisable(true);
            tf23.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf24.setText("" + a[2][4]);
        tf24.setEditable(false);
        if (a[2][4] == result[2][4]) {
            tf24.setDisable(true);
            tf24.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf25.setText("" + a[2][5]);
        tf25.setEditable(false);
        if (a[2][5] == result[2][5]) {
            tf25.setDisable(true);
            tf25.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf26.setText("" + a[2][6]);
        tf26.setEditable(false);
        if (a[2][6] == result[2][6]) {
            tf26.setDisable(true);
            tf26.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf27.setText("" + a[2][7]);
        tf27.setEditable(false);
        if (a[2][7] == result[2][7]) {
            tf27.setDisable(true);
            tf27.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf28.setText("" + a[2][8]);
        tf28.setEditable(false);
        if (a[2][8] == result[2][8]) {
            tf28.setDisable(true);
            tf28.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf30.setText("" + a[3][0]);
        tf30.setEditable(false);
        if (a[3][0] == result[3][0]) {
            tf30.setDisable(true);
            tf30.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf31.setText("" + a[3][1]);
        tf31.setEditable(false);
        if (a[3][1] == result[3][1]) {
            tf31.setDisable(true);
            tf31.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf32.setText("" + a[3][2]);
        tf32.setEditable(false);
        if (a[3][2] == result[3][2]) {
            tf32.setDisable(true);
            tf32.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf33.setText("" + a[3][3]);
        tf33.setEditable(false);
        if (a[3][3] == result[3][3]) {
            tf33.setDisable(true);
            tf33.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf34.setText("" + a[3][4]);
        tf34.setEditable(false);
        if (a[3][4] == result[3][4]) {
            tf34.setDisable(true);
            tf34.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf35.setText("" + a[3][5]);
        tf35.setEditable(false);
        if (a[3][5] == result[3][5]) {
            tf35.setDisable(true);
            tf35.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf36.setText("" + a[3][6]);
        tf36.setEditable(false);
        if (a[3][6] == result[3][6]) {
            tf36.setDisable(true);
            tf36.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf37.setText("" + a[3][7]);
        tf37.setEditable(false);
        if (a[3][7] == result[3][7]) {
            tf37.setDisable(true);
            tf37.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf38.setText("" + a[3][8]);
        tf38.setEditable(false);
        if (a[3][8] == result[3][8]) {
            tf38.setDisable(true);
            tf38.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf40.setText("" + a[4][0]);
        tf40.setEditable(false);
        if (a[4][0] == result[4][0]) {
            tf40.setDisable(true);
            tf40.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf41.setText("" + a[4][1]);
        tf41.setEditable(false);
        if (a[4][1] == result[4][1]) {
            tf41.setDisable(true);
            tf41.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf42.setText("" + a[4][2]);
        tf42.setEditable(false);
        if (a[4][2] == result[4][2]) {
            tf42.setDisable(true);
            tf42.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf43.setText("" + a[4][3]);
        tf43.setEditable(false);
        if (a[4][3] == result[4][3]) {
            tf43.setDisable(true);
            tf43.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf44.setText("" + a[4][4]);
        tf44.setEditable(false);
        if (a[4][4] == result[4][4]) {
            tf44.setDisable(true);
            tf44.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf45.setText("" + a[4][5]);
        tf45.setEditable(false);
        if (a[4][5] == result[4][5]) {
            tf45.setDisable(true);
            tf45.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf46.setText("" + a[4][6]);
        tf46.setEditable(false);
        if (a[4][6] == result[4][6]) {
            tf46.setDisable(true);
            tf46.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf47.setText("" + a[4][7]);
        tf47.setEditable(false);
        if (a[4][7] == result[4][7]) {
            tf47.setDisable(true);
            tf47.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf48.setText("" + a[4][8]);
        tf48.setEditable(false);
        if (a[4][8] == result[4][8]) {
            tf48.setDisable(true);
            tf48.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf50.setText("" + a[5][0]);
        tf50.setEditable(false);
        if (a[5][0] == result[5][0]) {
            tf50.setDisable(true);
            tf50.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf51.setText("" + a[5][1]);
        tf51.setEditable(false);
        if (a[5][1] == result[5][1]) {
            tf51.setDisable(true);
            tf51.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf52.setText("" + a[5][2]);
        tf52.setEditable(false);
        if (a[5][2] == result[5][2]) {
            tf52.setDisable(true);
            tf52.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf53.setText("" + a[5][3]);
        tf53.setEditable(false);
        if (a[5][3] == result[5][3]) {
            tf53.setDisable(true);
            tf53.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf54.setText("" + a[5][4]);
        tf54.setEditable(false);
        if (a[5][4] == result[5][4]) {
            tf54.setDisable(true);
            tf54.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf55.setText("" + a[5][5]);
        tf55.setEditable(false);
        if (a[5][5] == result[5][5]) {
            tf55.setDisable(true);
            tf55.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf56.setText("" + a[5][6]);
        tf56.setEditable(false);
        if (a[5][6] == result[5][6]) {
            tf56.setDisable(true);
            tf56.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf57.setText("" + a[5][7]);
        tf57.setEditable(false);
        if (a[5][7] == result[5][7]) {
            tf57.setDisable(true);
            tf57.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf58.setText("" + a[5][8]);
        tf58.setEditable(false);
        if (a[5][8] == result[5][8]) {
            tf58.setDisable(true);
            tf58.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf60.setText("" + a[6][0]);
        tf60.setEditable(false);
        if (a[6][0] == result[6][0]) {
            tf60.setDisable(true);
            tf60.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf61.setText("" + a[6][1]);
        tf61.setEditable(false);
        if (a[6][1] == result[6][1]) {
            tf61.setDisable(true);
            tf61.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf62.setText("" + a[6][2]);
        tf62.setEditable(false);
        if (a[6][2] == result[6][2]) {
            tf62.setDisable(true);
            tf62.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf63.setText("" + a[6][3]);
        tf63.setEditable(false);
        if (a[6][3] == result[6][3]) {
            tf63.setDisable(true);
            tf63.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf64.setText("" + a[6][4]);
        tf64.setEditable(false);
        if (a[6][4] == result[6][4]) {
            tf64.setDisable(true);
            tf64.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf65.setText("" + a[6][5]);
        tf65.setEditable(false);
        if (a[6][5] == result[6][5]) {
            tf65.setDisable(true);
            tf65.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf66.setText("" + a[6][6]);
        tf66.setEditable(false);
        if (a[6][6] == result[6][6]) {
            tf66.setDisable(true);
            tf66.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf67.setText("" + a[6][7]);
        tf67.setEditable(false);
        if (a[6][7] == result[6][7]) {
            tf67.setDisable(true);
            tf67.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf68.setText("" + a[6][8]);
        tf68.setEditable(false);
        if (a[6][8] == result[6][8]) {
            tf68.setDisable(true);
            tf68.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf70.setText("" + a[7][0]);
        tf70.setEditable(false);
        if (a[7][0] == result[7][0]) {
            tf70.setDisable(true);
            tf70.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf71.setText("" + a[7][1]);
        tf71.setEditable(false);
        if (a[7][1] == result[7][1]) {
            tf71.setDisable(true);
            tf71.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf72.setText("" + a[7][2]);
        tf72.setEditable(false);
        if (a[7][2] == result[7][2]) {
            tf72.setDisable(true);
            tf72.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf73.setText("" + a[7][3]);
        tf73.setEditable(false);
        if (a[7][3] == result[7][3]) {
            tf73.setDisable(true);
            tf73.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf74.setText("" + a[7][4]);
        tf74.setEditable(false);
        if (a[7][4] == result[7][4]) {
            tf74.setDisable(true);
            tf74.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf75.setText("" + a[7][5]);
        tf75.setEditable(false);
        if (a[7][5] == result[7][5]) {
            tf75.setDisable(true);
            tf75.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf76.setText("" + a[7][6]);
        tf76.setEditable(false);
        if (a[7][6] == result[7][6]) {
            tf76.setDisable(true);
            tf76.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf77.setText("" + a[7][7]);
        tf77.setEditable(false);
        if (a[7][7] == result[7][7]) {
            tf77.setDisable(true);
            tf77.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf78.setText("" + a[7][8]);
        tf78.setEditable(false);
        if (a[7][8] == result[7][8]) {
            tf78.setDisable(true);
            tf78.setStyle("-fx-text-inner-color: blue ; ");
        }

        tf80.setText("" + a[8][0]);
        tf80.setEditable(false);
        if (a[8][0] == result[8][0]) {
            tf80.setDisable(true);
            tf80.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf81.setText("" + a[8][1]);
        tf81.setEditable(false);
        if (a[8][1] == result[8][1]) {
            tf81.setDisable(true);
            tf81.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf82.setText("" + a[8][2]);
        tf82.setEditable(false);
        if (a[8][2] == result[8][2]) {
            tf82.setDisable(true);
            tf82.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf83.setText("" + a[8][3]);
        tf83.setEditable(false);
        if (a[8][3] == result[8][3]) {
            tf83.setDisable(true);
            tf83.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf84.setText("" + a[8][4]);
        tf84.setEditable(false);
        if (a[8][4] == result[8][4]) {
            tf84.setDisable(true);
            tf84.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf85.setText("" + a[8][5]);
        tf85.setEditable(false);
        if (a[8][5] == result[8][5]) {
            tf85.setDisable(true);
            tf85.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf86.setText("" + a[8][6]);
        tf86.setEditable(false);
        if (a[8][6] == result[8][6]) {
            tf86.setDisable(true);
            tf86.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf87.setText("" + a[8][7]);
        tf87.setEditable(false);
        if (a[8][7] == result[8][7]) {
            tf87.setDisable(true);
            tf87.setStyle("-fx-text-inner-color: blue ; ");
        }
        tf88.setText("" + a[8][8]);
        tf88.setEditable(false);
        if (a[8][8] == result[8][8]) {
            tf88.setDisable(true);
            tf88.setStyle("-fx-text-inner-color: blue ; ");
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

    /**
     * Initializes the controller class.
     *
     *
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        generate_random_suduko();
        save_result();
        medium_randomly_insert_zero();
        lblname.setText("Player:" + user_name);
        gamePlan();
        startTime();

    }
}
