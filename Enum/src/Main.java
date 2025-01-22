//Простые задания:


//
//

//        1. Создание и использование enum для дней недели:
//Создайте перечисление Day с константами для всех дней недели.
//        Напишите метод, который принимает Day
//        в качестве аргумента и выводит сообщение: "Сегодня [день]".

enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        printDay(today);
    }
    public static void printDay(Day day){
        System.out.println("Сегодня "+day);
    }
}
