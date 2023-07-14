package com.example.brucemwendaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoctorDetailsActitty extends AppCompatActivity {
    TextView tv;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details_actitty);

        tv = findViewById(R.id.textViewDDTittle);
        btn = findViewById(R.id.buttonDDBack);

         Intent it = getIntent();
         String title = it.getStringExtra("title");
         tv.setText(title);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(DoctorDetailsActitty.this,FinddocterActivity.class));
             }
         });
    }
}