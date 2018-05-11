public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(double costPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfKeys) {
        super(costPrice, sellingPrice, material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }


}
