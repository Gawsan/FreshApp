package com.gawsan.learnera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText n;
    String fname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.clickMe);
        n=findViewById(R.id.name);
        fname=n.getText().toString();

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                fname=n.getText().toString();
                Toast.makeText(MainActivity.this,fname,Toast.LENGTH_SHORT).show();


            }
        });

    }
}