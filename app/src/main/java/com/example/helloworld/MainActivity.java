package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void onBtnClick(View view) {

        TextView firstNameText = findViewById(R.id.FirstNameView);
        TextView SecondNameText = findViewById(R.id.SecondNameView);
        TextView emailView = findViewById(R.id.emailView);
        EditText edtTxtName = findViewById(R.id.editTxtName);
        EditText editTxtLastName = findViewById(R.id.editTxtLastName);
        EditText editEmailText = findViewById(R.id.editTextTextEmailAddress);

        firstNameText.setText(edtTxtName.getText().toString());
        SecondNameText.setText(editTxtLastName.getText().toString());
        emailView.setText(editEmailText.getText().toString());













    }

}