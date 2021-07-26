package sample.businesses.enums;

import sample.businesses.classes.BoardBusiness;

public enum BoardBusinesses {
    ;

    BoardBusiness business;
    BoardBusinesses(String name, int number, int price, int profit, int crisisProfit, int inspectorPayment, int clientPayment) {
        business = new BoardBusiness(name, number, price, profit, crisisProfit, inspectorPayment, clientPayment);
    }
}
