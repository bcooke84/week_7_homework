public class Saxophone extends Instrument{

    private SaxPitch saxPitch;

    public Saxophone(double costPrice, double sellingPrice, String material, String colour, InstrumentType type, SaxPitch pitch) {
        super(costPrice, sellingPrice, material, colour, type);
        this.saxPitch = pitch;
    }

    public SaxPitch getSaxPitch() {
        return saxPitch;
    }

    public String play() {
        return "Doo, doo, doo!";
    }

}
