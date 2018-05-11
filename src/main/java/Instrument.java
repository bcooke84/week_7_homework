public abstract class Instrument extends Item {

    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument(double costPrice, double sellingPrice, String material, String colour, InstrumentType type) {
        super(costPrice, sellingPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }
}
