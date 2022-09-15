package com.example.ui_ux_login_signup_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText ipEmail;
    private EditText ipPass;
    private TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        ipEmail = (EditText) findViewById(R.id.inputEmail);
        ipPass = (EditText) findViewById(R.id.inputPassword);
        txtSignUp = (TextView) findViewById(R.id.gotoRegiter);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ipEmail.getText().toString().length() != 0 && ipPass.getText().toString().length() != 0) {
                    if(ipEmail.getText().toString().equals("admin") && ipPass.getText().toString().equals("1234")) {
                        Toast.makeText(MainActivity.this, "Login success!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Login Fail!!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please fill out the information complete!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUp = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intentSignUp);
            }
        });

    }
}