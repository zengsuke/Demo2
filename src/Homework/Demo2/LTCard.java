package Homework.Demo2;

public class LTCard extends Card {

    public LTCard() {
    }

    public LTCard(String cardName) {
        super(cardName);
    }

    @Override
    public void charging() {
        System.out.println(super.getCardName()+"cost expensive....");
    }
}
