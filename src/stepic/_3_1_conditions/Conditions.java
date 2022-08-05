package stepic._3_1_conditions;

import java.util.Scanner;

public class Conditions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String result = multOfSeven(6);
        System.out.println(result);
    }

    // На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, но не делится на 5, иначе -  "NO".
    static String multOfSevenNotFive(int n) {
//        int n = sc.nextInt();
//        System.out.println((n % 7) == 0 && (n % 5) != 0 ? "YES" : "NO");
        return (n % 7) == 0 && (n % 5) != 0 ? "YES" : "NO";
    }

    // На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, и "NO" - если нет.
    static String multOfSeven(int num) {
//        System.out.println((sc.nextInt() % 7) == 0 ? "YES" : "NO");
        return (num % 7) == 0 ? "YES" : "NO";
    }

    // На вход подаётся целое число n. Выведите "YES", если  можно построить правильный многогранник из правильных плоских n-угольников(3 || 4 || 5), в противном случае - "NO".
    static String isTruePolygon(int n) {
//        int a = sc.nextInt();
//        System.out.println((a > 2 && a < 6) ? "YES" : "NO");
        return (n > 2 && n < 6) ? "YES" : "NO";
    }

    // На вход подаются два числа -  масса откушенного куска уха и норматив. Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.
    static String box(double yxo, double norm) {
//        System.out.print(
//                (sc.nextDouble() < sc.nextDouble()) ? "Бой продолжается!" : "Холифилд - чемпион!");
        return (yxo < norm) ? "Бой продолжается!" : "Холифилд - чемпион!";
    }

    // Выведите на печать наибольшее из трёх целых чисел.
    static int getMax(int num1, int num2, int num3) {
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        if (num1 >= num2 && num1 >= num3) {
//            System.out.print(num1);
//        } else if (num2 > num1 && num2 >= num3) {
//            System.out.print(num2);
//        } else {
//            System.out.print(num3);
//        }
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 > num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    // На первой строке подаётся пароль, хранящийся в базе данных, на второй - пароль, введённый пользователем.Выведите на печать фразу "Access is granted", если пользователь ввёл верный пароль,и "Access is denied" - если нет.
    static String grantAccessByEquals(String dbPassword, String userPassword) {
//        if (sc.nextLine().equals(sc.nextLine())) {
//            System.out.print("Access is granted");
//        } else {
//            System.out.print("Access is denied");
//        }
        if (dbPassword.equals(userPassword)) {
            return "Access is granted";
        } else {
            return "Access is denied";
        }

    }

    // вывести на печать "Махатма", если наоборот - "Джавахарлал". Гарантируется, что строки имеют разную длину.
    static String lengthEquals(String line1, String line2) {
//        if (sc.nextLine().length() > sc.nextLine().length()) {
//            System.out.print("Махатма");
//        } else {
//            System.out.print("Джавахарлал");
//        }
        if (line1.length() > line2.length()) {
            return "Махатма";
        } else {
            return "Джавахарлал";
        }
    }
}
