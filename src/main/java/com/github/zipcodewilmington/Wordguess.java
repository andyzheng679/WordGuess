package com.github.zipcodewilmington;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wordguess {
    //Andy Zheng


    public static List<String> wordsToGuess = new ArrayList<>(); //putting the list in the Word guess class so other methods can get it
    public static void main(String[] args){
        //create a list with words
        wordsToGuess.add("apple");
        wordsToGuess.add("zipcode");
        wordsToGuess.add("saveme");

        System.out.println(randomNumGen());
        System.out.println(getWordbyIndex(randomNumGen()));

    }
    public static int randomNumGen(){
        Random random = new Random();   //random obj to use random class
        int randomNumber = random.nextInt(3); //gen random num form 0 to 3 not including 3, i think
        return randomNumber;
    }

    public static String getWordbyIndex(int randomNumGen){
        return wordsToGuess.get(randomNumGen);
    }
}
