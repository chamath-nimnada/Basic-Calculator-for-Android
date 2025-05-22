package com.example.calculatorforandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final char ACTION_CLEAR = 'C';
    private static final char ACTION_DELETE = 'D';
    private static final char ACTION_PERCENT = '%';
    private static final char ACTION_DIVIDE = '/';
    private static final char ACTION_MULTIPLY = 'X';
    private static final char ACTION_SUBTRACT = '-';
    private static final char ACTION_ADD = '+';
    private static final char ACTION_EQUAL = '=';
    private static final char ACTION_DOT = '.';

    private char currentSymbol;

    private double firstNumber = Double.NaN;
    private double secondNumber;
    private TextView inputDisplay, outputDisplay;
    private DecimalFormat decimalFormat;
    private MaterialButton one, two, three, four, five, six, seven, eight, nine, zero, add, delete, clear, dot, divide, substract, multiply, percent, equal;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        decimalFormat = new DecimalFormat("#.#######");

        inputDisplay = findViewById(R.id.input);
        outputDisplay = findViewById(R.id.output);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);

        add = findViewById(R.id.add);
        delete = findViewById(R.id.delete);
        clear = findViewById(R.id.clear);
        dot = findViewById(R.id.dot);
        divide = findViewById(R.id.divide);
        substract = findViewById(R.id.substract);
        multiply = findViewById(R.id.multiply);
        percent = findViewById(R.id.percent);
        equal = findViewById(R.id.equal);
    }
    private void allCalculations(){

    }
}