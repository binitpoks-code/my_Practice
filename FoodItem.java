public class FoodItem extends MenuItem implements Orderable {

    public FoodItem(String name, double price){
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Food: " + name + " Price: $" + price);
    }

    @Override
    public void order(int quantity) {
        double total = price * quantity;
        System.out.println("Ordered " + quantity + " " + name + " Total: $" + total);
    }

}