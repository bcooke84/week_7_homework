public abstract class Item {

    private double costPrice;
    private double sellingPrice;

    public Item(double costPrice, double sellingPrice) {
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }


}
