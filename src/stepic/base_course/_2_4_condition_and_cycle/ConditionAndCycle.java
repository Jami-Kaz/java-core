package stepic.base_course._2_4_condition_and_cycle;

import java.math.BigInteger;

public class ConditionAndCycle {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("5");
        BigInteger.valueOf(0);
        BigInteger b = BigInteger.ONE;

        bigInteger.add(BigInteger.valueOf(2));       // добавить
        bigInteger.subtract(BigInteger.TEN);         // отнять
        bigInteger.multiply(BigInteger.valueOf(3));  // умножить
        bigInteger.divide(BigInteger.valueOf(2));    // делить
        bigInteger.pow(2);                           // степень

        System.out.println(factorial(40));


    }

    /**
     * Реализуйте метод, вычисляющий факториал заданного натурального числа.
     *
     * Факториал N вычисляется как 1 * 2 * 3 * ... * N
     *
     * Поскольку это очень быстро растущая функция,
     * то даже для небольших N вместимости типов int и long очень скоро не хватит.
     * Поэтому будем использовать BigInteger.
     *
     * Воспользуйтесь предоставленным шаблоном. Декларацию класса,
     * метод main и обработку ввода-вывода добавит проверяющая система.
     *
     * Sample Input 1:
     * 1
     * Sample Output 1:
     * 1
     *
     * Sample Input 2:
     * 3
     * Sample Output 2:
     * 6
     */
    // 1*2*3=6          2 432 902 008 176 640 000
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return new BigInteger(String.valueOf(res));

    }
}
