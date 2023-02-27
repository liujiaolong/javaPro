package com.dragon.d11_api_stringbuilder;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {44,76,99,189,23};
        System.out.println(toString(arr));
    }

    /*
        定义方法接收任意整形数组，返回数字内容格式
     */
    public static String toString(int[] arr){
        if (arr == null){
            return null;
        }
        //开始拼接内容
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
