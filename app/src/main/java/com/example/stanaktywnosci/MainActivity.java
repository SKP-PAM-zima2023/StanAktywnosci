package com.example.stanaktywnosci;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            click++;
            TextView textView = findViewById(R.id.textView);
            EditText editText = findViewById(R.id.editText);

            textView.setText(String.format("Przycisk wciśnięrto %d razy", click));
            editText.setText(String.format("Przycisk wciśnięrto %d razy", click));
        });
    }


    // w nowszych wersjach API już nie trzeba
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("click", click);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        click = savedInstanceState.getInt("click");
    }
}