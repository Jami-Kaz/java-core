package stepic._3_1_conditions;

import java.util.Scanner;

public class Conditions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task_7();
    }

    // На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, но не делится на 5, иначе -  "NO".
    static void task_7() {
        int n = sc.nextInt();
        System.out.println((n % 7) == 0 && (n % 5) != 0 ? "YES" : "NO");
    }

    // На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, и "NO" - если нет.
    static void task_6() {
        System.out.println((sc.nextInt() % 7) == 0 ? "YES" : "NO");
    }

    // На вход подаётся целое число n. Выведите "YES", если (3 || 4 || 5) можно построить правильныймногогранник из правильных плоских n-угольников, в противном случае - "NO".
    static void task_5() {
        int a = sc.nextInt();
        System.out.println((a > 2 && a < 6) ? "YES" : "NO");
    }

    // На вход подаются два числа -  масса откушенного куска уха и норматив. Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.
    static void task_4() {
        System.out.print(
                (sc.nextDouble() < sc.nextDouble()) ? "Бой продолжается!" : "Холифилд - чемпион!");
    }

    // Выведите на печать наибольшее из трёх целых чисел.
    static void task_3() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x >= y && x >= z) {
            System.out.print(x);
        } else if (y > x && y >= z) {
            System.out.print(y);
        } else {
            System.out.print(z);
        }
    }

    // На первой строке подаётся пароль, хранящийся в базе данных, на второй - пароль, введённый пользователем.Выведите на печать фразу "Access is granted", если пользователь ввёл верный пароль,и "Access is denied" - если нет.
    static void task_2() {
        if (sc.nextLine().equals(sc.nextLine())) {
            System.out.print("Access is granted");
        } else {
            System.out.print("Access is denied");
        }

    }

    // вывести на печать "Махатма", если наоборот - "Джавахарлал". Гарантируется, что строки имеют разную длину.
    static void task_1() {
        if (sc.nextLine().length() > sc.nextLine().length()) {
            System.out.print("Махатма");
        } else {
            System.out.print("Джавахарлал");
        }
    }
}
