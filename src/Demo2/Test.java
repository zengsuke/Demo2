package Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("军官发出指挥：（1步兵，2骑兵，3盾兵，4一起）");
        Scanner input=new Scanner(System.in);
        int type=input.nextInt();
        Officer officer=new Officer();
        officer.attack();
        officer.single(type);
    }
}
