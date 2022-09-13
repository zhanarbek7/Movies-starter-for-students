package com.company.models;

import java.util.List;

public class Movie {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    void printCast() {
        int counter = 1;
        for (Cast s : cast) {
            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;
        }
    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", cast=" + cast +
                '}';
    }
}
