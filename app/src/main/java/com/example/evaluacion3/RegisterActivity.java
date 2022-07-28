package com.example.evaluacion3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {
    TextView textLogIn;
    MaterialButton registerButton;
    TextInputLayout inputLayoutFullName, inputLayoutNickname, inputLayoutPhoneNumber , inputLayoutPassword;
    TextInputEditText inputFullName, inputNickname, inputPhoneNumber , inputPassword;
    String textFullName, textNickname, textPhoneNumber, textPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textLogIn = findViewById(R.id.textLogIn);
        inputLayoutFullName = findViewById(R.id.register_inputLayout_fullName);
        inputLayoutNickname = findViewById(R.id.register_inputLayout_nickname);
        inputLayoutPhoneNumber = findViewById(R.id.register_inputLayout_phoneNumber);
        inputLayoutPassword = findViewById(R.id.register_inputLayout_password);
        registerButton = findViewById(R.id.register_button);
        inputFullName = findViewById(R.id.register_input_fullName);
        inputNickname = findViewById(R.id.register_input_nickname);
        inputPhoneNumber = findViewById(R.id.register_input_phoneNumber);
        inputPassword = findViewById(R.id.register_input_password);


        textLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFullName = inputFullName.getText().toString();
                textNickname = inputNickname.getText().toString().trim();
                textPhoneNumber = inputPhoneNumber.getText().toString().trim();
                textPassword = inputPassword.getText().toString().trim();

                if(TextUtils.isEmpty(textFullName) || TextUtils.isEmpty(textNickname) || TextUtils.isEmpty(textPhoneNumber) ||  TextUtils.isEmpty(textPassword) ){
                    if(TextUtils.isEmpty(textFullName)) {
                        inputLayoutFullName.setError("El campo Nombre Completo no puede estar vacio!");
                    } else {
                        inputLayoutFullName.setError(null);
                    }
                    if(TextUtils.isEmpty(textNickname)) {
                        inputLayoutNickname.setError("El campo Apodo no puede estar vacio!");
                    }
                    else {
                        inputLayoutNickname.setError(null);
                    }
                    if(TextUtils.isEmpty(textPhoneNumber)) {
                        inputLayoutPhoneNumber.setError("El campo Numero de Celular no puede estar vacio!");
                    }
                    else {
                        inputLayoutPhoneNumber.setError(null);
                    }
                    if(TextUtils.isEmpty(textPassword)) {
                        inputLayoutPassword.setError("El campo Contraseña no puede estar vacio!");
                    }
                    else {
                        inputLayoutPassword.setError(null);
                    }
                } else {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
//
            }
        });
    }
}
