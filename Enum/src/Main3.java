//3. Перечисление для уровней сложности:
//Создайте enum Difficulty с уровнями EASY, MEDIUM, HARD.
//Используйте цикл для перебора всех значений перечисления и выведите их на экран.
enum Difficulty {EASY, MEDIUM, HARD}

public class Main3 {
    public static void main(String[] args) {


        Difficulty[] levels = Difficulty.values();
        for (int i = 0; i < levels.length; i++) {
            System.out.println(levels[i]);

        }
    }
}
