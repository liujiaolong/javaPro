package com.dragon.dianying;
/**
 *  目标：完成电影信息的展示案例，理解面向对象编程的代码
 *  "《长津湖》" , 9.7 , "吴京"
 *  "《我和我的父辈》" , 9.6, "吴京"
 *  "《扑水少年》" , 9.5 , "王川"
 * */
public class Test {
    public static void main(String[] args) {
        //创建3个电影对象，存电影的信息
//        Movie m1 = new Movie("《长津湖》" , 9.7 , "吴京");
//        Movie m2 = new Movie("《我和我的父辈》" , 9.6 , "吴京");
//        Movie m3 = new Movie("《扑水少年》" , 9.5 , "王川");

        //定义电影类型的数组，存3部电影对象
//        int[] arr = new int[3];
        Movie[] movies = new Movie[3];
//        movies[0] = m1;
//        movies[1] = m2;
//        movies[2] = m3;
        movies[0] = new Movie("《长津湖》" , 9.7 , "吴京");
        movies[1] = new Movie("《我和我的父辈》" , 9.6 , "吴京");
        movies[2] = new Movie("《扑水少年》" , 9.5 , "王川");

        //遍历数组中的每个电影对象，然后获取它的信息展示出来
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m); //数组中存储的元素并不是对象本身，而是对象的地址
            System.out.println("电影名:" + m.getName());
            System.out.println("得分:" + m.getScore());
            System.out.println("主演:" + m.getActor());
            System.out.println("-------------------------------");
        }
    }
}
