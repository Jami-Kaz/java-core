package stepic._4_3_base_math;

import java.math.BigInteger;
import java.util.Scanner;

public class Tests {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = isPrime(14);
        System.out.println(result);
//        task7();
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
    static boolean isPrime(int n) {
        boolean res = n != 1;
        for (int i = 2; i < n; i = i + 1) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    //На вход подаётся натуральное число n. Выведите на печать все его делители в одну строку через пробел.
    static String getDivides(int num) {
        String res = "";
        for (int i = 1; i <= num; i++) {

            res += (num % i == 0 ? i + " " : "");
        }
        return res;
    }

    //Выведите все нечётные целые числа, находящиеся между введёнными числами (включительно), в одной строке через пробел, в порядке возрастания.
//Sample Input 1:
//4 10
//Sample Output 1:
//5 7 9
//Sample Input 2:
//3 11
//Sample Output 2:
//3 5 7 9 11
    static String countOdd(int start, int end) {
        String res = "";
        if(start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (; start <= end; start++) {
            if (start % 2 == 1 || start % 2 == -1) {
                res = res + start + " ";
            }
        }
        return res;
    }

    //На вход подаётся целое число. Выведите его максимальную цифру.
    static char max(String nums) {
        char num;
        char max = '0';
        for (char x = 0; x < nums.length(); x++) {
            num = nums.charAt(x);
            if (num > max)
                max = num;
        }
        return max;
    }

    //Выведите на печать натуральные числа от 1 до 5 по порядку, каждое число на новой строке.
    static String count(int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res = res + i + "\n";
        }
        return res;
    }

    //x || y истинно, если либо x, либо y истинны             (верно)
    //x && y истинно, если либо x, либо y истинны
    //x && y истинно, если и x, и y истинны одновременно      (верно)
    //x || y ложно, если и x, и y ложны одновременно          (верно)
    //(x || y) && z истинно, если истинна хотя бы одна из переменных


    //Завершите программу таким образом, чтобы она вывела на печать фразу "In the loop" семь раз, каждый раз с новой строки.
    static String loopPhrase(int num, String phrase) {
        String res = "";
        for (int x = 0; x < num; x++) {
            res = res + phrase + "\n";
        }
        return res;

    }
//    int x = 1;
//        while (x <= 7) {
//        System.out.println("In the loop");
//        x++;
//    }
}
