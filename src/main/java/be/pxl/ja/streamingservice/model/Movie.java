package be.pxl.ja.streamingservice.model;
import java.time.LocalDate;

import static java.lang.Math.abs;

public class Movie extends Content implements Playable{
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector () {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate () {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration () {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = abs(duration);
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }
    public String getPlayingTime() {
        // TODO: implement this method correctly
        return "2 u 30 min";
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }
    public void play() {
        System.out.println("Playing " + this);
    }
    @Override
    public void pause(){
        System.out.println("Pausing " + this);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if (releaseDate != null) {
            builder.append(" (").append(releaseDate.getYear()).append(")");
        }
        return builder.toString();
    }
}