package be.pxl.ja.streamingservice.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordUtilCalculateStrengthTest {
    @Test
    public void PasswordStrengthShouldBeZero(){
        String password = "azert";

        assertEquals(0, PasswordUtil.calculateStrength(password));
    }
    @Test void PasswordStrengthShouldBeThreeIfPasswordLengthIsSix(){
        String password = "azerty";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }
    @Test void PasswordStrengthShouldBeFourIfPasswordLengthIsTen(){
        String password = "azertyuiop";

        assertEquals(4, PasswordUtil.calculateStrength(password));
    }
    @Test void PasswordStrengthShouldBeThreeIfPasswordLengthIsSixAndPasswordIsNumbers(){
        String password = "123456";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }
    @Test void PasswordStrengthShouldBeThreeIfPasswordLengthIsSixAndPasswordIsUpperCase(){
        String password = "AZERTY";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }
    @Test void PasswordStrengthShouldBeThreeIfPasswordLengthIsSixAndPasswordIsSpecialCharacters(){
        String password = "~!@#$%";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }
    @Test void PasswordStrengthMaximumShouldBeTen(){
        String password = "AZERTYUIOP1a$";

        assertEquals(10, PasswordUtil.calculateStrength(password));
    }
}
