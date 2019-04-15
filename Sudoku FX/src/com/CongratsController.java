/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.FirstStage.flag;
import static com.FirstStage.stage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author remon
 */
public class CongratsController extends FirstStage implements Initializable {

    @FXML
    private Button btnQuit;
    @FXML
    private Button btnBoard;
    @FXML
    private Button btnPlayAgain;
    @FXML
    private Button btnPrevious;

    @FXML
    private void btnBoardAction(ActionEvent event) throws Exception{
        root = FXMLLoader.load(getClass().getResource("/com/ScoreBoard.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();
    }           
    @FXML
    private void btnPreviousAction(ActionEvent event) throws Exception {

        root = FXMLLoader.load(getClass().getResource("/com/Menu.fxml"));
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Sudoku");

        stage.show();

    }

    @FXML
    private void btnPlayAgainAction(ActionEvent event) throws Exception {
        switch (flag) {
            case 1:
                root = FXMLLoader.load(getClass().getResource("/com/Easy.fxml"));
                break;
            case 2:
                root = FXMLLoader.load(getClass().getResource("/com/Medium.fxml"));
                break;
            case 3:
                root = FXMLLoader.load(getClass().getResource("/com/Hard.fxml"));
                break;
            default:
                break;
        }
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
       
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename.txt", true));
            String name = String.format("%-15s", user_name);
            out.write(name + "  ");
            switch (flag) {
                case 1:
                    out.write("Easy    ");
                    break;
                case 2:
                    out.write("Medium  ");
                    break;
                case 3:
                    out.write("Hard    ");
                    break;
                default:
                    break;
            }
            out.close();
            out = new BufferedWriter(new FileWriter("filename.txt", true));
            out.write(required_time+"    ");
            out.newLine();
            out.flush();
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
            String str;
            leaderboard = "";
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
