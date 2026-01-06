package org.hillcrest.chapter6.password;
import java.util.Scanner;

public class PasswordCheckerApp {
    public static void main(String[] args) {
        //prompt user for password
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = input.nextLine();
        boolean newPassword = passwordCheck(password);
        if (newPassword) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
        //main method goes here
        //Check strength
        //Provide user feedback based on the strength
    }
    public static boolean passwordCheck(String password)
    {
        // Complete this method
        String characters = "!@#$%^&*()-_=+|[]{};:/?.>";
        String numbers = "1234567890";
        String letters = "abcdefghijklmnopqrstuvwxyz";

        int counter = 0;

        int passwordLength = password.length();

        if (passwordLength >= 8) {
            counter++;

        }

        else {
            return false;
        }

        for (int i = 0; i < password.length(); i++)
        {
            char letter = password.charAt(i);
            if (Character.isLetter(letter))
            {
                //return true;
                counter++;
                break;
            }
            else {
                continue;
            }
        }

        for (int i = 0; i < password.length(); i++)
        {
            char letter = password.charAt(i);
            if (Character.isDigit(letter))
            {
                counter++;
                break;
            }
            else {
                continue;
            }


        }

        for (int i = 0; i < password.length(); i++) {
            String letter = password.substring(i, i + 1);
            if (letter.equals("!") || letter.equals("@") || letter.equals("#") ||
                    letter.equals("$") || letter.equals("%") || letter.equals("^") || letter.equals("&") ||
                    letter.equals("*") || letter.equals("(") || letter.equals(")") || letter.equals("-") ||
                    letter.equals("_") || letter.equals("+") || letter.equals("=") || letter.equals("|") ||
                    letter.equals("[") || letter.equals("]") || letter.equals("{") || letter.equals("}") ||
                    letter.equals(";") || letter.equals(":") || letter.equals("/") || letter.equals("?") ||
                    letter.equals(".") || letter.equals(">"))
            {
                counter++;
                break;
            }
            else {
                continue;
            }
        }



        if (counter == 4) {
            return true;
        }
        else {
            return false;
        }




    }
}


