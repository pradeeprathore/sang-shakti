package com.example.rajput.rajput.Activity.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rajput.rajput.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView registerActivity;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerActivity= (TextView) findViewById(R.id.register);
        login= (Button) findViewById(R.id.loginhome);
        login.setOnClickListener(this);
        registerActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == registerActivity) {
            startActivity(new Intent(MainActivity.this,RegisterActivity.class));
        }
        if (v == login) {
            startActivity(new Intent(MainActivity.this,NavigationActivity.class));
        }
    }
}
