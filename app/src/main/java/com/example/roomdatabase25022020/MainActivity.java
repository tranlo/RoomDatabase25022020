package com.example.roomdatabase25022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mText;
    Button mButton;
    MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        mButton = findViewById(R.id.buttonsetText);
        mText = findViewById(R.id.textview);

        myViewModel.getValueText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mText.setText(s);
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.setValueText("Button set text");
            }
        });
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
}
