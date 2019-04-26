package com.example.textviewlibrary;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextLibActivity extends ConstraintLayout {

    TextView textView;

    public TextLibActivity(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    public void setText1(String text){

        textView.setText(text);
    }

    public void init(Context context) {

        inflate(context,R.layout.activity_text_lib,this);
        textView = findViewById(R.id.textViewid);

    }
}
