import java.util.ArrayList;

public class Shop {

    ArrayList<Item> stock;

    public Shop() {
        this.stock = new ArrayList<>();
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



}
