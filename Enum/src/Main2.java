//        2. Создание enum для времён года:
//Создайте перечисление Season с константами WINTER, SPRING, SUMMER, FALL.
//        Напишите метод, который принимает сезон и
//        возвращает логическое значение: true, если это лето.

enum Seson {WINTER, SPRING, SUMMER, FALL}

public class Main2 {
    public static void main(String[] args) {
        Seson now = Seson.SUMMER;
        printSeason(now);
        System.out.println("Сейчас лето? " + isSummer(now));

    }

    public static void printSeason(Seson seson) {
        System.out.println("Сейчас " + seson);
    }

    public static boolean isSummer(Seson seson) {
        return seson == Seson.SUMMER;
    }
}