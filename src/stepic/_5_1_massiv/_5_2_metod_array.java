package stepic._5_1_massiv;

import java.util.Arrays;
import java.util.Scanner;

public class _5_2_metod_array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task2();
    }
//На вход подаётся последовательность целых чисел. Создайте из этой последовательности массив
// чисел, отсортированный по возрастанию, и выведите на печать.
//Sample Input:
//3 6 2 14 1
//Sample Output:
//[1, 2, 3, 6, 14]
    static void task3() {
        String nums = sc.nextLine();

    }
//На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
// а на следующей строке - натуральное число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
//Sample Input:
//5
//3 12 1 22 17
//3
//Sample Output:
//12
    static void task2() {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
