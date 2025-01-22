//6. Работа с ordinal:
//Создайте enum Priority с уровнями LOW, MEDIUM, HIGH.
//Напишите метод, который возвращает номер каждого уровня,
// используя метод ordinal().

enum Priority {LOW, MEDIUM, HIGH}

public class Main6 {
    public static void main(String[] args) {
        Priority[] priorities = Priority.values();
        for (int i = 0; i < priorities.length; i++) {
            System.out.println("уровень :" + priorities[i] + " ,номер " + priorities[i].ordinal());

        }


    }
}
