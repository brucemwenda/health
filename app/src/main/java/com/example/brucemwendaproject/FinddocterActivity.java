package com.example.brucemwendaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinddocterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finddocter);

        CardView exit = findViewById(R.id.cardFDback);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FinddocterActivity.this, HomeActivity.class));
            }
        });
        CardView dietician = findViewById(R.id.cardFDDietician);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FinddocterActivity.this,DoctorDetailsActitty.class);
                it.putExtra("title", "Dietician");
                startActivity(it);
            }
        });
        CardView dentist = findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FinddocterActivity.this,DoctorDetailsActitty.class);
                it.putExtra("title", "Dietician");
                startActivity(it);
            }
        });
        CardView cardiologists = findViewById(R.id.cardFDCardiologists);
        cardiologists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FinddocterActivity.this,DoctorDetailsActitty.class);
                it.putExtra("title", "Dietician");
                startActivity(it);
            }
        });
    }
}








