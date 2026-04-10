import java.util.ArrayList;

public class Restaurant {

    private ArrayList<MenuItem> menu = new ArrayList<>();

    public void addItem(MenuItem item){
        menu.add(item);
    }

    public void printMenu(){
        for(MenuItem item : menu){
            item.display();
        }
    }

}