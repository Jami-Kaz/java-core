package practic._2_core;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String str = "jami";
        String str1 = "j a m i";
        String[] strs = str1.split(" ");

        System.out.println(str.length());       // длину строки
        System.out.println(str.equals("Jami")); // сравнение
        System.out.println(str.indexOf('m'));   // индекс символа
        System.out.println(str.charAt(3));      // символ по индексу
        System.out.println("".isEmpty());       // проверяет на пустоту
        System.out.println(str.contains("ami"));// проверяет есть ли строка внутри другой
        System.out.println(str.startsWith("ja"));// проверяет начало слова

        System.out.println(Arrays.toString(strs));

//        String st = "jamilya";
//        int x = 0;
//
//        while (x < st.length()) {
//            System.out.println(st.charAt(x));
//            x++;
//        }
    }
}
