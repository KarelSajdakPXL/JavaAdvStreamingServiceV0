package be.pxl.ja.streamingservice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void accountConstructorTest() {
        Account testAccount = new Account("test@gmail.com", "123");

        assertEquals("test@gmail.com", testAccount.getEmail());
        assertEquals("profile1", testAccount.getFirstProfile().getName());
        assertNull(testAccount.getFirstProfile().getDateOfBirth());
    }
}
