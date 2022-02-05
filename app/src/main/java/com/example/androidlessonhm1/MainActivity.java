package com.example.androidlessonhm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button task1Button = (Button) findViewById(R.id.task_1_button);
        task1Button.setOnClickListener(this);

        Button task2Button = findViewById(R.id.task_2_button);
        task2Button.setOnClickListener(this);

        Button task3Button = findViewById(R.id.task_3_button);
        task3Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent task1;
        Intent task2;
        Intent task3;

        task1 = new Intent(this, task1.class);
        task2 = new Intent(this, task2.class);
        task3 = new Intent(this, task3.class);

        switch (view.getId()){
           case R.id.task_1_button:
               startActivity(task1);
               break;

            case R.id.task_2_button:
                startActivity(task2);
                break;

            case R.id.task_3_button:
                startActivity(task3);
                break;
        }



    }
}