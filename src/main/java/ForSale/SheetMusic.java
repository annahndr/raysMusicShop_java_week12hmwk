package ForSale;

import Interfaces.Saleable;

public class SheetMusic implements Saleable {

    private int buyingPrice;
    private int sellingPrice;
    private String description;

    public SheetMusic(int buyingPrice, int sellingPrice, String description){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }

}
