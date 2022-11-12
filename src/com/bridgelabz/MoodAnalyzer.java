package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String nullMood = moodAnalyser.analyzeMood();
        System.out.println("Mood is " + nullMood);
    }

    public String analyzeMood() {
        try {
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}
