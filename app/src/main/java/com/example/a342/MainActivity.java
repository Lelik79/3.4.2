package com.example.a342;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner mMarginsSpinner;

    @Override
    public void onCreate(Bundle savedInstanceState)     {

        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);

        mMarginsSpinner = findViewById(R.id.marginsSpinner);
    }

    @Override
    public void onClick(View v)     {

        switch (mMarginsSpinner.getSelectedItem().toString()) {
            case "Крупный":
                Utils.changeToTheme(this, Utils.THEME_Margin1);
                break;
            case "Средний":
                Utils.changeToTheme(this, Utils.THEME_Margin3);
                break;
            case "Мелкий":
                Utils.changeToTheme(this, Utils.THEME_Margin10);
                break;
        }
        Toast.makeText(MainActivity.this, mMarginsSpinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        recreate();
    }
}