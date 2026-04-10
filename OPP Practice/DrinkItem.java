public class DrinkItem extends MenuItem implements Orderable {

    public DrinkItem(String name, double price){
        super(name, price);
    }

    @Override
    public void display(){
        System.out.println("Drink: " + name + " Price: $" + price);
    }

    @Override
    public void order(int quantity){
        double total = price * quantity;
        System.out.println("Ordered " + quantity + " " + name + " Total: $" + total);
    }
}