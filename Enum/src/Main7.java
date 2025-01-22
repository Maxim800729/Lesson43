
//        7. Перебор значений с values:
//Создайте enum Months с названиями месяцев.
//Используйте метод values() для вывода всех месяцев на экран.
enum Months {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

public class Main7 {

    public static void main(String[] args) {
        Months[] months = Months.values();
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
    }