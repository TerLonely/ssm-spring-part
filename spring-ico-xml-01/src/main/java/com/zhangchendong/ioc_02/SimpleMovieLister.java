package com.zhangchendong.ioc_02;

/**
 * @author zhangchendong
 * @data 2024/1/29 16:27
 */
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    private String movieName;

    public void setMovieFinder (MovieFinder movieFinder){
        this.movieFinder = movieFinder;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
}
