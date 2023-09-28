package ru.netology.poster;

public class PosterManager {
    private String[] poster = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addFilms(String films) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }

        tmp[tmp.length - 1] = films;
        this.poster = tmp;
    }

    public String[] findAll() {
        return poster;
    }

    public String[] findLast() {
        int resultLength;
        if (poster.length < limit) {
            resultLength = poster.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = poster[poster.length - 1 - i];
        }
        return result;
    }


}
