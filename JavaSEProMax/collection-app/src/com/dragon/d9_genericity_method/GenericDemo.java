package com.dragon.d9_genericity_method;

public class GenericDemo {
    public static void main(String[] args) {
        String[] names = {"小路" , "蓉蓉" , "小何"};
        printArray(names);

        Integer[] ages = {10 , 20 , 30};
        printArray(ages);

    }

    public static <T> void printArray(T[] arr){
        StringBuilder sb = new StringBuilder("[");
        if (arr == null){
            System.out.println(arr);
        }else{
            for (int i = 0; i < arr.length ; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }
    }
}
