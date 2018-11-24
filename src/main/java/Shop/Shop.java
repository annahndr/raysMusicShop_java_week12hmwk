package Shop;

import Instruments.Clarinet;
import Instruments.Guitar;
import Interfaces.Saleable;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Saleable> stock;

    public Shop() {
        this.stock = new ArrayList<Saleable>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addStock(Saleable saleable) {
        this.stock.add(saleable);
    }

    public void removeStock(Saleable itemForSale) {
                this.stock.remove(itemForSale);
            }

    public double calculateProfit() {
        double profit = 0;
        for(Saleable item:this.stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
