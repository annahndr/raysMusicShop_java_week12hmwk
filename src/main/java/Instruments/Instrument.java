package Instruments;

import Interfaces.Playable;
import Interfaces.Saleable;

public abstract class Instrument implements Playable, Saleable {

    private String colour;
    private InstrumentType instrumentType;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice) {
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyPrice = buyingPrice;
        this.sellPrice = sellingPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public void setType(InstrumentType type) {
        this.instrumentType = type;
    }

    public String play(){
        return "tune";
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

}
