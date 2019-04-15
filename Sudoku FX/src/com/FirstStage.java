/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Random;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author remon
 */

public class FirstStage {

    public Parent root;
    public Scene scene;
    public static Stage stage; 
    public static String user_name;
    public static int a[][] = new int[9][9];
    public static int result[][] = new int[9][9];
    public static int flag;
    public static int counter;
    public static int total;
    public static String required_time;
    public static void setStage(Stage st){stage = st;}
    public Stage getStage(){return stage;}
    public static String leaderboard = "";
    public void generate() {
        int k = 1, n = 1;
        for (int i = 0; i < 9; i++) {
            k = n;
            for (int j = 0; j < 9; j++) {
                if (k <= 9) {
                    a[i][j] = k;
                    k++;
                } else {
                    k = 1;
                    a[i][j] = k;
                    k++;
                }
            }
            n = k + 3;
            if (k == 10) {
                n = 4;
            }
            if (n > 9) {
                n = (n % 9) + 1;
            }
        }
    }
    public void random_gen(int check) {
        int k1, k2, max = 2, min = 0;
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
//There are three groups.So we are using for loop three times.
            k1 = r.nextInt(max - min + 1) + min;
//This while is just to ensure k1 is not equal to k2.
            do {
                k2 = r.nextInt(max - min + 1) + min;
            } while (k1 == k2);
            max += 3;
            min += 3;
//check is global variable.
//We are calling random_gen two time from the main func.
//Once it will be called for columns and once for rows.
            if (check == 1) //calling a function to interchange the selected rows.
            {
                permutation_row(k1, k2);
            } else if (check == 0) {
                permutation_col(k1, k2);
            }
        }
    }
//For row

    public void permutation_row(int k1, int k2) {
        int temp;//k1 and k2 are two rows that we are selecting to interchange.
        for (int j = 0; j < 9; j++) {
            temp = a[k1][j];
            a[k1][j] = a[k2][j];
            a[k2][j] = temp;
        }
    }
//For column

    public void permutation_col(int k1, int k2) {
        int temp;
        for (int j = 0; j < 9; j++) {
            temp = a[j][k1];
            a[j][k1] = a[j][k2];
            a[j][k2] = temp;
        }
    }

    public void row_change(int k1, int k2) {
        int temp;
        for (int n = 1; n <= 3; n++) {
            for (int i = 0; i < 9; i++) {
                temp = a[k1][i];
                a[k1][i] = a[k2][i];
                a[k2][i] = temp;
            }
            k1++;
            k2++;
        }
    }

    public void col_change(int k1, int k2) {
        int temp;
        for (int n = 1; n <= 3; n++) {
            for (int i = 0; i < 9; i++) {
                temp = a[i][k1];
                a[i][k1] = a[i][k2];
                a[i][k2] = temp;
            }
            k1++;
            k2++;
        }
    }

    public void save_result() {
        for (int i = 0; i < 9; i++) {
            System.arraycopy(a[i], 0, result[i], 0, 9);
        }
    }

    public void generate_random_suduko() {
        int counter = 1, k1, k2;
        generate();
        random_gen(1);
        random_gen(0);
        Random rand = new Random();
        int n[] = {0, 3, 6};
        for (int i = 0; i < 2; i++) {
            k1 = n[rand.nextInt(n.length)];
            do {
                k2 = n[rand.nextInt(n.length)];
            } while (k1 == k2);
            if (counter == 1) {
                row_change(k1, k2);
            } else {
                col_change(k1, k2);
            }
            counter++;
        }
        save_result();
    }

    public void easy_randomly_insert_zero() {   //41 ta digit,bakigula 00
        //    a[0][0] = 0;  //
        a[0][1] = 0;
        a[0][2] = 0;
        a[0][3] = 0;
        a[0][4] = 0;
        //    a[0][5] = 0; //
        //    a[0][6] = 0;  //
        a[0][7] = 0;
      //  a[0][8] = 0;   //

        a[1][0] = 0;
        //    a[1][1] = 0;  //
        a[1][2] = 0;
        //    a[1][3] = 0;  //
        a[1][4] = 0;
        a[1][5] = 0;
        //    a[1][6] = 0;   //
        //    a[1][7] = 0;   //
        a[1][8] = 0;

        //    a[2][0] = 0;   //
        a[2][1] = 0;
        //    a[2][2] = 0;  //
        //    a[2][3] = 0;   //
        //    a[2][4] = 0;   //
        a[2][5] = 0;
        //    a[2][6] = 0;   //
        a[2][7] = 0;
        a[2][8] = 0;

        a[3][0] = 0;
        a[3][1] = 0;
        a[3][2] = 0;
        //    a[3][3] = 0;  //
        //    a[3][4] = 0;  //
        a[3][5] = 0;
        //    a[3][6] = 0;   //
        //    a[3][7] = 0;   //
        //    a[3][8] = 0;   //

        a[4][0] = 0;
        //    a[4][1] = 0;   //
        a[4][2] = 0;
        //    a[4][3] = 0;   //
        a[4][4] = 0;
        //   a[4][5] = 0;   //
        a[4][6] = 0;
        //    a[4][7] = 0;   //
        a[4][8] = 0;

        //    a[5][0] = 0;  //
        //    a[5][1] = 0;  //
        //    a[5][2] = 0;  //
        a[5][3] = 0;
        //    a[5][4] = 0;  //
        //    a[5][5] = 0;  //
        a[5][6] = 0;
        a[5][7] = 0;
        a[5][8] = 0;

        a[6][0] = 0;
        a[6][1] = 0;
        //    a[6][2] = 0;  //
        a[6][3] = 0;
        //    a[6][4] = 0;  //
        //    a[6][5] = 0;  //
        //    a[6][6] = 0;  //
        a[6][7] = 0;
        //    a[6][8] = 0;   //

        a[7][0] = 0;
        //    a[7][1] = 0;  //
        //    a[7][2] = 0;  //
        a[7][3] = 0;
        //    a[7][4] = 0;   //
        //    a[7][5] = 0;  //
        //    a[7][6] = 0;  //
        //    a[7][7] = 0;  //
        a[7][8] = 0;

        //    a[8][0] = 0;  //
        a[8][1] = 0;
        //    a[8][2] = 0;  //
        //    a[8][3] = 0;   //
        a[8][4] = 0;       
        a[8][5] = 0; 
        a[8][6] = 0;                       
        //    a[8][7] = 0;  //          
        a[8][8] = 0;
        print_a();
        print_result();

    }

    public void medium_randomly_insert_zero() {
        //    a[0][0] = 0;
        a[0][1] = 0;
        //    a[0][2] = 0;
        a[0][3] = 0;
        a[0][4] = 0;
        a[0][5] = 0;
        a[0][6] = 0;
        //    a[0][7] = 0;
        a[0][8] = 0;

            a[1][0] = 0;
        //    a[1][1] = 0;
        a[1][2] = 0;
        //a[1][3] = 0;
        a[1][4] = 0;
        // a[1][5] = 0;
        a[1][6] = 0;
        a[1][7] = 0;
        a[1][8] = 0;

        //    a[2][0] = 0;
        a[2][1] = 0;
        //   a[2][2] = 0;
        a[2][3] = 0;
        //    a[2][4] = 0;
        a[2][5] = 0;
        a[2][6] = 0;
        //    a[2][7] = 0;
        a[2][8] = 0;

        //    a[3][0] = 0;
        //    a[3][1] = 0;
        a[3][2] = 0;
        a[3][3] = 0;
        //    a[3][4] = 0;
        a[3][5] = 0;
        a[3][6] = 0;
        a[3][7] = 0;
        //    a[3][8] = 0;

        a[4][0] = 0;
        a[4][1] = 0;
        a[4][2] = 0;
        //    a[4][3] = 0;
        a[4][4] = 0;
        a[4][5] = 0;
        //    a[4][6] = 0;
        a[4][7] = 0;
        a[4][8] = 0;

        a[5][0] = 0;
        //    a[5][1] = 0;
        a[5][2] = 0;
        //    a[5][3] = 0;
        a[5][4] = 0;
        //    a[5][5] = 0;
        a[5][6] = 0;
        a[5][7] = 0;
        a[5][8] = 0;

        a[6][0] = 0;
        //    a[6][1] = 0;
        //    a[6][2] = 0;
        a[6][3] = 0;
        a[6][4] = 0;
        a[6][5] = 0;
        //    a[6][6] = 0;
        //    a[6][7] = 0;
        //    a[6][8] = 0;

    //    a[7][0] = 0;
        a[7][1] = 0;
        a[7][2] = 0;
        //    a[7][3] = 0;
        a[7][4] = 0;
        //    a[7][5] = 0;
        a[7][6] = 0;
        //    a[7][7] = 0;
        a[7][8] = 0;

        a[8][0] = 0;
        //    a[8][1] = 0;
        //    a[8][2] = 0;
        //    a[8][3] = 0;
        //    a[8][4] = 0;
        a[8][5] = 0;
        //    a[8][6] = 0;
        a[8][7] = 0;
        a[8][8] = 0;
        print_a();
        print_result();
    }

    public void hard_randomly_insert_zero() { //18 ta digit,baki gula 00
    //    a[0][0] = 0;
        a[0][1] = 0;
        a[0][2] = 0;
        a[0][3] = 0;
        a[0][4] = 0;
        a[0][5] = 0;
        a[0][6] = 0;
        //    a[0][7] = 0;
        a[0][8] = 0;

        a[1][0] = 0;
        a[1][1] = 0;
        a[1][2] = 0;
        a[1][3] = 0;
        a[1][4] = 0;
        //    a[1][5] = 0;
        a[1][6] = 0;
        a[1][7] = 0;
        //    a[1][8] = 0;

        a[2][0] = 0;
        a[2][1] = 0;
        a[2][2] = 0;
        //    a[2][3] = 0;
        a[2][4] = 0;
        a[2][5] = 0;
        a[2][6] = 0;
        a[2][7] = 0;
        a[2][8] = 0;

        a[3][0] = 0;
        a[3][1] = 0;
        a[3][2] = 0;
        //    a[3][3] = 0;
        a[3][4] = 0;
        a[3][5] = 0;
        //    a[3][6] = 0;
        a[3][7] = 0;
        a[3][8] = 0;

        //    a[4][0] = 0;
        a[4][1] = 0;
        //    a[4][2] = 0;
        //    a[4][3] = 0;
        a[4][4] = 0;
        a[4][5] = 0;
        a[4][6] = 0;
        a[4][7] = 0;
        a[4][8] = 0;

        a[5][0] = 0;
        a[5][1] = 0;
        //    a[5][2] = 0;
        //    a[5][3] = 0;
        a[5][4] = 0;
        a[5][5] = 0;
        a[5][6] = 0;
    //    a[5][7] = 0;
        a[5][8] = 0;

        a[6][0] = 0;
        //    a[6][1] = 0;
        a[6][2] = 0;
        a[6][3] = 0;
        a[6][4] = 0;
        a[6][5] = 0;
        //    a[6][6] = 0;
        a[6][7] = 0;
        a[6][8] = 0;

        a[7][0] = 0;
        a[7][1] = 0;
        a[7][2] = 0;
        a[7][3] = 0;
        //    a[7][4] = 0;
        a[7][5] = 0;
        a[7][6] = 0;
        //    a[7][7] = 0;
        a[7][8] = 0;

        a[8][0] = 0;
        //    a[8][1] = 0;
        a[8][2] = 0;
        //    a[8][3] = 0;
        //    a[8][4] = 0;
        a[8][5] = 0;
        a[8][6] = 0;
        a[8][7] = 0;
        a[8][8] = 0;
        print_a();
        print_result();
    }
    
    public void print_result() {
        System.out.println();
        System.out.println("The solution of the Suduko");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void print_a() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
