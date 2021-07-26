package sample.player;

import sample.businesses.interfaces.BusinessInterface;
import sample.owns.interfaces.OwnInterface;

import java.util.List;

public class Player {
    private String name;
    private int money = 3000000;

    private List<Credit> creditList;
    private int creditSum = creditList.stream().mapToInt(Credit::getMonthPayment).sum();

    private List<BusinessInterface> businessList;
    private int businessesProfit = businessList.stream().mapToInt(BusinessInterface::getProfit).sum();
    private List<OwnInterface> ownsList;
    private int ownsProfit = ownsList.stream().mapToInt(OwnInterface::getProfit).sum();

    private int fullProfit = businessesProfit + ownsProfit - creditSum;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCreditSum() {
        return creditList.stream().mapToInt(Credit::getMonthPayment).sum();
    }

    public boolean payCredit() {
        if (money >= getCreditSum()) {
            money -= getCreditSum();
            return true;
        } else {
            return false;
        }
    }

    public boolean isMoneyLack(int money) {
        if ((money - this.money) < 0) {
            return true;
        } else {
            return true;
        }
    }

    public void sellSomething(int price, int profit) {
        money += price;
        fullProfit -= profit;
    }

    public void sellBusiness(BusinessInterface business) {
        businessList.remove(business);
    }

    public void addCredit(int price, int monthPayment) {
        creditList.add(new Credit(price, monthPayment));
    }

    public int getFullProfit() {
        return fullProfit;
    }

    public void addProfit(int addProfit, boolean isBusiness) {
        fullProfit += addProfit;
        if (isBusiness == true) businessesProfit += addProfit;
    }

    public void addBusiness(BusinessInterface business) {
        businessList.add(business);
    }

    public int getBusinessesProfit() {
        return businessesProfit;
    }

    @Override
    public String toString() {
        return "Player: " + name +
                "\nmoney " + money +
                "\ncredit payment " + getCreditSum() +
                "\nbusinesses profit " + businessesProfit +
                "\nfull profit " + fullProfit;
    }
}
