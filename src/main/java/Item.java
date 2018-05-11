public abstract class Item implements ISell {

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

    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }

    public double calculateMarkupPercentage() {
        return (((getSellingPrice() / getCostPrice()) - 1) * 100);
    }

}
