package stepic._3_2_boolean_constructions;

/**
 *     static boolean isValidDate(int day, int mon, int yer) {
 *         return (!(day < 1 || mon < 1 || mon > 12 || yer < 0)
 *                 || (!(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) && day > 31)
 *                 || (!(mon == 4 || mon == 6 || mon == 9 || mon == 11) && day > 30)
 *                 || (!(day > 29 || (!((yer % 4 == 0 && yer % 100 != 0))
 *                 || (!(yer % 400 == 0)) && day > 28))));
 *     }
 */
public class Calendar {
    int day;
    int month;
    int year;

    Calendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    boolean isValidDate() {
        return (!(day < 1 || month < 1 || month > 12 || year < 0)
                          || (!(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31)
                          || (!(month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
                          || (!(day > 29 || (!((year % 4 == 0 && year % 100 != 0))
                          || (!(year % 400 == 0)) && day > 28))));
    }
}

class Test {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2, 10, 1991);
        boolean result = calendar.isValidDate();
        System.out.println(result);
    }
}
