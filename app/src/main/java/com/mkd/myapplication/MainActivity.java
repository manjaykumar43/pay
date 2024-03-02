package com.mkd.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mkd.payment.pay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pay.pay(this,"manjay)");
    }
}