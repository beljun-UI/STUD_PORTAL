package com.example.studportal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.studportal.R;
import com.example.studportal.SecondActivity;
import com.example.studportal.SignUpActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button superButton;
    private TextView signUpButton;
    private TextView forgotPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // layout views
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        superButton = findViewById(R.id.superButton);
        signUpButton = findViewById(R.id.signUpButton);
        forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);

        // Function number 1 ni sa Login Button Action (superButton)
        superButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Mopadung siya adto sa SecondActivity (Dashboard / Portal Home)
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("USER_EMAIL", email);
                    startActivity(intent);
                }
            }
        });

        // Function 2 para sa Sign Up Button Action
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mopadung sa SignUpActivity lisud sad  asa
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        // Optional lang ni na Function: Forgot Password Click Event
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Redirecting to password recovery...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
