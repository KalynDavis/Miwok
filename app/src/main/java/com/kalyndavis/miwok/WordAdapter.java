package com.kalyndavis.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{


    private int colorResourceId;

    public WordAdapter(@NonNull Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        this.colorResourceId=colorResourceId;
    }

    @NonNull
    @Override //Get current view from the parent ListView
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWord = getItem(position);

        //Grab the available view to be recycled
        View listItemView = convertView;
        //If this is the first view, it will be null so we mus inflate one
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        TextView miwokWord = listItemView.findViewById(R.id.miwokWord);
        TextView defaultWord = listItemView.findViewById(R.id.defaultWord);
        ImageView imageIcon = listItemView.findViewById(R.id.imageIcon);


        miwokWord.setText(currentWord.getMiwokTranslation());
        defaultWord.setText(currentWord.getDefaultTranslation());

        if(currentWord.hasImage()){
            imageIcon.setImageResource(currentWord.getImageIcon());
            imageIcon.setVisibility(View.VISIBLE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
