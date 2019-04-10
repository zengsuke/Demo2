package Homework.Demo2;

public abstract class Card {
    private String cardName;//name

    public Card() {
    }

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public abstract void charging();//计费

}
