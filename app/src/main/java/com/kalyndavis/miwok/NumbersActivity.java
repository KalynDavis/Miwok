package com.kalyndavis.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    String[] words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] wordArray = new String[]{"one", "two","three","four","five","six","seven","eight","nine","ten"};

        ArrayList<String> words = new ArrayList<String>();

        for(int i = 0; i <=wordArray.length-1;  i++){
            words.add(wordArray[i]);
        }

        Log.v("NumbersActivity", "word at index 9: "+words.get(9));


    }
}
