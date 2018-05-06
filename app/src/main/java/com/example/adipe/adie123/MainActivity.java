package com.example.adipe.adie123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double x = 0, n = 0, r=0;
    int u=0;
    Button pp, mm, hh, cc, ip, eq;
    EditText kel;
    String str, j;
    boolean e = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pp = (Button) findViewById(R.id.plus);
        mm = (Button) findViewById(R.id.minus);
        hh = (Button) findViewById(R.id.hiluk);
        cc = (Button) findViewById(R.id.cefel);
        ip = (Button) findViewById(R.id.ipus);
        eq = (Button) findViewById(R.id.equal);
        kel = (EditText) findViewById(R.id.editText);
    }


    public void hilukk(View view) {
        if ((!kel.getText().toString().equals(""))&&((!kel.getText().toString().equals("."))&&(!kel.getText().toString().equals("-"))&&(!kel.getText().toString().equals("-.")))) {
            str = kel.getText().toString();
            x = Double.parseDouble(str);
            kel.setText("");
            switch (u) {
                case 1:
                    n = n + x;
                    break;
                case 2:
                    n = n - x;
                    break;
                case 3:
                    n = n * x;
                    break;
                case 4:
                    if (x == 00)
                        Toast.makeText(this, "לא ניתן לחלק ב0", Toast.LENGTH_SHORT).show();
                    else
                        n = n / x;
                    break;
            }

        }

        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
            kel.setText("");
        }
        u = 4;
    }



    public void cefell(View view) {

        if ((!kel.getText().toString().equals("")) && ((!kel.getText().toString().equals(".")) && (!kel.getText().toString().equals("-")) && (!kel.getText().toString().equals("-.")))) {
            str = kel.getText().toString();
            x = Double.parseDouble(str);
            kel.setText("");
            switch (u) {
                case 1:
                    n = n + x;
                    break;
                case 2:
                    n = n - x;
                    break;
                case 3:
                    n = n * x;
                    break;
                case 4:
                    n = n / x;
                    break;

            }
            kel.setHint(Double.toString(n));
        } else {
            Toast.makeText(this, "הקלט לא חוקי", Toast.LENGTH_SHORT).show();
            kel.setText("");
        }

        u = 3;
    }

    public void minuss(View view) {

            if ((!kel.getText().toString().equals(""))&&((!kel.getText().toString().equals("."))&&(!kel.getText().toString().equals("-"))&&(!kel.getText().toString().equals("-.")))) {
                str = kel.getText().toString();
                x = Double.parseDouble(str);
                kel.setText("");
                switch (u) {
                    case 1:
                        n = n + x;
                        break;
                    case 2:
                        n = n - x;
                        break;
                    case 3:
                        n = n * x;
                        break;
                    case 4:
                        n = n / x;
                        break;

                }
                kel.setHint(Double.toString(n));
            }

            else{
                Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
                kel.setText("");
            }
            u = 2;
        }


    public void pluss(View view) {

        if (!(kel.getText().toString().equals("")) && !(kel.getText().toString().equals(".")) && !(kel.getText().toString().equals("-")) && !(kel.getText().toString().equals("-."))) {
            str = kel.getText().toString();
            x = Double.parseDouble(str);
            kel.setText("");
            n = n + x;
            kel.setHint(Double.toString(n));
        }

        else{
            Toast.makeText(this, "הקלט שהוזן לא תקין", Toast.LENGTH_LONG).show();
            kel.setText("");
        }

        u = 1;
    }






    public void ipuss(View view) {
        kel.setText("");
        kel.setHint("0");
        u=1;
        x=0;
        n=0;
    }

    public void equall(View view) {

            str=kel.getText().toString();
            x=Double.parseDouble(str);
            switch ((int) u) {
                case 1:
                    n = n + x; break;
                case 2:
                    n = n - x; break;
                case 3:
                    n = n * x; break;
                case 4:
                    n = n / x; break;
                default: kel.setText("error");
            }
            str= Double.toString(n);
            kel.setText(str);
        }




    public void credits(View view) {
        Intent b= new Intent(this,Main2Activity.class);
        if (n==0){
            str=Double.toString(r);
            b.putExtra("ee", str);
        }
        else {
            str=Double.toString(n);
            b.putExtra("ee", str);
        }
        startActivity(b);

    }
}
