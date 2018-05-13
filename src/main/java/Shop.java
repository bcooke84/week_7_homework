import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;
    private double till;


    public Shop() {
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public ArrayList<Item> getStock() {
        ArrayList stockCopy = this.stock;
        return stockCopy;
    }

    public void addItemToStock(Item item) {
        this.stock.add(item);
    }

    public Item removeItemFromStock(Item required) {
        for (Item item : this.stock) {
            if (item == required) {
                return this.stock.remove(this.stock.indexOf(item));
            }
        }
        return null;
    }

    public int countNumberOfItemsInStock() {
        return getStock().size();
    }

    public double getTotalMarkupProfit() {
        double total = 0;
        for(Item item : this.stock) {
            total += item.calculateMarkup();
        }
        return total;
    }

    public double getTillBalance() {
        return this.till;
    }

    public void increaseTillBalance(Item item) {
        this.till += item.getSellingPrice();
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void sellItem(Item item) {
            if (stock.contains(item)) {
                removeItemFromStock(item);
                increaseTillBalance(item);
        }
    }


}
