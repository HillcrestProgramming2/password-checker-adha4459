package org.hillcrest.chapter6.password;

public class CriteriaChecker {

    //utility class

    public static int evaluateCriteria(String password)
    {
        // Complete this method
        String characters = "!@#$%^&*()-_=+|[]{};:/?.>";

        int counter = 0;

        int passwordLength = password.length();

        if (passwordLength >= 8) {
            counter++;
        }

        for (int i = 0; i < password.length(); i++)
        {
            char lowercaseLetter = password.charAt(i);
            if (Character.isLowerCase(lowercaseLetter))
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
            char uppercaseLetter = password.charAt(i);
            if (Character.isUpperCase(uppercaseLetter))
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
        return counter;

    }

    public static String determineStrength(int score) {
        if (score < 3) {
            return "Weak";
        }
        else if (score == 3) {
            return "Moderate";
        }
        else {
            return "Strong";
        }
    }
}