package com.company;

public class song {
    private String title;
    private double duration;

    public song(String title,double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title+" : "+this.duration;
    }
}
