package com.example.adipe.adie123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    Button e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=(TextView) findViewById(R.id.textt);
        e=(Button) findViewById(R.id.button7);
        t.setText(" התוצאה הסופית היא "+getIntent().getExtras().getString("ee"));
    }

    public void HH(View view) {
        Intent b= new Intent(this,MainActivity.class);
        startActivity(b);
    }

}
