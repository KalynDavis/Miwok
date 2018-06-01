package com.kalyndavis.miwok;

import android.graphics.drawable.Drawable;

public class Word {

    public Word(String miwokTranslation, String defaultTranslation, int imageIcon) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageIcon = imageIcon;
    }

    public Word(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    private String miwokTranslation;
    private String defaultTranslation;
    private static final int NO_IMAGE = -1;
    private int imageIcon=NO_IMAGE;


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
}
