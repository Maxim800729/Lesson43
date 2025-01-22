//        9. Добавление полей и методов для категорий товаров:
//Создайте enum ProductCategory с константами ELECTRONICS, FOOD, CLOTHING.
//Для каждой категории добавьте поле taxRate (процент налога).
//Напишите метод calculateTax, который принимает цену товара и возвращает налог на него.
//        example: double tax = ProductCategory.ELECTRONICS.calculateTax(1000);
//         System.out.println("Tax: " + tax);

enum ProductCategory {

    ELECTRONICS(14),

    FOOD(5),

    CLOTHING(10);

    private double taxRate;

    ProductCategory(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax(double price) {
        return price * (taxRate / 100);
    }
}

public class Main9 {
    public static void main(String[] args) {
        double price = 1000;
        double tax = ProductCategory.ELECTRONICS.calculateTax(price);
        System.out.println("Tax for ELECTRONICS" + tax);
        for (ProductCategory categore : ProductCategory.values()) {
            System.out.println("Category" + categore + " ,Tax for price" + price + " :" + categore.calculateTax(price));
        }
    }
}
