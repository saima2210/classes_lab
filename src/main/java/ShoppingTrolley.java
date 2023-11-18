import java.util.ArrayList;
import java.util.List;

public class ShoppingTrolley {

    private ArrayList<String> items;

    public ShoppingTrolley() {
        this.items = new ArrayList<>();
    }

    public int countItems() {
        return this.items.size();
    }

    public void addItems(String newItem) {
       this.items.add(newItem);
    }

    public boolean isItemInTrolley(String item){
        return this.items.contains(item);
    }
}
