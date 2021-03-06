package com.kalyndavis.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("әpә","father", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("әṭa","mother", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("angsi","son", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("tune","daughter", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("taachi","older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("chalitti","younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("teṭe","older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("kolliti","younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("ama","grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("paapa","grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                Log.v("FamilyActivity", "Current Word: "+word);

                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioFile());
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer(){
        if (mMediaPlayer != null){

            mMediaPlayer.release();
            mMediaPlayer = null;

        }
    }
}
