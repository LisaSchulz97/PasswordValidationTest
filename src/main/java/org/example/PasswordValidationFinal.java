package org.example;

public class PasswordValidationFinal {
    public static void main(String[] args) {

        System.out.println(makeTheRightLength("HalloHallo289"));

        System.out.println(areNumbersThere("HalloHallo289"));

        System.out.println(checkTheLengthAndTheContent("HalloHallo289"));

    }


    public static boolean makeTheRightLength(String lengthTest) {
       return (lengthTest.length() > 8);
    }

    public static boolean areNumbersThere(String containsNumbers) {
        return (containsNumbers.contains("1") || containsNumbers.contains ("2") || containsNumbers.contains ("3") || containsNumbers.contains ("4")|| containsNumbers.contains ("5") || containsNumbers.contains ("6") || containsNumbers.contains ("7") || containsNumbers.contains ("8") || containsNumbers.contains ("9") || containsNumbers.contains ("0"));



        }


    public static boolean checkTheLengthAndTheContent(String checkedUp) {
        return  (areNumbersThere(checkedUp) && makeTheRightLength(checkedUp));

    }
}



