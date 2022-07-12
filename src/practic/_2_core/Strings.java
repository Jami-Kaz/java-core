package practic._2_core;

public class Strings {
    public static void main(String[] args) {
        String str = "jami";

        System.out.println(str.length());       // длину строки
        System.out.println(str.equals("Jami")); // сравнение
        System.out.println(str.indexOf('m'));   // индекс символа
        System.out.println(str.charAt(3));      // символ по индексу
        System.out.println("".isEmpty());       // проверяет на пустоту
        System.out.println(str.contains("ami"));// проверяет есть ли строка внутри другой
        System.out.println(str.startsWith("ja"));// проверяет начало слова


        String st = "jamilya";
        int x = 0;

        while (x < st.length()) {
            System.out.println(st.charAt(x));
            x++;
        }
    }
}
