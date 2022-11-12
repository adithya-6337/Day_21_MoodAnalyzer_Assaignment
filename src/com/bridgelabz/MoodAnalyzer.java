package com.bridgelabz;

public class MoodAnalyzer {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String happyMood = moodAnalyzer.analyseMood("Happy mood");
        System.out.println("Mood is " + happyMood);
        String sadMood = moodAnalyzer.analyseMood("Sad mood");
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
