package com.example.studportal;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.studportal.R;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String email = getIntent().getStringExtra("USER_EMAIL");
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);

        if (welcomeTextView != null && email != null && !email.isEmpty()) {
            // Step 1: kuhaon o ibulag ang parte before '@'
            String username = email.split("@")[0];

            // Step 2: kuhaon lang first name  '.'
            String firstName = username.split("\\.")[0];

            // Step 3: e display ang tama na text without changing the uppercase and lowercase letters
            welcomeTextView.setText("Welcome, " + firstName + "!");
        }
    }
}