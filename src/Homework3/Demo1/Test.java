package Homework3.Demo1;

import java.util.LinkedList;

public class Test {
    public static LinkedList<Animal> animals;//成员
    public static void main(String[] args) {
        System.out.println("please input animals:");
        FunctionImpl function=new FunctionImpl();
        animals =function.add();//添加
        function.pl(animals);
        function.addLast(animals);//添加在最后
        function.pl(animals);
        Animal animal=function.deleteLast(animals);//删除最后一个数据
        System.out.println(animal.toString());
        LinkedList<Animal> fish=function.findByName(animals,"fish");
        if(fish!=null){//查找一条鱼
            function.pl(fish);
        }else {
            System.out.println("没有鱼！");
        }
        function.deleteById(animals,1);//删除id为1的
        function.pl(animals);

    }
}
