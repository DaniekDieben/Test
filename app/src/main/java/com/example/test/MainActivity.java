package com.example.test;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_COLS = 10;
    private static final int NUM_ROWS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateButtons();

    }

    private void populateButtons() {
        TableLayout table = findViewById(R.id.TabelForButtons);
        Button [] [] btnTag = new Button [10][10];

        int k = 0;
        for (int i=0; i<10; i++){
            TableRow tableRow = new TableRow(this);
            System.out.println("i for looop");
            tableRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT));
            for (int j=0; j<9;j++){
                btnTag[i][j] = new Button(this).setBackground(Color.BLUE);
                btnTag[i][j].setBackground(Color.BLUE);
                System.out.println();
                k++;
                btnTag[i][j].setId(k);
                tableRow.addView(btnTag[i][j]);

//        for (int row =0; row<NUM_ROWS; row++){
//            TableRow tableRow = new TableRow(this);
//            table.addView(tableRow);
//            for (int col=0; col<NUM_COLS; col++){
//                Button button = new Button(this);
//                tableRow.addView(button);
            }
            table.addView(tableRow);
        }


    }
}
