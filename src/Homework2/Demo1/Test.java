package Homework2.Demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int num=getNum();
        System.out.println(num);
    }
    private static int getNum() {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("请输入整数：");
            try {
                int num=input.nextInt();
                return num;
            }catch (InputMismatchException e){//捕获输入异常
                input.nextLine();//数据清空
                System.out.println("输入有误请重新输入！");
            }

        }
    }
}
