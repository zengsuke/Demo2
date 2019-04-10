package Homework.Demo2;

public class YDCard extends Card {

    public YDCard() {
    }

    public YDCard(String cardName) {
        super(cardName);
    }

    @Override
    public void charging() {
        System.out.println(super.getCardName()+"cost cheap....");
    }
}
