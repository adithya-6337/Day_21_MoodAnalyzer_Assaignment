package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String nullMood = moodAnalyser.analyseMood();
        System.out.println("Mood is " + nullMood);
    }

    public String analyseMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}