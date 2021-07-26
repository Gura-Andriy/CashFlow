package sample.owns.interfaces;

import sample.owns.enums.OwnTypes;
import sample.player.Credit;

public interface OwnInterface {
    int getFullPrice();
    int getSellPrice();
    int getProfit();
    Credit getCredit();
    void inCredit(boolean isInCredit);
    void setCredit(int monthPayment);
    OwnTypes getType();
}
