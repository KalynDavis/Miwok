package com.kalyndavis.miwok;

import android.graphics.drawable.Drawable;

public class Word {

    public Word(String miwokTranslation, String defaultTranslation, int imageIcon, int audioFile) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageIcon = imageIcon;
        this.audioFile = audioFile;
    }

    public Word(String miwokTranslation, String defaultTranslation, int audioFile) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.audioFile = audioFile;
    }

    private String miwokTranslation;
    private String defaultTranslation;
    private static final int NO_IMAGE = -1;
    private int imageIcon=NO_IMAGE;
    private int audioFile;


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }

    public boolean hasImage(){
        return imageIcon != NO_IMAGE;
    }


    public int getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(int audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public String toString() {
        return "Word{" +'\n' +
                "miwokTranslation='" + miwokTranslation + '\n' +
                ", defaultTranslation='" + defaultTranslation + '\n' +
                ", imageIcon=" + imageIcon +'\n' +
                ", audioFile=" + audioFile +
                '}';
    }
}
