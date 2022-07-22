package stepic._5_1_massiv;

import java.util.Arrays;
import java.util.Scanner;

public class _5_3_tasks_array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task3();
    }

//На ввод подаётся последовательность целых чисел. Поменяйте местами соседние элементы
// последовательности (второй с третьим, четвёртый с пятым и т.д.), кроме первого и последнего.
// Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
//Sample Input:
//1 2 3 4 5 6
//Sample Output:
//1 3 2 5 4 6
static void task3() {
        String nums = sc.nextLine();
        String[] numsArr = nums.split(" ");
        int[] res = new int[numsArr.length];

    for (int i = 0; i < res.length; i++) {
        res[i] = Integer.parseInt(numsArr[i]);
    }

    Arrays.sort(res, 2, 3);
    System.out.println(Arrays.toString(res));
}



}
