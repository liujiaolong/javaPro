package com.dragon.string;

public class StringAPIOther {
    public static void main(String[] args) {
        //1、public int length() ： 获取字符串长度
        String name = "我爱你中国love";
        int sLen = name.length();
        System.out.println(sLen); //9
        //2、public char charAt(int index) ： 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c); //爱
        System.out.println("---------start  遍历字符串中的每个字符");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
        System.out.println("---------end 遍历字符串中的每个字符");
        //3、public char[] toCharArray() : 把字符串转换成字符数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch2 = chars[i];
            System.out.println(ch2);
        }
        //4、public String substring(int beginIndex , int endIndex) ：截取内容，包前不包后
        String name2 = "Java是最厉害的编程语言";
        String rs = name2.substring(0,9);
        System.out.println(rs);//Java是最厉害的
        String rs1 = name2.substring(4,9);
        System.out.println(rs1); //是最厉害的
        //5、public String substring(int beginIndex) : 从当前索引一直截取到末尾
        String rs2 = name2.substring(4);
        System.out.println(rs2);//是最厉害的编程语言
        //6、public String replace(CharSequence target , CharSequence replacement)
        String name3 = "金三胖是最厉害的80后，金三胖是棒棒的！我好爱金三胖";
        String rs3 = name3.replace("金三胖" , "***");
        System.out.println(rs3);//***是最厉害的80后，***是棒棒的！我好爱***
        //7、public boolean contains(CharSequence s)
        System.out.println(name3.contains("金三胖")); //true
        System.out.println(name3.contains("金二胖")); //false
        //8、public boolean startsWiths(String prefix)
        System.out.println(name3.startsWith("金三胖")); //true
        System.out.println(name3.startsWith("金三胖是最厉害的2")); //false
        //9、public String[] split(String s) : 按照某个内容把字符串分割成字符串数组返回
        String name4 = "王宝强,贾乃亮,陈羽凡";
        String[] nameArr = name4.split(",");
        for (int i = 0; i < nameArr.length; i++) {
            System.out.println("选择了：" + nameArr[i]);
        }
    }
}
