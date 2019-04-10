package Homework.Demo2;

public class CenterFactory {
    public static Card createCard(String card){
        if(card.equals("联通")){
            return new LTCard("联通");
        }
        else if(card.equals("移动")){
            return new YDCard("移动");
        }
        else
            return null;
    }
}
