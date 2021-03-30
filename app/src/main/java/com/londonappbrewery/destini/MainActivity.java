package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button  mTopButton;
    Button mBotButton;
    int StoryState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);

        mBotButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (StoryState == 1){
                    StoryState = 3;
                    mStory.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBotButton.setText(R.string.T3_Ans2);
                } else if (StoryState == 3) {
                    mStory.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBotButton.setVisibility(View.GONE);
                } else if (StoryState == 2) {
                    StoryState = 3;
                    mStory.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBotButton.setText(R.string.T3_Ans2);
                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StoryState == 1){
                    StoryState = 2;
                    mStory.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBotButton.setText(R.string.T2_Ans2);
                } else if (StoryState == 3) {
                    mStory.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBotButton.setVisibility(View.GONE);
                } else if (StoryState == 2) {
                    mStory.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBotButton.setVisibility(View.GONE);
                }

            }
        });


    }
}
