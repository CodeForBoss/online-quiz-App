package com.example.examstation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class SignUpActivity extends AppCompatActivity {
     Button signUp;
     EditText name,phone,email,age,address,password;
     RadioButton male,female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUp = findViewById(R.id.signUpBTN);
        name = findViewById(R.id.nameTv);
        phone = findViewById(R.id.phoneTv);
        email = findViewById(R.id.emailTv);
        age = findViewById(R.id.ageTv);
        address = findViewById(R.id.addressTv);
        password = findViewById(R.id.passwordTv);
        male = findViewById(R.id.maleRB);
        female = findViewById(R.id.femaleRB);
    }
}