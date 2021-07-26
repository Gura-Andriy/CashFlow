package sample.events;

import sample.businesses.classes.NotBoardBusiness;

public class BeforeCrisisEvents implements EventInterface {
    @Override
    public boolean isBusinessExist(NotBoardBusiness notBoardBusiness) {
        return false;
    }

    @Override
    public int payMoney(int money) {
        return 0;
    }

    @Override
    public int addProfit(int add) {
        return 0;
    }
}
