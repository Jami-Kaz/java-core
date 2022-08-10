package stepic.begin_course._4_1_cycle;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    private String name;
    private int year;
    private double rating;
    private Genre[] genres;

    public Movie() {}

    public Movie(String name, int year, double rating, Genre... genres) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genres = genres;
    }

    public double getMoveRating(Scanner sc) {
        double sum = 0;
        double count = 0;
        double average = 0;
        int num;
        while ((num = sc.nextInt()) <= 10 && num >= 0) {
            sum = sum + num;
            count = count + 1;
            average = sum / count;
        }
        return average;
    }

    public String toString() {
        return String.format("Movie {name=%s, year=%d, rating=%.1f, genres=%s}",
                name, year, rating, Arrays.toString(genres));
    }


    static class Genre {
        private String name;
        Genre(String name) {
            this.name = name;
        }
        public String toString() {
            return String.format("Genre {%s}", name);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Movie titanic = new Movie("Titanic", 1990, 7.7,
                new Movie.Genre("Melodrama"),new Movie.Genre("History"));
        Movie cat = new Movie();
        System.out.println(titanic);
    }
}