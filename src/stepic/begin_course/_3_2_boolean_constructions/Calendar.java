package stepic.begin_course._3_2_boolean_constructions;

public class Calendar {
    private int day;
    private int month;
    private int year;
    private String[] months = {"jan", "feb", "mar", "apr", "may", "jin", "jil", "aug", "sep", "oct", "nov", "dec"};

    Calendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Calendar(String date) {
        String[] dates = date.split("/");
        day = Integer.parseInt(dates[0]);
        year = Integer.parseInt(dates[2]);
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(dates[1])) {
                month = i + 1;
            }
        }

    }

    public boolean isValidDate() {
        return (!(day < 1 || month < 1 || month > 12 || year < 0)
                          || (!(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31)
                          || (!(month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
                          || (!(day > 29 || (!((year % 4 == 0 && year % 100 != 0))
                          || (!(year % 400 == 0)) && day > 28))));
    }

    public String toString() {
        return String.format("{day=%02d month=%s year=%d}", day, months[month - 1], year);
    }
}

class Test {
    public static void main(String[] args) {
//        Calendar calendar = new Calendar(2, 10, 1991);
//        boolean result = calendar.isValidDate();
//        System.out.println(result);
        Calendar calendar1 = new Calendar("20/may/1991");
        System.out.println(calendar1.isValidDate());
        System.out.println(calendar1.toString());
    }
}
