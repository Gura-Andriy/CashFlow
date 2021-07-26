package sample.businesses.enums;

import sample.businesses.classes.NotBoardBusiness;

public enum NotBoardBusinesses {
    ;

    NotBoardBusiness business;
    NotBoardBusinesses(String name, int price, int profit, int crisisProfit, int inspectorPayment, int clientPayment) {
        business = new NotBoardBusiness(name, price, profit, crisisProfit, inspectorPayment, clientPayment);
    }
}
