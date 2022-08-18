package stepic.base_course._2_1_primetive;

public class Bool {

    public static void main(String[] args) {

        System.out.println(flipBit(13, 1));

    }

    // true, если среди четырех его аргументов ровно два истинны
    public static boolean booleanExpression(boolean... bool) {
        int res = 0;

        for (boolean b : bool) {
            if (b) {
                res++;
            }
        }
        return res == 2;
    }

    //В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом
// не кратен 100, либо кратен 400.
//Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до
// заданного года включительно. В программу всегда подается положительный номер года.
// Предполагается решение без циклов. Вам надо придумать и записать несложную формулу,
// использующую только арифметические операторы.
//Sample Input 1:   1         Sample Input 2:   4      Sample Input 3:  100
//Sample Output 1:  0         Sample Output 2:  1      Sample Output 3:  24
    public static int leapYearCount(int year) {
        int res = 0;
        for (int i = 1; i <= year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                res++;
            }
        }
        return res;
    }

    //Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
//Допустимая погрешность – 0.0001 (1E-4)
//Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
//В качестве примера написано заведомо неправильное выражение. Исправьте его.
//    Sample Input:   0.1 0.2 0.3       Sample Output:    true
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }

    //    Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное
    //13 1     12
    //13 2     15
    //13 3     9
    //13 4     5
    public static int flipBit(int value, int bitIndex) {
        StringBuilder res = new StringBuilder(Integer.toBinaryString(value)).reverse();
        if (value >= 0) {
            for (int i = 0, l = 32 - res.length(); i < l; i++) {
                res.append('0');
            }
        }
        res.setCharAt(bitIndex - 1, res.charAt(bitIndex - 1) == '1' ? '0' : '1');
        return Integer.parseUnsignedInt(res.reverse().toString(), 2);
    }

}
