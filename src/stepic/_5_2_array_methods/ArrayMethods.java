package stepic._5_2_array_methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      int[] result = sortSequence("1 5 8 2 0");
        System.out.println(Arrays.toString(result));
    }

    //На вход подаётся последовательность целых чисел. Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
    static int[] sortSequence(String nums) {
        String[] numsArr = nums.split(" ");
        int[] res = new int[numsArr.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(numsArr[i]);
        }
        Arrays.sort(res);
        return res;
    }

    //На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
// а на следующей строке - число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
//Sample Input:
// 5
// 3 12 1 22 17
// 3
//Sample Output:
//12
    static int kCountSorted(int n, int k, int... seq) {
        int[] numsArr = new int[n];
        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = seq[i];
        }
        Arrays.sort(numsArr);
        if (k > numsArr.length || k < 0) {
            return -1;
        } else {
            return numsArr[k - 1];
        }
    }
}
