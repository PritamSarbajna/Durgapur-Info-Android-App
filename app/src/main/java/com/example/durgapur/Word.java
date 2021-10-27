package com.example.durgapur;

public class Word {

    //Image for places
    private int mImageResourceId;

    //Places name
    private String mPlacesName;

    //Places description
    private String mPlacesDescription;

    /**
     * Create a new word object
     * @param placesName for displaying titles of the places
     * @param placesDescription is for displaying some of the info of that place
     * @param imageResourceId requiring for displaying image of that place
     */

    public Word(String placesName, String placesDescription, int imageResourceId){
        mPlacesName = placesName;
        mPlacesDescription = placesDescription;
        mImageResourceId = imageResourceId;
    }


    /**
     * to get the correct place name
     */
    public String getPlacesName(){
        return mPlacesName;
    }


    /**
     * to get the correct place Description
     */
    public String getPlacesDescription(){
        return mPlacesDescription;
    }

    /**
     * to get the correct place Description
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }



}
