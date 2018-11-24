package Instruments;

public class Clarinet extends Instrument {

    private String material;

    public Clarinet(String colour, InstrumentType type, double buyingPrice, double sellingPrice, String material) {
        super(colour, type, buyingPrice, sellingPrice);
        this.material = material;
    }

    public String getMaterial(){
        return this.material;
    }

}
