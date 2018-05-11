public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(double costPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfValves) {
        super(costPrice, sellingPrice, material, colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
