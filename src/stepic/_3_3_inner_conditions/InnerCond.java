package stepic._3_3_inner_conditions;

import java.util.Scanner;

public class InnerCond {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task_2();
    }

    //ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты различаются. Разработчики решили объявить забастовку, если разница максимальной и минимальной зарплаты превысит определённый уровень. Определите, грозит ли ООО "Круче Гугла" забастовка.
    static void task_2() {
        int zp1 = sc.nextInt();
        int zp2 = sc.nextInt();
        int zp3 = sc.nextInt();
        int raz = sc.nextInt();
        if (zp1 - zp2 > raz || zp1 - zp3 > raz || zp2 - zp1 > raz || zp2 - zp3 > raz || zp3 - zp1 > raz || zp3 - zp2 > raz) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }

    //На вход подаётся три целых числа. Выведите среднее из них (т.е. не минимальное и не максимальное).
    static void task_1() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x <= y && x >= z || x <= z && x >= y) {
            System.out.println(x);
        } else if (y <= x && y >= z || y <= z && y >= x) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
