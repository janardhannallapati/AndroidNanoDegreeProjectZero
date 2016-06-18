package com.example.janardhan.myportfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view){
        Button clickedButton=(Button)view;
        Toast.makeText(getApplicationContext(),clickedButton.getText(),Toast.LENGTH_SHORT).show();
    }
}
