package org.hillcrest.chapter6.password;

public class FeedbackGenerator {

    //utility class for generating feedback based on password

    public static String generateFeedback(String password) {

        String feedback = "";
        if (password.length() < 8) {
            feedback = "\n- Increase the length to at least 8 characters.";
        }
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isDigit(letter)) {
                break;
            } else if (i == password.length() - 1) {
                feedback += "\n- Add at least one number.";
            }
        }

        for (int i = 0; i < password.length(); i++)
        {
            char lowercaseLetter = password.charAt(i);
            if (Character.isLowerCase(lowercaseLetter))
            {
                break;
            }
            else if (i == password.length() - 1){
                feedback += "\n- Add at least one lowercase letter.";
            }
        }

        for (int i = 0; i < password.length(); i++)
        {
            char uppercaseLetter = password.charAt(i);
            if (Character.isUpperCase(uppercaseLetter))
            {
                break;
            }
            else if (i == password.length() - 1){
                feedback += "\n- Add at least one uppercase letter.";
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
                break;
            }
            else if (i == password.length() - 1) {
                feedback += "\n- Include at least one special character.";
            }
        }

        return feedback;
    }


}
