package com.example.htw;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button button;
    private int a, b, c, d, e, f, g, h, i ,j, k ,l , m, n, o, p, q, r, s, t, u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.textview);
        button = (Button) findViewById(R.id.button);






        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                if(str.length() != 21){
                    textView.setText("False");
                }else{
                    //textView.setText(str.charAt(0));

                    a = (int)str.charAt(0);
                    b = (int)str.charAt(1);
                    c = (int)str.charAt(2);
                    d = (int)str.charAt(3);
                    e = (int)str.charAt(4);
                    f = (int)str.charAt(5);
                    g = (int)str.charAt(6);
                    h = (int)str.charAt(7);
                    i = (int)str.charAt(8);
                    j = (int)str.charAt(9);
                    k = (int)str.charAt(10);
                    l = (int)str.charAt(11);
                    m = (int)str.charAt(12);
                    n = (int)str.charAt(13);
                    o = (int)str.charAt(14);
                    p = (int)str.charAt(15);
                    q = (int)str.charAt(16);
                    r = (int)str.charAt(17);
                    s = (int)str.charAt(18);
                    t = (int)str.charAt(19);
                    u = (int)str.charAt(20);

                    if((((a + b + c) - (a + e)) ^ f - g ^ h) != -125){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((h + u - t) + (d ^ k) + k + l) != 314){
                        u = 0;
                        textView.setText("False");
                    }
                    if(m + n + p + q - s - t - r + i + k != 390){
                        u = 0;
                        textView.setText("False");
                    }
                    if(a + b - c + e + d - k + i - m - n != 189){
                        u = 0;
                        textView.setText("False");
                    }
                    if(a + b + c + d + e + f + g + h + i + j + k + l != 1074){
                        u = 0;
                        textView.setText("False");
                    }
                    if(m + n + o + p +q + r + s + t +u != 841){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((a + b) ^ (c + d)) != 13){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((e + f) ^ (g + h)) != 114){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((i + j) ^ (k + l)) != 79){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((m + n) ^ (o + p)) != 10){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((q + r) ^ (s + t + u)) != 81){
                        u = 0;
                        textView.setText("False");
                    }
                    if(b * c - d * f != -3015){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((a + q) ^ (d + o)) != 88){
                        u = 0;
                        textView.setText("False");
                    }
                    if(((i - j) ^ (m + n)) != 216){
                        u = 0;
                        textView.setText("False");
                    }
                    if(b * u * n - e * k * s != 988494){
                        u = 0;
                        textView.setText("False");
                    }
                    if(s * 3 - 2 != b){
                        u = 0;
                        textView.setText("False");
                    }
                    if(s + a + b + c + d + e != 465){
                        u = 0;
                        textView.setText("False");
                    }
                    if(u == 103){
                        textView.setText("True");
                    }
                }


              //  textView.setText(str);
            }
        });

    }




}