package com.pau_e.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    private TextView number;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        number = findViewById(R.id.number_text);
        counter = 0;
    }

    public void addSubNumber(View view) {
        Button btnPress = (Button) view;
        String action = btnPress.getText().toString();
        switch (action){
            case "-":
                counter--;
                break;
            case "+":
                counter++;
                break;
        }
        number.setText(String.valueOf(counter));
    }
}
