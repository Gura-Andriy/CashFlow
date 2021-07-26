package sample.player;

public class Credit {
    private int price;
    private int monthPayment;
    private boolean isDone = false;

    public Credit(int price, int monthPayment) {
        this.price = price;
        this.monthPayment = monthPayment;
    }

    public int getPrice() {
        return price;
    }

    public int getMonthPayment() {
        return monthPayment;
    }

    public boolean isDone() {
        return isDone;
    }

    public void payCredit(int money) {
        if (money < price) {
            price -= money;
        } else if (money >= price) {
            price = 0;
            monthPayment = 0;
            isDone = true;
        }
    }
}
