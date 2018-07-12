package com.danielledanskin.phrase_o_matic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] wordListOne = {
            "scaffolded", "game-changing", "revolutionary",
            "disruptive", "holistic", "machine learning", "quick-win"
    };
    String[] wordListTwo = {
            "deep dive", "client-centered", "data mining",
            "scalable", "beta", "agile", "upselling"
    };
    String[] wordListThree = {
            "framework", "benchmarking", "social software",
            "big data", "digital signage", "cloud", "blockchain"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Generate random phrase
    public void getPhrase(View view) {
        // find the length of each word list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        // generate 3 random numbers
        int randWordOne = (int) (Math.random() * oneLength);
        int randWordTwo = (int) (Math.random() * twoLength);
        int randWordThree = (int) (Math.random() * threeLength);
        // build a phrase
        String phrase = wordListOne[randWordOne] + " " + wordListTwo[randWordTwo] + " " +
                wordListThree[randWordThree];
        // print out phrase
        displayMessage("What we need is a " + phrase + ".");
    }

    // Display message on screen
    private void displayMessage(String message) {
        TextView phraseTextView = (TextView) findViewById(R.id.phrase_text_view);
        phraseTextView.setText(message);
    }
}
