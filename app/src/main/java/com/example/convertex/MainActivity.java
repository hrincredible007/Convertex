package com.example.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView resUlt;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonMultiply, buttonDivide, buttonAdd, buttonEqual,
            button17,buttonSubtract,buttonZero,buttonDecimal,buttonPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





            editText = findViewById(R.id.editText);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDecimal=findViewById(R.id.buttonDecimal);

        buttonZero=findViewById(R.id.buttonZero);
        buttonPower=findViewById(R.id.buttonPower);
        button17 = findViewById(R.id.button17);
        resUlt = findViewById(R.id.resUlt);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "/");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "9");
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "*");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "+");
            }
        });
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(MessageFormat.format("{0}^", editText.getText().toString()));
            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() +".");
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() +"0");
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "-");
            }
        });

        final String p=editText.getText().toString();
        final int len=p.length();
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String p=editText.getText().toString();
                final int len=p.length();


                if(p.contains("^")){
                    int index = p.indexOf("^");
                    double fst = Double.parseDouble(p.substring(0, index));
                    double lst = Double.parseDouble(p.substring(index + 1, len));
                    resUlt.setText("" + Math.pow(fst , lst));
                    editText.setText(" ");
                }
                if(p.contains("+")) {
                    int index = p.indexOf("+");
                    double fst = Double.parseDouble(p.substring(0, index));
                    double lst = Double.parseDouble(p.substring(index + 1, len));
                    resUlt.setText("" + (fst + lst));
                    editText.setText(" ");
                }
                if(p.contains("*")) {
                    int index = p.indexOf('*');
                    double fst = Double.parseDouble(p.substring(0, index));
                    double lst = Double.parseDouble(p.substring(index + 1, len));
                    resUlt.setText("" + (fst * lst));
                    editText.setText(" ");
                }
                if(p.contains("/")) {
                    int index = p.indexOf("/");
                    double fst = Double.parseDouble(p.substring(0, index));
                    double lst = Double.parseDouble(p.substring(index + 1, len));
                    resUlt.setText(" " + (fst / lst));
                    editText.setText(" ");
                }
                if(p.contains("-")) {
                    int index = p.indexOf("-");
                    double fst = Double.parseDouble(p.substring(0, index));
                    double lst = Double.parseDouble(p.substring(index + 1, len));
                    resUlt.setText("" + (fst - lst));
                    editText.setText(" ");

                }


                //if(p.contains("//")||p.contains("**")||p.contains("++")||p.contains("--")||p.contains("..")||p.contains("^^")||p.contains("+-")||p.contains("-+")||p.contains("//")||p.contains("//"))

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
}


