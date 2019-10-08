package com.example.call_recorder_for_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TermsActivity extends AppCompatActivity {

    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        mTextView = (TextView) findViewById(R.id.txtTerms2);

        try {
            mTextView.setText(MainActivity.getDataFromRawFiles(R.raw.terms));
        } catch (IOException e) {

        }
    }

}
