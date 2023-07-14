package com.example.brucemwendaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegesterActivity extends AppCompatActivity {
    EditText edUsername,edEmail,edPassword,Edconfirm;
    Button bnt;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);

        edUsername=findViewById(R.id.editTextusername);
        edPassword=findViewById(R.id.editpassword);
        edEmail=findViewById(R.id.editTextemail);
        Edconfirm=findViewById(R.id.editTextconfpassword);
        bnt=findViewById(R.id.buttonregester);
        tv=findViewById(R.id.textView3);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegesterActivity.this,LoginActivity.class));
            }
        });

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=edUsername.getText().toString();
                String email=edEmail.getText().toString();
                String password=edPassword.getText().toString();
                String confirm=Edconfirm.getText().toString();
                Database db =new Database(getApplicationContext(),"Healthercare",null, 1);
                if(username.length()==0 || email.length()==0 || password.length()==0 || confirm.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill All the details",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(password.compareTo(confirm)==0){
                        if(isValid(password)) {
                            Toast.makeText(getApplicationContext(),"Record Inserted",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegesterActivity.this, LoginActivity.class));
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Password must contain at least 8 characters, having letters,digits and special symbol",Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Password and confirm password didin't match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public static boolean isValid(String passwordbere) {
        int f1 = 0, f2 = 0, f3 = 0;
        if (passwordbere.length() < 8) {
            return false;
        } else {
            for (int p = 0; p < passwordbere.length(); p++) {
                if (Character.isLetter(passwordbere.charAt(p))) {
                    f1 = 1;
                }
            }
            for (int r = 0; r < passwordbere.length(); r++) {
                if (Character.isLetter(passwordbere.charAt(r))) {
                    f2 = 1;
                }
            }
            for (int s = 0; s < passwordbere.length(); s++) {
                if (Character.isLetter(passwordbere.charAt(s))) {
                    f3 = 1;
                }
            }
            if (f1 == 1 && f2 == 1 && f3 == 1)
                return true;
            return false;
        }
    }
}