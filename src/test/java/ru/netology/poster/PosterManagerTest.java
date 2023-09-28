package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();

    @Test
    public void shouldTestShowMovies() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestShowIfFirstFilm() {
        manager.addFilms("Film1");
        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestShowIfMoreOneFilm() {
        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestShowFilmIfALimit() {
        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");
        manager.addFilms("Film4");
        manager.addFilms("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastAboveLimit() {
        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");
        manager.addFilms("Film4");
        manager.addFilms("Film5");
        manager.addFilms("Film6");
        manager.addFilms("Film7");
        manager.addFilms("Film8");
        manager.addFilms("Film9");
        manager.addFilms("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastZero() {
        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastIfFirst() {
        manager.addFilms("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastIfMoreFirst() {
        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastLimit() {
        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");
        manager.addFilms("Film4");
        manager.addFilms("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
