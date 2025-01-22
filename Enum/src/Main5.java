//        5. Использование метода valueOf:
//Создайте enum Status с константами START, PROCESSING, FINISHED.
//        Напишите программу, которая принимает строку из консоли и
//        преобразует её в значение перечисления с помощью valueOf.

import java.util.Scanner;

enum Status {START, PROCESSING, FINISHED}

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите статус(START, PROCESSING, FINISHED):  ");
        String input = scanner.nextLine().toUpperCase();
        try {
            Status status = Status.valueOf(input);
            System.out.println("Вы ввели статус: " + status);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка!");
        }
    }
}
