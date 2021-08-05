package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText studentNumber = findViewById(R.id.studentNumber);
        Button ok = findViewById(R.id.btn_next);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Second.class);
                intent.putExtra("name",""+name.getText());
                intent.putExtra("studentNumber",""+studentNumber.getText());
                startActivity(intent);
            }
        });

    }
}