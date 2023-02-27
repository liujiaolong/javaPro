package com.dragon.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDemo {
    public static void main(String[] args) {
        //定义电影类 Movie

        //定义一个结合对象存储三部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《你好李焕英》" , 9.5 , "贾玲"));
        movies.add(new Movie("《唐人街探案》" , 8.5 , "王宝强"));
        movies.add(new Movie("《刺杀小说家》" , 8.6 , "雷佳音"));
        System.out.println("-----------foreach----------");
        //使用foreach遍历集合容器中的每个电影对象
        for (Movie movie : movies) {
            System.out.println("片名：" + movie.getName());
            System.out.println("得分" + movie.getScore());
            System.out.println("主演" + movie.getActor());
            System.out.println("------------");
        }
        System.out.println("-----------Iterator----------");
        //使用Iterator迭代器来遍历
        Iterator<Movie> movieIterator = movies.iterator();
        while (movieIterator.hasNext()){
            Movie movie = movieIterator.next();
            System.out.println("片名：" + movie.getName());
            System.out.println("得分" + movie.getScore());
            System.out.println("主演" + movie.getActor());
            System.out.println("------------");
        }
    }
}
