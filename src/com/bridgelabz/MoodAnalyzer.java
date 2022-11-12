package com.bridgelabz;

public class MoodAnalyzer {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String happyMood = moodAnalyser.analyseMood("I am in Happy mood");
        System.out.println("Mood is " + happyMood);
        String sadMood = moodAnalyser.analyseMood("I am in Sad mood");
        System.out.println("Mood is " + sadMood);

    }

    String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (message.toLowerCase().contains("happy")) {
            return "HAPPY";
        }
        return message;
    }
}