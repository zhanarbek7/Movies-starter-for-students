package com.company.services;

import com.company.models.Movie;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(String actorName);

    void findMoviesByDirector(String directorName);

    void findMoviesByYear(int year);

    void findMoviesAndRoleByActor(String actorName);

    void showActorRoles(String actor);
}
