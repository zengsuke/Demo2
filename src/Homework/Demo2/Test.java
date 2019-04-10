package Homework.Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please input your type：");
        String name=input.next();
        Card card= CenterFactory.createCard(name);
        card.charging();
    }
}
