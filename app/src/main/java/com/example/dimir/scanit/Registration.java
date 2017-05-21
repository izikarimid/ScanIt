package com.example.dimir.scanit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    EditText txtpasswordR,txtnameR,txtemail;
    TextView txtRegister;
    Button btnSignin,btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtnameR=(EditText)findViewById(R.id.txtnameR);
        txtemail=(EditText)findViewById(R.id.txtemail);
        txtpasswordR=(EditText)findViewById(R.id.txtpasswordR);

        txtRegister=(TextView) findViewById(R.id.txtRegister);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginActivity= new Intent(Registration.this,Login.class);
                startActivity(LoginActivity);
            }
        });

    }

}
