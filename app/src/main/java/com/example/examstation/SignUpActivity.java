package com.example.examstation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.examstation.Utilities.AllUtill;

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
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()){
                    Toast.makeText(SignUpActivity.this, "All input is correct!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean checkValidation(){
        if(!AllUtill.isName(name.getText().toString())){
            name.setError("Invalid name!");
            name.requestFocus();
            return false;
        }
        if(!AllUtill.isPhone(phone.getText().toString())){
            phone.setError("Invalid phone number!");
            phone.requestFocus();
            return false;
        }
        if(!AllUtill.isEmail(email.getText().toString())){
            email.setError("Invalid email address!");
            email.requestFocus();
            return false;
        }
        if(!AllUtill.isAge(age.getText().toString())){
            age.setError("Invalid age!");
            age.requestFocus();
            return false;
        }
        if(!AllUtill.isAddress(address.getText().toString())){
            address.setError("Invalid address!");
            address.requestFocus();
            return false;
        }
        if(!AllUtill.isPassword(password.getText().toString())){
            password.setError("Invalid password! must be greater than 4");
            password.requestFocus();
            return false;
        }
        return true;
    }
}