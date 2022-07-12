package stepic._3_2_boolean_constructions;

import java.util.Scanner;

public class BoolCond {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task_6();
    }

    // Реализуйте простой справочник по командам Java. На вход подаётся команда, по которой необходима справка (ограничимся тремя командами). В соответствии с этим выведите текст: Ввод: System.out.println() Вывод: Это команда вывода на печать Ввод: if Вывод: Это условный оператор Ввод: else Вывод: Это альтернативная конструкция условного оператора Если введено что-либо другое, выведите фразу "Раздел в разработке" (без кавычек).
    static void task_6() {
        switch (sc.nextLine()) {
            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;
            case "if":
                System.out.println("Это условный оператор");
                break;
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;
            default:
                System.out.println("Раздел в разработке");
        }
    }

    //На вход подаются три слова на одной строке, разделённые пробелом. Выведите их в алфавитном порядке. Гарантируется, что слова начинаются с разных букв.
    static void task_5() {
        String st1 = sc.next();
        String st2 = sc.next();
        String st3 = sc.next();
        char a = st1.charAt(0);
        char b = st2.charAt(0);
        char c = st3.charAt(0);
        if (a < b && a < c && b < c) {
            System.out.println(st1 + "\n" + st2 + "\n" + st3);
        } else if (a < c && c < b) {
            System.out.println(st1 + "\n" + st3 + "\n" + st2);
        } else if (b < a && b < c && a < c) {
            System.out.println(st2 + "\n" + st1 + "\n" + st3);
        } else if (b < c && c < a) {
            System.out.println(st2 + "\n" + st3 + "\n" + st1);
        } else if (c < a && c < b && a < b) {
            System.out.println(st3 + "\n" + st1 + "\n" + st2);
        } else if (c < b && b < a) {
            System.out.println(st3 + "\n" + st2 + "\n" + st1);
        }
    }

    //На вход подаются целых три числа - день, месяц и год (по григорианскому календарю). Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
    static void task_4() {
        int day = sc.nextInt();
        int mon = sc.nextInt();
        int yer = sc.nextInt();
        if (day < 1 || mon < 1 || mon > 12 || yer < 0) {  // если день, или месяц, или год меньше одного, то не верно
            System.out.println(false);
        } else if ((mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) && day > 31) {
            System.out.println(false);
        } else if ((mon == 4 || mon == 6 || mon == 9 || mon == 11) && day > 30) {
            System.out.println(false);
        } else if (day > 29 || (!((yer % 4 == 0 && yer % 100 != 0) || (yer % 400 == 0)) && day > 28)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    //На вход подаются три целых числа. Выведите true, если среди них есть ровно два чётных, и false - если нет.
    static void task_3() {
        System.out.print(
                (sc.nextInt() % 2 + sc.nextInt() % 2 + sc.nextInt() % 2) == 1);
    }

    //На вход подаются два целых числа. Выведите на печать true, если их сумма чётна, а произведение - нечётно, и false - в противном случае.
    static void task_2() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print((x + y) % 2 == 0 && (x * y) % 2 == 1);
    }

    //На вход подаётся строка, а затем - одна буква. Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO".
    static void task_1() {
        String st = sc.nextLine();
        System.out.print(
                st.contains(sc.next()) || st.length() > 20 ? "YES" : "NO");
    }

}
