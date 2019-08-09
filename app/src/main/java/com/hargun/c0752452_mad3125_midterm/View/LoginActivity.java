package com.hargun.c0752452_mad3125_midterm.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.hargun.c0752452_mad3125_midterm.R;

public class LoginActivity extends AppCompatActivity {
  private EditText txtEmail,txtPass;
  private Button btnLogin;
  private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // getSupportActionBar().setTitle("Login");
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPass = (EditText) findViewById(R.id.txtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        mAuth = FirebaseAuth.getInstance();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));

//                        mAuth.signInWithEmailAndPassword(txtEmail.getText().toString(), txtPass.getText().toString())
//                                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
//                                    @Override
//                                    public void onComplete(@NonNull Task<AuthResult> task) {
//                                        if (task.isSuccessful()) {
//                                            // Sign in success.
//                                            Toast.makeText(LoginActivity.this, "Wokinggg", Toast.LENGTH_SHORT).show();
//                                            startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));
//                                        } else {
//                                            // If sign in fails, display a message to the user.
//                                            Toast.makeText(LoginActivity.this, "Authentication failed.",
//                                                    Toast.LENGTH_SHORT).show();
//                                        }
//
//                                    }
//                                });
                    }
                });
            }
        });
    }
}








