package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationFinalTest {


@Test
void checkUpTheLength () {
    //Given
    String lengthTest = "Hundert145";

    //When
    boolean result = PasswordValidationFinal.makeTheRightLength(lengthTest);


    //Then
    assertEquals(true, result);
    }

    @Test
    void checkUpIfNumbersThere() {
        //Given
        String containsNumbers = "98";

        //When
        boolean result = PasswordValidationFinal.areNumbersThere(containsNumbers);

        //Then
        assertEquals(true, result);

    }


    @Test
    void checkUpIfNumbersThere2() {
        //Given
        String containsNumbers = "9756553";

        //When
        boolean result = PasswordValidationFinal.areNumbersThere(containsNumbers);

        //Then
        assertEquals(true, result);

    }


    @Test
    void checkUpIfLowercase() {
        //Given
        String containsLowercase = "blabliblub";

        //When
        boolean result = PasswordValidationFinal.isLowercaseThere(containsLowercase);

        //Then
        assertEquals(true, result);


    }

    @Test
    void checkUpIfUppercase () {
        //Given
        String containsUppercase = "blablablA";

        //When
        boolean result = PasswordValidationFinal.isUppercaseThere(containsUppercase);

        //Then
        assertEquals(true, result);

    }
}




