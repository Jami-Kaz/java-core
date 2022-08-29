package practic._1_syntax;

public class ReferenceType {
    public static void main(String[] args) {
        int x = 1;  // значение переменной число
        int y = x;  // копирование значения

        y = 0;
        System.out.println(x);


        int[] arrX = {1};   // значение переменной ссылка
        int[] arrY = arrX;  // копирование ссылки на обьект

        arrX = new int[]{7}; // замена ссылки
        arrX[0] = 2;

        System.out.println(arrY[0]);


    }
}
