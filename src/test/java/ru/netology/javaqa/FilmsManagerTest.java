package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findIfNone() {
        FilmsManager FilmsManager = new FilmsManager();
        String[] actual = FilmsManager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 2");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastIfLessFive() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastIfMoreFive() {
        FilmsManager manager = new FilmsManager(6);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindLastIfMoreFiveLimit() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindLastIfMoreSixLimit() {
        FilmsManager manager = new FilmsManager(6);


        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

}