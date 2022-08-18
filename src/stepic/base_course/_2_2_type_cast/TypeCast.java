package stepic.base_course._2_2_type_cast;

public class TypeCast {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(5));

    }

//Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью
// двойки. Решать можно разными способами:воспользовавшись одним удобным статическим методом
// из класса java.lang.Integer; применив пару трюков из двоичной арифметики; написав решение
// "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра
// соответствующих уроков).Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод
// main и обработку ввода-вывода добавит проверяющая система.
//Sample Input 1:   0           Sample Input 2:   1         Sample Input 3:   -2
//Sample Output 1:  false       Sample Output 2:  true      Sample Output 3:  true

    public static boolean isPowerOfTwo(int value) {
        for (int i = 1; i <= (value = Math.abs(value));) {
            i *= 2;
            if (i == value || value == 1) {
                return true;
            }
        }
        return false;
    }

// Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
// (обратный слэш) на расстоянии a. В качестве примера написано заведомо неправильное выражение.
// Исправьте его.
//Sample Input 1:    32      Sample Input 2:    29
//Sample Output 1:    |      Sample Output 2:   y

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
