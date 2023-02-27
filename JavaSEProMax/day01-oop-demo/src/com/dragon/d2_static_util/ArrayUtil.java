package com.dragon.d2_static_util;

/**
 * 练习：完成数组的工具类设计
 */
public class ArrayUtil {
    /**
     * 构造器私有化
     */
    private ArrayUtil(){}

    /**
     *  工具方法：静态方法
     */
    public static String toString(int[] arr){
        if (arr == null){
            return null;
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length -1)? arr[i] : arr[i] + "，";
        }
        result += "]";
        return result;
    }
}
