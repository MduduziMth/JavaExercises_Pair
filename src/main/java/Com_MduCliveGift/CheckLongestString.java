package Com_MduCliveGift;

import java.util.Scanner;
import java.util.Arrays;

public class CheckLongestString {

    public static void main(String args[])
    {

        String[] Words = {"hi","heyaa", "aaaa", "qwerty","zxcvbn", "qawsedrftg"};

        System.out.println(longest(Words));


    }

    public static String longest(String[] WordArray){

        //variable for finding the Max Length
        int MaxLength = 0;

        //variable for finding the Longest string
        String LongestWords= "";
        //Finds largest length of a word
        for(String word: WordArray)
        {
            if(word.length() > MaxLength)
            {
                MaxLength = word.length();
            }
        }
        // Finds words that match the Maximum length
        for (String word: WordArray)
            if(word.length() == MaxLength)
            {
                LongestWords += word + "\n";
            }

        return LongestWords;

    }
}

