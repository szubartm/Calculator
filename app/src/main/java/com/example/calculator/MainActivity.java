package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static java.lang.Math.*;

public class MainActivity extends AppCompatActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnAdd;
    private Button btnSubstract;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnEqual;
    private Button btnPlusMinus;
    private Button btnDot;
    private Button btnSqrt;
    private Button btnClear;
    private Button btnBracket;
    private TextView tvResult;
    private TextView tvControl;

    private final char addChar = '+';
    private final char substractChar = '-';
    private final char multiplyChar = '*';
    private final char divideChar = '/';
    private final char sqrtChar = 's';
    private final char EQU= 0;
    private char choice;

    private double value1 = Double.NaN;
    private double value2;

    private boolean isFinished;


    static final private int ALERT_DIALOG_PLAIN = 1;
    static final private int ALERT_DIALOG_BUTTONS = 2;
    static final private int ALERT_DIALOG_LIST = 3;
    static final private int CUSTOM_ALERT_DIALOG = 4;

    private Button btnNewAlertDialog;
    private Button btnNewAlertDialogButton;
    private Button btnNewAlertDialogList;
    private Button btnNewCustomAlertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinished){
                    tvResult.setText(null);
                    tvControl.setText(null);
                    isFinished = false;
                }
                tvControl.setText(tvControl.getText().toString() + "9");
            }
        });

       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               execute();
               choice = addChar;
               tvResult.setText(String.valueOf(value1)+ "+");
               tvControl.setText(null);
           }
       });
        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                execute();
                choice = substractChar;
                tvResult.setText(String.valueOf(value1)+ "-");
                tvControl.setText(null);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                execute();
                choice = multiplyChar;
                tvResult.setText(String.valueOf(value1)+ "*");
                tvControl.setText(null);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                execute();
                choice = divideChar;

                tvResult.setText(String.valueOf(value1)+ "/");
                tvControl.setText(null);
            }
        });

        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = sqrtChar;
                execute();
                double result;
                result = sqrt(value1);
                tvResult.setText( String.valueOf(result));
                tvControl.setText(null);

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                execute();
                choice = EQU;
                tvResult.setText(tvResult.getText().toString() + String.valueOf(value2) + "=");
                tvControl.setText(null);
                tvControl.setText( String.valueOf(value1));
                isFinished = true;
                value1 = Double.NaN;
                value2 = Double.NaN;
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvControl.getText().length() > 0){
                    CharSequence name = tvControl.getText().toString();
                    tvControl.setText(name.subSequence(0, name.length() - 1));
                }
                else{
                    value1 = Double.NaN;
                    value2 = Double.NaN;
                    tvControl.setText(null);
                    tvResult.setText(null);
                }
            }
        });

    }

    private void initButtonsClick() {
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnNewAlertDialog:
                        showDialog(ALERT_DIALOG_PLAIN);
                        break;

                    default:
                        break;
                }
            }
        };
        btnNewAlertDialog.setOnClickListener(listener);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case ALERT_DIALOG_PLAIN:
                return createPlainAlertDialog();
            default:
                return null;

        }
    }

    private Dialog createPlainAlertDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("Autorzy");
        dialogBuilder.setMessage("Mateusz Szubart @@ Mateusz Gąsior");
        return dialogBuilder.create();
    }

    private void setupUIViews(){
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSubstract = (Button)findViewById(R.id.btnSubstract);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        btnPlusMinus = (Button)findViewById(R.id.btnPlusMinus);
        btnDot  = (Button)findViewById(R.id.btnDot);
        btnSqrt = (Button)findViewById(R.id.btnSqrt);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnBracket = (Button)findViewById(R.id.btnBracket);
        tvControl = (TextView)findViewById(R.id.tvControl);
        tvResult = (TextView)findViewById(R.id.tvResult);

        btnNewAlertDialog = (Button) findViewById(R.id.btnNewAlertDialog);

        initButtonsClick();

    }

    private void execute(){
        if(!Double.isNaN(value1)){
            value2 = Double.parseDouble(tvControl.getText().toString());

            switch(choice){
                case addChar:
                    value1 = value1 + value2;
                    break;
                case substractChar:
                    value1 = value1 - value2;
                    break;
                case multiplyChar:
                    value1 = value1 * value2;
                    break;
                case divideChar:
                    value1 = value1 / value2;
                    break;
                case sqrtChar:
                    value1 = sqrt(value1);


                case EQU:
                    break;

            }
        }
        else{
            value1 = Double.parseDouble(tvControl.getText().toString());
        }
    }
}
