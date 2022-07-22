package stepic._5_1_massiv;

import java.util.Arrays;
import java.util.Scanner;

public class _5_2_metod_array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        task2();
    }

//На вход подаётся последовательность целых чисел. Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
    static void task3() {
        String nums = sc.nextLine();
        String[] numsArr = nums.split(" ");
        int[] res = new int[numsArr.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(numsArr[i]);
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
//На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
// а на следующей строке - число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
//Sample Input:
//5
//3 12 1 22 17
//3
//Sample Output:
//12
    static void task2() {
        int n = sc.nextInt();
        int[] numsArr = new int[n];
        int nums = sc.nextInt();

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = nums;
        }

        int k = sc.nextInt();
        Arrays.sort(numsArr);

        if (k > numsArr.length || k < 0) {
                System.out.println("Ошибка ввода");
            }
            else {
                System.out.println(numsArr[k - 1]);
            }
    }

}
