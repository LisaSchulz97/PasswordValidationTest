package org.example;

public class PasswordValidationFinal {
    public static void main(String[] args) {


        System.out.println(checkTheLengthAndTheContent("blaPlabblab66"));

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
        if (!isLowercaseThere(password)) {
            return "your password must contain an Lowercase";
        }
        if (!isUppercaseThere(password)) {
            return "your password must contain an Uppercase";
        }
        if (makeTheRightLength(password) && areNumbersThere(password) && isLowercaseThere(password) && isUppercaseThere(password)) {
            return "your password is valid";
        } else {
            return "your password needs at least 8 characters and one digit";
        }
    }

    public static boolean isLowercaseThere (String password) {
        for (int i = 0; i < password.length(); ++i) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUppercaseThere(String password) {
        for (int i = 0; i < password.length(); ++i) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //public static boolean isUppercaseThere(String containsUppercase) {

}



