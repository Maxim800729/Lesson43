//        8. Добавление описания к временам года:
//Создайте enum Season с константами WINTER, SPRING, SUMMER, FALL.
//Добавьте поле description (строка) для каждого сезона (например, "Cold", "Warm").
//Напишите метод getDescription, который возвращает описание сезона.
//example: System.out.println(Season.WINTER.getDescription());

enum Season {
    WINTER("Cold"),
    SPRING("Fresh"),
    SUMMER("Hot"),
    FALL("Rainy");
    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class Main8 {
    public static void main(String[] args) {
        for (Season season : Season.values())
            System.out.println(season + " :" +season.getDescription());
        System.out.println("WINTER descriptuon -" + Season.WINTER.getDescription());
    }
}
