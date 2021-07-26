package sample.businesses.interfaces;

public interface BoardBusinessInterface extends BusinessInterface {
    String getName();
    int getNumber();
    int getPrice();
    @Override
    int getProfit();
    int getCrisisProfit();
    int getInspectorPayment();
    int getClientPayment();

    void addProfit(int add);
    void addCrisisProfit(int add);
}
