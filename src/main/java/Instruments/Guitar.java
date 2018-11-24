package Instruments;

public class Guitar extends Instrument {

    private String guitarType;

    public Guitar(String colour, InstrumentType type, double buyPrice, double sellPrice, String guitarType) {
        super(colour, type, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }

    public String getGuitarType(){
        return this.guitarType;
    }
}
