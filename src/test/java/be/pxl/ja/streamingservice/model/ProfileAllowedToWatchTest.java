package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProfileAllowedToWatchTest {
    @Test
    public void AllowedToWatchShouldReturnFalseWhenTooYoung(){
        LocalDate datum = LocalDate.of(2015, 12, 30);
        Profile person = new Profile("persoon", datum);
        Content film = new Movie("testMovie", Rating.MATURE);

        Assertions.assertFalse(person.allowedToWatch(film));
    }

    @Test
    public void AllowedToWatchShouldReturnFalseWhenLocalDateNull(){
        Profile person = new Profile("persoon", null);
        Content film = new Movie("testMovie", Rating.MATURE);

        Assertions.assertFalse(person.allowedToWatch(film));
    }

    @Test
    public void AllowedToWatchShouldReturnTrueWhenOldEnough() {
        LocalDate datum = LocalDate.of(1969, 12, 30);
        Profile person = new Profile("persoon", datum);
        Content film = new Movie("testMovie", Rating.MATURE);

        Assertions.assertTrue(person.allowedToWatch(film));
    }
}
