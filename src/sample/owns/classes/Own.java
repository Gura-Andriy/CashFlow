package sample.owns.classes;

import sample.owns.enums.OwnTypes;
import sample.owns.interfaces.OwnInterface;
import sample.player.Credit;

public class Own implements OwnInterface {
    private int fullPrice;
    private int sellPrice;
    private int profit;
    private boolean isInCredit;
    private Credit credit = null;
    private OwnTypes type;

    public Own(int fullPrice, int sellPrice, int profit, OwnTypes type) {
        this.fullPrice = fullPrice;
        this.sellPrice = sellPrice;
        this.profit = profit;
        this.type = type;
    }

    @Override
    public int getFullPrice() {
        return fullPrice;
    }

    @Override
    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public Credit getCredit() {
        return credit;
    }

    @Override
    public void inCredit(boolean isInCredit) {
        this.isInCredit = isInCredit;
    }

    @Override
    public void setCredit(int monthPayment) {
        credit = new Credit(sellPrice, monthPayment);
    }

    @Override
    public OwnTypes getType() {
        return type;
    }
}
