package com.dragon.d6_regex;

/*
    目标：正则表达式在方法中的应用
        public String[] split(String regex)
            --按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
         public String replaceAll(String regex , String newStr)
            --按照正则表达式匹配的内容进行替换
 */
public class RegexDemo4 {
    public static void main(String[] args) {
        String names = "小路发的撒sfasd蓉儿阿斯顿发士大夫撒asdf过儿";
        String[] arrs = names.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);//小路发的撒
                                        //蓉儿阿斯顿发士大夫撒
                                        //过儿
        }

        String names2 = names.replaceAll("\\w+" , "     ");
        System.out.println(names2);//小路发的撒     蓉儿阿斯顿发士大夫撒     过儿
    }
}
