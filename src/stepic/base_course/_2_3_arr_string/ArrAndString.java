package stepic.base_course._2_3_arr_string;

public class ArrAndString {
    public static void main(String[] args) {
        System.out.println("");
    }

// Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется
// строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
// При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки
// препинания, а также регистр символов должны игнорироваться.
//
// 1. для удаления из строки всех символов, не являющихся буквами и цифрами,
//      можно воспользоваться регулярным выражением "[^a-zA-Z0-9]";
// 2. найдите в классе String метод, выполняющий замену по регулярному выражению;
// 3. для перестановки символов строки в обратном порядке можно воспользоваться
//      методом reverse(), который находится в классе StringBuilder;
// 4. в классе String есть методы для преобразования всей строки в верхний и нижний регистр.

//Sample Input:
//Madam, I'm Adam!
//Sample Output:
//true
    public static boolean isPalindrome(String text) {

        String clean = text.replaceAll("[^a-zA-Z0-9]", "");
        String revers = new StringBuilder(clean).reverse().toString();

        return clean.equalsIgnoreCase(revers);

    }
}
