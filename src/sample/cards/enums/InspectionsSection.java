package sample.cards.enums;

public enum InspectionsSection {
    EARN_CHANCE(0),
    MARKET_EVENTS(0),
    SALARY(1),
    FIRE_INSPECTION(-0.1),
    TAX_INSPECTION(-0.5),
    SANITARY_INSPECTION(-0.1),
    ECONOMIC_CRIME_DEPARTMENT(-0.25);

    double earnMoneyIndex;
    InspectionsSection(double earnMoneyIndex) {
        this.earnMoneyIndex = earnMoneyIndex;
    }

    public double getIndex() {
        return earnMoneyIndex;
    }
}
