package stepic._3_2_boolean_constructions;

import java.util.Scanner;

public class BoolCond {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String result;
        result = isLineContainsLetter(args[0], args[1]);

        System.out.println(result);
    }

    // Реализуйте простой справочник по командам Java. На вход подаётся команда, по которой необходима справка (ограничимся тремя командами). В соответствии с этим выведите текст: Ввод: System.out.println() Вывод: Это команда вывода на печать Ввод: if Вывод: Это условный оператор Ввод: else Вывод: Это альтернативная конструкция условного оператора Если введено что-либо другое, выведите фразу "Раздел в разработке" (без кавычек).
    static String dictionary(String command) {
//        switch (sc.nextLine()) {
//            case "System.out.println()":
//                System.out.println("Это команда вывода на печать");
//                break;
//            case "if":
//                System.out.println("Это условный оператор");
//                break;
//            case "else":
//                System.out.println("Это альтернативная конструкция условного оператора");
//                break;
//            default:
//                System.out.println("Раздел в разработке");
//        }
                switch (command) {
            case "System.out.println()": return ("Это команда вывода на печать");
            case "if":                   return ("Это условный оператор");
            case "else":                 return ("Это альтернативная конструкция условного оператора");
            default:                     return ("Раздел в разработке");
        }


    }

    //На вход подаются три слова на одной строке, разделённые пробелом. Выведите их в алфавитном порядке. Гарантируется, что слова начинаются с разных букв.
    static String toAbc(String word1, String word2, String word3) {
//        String st1 = sc.next();
//        String st2 = sc.next();
//        String st3 = sc.next();
//        char a = st1.charAt(0);
//        char b = st2.charAt(0);
//        char c = st3.charAt(0);
//        if (a < b && a < c && b < c) {
//            System.out.println(st1 + "\n" + st2 + "\n" + st3);
//        } else if (a < c && c < b) {
//            System.out.println(st1 + "\n" + st3 + "\n" + st2);
//        } else if (b < a && b < c && a < c) {
//            System.out.println(st2 + "\n" + st1 + "\n" + st3);
//        } else if (b < c && c < a) {
//            System.out.println(st2 + "\n" + st3 + "\n" + st1);
//        } else if (c < a && c < b && a < b) {
//            System.out.println(st3 + "\n" + st1 + "\n" + st2);
//        } else if (c < b && b < a) {
//            System.out.println(st3 + "\n" + st2 + "\n" + st1);
//        }
        char firstCh1 = word1.charAt(0);
        char firstCh2 = word2.charAt(0);
        char firstCh3 = word3.charAt(0);

        if (firstCh1 < firstCh2 && firstCh2 < firstCh3) {
            return (word1 + "\n" + word2 + "\n" + word3);

        } else if (firstCh1 < firstCh3 && firstCh3 < firstCh2) {
            return (word1 + "\n" + word3 + "\n" + word2);

        } else if (firstCh2 < firstCh1 && firstCh2 < firstCh3 && firstCh1 < firstCh3) {
            return (word2 + "\n" + word1 + "\n" + word3);

        } else if (firstCh2 < firstCh3 && firstCh3 < firstCh1) {
            return (word2 + "\n" + word3 + "\n" + word1);

        } else if (firstCh3 < firstCh1 && firstCh3 < firstCh2 && firstCh1 < firstCh2) {
            return (word3 + "\n" + word1 + "\n" + word2);

        } else {
            return (word3 + "\n" + word2 + "\n" + word1);
        }
    }

    //На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
    //Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
    static boolean isValidDate(int day, int mon, int yer) {
//        int day = sc.nextInt();
//        int mon = sc.nextInt();
//        int yer = sc.nextInt();
//        if (day < 1 || mon < 1 || mon > 12 || yer < 0) {  // если день, или месяц, или год меньше одного, то не верно
//            System.out.println(false);
//        } else if ((mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) && day > 31) {
//            System.out.println(false);
//        } else if ((mon == 4 || mon == 6 || mon == 9 || mon == 11) && day > 30) {
//            System.out.println(false);
//        } else if (day > 29 || (!((yer % 4 == 0 && yer % 100 != 0) || (yer % 400 == 0)) && day > 28)) {
//            System.out.println(false);
//        } else {
//            System.out.println(true);
//        }
        return (!(day < 1 || mon < 1 || mon > 12 || yer < 0)
                || (!(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) && day > 31)
                || (!(mon == 4 || mon == 6 || mon == 9 || mon == 11) && day > 30)
                || (!(day > 29 || (!((yer % 4 == 0 && yer % 100 != 0))
                || (!(yer % 400 == 0)) && day > 28))));
    }

    //На вход подаются три целых числа. Выведите true, если среди них есть ровно два чётных, и false - если нет.
    static boolean isTwoEven(int num1, int num2, int num3) {
//        System.out.print(
//                (sc.nextInt() % 2 + sc.nextInt() % 2 + sc.nextInt() % 2) == 1);
        return (num1 % 2 + num2 % 2 + num3 % 2) == 1;
    }

    //На вход подаются два целых числа. Выведите на печать true, если их сумма чётна, а произведение - нечётно, и false - в противном случае.
    static boolean isSumAndP(int num1, int num2) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.print((x + y) % 2 == 0 && (x * y) % 2 == 1);
        return (num1 + num2) % 2 == 0 && (num1 * num2) % 2 == 1;
    }

    //На вход подаётся строка, а затем - одна буква. Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO".
    static String isLineContainsLetter(String line, String letter) {
//        String st = sc.nextLine();
//        System.out.print(
//                st.contains(sc.next()) || st.length() > 20 ? "YES" : "NO");
        return line.contains(letter) || line.length() > 20 ? "YES" : "NO";
    }

}
