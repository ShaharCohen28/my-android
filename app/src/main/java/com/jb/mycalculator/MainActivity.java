package com.jb.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView phoneNumber;
    private RelativeLayout del, dial;
    private boolean isDialing=false;
    private ImageView dialImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPointer();
    }

    private void setPointer() {
        phoneNumber = findViewById(R.id.result);
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
        dial = findViewById(R.id.dial);
        del=findViewById(R.id.del);
        dialImage=findViewById(R.id.dialImage);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.num1:
                phoneNumber.setText(phoneNumber.getText().toString().concat("1"));
                break;
            case R.id.num2:
                phoneNumber.setText(phoneNumber.getText().toString().concat("2"));
                break;
            case R.id.num3:
                phoneNumber.setText(phoneNumber.getText().toString().concat("3"));
                break;
            case R.id.num4:
                phoneNumber.setText(phoneNumber.getText().toString().concat("4"));
                break;
            case R.id.num5:
                phoneNumber.setText(phoneNumber.getText().toString().concat("5"));
                break;
            case R.id.num6:
                phoneNumber.setText(phoneNumber.getText().toString().concat("6"));
                break;
            case R.id.num7:
                phoneNumber.setText(phoneNumber.getText().toString().concat("7"));
                break;
            case R.id.num8:
                phoneNumber.setText(phoneNumber.getText().toString().concat("8"));
                break;
            case R.id.num9:
                phoneNumber.setText(phoneNumber.getText().toString().concat("9"));
                break;
            case R.id.num0:
                phoneNumber.setText(phoneNumber.getText().toString().concat("0"));
                break;
            case R.id.del:
                phoneNumber.setText(phoneNumber.getText().toString()
                        .substring(0,phoneNumber.getText().toString().length()-1));
                break;
            case R.id.dial:
                isDialing=!isDialing;
                if(isDialing) {
                    Toast.makeText(this, "Dialing: " + phoneNumber.getText().toString(), Toast.LENGTH_SHORT).show();
                    dialImage.setImageResource(R.drawable.hangup);
                }else{
                    dialImage.setImageResource(R.drawable.call);
                    phoneNumber.setText("");
                }

        }

    }

}