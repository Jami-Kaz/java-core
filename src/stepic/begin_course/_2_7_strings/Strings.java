package stepic.begin_course._2_7_strings;

import java.util.Scanner;

class Strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

       String res = firstAndLastChar("Jamilya");
        System.out.println(res);
    }


    // На вход подаются два слова на одной строке, разделённые пробелом.Выведите true, если они идут по алфавиту, и false, если нет.
    static boolean isAlphabet(String st1, String st2) {
//        System.out.print(sc.next().charAt(0) < sc.next().charAt(0));

        return st1.charAt(0) < st2.charAt(0);
    }

    // На вход подаются два числа. Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат и сложите в строковом формате.
    static String sumAndConcat(int x, int y) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.print(x + y + "\n" + x + y);

        return ((x + y) + "\n" + x + y);
    }

    // На вход подаются две строки. Объедините их в предложение, а на следующей строке выведите общее количество знаков в предложении.
    static String stringAndLength(String st) {
//        String st = sc.nextLine() + " " + sc.nextLine();
//        System.out.print(st + "\n" + st.length());

        return (st + "\n" + st.length());
    }

    // На вход подаются две строки текста. Выведите на печать true, если строки совпадают,и false - если нет.
    static boolean stringEquals(String st1, String st2) {
//        System.out.print(sc.nextLine().equals(sc.nextLine()));

        return st1.equals(st2);
    }

    // На вход подаётся строка, а затем целое число n > 0. Выведите n- й символ с начала строки.
    static char stringNumChar(String st, int num) {
//        System.out.print(sc.nextLine().charAt(sc.nextInt() - 1));

        return (st.charAt(num - 1));
    }

    // На вход подаётся строка. Выведите её на печать сначала строчными, а затем прописными буквами.
    static String lowerAndUpper(String st) {
//        String st = sc.nextLine();
//        System.out.print(st.toLowerCase() + "\n" + st.toUpperCase());

        return (st.toLowerCase() + "\n" + st.toUpperCase());
    }

    //На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в строке, и false - если не содержится.
    static boolean isWordInText(String text, String word) {
//        System.out.print(sc.nextLine().contains(sc.next()));

        return word.contains(text);
    }

    //  На вход подаётся строка текста. Выведите её первый и последний элемент в одну строку через пробел.
    static String firstAndLastChar(String text) {
//        String str = sc.nextLine();
//        System.out.print(str.charAt(0) + " " + str.charAt(str.length() - 1));

        return (text.charAt(0) + " " + text.charAt(text.length() - 1));
    }

    static int wordLength(String word) {
//        System.out.println(sc.nextLine().length());
        return word.length();
    }
}
