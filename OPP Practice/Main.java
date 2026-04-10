import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        FoodItem burger = new FoodItem("Burger", 8.99);
        FoodItem pizza = new FoodItem("Pizza", 12.50);

        DrinkItem soda = new DrinkItem("Soda", 2.50);
        DrinkItem coffee = new DrinkItem("Coffee", 3.25);

        restaurant.addItem(burger);
        restaurant.addItem(pizza);
        restaurant.addItem(soda);
        restaurant.addItem(coffee);

        restaurant.printMenu();

        simulateOrder(burger, 2);
        simulateOrder(coffee, 3);

    }

    public static void simulateOrder(Orderable item, int quantity) {

        System.out.println("Processing order...");
        item.order(quantity);

    }

}