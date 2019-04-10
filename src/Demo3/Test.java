package Demo3;

import java.util.Scanner;

import static Demo3.Transportation.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入你选择的交通工具：（1飞机，2火车，3卡车）");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a==TRUCK){
            AirPlane airPlane=new AirPlane();
            System.out.println("飞机所需运费："+airPlane.cost(500,800));
        }
        else if(a==TRAIN){
            Train train=new Train();
            System.out.println("火车所需运费："+train.cost(500,200));
        }
        else if(a==CAR){
            Car car=new Car();
            System.out.println("卡车所需运费："+car.cost(500,200));
        }
        else
            System.out.println("输入有误！");

    }
}
