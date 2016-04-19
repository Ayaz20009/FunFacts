package com.example.ayazshah.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFact extends AppCompatActivity {
    public static final String TAG = FunFact.class.getSimpleName();
    private FunFactsBook mFactsBook = new FunFactsBook();
    private Colors mColor = new Colors();
    // Declare our view variables
    private TextView mFactTView;
    private Button mShowFactButton;
    private RelativeLayout mBackgroundColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);
        // Assigning the View from the layout file to the corresponding variables

        mFactTView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mBackgroundColor = (RelativeLayout) findViewById(R.id.FunFactBack);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactsBook.getFact();
                int color = mColor.getColors();
                mFactTView.setText(fact);
                mBackgroundColor.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };

        mShowFactButton.setOnClickListener(listener);
        Log.d(TAG, "We are logging from the onCreate");
    }
}
