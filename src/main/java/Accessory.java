public class Accessory extends Item {

    private String description;

    public Accessory(String description, double costPrice, double sellingPrice) {
        super(costPrice, sellingPrice);
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
