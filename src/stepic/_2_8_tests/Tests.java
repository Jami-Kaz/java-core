package stepic._2_8_tests;

import java.util.Scanner;

public class Tests {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String result = lettersCount("hjjj");
        System.out.println(result);
    }

    //На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово".
    static String lettersCount(String word) {
//        String word = sc.nextLine();
//        if (word.length() == 1) {
//            System.out.println("Одна буква");
//        } else if (word.length() == 2) {
//            System.out.println("Две буквы");
//        } else if (word.length() == 3) {
//            System.out.println("Три буквы");
//        } else if (word.length() == 4) {
//            System.out.println("Четыре буквы");
//        } else if (word.length() == 5) {
//            System.out.println("Пять букв");
//        } else {
//            System.out.println("Длинное слово");
//        }
        if (word.length() == 1) {
            return "Одна буква";
        } else if (word.length() == 2) {
            return "Две буквы";
        } else if (word.length() == 3) {
            return "Три буквы";
        } else if (word.length() == 4) {
            return "Четыре буквы";
        } else if (word.length() == 5) {
            return "Пять букв";
        } else {
            return "Длинное слово";
        }
    }

    //Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶. В кабинет совещаний могут войти только те, кто указан в специальном списке:Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс. Чтобы получить допуск, нужно сказатьфразу-приветствие. Если фраза-приветствие содержит имя из списка, проход разрешается.Если же нет - проход блокируется.На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!", если имя есть в списке,и "Здесь никого нет, Вы ошиблись дверью" - если нет.
    static String task_13(String hello) {
//        String hello = sc.nextLine();
//        System.out.println(
//                        hello.contains("Джефф Безос") ||
//                        hello.contains("Илон Маск") ||
//                        hello.contains("Марк Цукерберг") ||
//                        hello.contains("Билл Гейтс") ? "Добро пожаловать!"
//                        : "Здесь никого нет, Вы ошиблись дверью");
        return hello.contains("Джефф Безос") ||
                hello.contains("Илон Маск") ||
                hello.contains("Марк Цукерберг") ||
                hello.contains("Билл Гейтс") ? "Добро пожаловать!"
                : "Здесь никого нет, Вы ошиблись дверью";
    }

    //На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область.Выведите "Yes", если попадает, и "No" - в противном случае.Примечание. Считать, что граница принадлежит заштрихованной области.
    static String isInArial(double x, double y) {
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        System.out.println(
//                x >= 0 && y <= 2 - x * x && y >= 0 || x < 0 && y >= x && y <= 2 - x * x ? "Yes" : "No");
        return x >= 0 && y <= 2 - x * x && y >= 0 || x < 0 && y >= x && y <= 2 - x * x ? "Yes" : "No";
    }

    //Выведите время года по введённому номеру месяца. Если введён ошибочный номер месяца, выведите "error".
    static String season(int month) {
//        int month = sc.nextInt();
//        if (month == 1 || month == 2 || month == 12) {
//            System.out.println("Зима");
//        } else if (month == 3 || month == 4 || month == 5) {
//            System.out.println("Весна");
//        } else if (month == 6 || month == 7 || month == 8) {
//            System.out.println("Лето");
//        } else if (month == 9 || month == 10 || month == 11) {
//            System.out.println("Осень");
//        } else {
//            System.out.println("error");
//        }

        if (month == 1 || month == 2 || month == 12) {
            return "Зима";
        } else if (month == 3 || month == 4 || month == 5) {
            return "Весна";
        } else if (month == 6 || month == 7 || month == 8) {
            return "Лето";
        } else if (month == 9 || month == 10 || month == 11) {
            return "Осень";
        } else {
            return "error";
        }
    }

    // На вход подаётся два числа - a и b. Выведите знак отношения между числами: один символ "<",если a < b, ">", если a > b и "=", если a=b.
    static char doubleCharEquals(double a, double b) {
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        if (a < b) {
//            System.out.println('<');
//        } else if (a > b) {
//            System.out.println('>');
//        } else {
//            System.out.println('=');
//        }
        if (a < b) {
            return '<';
        }
        else if (a > b) {
            return '>';
        } else {
            return '=';
        }
    }

    // На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является среднейв числе (разряд десятков), и false - если нет. Если введённое число не является трёхзначным,выведите "error".
    static boolean isContainsCentre(int num, int n) {
        return ((num / 10) % 10) == n;
    }

    // На вход подается строка, а затем слово. Выведите true, если слово содержится в строке,и false - если нет, без учёта регистров.
    static boolean isWordInLine(String line, String word) {
//        System.out.println(
//                sc.nextLine().toLowerCase().contains(sc.next().toLowerCase())); // переводим в одинаковый формат
        return line.toLowerCase().contains(word.toLowerCase());
    }

    // На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число,а в противном случае - "NO".
    static String isAbs(int x) {
//        int x = sc.nextInt();
//        System.out.println((x / 100 >= 1 && x / 100 < 10) ? "YES" : "NO");
        return (x / 100 >= 1 && x / 100 < 10) ? "YES" : "NO";
    }

    // На вход подаются целые числа x и y. Выведите их сумму и разность в формате,соответствующем примеру
    static String sumAndDiff(int x, int y) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.printf("Сложение: %d + %d = %d\n", x, y, (x + y));
//        System.out.printf("Вычитание: %d - %d = %d", x, y, (x - y));
        return String.format("Сложение: %d + %d = %d\n" +
                "Вычитание: %d - %d = %d", x, y, (x + y), x, y, (x - y));
    }

    // На вход подаётся число N - номер года по григорианскому календарю. Посчитайте, сколько високосных лет прошло, начиная с 1 года н. э. Будем считать, что григорианский календарь действовал всё это время).Примечание 1. Правила определения високосного года:год, номер которого кратен 400, — високосный;остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900,2100, 2200, 2300);остальные годы, номер которых кратен 4, — високосные.
    static int leapYearCount(int year) {
//        int year = sc.nextInt();
//        System.out.print((year / 4) - (year / 100) + (year / 400));
        return (year / 4) - (year / 100) + (year / 400);
    }

    // Напишите программу, находящую корни квадратного уравнения  {ax^2+bx+c = 0}На вход подаются целые числа a, b и c. Выведите сумму и произведение корней в одной строке, через пробел.   x1+x2=-b/a      x1*x2=c/a
    static String sumAndProCore(double a, double b, double c) {
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        System.out.print(((-1 * b) / a) + " " + (c / a));
        return ((-1 * b) / a) + " " + (c / a);
    }

    // Что выведет на печать следующий код:
    static int task_3(int x, int y) {
//        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z += --x + y++;
//        System.out.print(x + y + z);
        return x + y + z;
    }

    // На вход программа получает n - количество дней. На выходе программа должна вывести количество секунд в этом количестве дней.
    static int secInDays(int days) {
//        System.out.print(sc.nextInt() * 24 * 60 * 60);
        return days * 24 * 60 * 60;
    }

    // Завершите код, выводящий на печать сумму двух чисел. Не меняйте значение переменных.
    static int sum(int x, int y) {
//        int x = 4;
//        int y = 7;
//        System.out.print(x + y);
        return x + y;
    }

}
