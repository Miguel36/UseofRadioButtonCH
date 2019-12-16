package com.example.useofradiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.option1);
        radioButton2 = findViewById(R.id.option2);

    }

    public void onClick(View view) {
        validar();
    }

    private void validar() {
        if (radioButton1.isChecked())
            Toast.makeText(getApplicationContext(), "Se eligio la OPCION1", Toast.LENGTH_SHORT).show();

        if (radioButton2.isChecked())
            Toast.makeText(getApplicationContext(), "Se eligio la OPCION2", Toast.LENGTH_SHORT).show();
    }
}
