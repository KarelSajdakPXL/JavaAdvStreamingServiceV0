package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    Profile(String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        if (dateOfBirth != null){
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }
        else {
            return 0;
        }
    }

    public boolean allowedToWatch(Content content){
        Rating contentRating = content.getMaturityRating();
        if (contentRating.getMinimumAge() <= this.getAge()){
            return true;
        }
        else {
            return false;
        }
    }
}
