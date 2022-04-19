package com.testing.commons;

public class AlgoUtilities {

    private String AlphaNumbers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    public String getRandomString(int size){
        String word = "";
        for(int i=0;i< size; i++){
            int character = (int) (Math.random() * AlphaNumbers.length());
            word+=AlphaNumbers.charAt(character);
        }
        return word.toString();
    }
}