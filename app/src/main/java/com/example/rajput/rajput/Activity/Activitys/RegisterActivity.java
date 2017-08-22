package com.example.rajput.rajput.Activity.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rajput.rajput.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    TextView loginActivity;
    Button singin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        loginActivity= (TextView) findViewById(R.id.loginActivity);
        singin= (Button) findViewById(R.id.singin);
        singin.setOnClickListener(this);
        loginActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==loginActivity){
            startActivity(new Intent(RegisterActivity.this,MainActivity.class));
        }
        if(v==singin){
            startActivity(new Intent(RegisterActivity.this,NavigationActivity.class));
        }
    }
}
