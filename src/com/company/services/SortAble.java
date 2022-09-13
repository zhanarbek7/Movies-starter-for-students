package com.company.services;

import com.company.models.Director;

public interface SortAble {

    void printAllMovies();

    void findMovie(String movieName);

    void sortByYear(int year);

    void sortByName(String name);

    void sortByDirector(Director director);
}
