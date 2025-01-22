//10. Определение рабочего времени по дням недели:
//Создайте enum Day с константами для всех дней недели.
//Добавьте поле isWorkingDay (логическое значение).
//Реализуйте метод isWorkingDay, который возвращает
// true для будних дней и false для выходных.
//example: System.out.println(Day.MONDAY.isWorkingDay()); // true
//        System.out.println(Day.SUNDAY.isWorkingDay()); // false
public class Main10 {
    public static void main(String[] args) {
        System.out.println(Duy.MONDAY1.isWorkingDuy());
        System.out.println(Duy.SATURDAY1.isWorkingDuy());
        System.out.println(Duy.SUNDAY1.isWorkingDuy());
    }
}

enum Duy {
    MONDAY1(true),
    TUESDAY1(true),
    WEDNESDAY1(true),
    THURSDAY1(true),
    FRIDAY1(true),
    SATURDAY1(false),
    SUNDAY1(false);
    private final boolean isWorkingDuy;

    Duy(boolean isWorkingDuy) {
        this.isWorkingDuy = isWorkingDuy;
    }

    public boolean isWorkingDuy() {
        return isWorkingDuy;
    }

}

