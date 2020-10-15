package com.example.exercice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView compteur;
    Button b1, b2;
    int score =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compteur = findViewById(R.id.compteur);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

    }

    public void showToast(View view) {
        String msg = "Hello Toast!";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void compter(View view) {
        score++;
        compteur.setText(Integer.toString(score));

    }
}















































































