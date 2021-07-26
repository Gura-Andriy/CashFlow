package sample.events;

import sample.businesses.classes.NotBoardBusiness;

public interface EventInterface {
    boolean isBusinessExist(NotBoardBusiness notBoardBusiness);
    int payMoney(int money);
    int addProfit(int add);

}
