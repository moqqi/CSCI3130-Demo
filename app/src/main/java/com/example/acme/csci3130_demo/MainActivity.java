package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Validator validator = new Validator();

        final TextView textOne = (TextView) findViewById(R.id.textView1);
        final EditText textTwo = (EditText) findViewById(R.id.editText1);
        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = textTwo.getText().toString();
                int check = validator.validate(password);
                if(check == 5){
                    textOne.setText("Password Is Strong.");
                } else {
                    textOne.setText("Password Not Strong.");
                }
            }
        });

    }
}
