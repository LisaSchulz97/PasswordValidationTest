package org.example;

public class PasswordValidationFinal {
    public static void main(String[] args) {


        System.out.println(checkTheLengthAndTheContent("blablabblab66"));

    }


    public static boolean makeTheRightLength(String lengthTest) {
        return (lengthTest.length() > 8);
    }

    public static boolean areNumbersThere(String containsNumbers) {
        return (containsNumbers.contains("1") || containsNumbers.contains("2") || containsNumbers.contains("3") || containsNumbers.contains("4") || containsNumbers.contains("5") || containsNumbers.contains("6") || containsNumbers.contains("7") || containsNumbers.contains("8") || containsNumbers.contains("9") || containsNumbers.contains("0"));


    }


    public static String checkTheLengthAndTheContent(String password) {
        if (!makeTheRightLength(password)) {
            return "your password must contain at least 8 characters";
        }
        if (!areNumbersThere(password)) {
            return "your password must contain a digit";
        }
        if (makeTheRightLength(password) && areNumbersThere(password)) {
            return "your password is valid";
        } else {
            return "your password needs at least 8 characters and one digit";
        }
    }
}



