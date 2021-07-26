package sample.businesses.interfaces;

public interface NotBoardBusinessInterface extends BusinessInterface {
    String getName();
    int getPrice();
    @Override
    int getProfit();
    int getCrisisProfit();
    int getInspectorPayment();
    int getClientPayment();

    void addProfit(int add);
    void addCrisisProfit(int add);
}
