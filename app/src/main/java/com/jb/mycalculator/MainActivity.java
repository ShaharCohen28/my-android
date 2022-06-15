package com.jb.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result;
    private RelativeLayout num1, num2, num3, num4, num5,
            num6, num7, num8, num9, num0,
            div, multiply, plus, minus, clear, dot;
    private LinearLayout equals;
    private char opr = ' ';
    private double totalSum = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPointer();
    }

    private void setPointer() {
        result = findViewById(R.id.result);
//        num1 = findViewById(R.id.num1);
//        num2 = findViewById(R.id.num2);
//        num3 = findViewById(R.id.num3);
//        num4 = findViewById(R.id.num4);
//        num5 = findViewById(R.id.num5);
//        num6 = findViewById(R.id.num6);
//        num7 = findViewById(R.id.num7);
//        num8 = findViewById(R.id.num8);
//        num9 = findViewById(R.id.num9);
//        num0 = findViewById(R.id.num0);
        div = findViewById(R.id.div);
        multiply = findViewById(R.id.multiply);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        equals = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
    }

    @Override
    public void onClick(View view) {
        double myNum = Double.parseDouble(result.getText().toString());
        switch (view.getId()) {
            case R.id.num1:
                myNum = myNum * 10 + 1;
                break;
            case R.id.num2:
                myNum = myNum * 10 + 2;
                break;
            case R.id.num3:
                myNum = myNum * 10 + 3;
                break;
            case R.id.num4:
                myNum = myNum * 10 + 4;
                break;
            case R.id.num5:
                myNum = myNum * 10 + 5;
                break;
            case R.id.num6:
                myNum = myNum * 10 + 6;
                break;
            case R.id.num7:
                myNum = myNum * 10 + 7;
                break;
            case R.id.num8:
                myNum = myNum * 10 + 8;
                break;
            case R.id.num9:
                myNum = myNum * 10 + 9;
                break;
            case R.id.num0:
                myNum = myNum * 10;
                break;
            case R.id.div:
                if (opr == ' ') {
                    totalSum = myNum;
                    opr = '/';
                    myNum = 0;
                }
                break;
            case R.id.multiply:
                if (opr == ' ') {
                    totalSum = myNum;
                    opr = '*';
                    myNum = 0;
                }
                break;
            case R.id.plus:
                if (opr == ' ') {
                    totalSum = myNum;
                    opr = '+';
                    myNum = 0;
                }
                break;
            case R.id.minus:
                if (opr == ' ') {
                    totalSum = myNum;
                    opr = '-';
                    myNum = 0;
                }
                break;
            case R.id.equals:
                switch (opr) {
                    case '+':
                        myNum += totalSum;
                        break;
                    case '-':
                        myNum=totalSum-myNum;
                        break;
                    case '*':
                        myNum *= totalSum;
                        break;
                    case '/':
                        if (myNum != 0) {
                            myNum=totalSum/myNum;
                        }else{
                            Toast.makeText(this, "Can't divide by 0", Toast.LENGTH_LONG).show();
                            return;
                        }
                        break;
                    default:
                }
                opr = ' ';
                break;
            case R.id.dot:

                break;
            case R.id.clear:
                myNum = 0;
                totalSum = 0;
                opr = ' ';
                break;

        }

        result.setText(String.valueOf(myNum));
    }

}