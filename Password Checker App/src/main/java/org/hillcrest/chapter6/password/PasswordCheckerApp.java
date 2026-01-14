package org.hillcrest.chapter6.password;
import java.util.Scanner;

public class PasswordCheckerApp {
    public static void main(String[] args) {
        //prompt user for password
        //main method goes here
        //Check strength
        //Provide user feedback based on the strength
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = input.nextLine();
        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);
        System.out.println("Password Strength: " + strength + " (" + score + "/5" + ")");


        if (score < 5) {
            String feedback = FeedbackGenerator.generateFeedback(password);
            System.out.println("Suggestions to improve your password: " + feedback);
        }

    }

}


