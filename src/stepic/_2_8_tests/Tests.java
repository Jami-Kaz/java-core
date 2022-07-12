package stepic._2_8_tests;

import java.util.Scanner;

public class Tests {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task_14();
    }

    //На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово".
    static void task_14() {
        String word = sc.nextLine();
        if (word.length() == 1) {
            System.out.println("Одна буква");
        } else if (word.length() == 2) {
            System.out.println("Две буквы");
        } else if (word.length() == 3) {
            System.out.println("Три буквы");
        } else if (word.length() == 4) {
            System.out.println("Четыре буквы");
        } else if (word.length() == 5) {
            System.out.println("Пять букв");
        } else {
            System.out.println("Длинное слово");
        }
    }

    //Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶. В кабинет совещаний могут войти только те, кто указан в специальном списке:Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс. Чтобы получить допуск, нужно сказатьфразу-приветствие. Если фраза-приветствие содержит имя из списка, проход разрешается.Если же нет - проход блокируется.На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!", если имя есть в списке,и "Здесь никого нет, Вы ошиблись дверью" - если нет.
    static void task_13() {
        String hello = sc.nextLine();
        System.out.println(
                        hello.contains("Джефф Безос") ||
                        hello.contains("Илон Маск") ||
                        hello.contains("Марк Цукерберг") ||
                        hello.contains("Билл Гейтс") ? "Добро пожаловать!"
                        : "Здесь никого нет, Вы ошиблись дверью");
    }

    //На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область.Выведите "Yes", если попадает, и "No" - в противном случае.Примечание. Считать, что граница принадлежит заштрихованной области.
    static void task_12() {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(
                x >= 0 && y <= 2 - x * x && y >= 0 || x < 0 && y >= x && y <= 2 - x * x ? "Yes" : "No");
    }

    //Выведите время года по введённому номеру месяца. Если введён ошибочный номер месяца, выведите "error".
    static void task_11() {
        int x = sc.nextInt();
        if (x == 1 || x == 2 || x == 12) {
            System.out.println("Зима");
        } else if (x == 3 || x == 4 || x == 5) {
            System.out.println("Весна");
        } else if (x == 6 || x == 7 || x == 8) {
            System.out.println("Лето");
        } else if (x == 9 || x == 10 || x == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("error");
        }
    }

    // На вход подаётся два числа - a и b. Выведите знак отношения между числами: один символ "<",если a < b, ">", если a > b и "=", если a=b.
    static void task_10() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a < b) {
            System.out.println('<');
        } else if (a > b) {
            System.out.println('>');
        } else {
            System.out.println('=');
        }
    }

    // На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является среднейв числе (разряд десятков), и false - если нет. Если введённое число не является трёхзначным,выведите "error".
    static void task_9() {
    }

    // На вход подается строка, а затем слово. Выведите true, если слово содержится в строке,и false - если нет, без учёта регистров.
    static void task_8() {
        System.out.println(
                sc.nextLine().toLowerCase().contains(sc.next().toLowerCase())); // переводим в одинаковый формат
    }

    // На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число,а в противном случае - "NO".
    static void task_7() {
        int x = sc.nextInt();
        System.out.println((x / 100 >= 1 && x / 100 < 10) ? "YES" : "NO");
    }

    // На вход подаются целые числа x и y. Выведите их сумму и разность в формате,соответствующем примеру
    static void task_6() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("Сложение: %d + %d = %d\n", x, y, (x + y));
        System.out.printf("Вычитание: %d - %d = %d", x, y, (x - y));
    }

    // На вход подаётся число N - номер года по григорианскому календарю. Посчитайте, сколько високосных лет прошло, начиная с 1 года н. э. Будем считать, что григорианский календарь действовал всё это время).Примечание 1. Правила определения високосного года:год, номер которого кратен 400, — високосный;остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900,2100, 2200, 2300);остальные годы, номер которых кратен 4, — високосные.
    static void task_5() {
        int year = sc.nextInt();
        System.out.print((year / 4) - (year / 100) + (year / 400));
    }

    // Напишите программу, находящую корни квадратного уравнения  {ax^2+bx+c = 0}На вход подаются целые числа a, b и c. Выведите сумму и произведение корней в одной строке, через пробел.   x1+x2=-b/a      x1*x2=c/a
    static void task_4() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.print(((-1 * b) / a) + " " + (c / a));
    }

    // Что выведет на печать следующий код:
    static void task_3() {
        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z += --x + y++;
        System.out.print(x + y + z);
    }

    // На вход программа получает n - количество дней. На выходе программа должна вывести количество секунд в этом количестве дней.
    static void task_2() {
        System.out.print(sc.nextInt() * 24 * 60 * 60);
    }

    // Завершите код, выводящий на печать сумму двух чисел. Не меняйте значение переменных.
    static void task_1() {
        int x = 4;
        int y = 7;
        System.out.print(x + y);
    }

}
