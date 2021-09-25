package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zero, one ,two,three,four,five,sex,seven,eight,nine,dot,negOrPos,equal,plus,min,multi,div,delOne,delAll;
    TextView calc,result;
    float firstVal,secondVal;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        sex = (Button)findViewById(R.id.sex);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        dot = (Button)findViewById(R.id.dot);
        negOrPos = (Button)findViewById(R.id.negOrPos);
        equal = (Button)findViewById(R.id.equal);
        plus = (Button)findViewById(R.id.plus);
        min = (Button)findViewById(R.id.min);
        multi = (Button)findViewById(R.id.multi);
        div = (Button)findViewById(R.id.div);
        delOne = (Button)findViewById(R.id.delOne);
        delAll = (Button)findViewById(R.id.delAll);
        calc = (TextView)findViewById(R.id.calc);
        result = (TextView)findViewById(R.id.result);
    }

    public void setNegative(View view) {
        calc.setText("-"+calc.getText());
    }

    public void dot(View view) {
        calc.setText(calc.getText()+".");
    }

    public void result(View view) {

            secondVal = Float.parseFloat(calc.getText() + "");

            if (crunchifyAddition == true) {
                result.setText(firstVal + secondVal + "");
                crunchifyAddition = false;
            }

            if (mSubtract == true) {
                result.setText(firstVal - secondVal + "");
                mSubtract = false;
            }

            if (crunchifyMultiplication == true) {
                result.setText(firstVal * secondVal + "");
                crunchifyMultiplication = false;
            }

            if (crunchifyDivision == true) {
                result.setText(firstVal / secondVal + "");
                crunchifyDivision = false;
            }
    }

    public void zero(View view) {

        calc.setText(calc.getText()+"0");
    }

    public void one(View view) {
        calc.setText(calc.getText()+"1");
    }

    public void two(View view) {
        calc.setText(calc.getText()+"2");
    }

    public void three(View view) {
        calc.setText(calc.getText()+"3");
    }

    public void four(View view) {
        calc.setText(calc.getText()+"4");
    }

    public void five(View view) {
        calc.setText(calc.getText()+"5");
    }

    public void sex(View view) {
        calc.setText(calc.getText()+"6");
    }

    public void seven(View view) {
        calc.setText(calc.getText()+"7");
    }

    public void eight(View view) {
        calc.setText(calc.getText()+"8");
    }

    public void nine(View view) {
        calc.setText(calc.getText()+"9");
    }

    public void add(View view) {
        if (calc == null) {
            calc.setText("");
        } else {
            firstVal = Float.parseFloat(calc.getText() + "");
            crunchifyAddition = true;
             calc.setText(null);

        }
    }

    public void min(View view) {
        firstVal = Float.parseFloat(calc.getText() + "");
        mSubtract = true;
        calc.setText(null);
    }

    public void multi(View view) {
        firstVal = Float.parseFloat(calc.getText() + "");
        crunchifyMultiplication = true;
        calc.setText(null);
    }

    public void div(View view) {
        firstVal = Float.parseFloat(calc.getText() + "");
        crunchifyDivision = true;
        calc.setText(null);
    }

    public void delOne(View view) {

    }

    public void delAll(View view) {
        calc.setText(null);
    }
}
