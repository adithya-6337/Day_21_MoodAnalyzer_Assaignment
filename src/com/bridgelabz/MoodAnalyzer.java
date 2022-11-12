package com.bridgelabz;

import org.testng.Assert;

public class MoodAnalyzer {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String happyMood = moodAnalyser.analyseMood("I am in Happy Mood");
        System.out.println("Mood is " + happyMood);
        String sadMood = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.println("Mood is " + sadMood);
    }

   public String analyseMood(String message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else if (message.toLowerCase().contains("happy")){
            return "HAPPY";
        }
        return message;
    }
}