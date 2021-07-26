package sample.businesses.classes;

import sample.businesses.interfaces.NotBoardBusinessInterface;

public class NotBoardBusiness implements NotBoardBusinessInterface {
    private String name;
    private int price;
    private int profit;
    private int crisisProfit;
    private int inspectorPayment;
    private int clientPayment;

    public NotBoardBusiness(String name, int price, int profit, int crisisProfit, int inspectorPayment, int clientPayment) {
        this.name = name;
        this.price = price;
        this.profit = profit;
        this.crisisProfit = crisisProfit;
        this.inspectorPayment = inspectorPayment;
        this.clientPayment = clientPayment;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public int getCrisisProfit() {
        return crisisProfit;
    }

    @Override
    public int getInspectorPayment() {
        return inspectorPayment;
    }

    @Override
    public int getClientPayment() {
        return clientPayment;
    }

    @Override
    public void addProfit(int add) {
        profit += add;
    }

    @Override
    public void addCrisisProfit(int add) {
        crisisProfit += add;
    }
}
