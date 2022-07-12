package practic._1_syntax;

public class Increment {
    public static void main(String[] args) {

        int x = 4;
//        int y = x + 1;
//        int z = x++;
//        int v = (x = x + 1);
        x += 3;         // x = x + 3
        x -= 3;
        x *= 3;
        x /= 3;

        int a = x--;    // 4 если переменная впереди знаков то она сначало присваивается
//      x = x - 1;      // 3
        int b = --x;    // 2 если знаки впереди  то сначало выполняется решение

        System.out.println(x);

//        System.out.println(b);


    }
}
