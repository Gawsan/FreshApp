package com.gawsan.learnera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebView;

public class checkSum extends AppCompatActivity {
    private WebView gaws;
    private Object view;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_sum);
        gaws.canGoBack();
    }
}