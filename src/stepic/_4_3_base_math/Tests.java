package stepic._4_3_base_math;

import java.math.BigInteger;
import java.util.Scanner;

public class Tests {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        task8();
    }
//На вход подаётся натуральное число n. Определите, является ли это число простым.
// (натур число является простым если оно отлично от 1 и
// делится без остатка только на 1 и на само себя)
// Выведите true,если число n - простое, и false - если нет.
//Sample Input 1:
//100
//Sample Output 1:
//false
//Sample Input 2:
//7
//Sample Output 2:
//true
    static void task8() {
        int n = sc.nextInt();
        boolean res = n != 1;
        for (int i = 2; i < n; i = i + 1) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }

//На вход подаётся натуральное число n. Выведите на печать все его делители в одну строку через пробел.
    static void task7() {
        int x = sc.nextInt();
        for (int i = 1; i <= x ; i = i + 1) {
            System.out.print(x % i == 0 ? i + " " : "");
        }
    }

//Выведите все нечётные целые числа, находящиеся между введёнными числами (включительно), в одной
// строке через пробел, в порядке возрастания.
//Sample Input 1:
//4 10
//Sample Output 1:
//5 7 9
//Sample Input 2:
//3 11
//Sample Output 2:
//3 5 7 9 11
    static void task6() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        for ( ; x < y ; x++) {
           if (x % 2 == 1 || x % 2 == -1) {
               System.out.print(x + " ");
        }
            for ( ; x > y ; y--) {
                if (x % 2 == -1 || x % 2 == 1)
                    System.out.print(x + " ");
            }
            for (; x == y ; x++) {
                System.out.print("");
            }

//        while (x < y) {
//            if (x % 2 == 1 || x % 2 == -1) {
//                System.out.print(x + " ");
//            }
//            x = x + 1;
//        }
//        while (x > y) {
//            if (x % 2 == 1 || x % 2 == -1) {
//                System.out.print(x + " ");
//            }
//            x = x - 1;
//        }
//        while (x == y) {
//            System.out.println("");
//            x++;
//        }

    }
}
    //На вход подаeтся целое число. Выведите его максимальную цифру.
    static void task5() {
        String nums = sc.nextLine();
        char num;
        char max = '0';
        for (char x = 0; x < nums.length(); x++) {
            num = nums.charAt(x);
            if (num > max)
                max = num;
        }
        System.out.println(max);
    }

    //Выведите на печать натуральные числа от 1 до 5 по порядку, каждое число на новой строке.
    static void task4() {
        for (int x = 1; x < 6; x++) {
            System.out.println(x);
        }
    }

    //x || y истинно, если либо x, либо y истинны             (верно)
    //x && y истинно, если либо x, либо y истинны
    //x && y истинно, если и x, и y истинны одновременно      (верно)
    //x || y ложно, если и x, и y ложны одновременно          (верно)
    //(x || y) && z истинно, если истинна хотя бы одна из переменных
    static void task2() {
    }

    //Завершите программу таким образом, чтобы она вывела на печать фразу "In the loop" семь раз, каждый раз с новой строки.
    static void task1() {
        String str = "In the loop";
        for (int x = 0; x < 7; x++) {
            System.out.println(str);
        }
    }
//    int x = 1;
//        while (x <= 7) {
//        System.out.println("In the loop");
//        x++;
//    }
}
