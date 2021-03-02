package com.example.practical2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal, btn_dot, btn_clear;
    TextView ans, input;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision, Equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.num_zero);
        btn_1 = findViewById(R.id.num_one);
        btn_2 = findViewById(R.id.num_two);
        btn_3 = findViewById(R.id.num_three);
        btn_4 = findViewById(R.id.num_four);
        btn_5 = findViewById(R.id.num_five);
        btn_6 = findViewById(R.id.num_six);
        btn_7 = findViewById(R.id.num_seven);
        btn_8 = findViewById(R.id.num_eight);
        btn_9 = findViewById(R.id.num_nine);
        btn_Add = findViewById(R.id.op_add);
        btn_Div = findViewById(R.id.op_div);
        btn_Sub = findViewById(R.id.op_sub);
        btn_Mul = findViewById(R.id.op_mul);
        btn_equal = findViewById(R.id.op_equal);
        btn_dot = findViewById(R.id.num_dot);
        btn_clear = findViewById(R.id.op_clear);
        ans = findViewById(R.id.Output);
        input = findViewById(R.id.Intput);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "0");
                input.setText(input.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "1");
                input.setText(input.getText() + "1");

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "2");
                input.setText(input.getText() + "2");

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "3");
                input.setText(input.getText() + "3");

            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "4");
                input.setText(input.getText() + "4");

            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "5");
                input.setText(input.getText() + "5");

            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "6");
                input.setText(input.getText() + "6");

            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "7");
                input.setText(input.getText() + "7");

            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "8");
                input.setText(input.getText() + "8");

            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + "9");
                input.setText(input.getText() + "9");

            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {

                    input.setText(ans.getText() + "");
                    Equal = false;
                }
                ans.setText(ans.getText() + ".");
                input.setText(input.getText() + ".");

            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ans == null) {
                    ans.setText("");
                } else {
                    Value1 = Float.parseFloat(ans.getText() + "");
                    input.setText(input.getText() + "+");
                    mAddition = true;
                    ans.setText(null);
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ans.getText() + "");
                input.setText(input.getText() + "-");
                mSubtract = true;
                ans.setText(null);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ans.getText() + "");
                input.setText(input.getText() + "×");
                mMultiplication = true;
                ans.setText(null);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ans.getText() + "");
                input.setText(input.getText() + "÷");
                mDivision = true;
                ans.setText(null);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equal = true;
                Value2 = Float.parseFloat(ans.getText() + "");

                if (mAddition == true) {

                    ans.setText(Value1 + Value2 + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    ans.setText(Value1 - Value2 + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    ans.setText(Value1 * Value2 + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    ans.setText(Value1 / Value2 + "");
                    mDivision = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equal = true;
                ans.setText("");
                input.setText("");
            }
        });
    }

}