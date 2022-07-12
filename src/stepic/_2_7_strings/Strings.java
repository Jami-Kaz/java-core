package stepic._2_7_strings;

import java.util.Scanner;

class Strings {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task_8();
    }

    // На вход подаются два слова на одной строке, разделённые пробелом.Выведите true, если они идут по алфавиту, и false, если нет.
    static void task_11() {
        System.out.print(sc.next().charAt(0) < sc.next().charAt(0));
    }

    // На вход подаются два числа. Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат и сложите в строковом формате.
    static void task_10() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print(x + y + "\n" + x + y);
    }

    // На вход подаются две строки. Объедините их в предложение, а на следующей строке выведите общее количество знаков в предложении.
    static void task_9() {
        String st = sc.nextLine() + " " + sc.nextLine();
        System.out.print(st + "\n" + st.length());
    }

    // На вход подаются две строки текста. Выведите на печать true, если строки совпадают,и false - если нет.
    static void task_8() {
        System.out.print(sc.nextLine().equals(sc.nextLine()));
    }

    // На вход подаётся строка, а затем целое число n > 0. Выведите n- й символ с начала строки.
    static void task_7() {
        System.out.print(sc.nextLine().charAt(sc.nextInt() - 1));
    }

    // На вход подаётся строка. Выведите её на печать сначала строчными, а затем прописными буквами.
    static void task_6() {
        String st = sc.nextLine();
        System.out.print(st.toLowerCase() + "\n" + st.toUpperCase());
    }

    //На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в строке, и false - если не содержится.
    static void task_5() {
        System.out.print(sc.nextLine().contains(sc.next()));
    }

    //  На вход подаётся строка текста. Выведите её первый и последний элемент в одну строку через пробел.
    static void task_4() {
        String str = sc.nextLine();
        System.out.print(str.charAt(0) + " " + str.charAt(str.length() - 1));
    }

    static void task_3() {
        System.out.println(sc.nextLine().length());
    }
}
