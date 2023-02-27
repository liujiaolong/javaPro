package com.dragon.dianying;

public class Movie {
    //1、成员变量
    private String name;
    private double score;
    private String actor;

    //3、有参数构造器
    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }
    //无参数构造器
    public Movie() {
    }

    //2、getter + setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
