//        4. Перечисление для направлений:
//Создайте enum Direction с константами NORTH, EAST, SOUTH, WEST.
//        Напишите метод, который принимает направление и
//        возвращает сообщение:
//        "Вы движетесь на [направление]".
enum Direction {NORTH,EAST,SOUTH,WEST}


public class Main4 {
    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        printDirection(direction);

    }

    public static void printDirection (Direction direction) {
        System.out.println("Вы движетесь на " + direction);
    }
}