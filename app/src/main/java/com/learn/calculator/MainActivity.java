package com.learn.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import org.mariuszgromada.math.mxparser.*;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine, plusMinus, point, equal, add, subtract, divide, multiply, exponent, parentheses, clear;
    ImageButton backspace;
    EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button Binding

        zero = (Button) findViewById(R.id.zeroBTN);
        one = (Button) findViewById(R.id.oneBTN);
        two = (Button) findViewById(R.id.twoBTN);
        three = (Button) findViewById(R.id.threeBTN);
        four = (Button) findViewById(R.id.fourBTN);
        five = (Button) findViewById(R.id.fiveBTN);
        six = (Button) findViewById(R.id.sixBTN);
        seven = (Button) findViewById(R.id.sevenBTN);
        eight = (Button) findViewById(R.id.eightBTN);
        nine = (Button) findViewById(R.id.nineBTN);
        plusMinus = (Button) findViewById(R.id.plusMInusBTN);
        point = (Button) findViewById(R.id.pointBTN);
        equal = (Button) findViewById(R.id.equalBTN);
        add = (Button) findViewById(R.id.addBTN);
        subtract = (Button) findViewById(R.id.subtractBTN);
        multiply = (Button) findViewById(R.id.multiplyBTN);
        divide = (Button) findViewById(R.id.divideBTN);
        exponent = (Button) findViewById(R.id.exponentBTN);
        parentheses = (Button) findViewById(R.id.parenthesesBTN);
        clear = (Button) findViewById(R.id.clearBTN);

        backspace = (ImageButton) findViewById(R.id.backspaceBTN);

        display = (EditText) findViewById(R.id.input);

        // Button Clicks Binding

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zeroBTN();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneBTN();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoBTN();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeBTN();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourBTN();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiveBTN();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixBTN();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevenBTN();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eightBTN();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nineBTN();
            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plusMinusBTN();
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointBTN();
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalBTN();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addBTN();
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractBTN();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplyBTN();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divideBTN();
            }
        });

        exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exponentBTN();
            }
        });

        parentheses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parenthesesBTN();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearBTN();
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspaceBTN();
            }
        });

        // Disable Keyboard popup on EditText click
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                if (getString(R.id.input).equals(display.getText().toString())) {
                    display.setText("");
                }
            }
        });

    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int currentPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, currentPos);
        String rightStr = oldStr.substring(currentPos);

        if (getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
        }
        else{
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        }
        display.setSelection(currentPos + 1);
    }

    public void zeroBTN() {
        updateText("0");
    }

    public void oneBTN() {
        updateText("1");
    }

    public void twoBTN() {
        updateText("2");
    }

    public void threeBTN() {
        updateText("3");
    }

    public void fourBTN() {
        updateText("4");
    }

    public void fiveBTN() {
        updateText("5");
    }

    public void sixBTN() {
        updateText("6");
    }

    public void sevenBTN() {
        updateText("7");
    }

    public void eightBTN() {
        updateText("8");
    }

    public void nineBTN() {
        updateText("9");
    }

    public void plusMinusBTN() {
        updateText("-");
    }

    public void pointBTN() {
        updateText(".");
    }

    public void equalBTN() {
        String userExp = display.getText().toString();

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        display.setText(result);
        display.setSelection(result.length());
    }

    public void addBTN() {
        updateText("+");
    }

    public void subtractBTN() {
        updateText("-");
    }

    public void multiplyBTN() {
        updateText("*");
    }

    public void divideBTN() {
        updateText("/");
    }

    public void exponentBTN() {
        updateText("^");
    }

    public void parenthesesBTN() {
        int openPar = 0;
        int closedPar = 0;
        int currentPos = display.getSelectionStart();
        int textLen = display.getText().length();

        for(int i = 0; i < currentPos; i++){
            if (display.getText().toString().substring(i, i+1).equals("(")){
                openPar += 1;
            }
            if (display.getText().toString().substring(i, i+1).equals(")")){
                closedPar += 1;
            }
        }

        if (closedPar == openPar || display.getText().toString().substring(textLen - 1, textLen).equals("(")){
            updateText("(");
            display.setSelection(currentPos + 1);
        }
        else if (closedPar < openPar && !display.getText().toString().substring(textLen - 1, textLen).equals(")")){
            updateText(")");
            display.setSelection(currentPos + 1);
        }

    }

    public void clearBTN() {
        display.setText("");
    }

    public void backspaceBTN() {
        int currentPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (currentPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(currentPos - 1, currentPos, "");
            display.setText(selection);
            display.setSelection(currentPos - 1);
        }
    }


}