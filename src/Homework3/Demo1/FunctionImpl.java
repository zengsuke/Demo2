package Homework3.Demo1;

import java.util.LinkedList;
import java.util.Scanner;

public class FunctionImpl implements Function {
    @Override
    public LinkedList<Animal> add() {
        Scanner input=new Scanner(System.in);
        LinkedList<Animal> animals=new LinkedList<Animal>();
        for (int i = 0; i <5; i++) {
            Animal animal=new Animal();
            System.out.println("请输入动物的id:");
            int id=input.nextInt();
            animal.setId(id);
            System.out.println("请输入动物的名字：");
            animal.setName(input.next());
            System.out.println("请输入动物的年龄：");
            animal.setAge(input.nextInt());
            animals.add(animal);
        }
        return animals;
    }

    @Override
    public void addLast(LinkedList<Animal> animals) {
        System.out.println("在链表最后添加一个数据：");
        Animal animal= new Animal(4,"fish",2);
        animals.addLast(animal);
    }

    @Override
    public Animal deleteLast(LinkedList<Animal> animals) {
        System.out.println("删除链表最后一个数据：");
        Animal animal=animals.getLast();
        animals.removeLast();
        return animal;
    }

    @Override
    public LinkedList<Animal> findByName(LinkedList<Animal> animals, String name) {
        System.out.println("找到链表中的鱼：");
        LinkedList<Animal> a=new LinkedList<Animal>();
        for (int i = 0; i <animals.size(); i++) {
            if(animals.get(i).getName().equals(name)){
                a.add(animals.get(i));
            }
        }
        return a;
    }

    @Override
    public void deleteById(LinkedList<Animal> animals,int id) {
        System.out.println("删除id为1的：");
        for (int i = 0; i <animals.size(); i++) {
            if(id==animals.get(i).getId()){
                animals.remove(i);
                i--;
            }
        }
    }

    @Override
    public void pl(LinkedList<Animal> animals) {
        for (int i = 0; i <animals.size(); i++) {
            System.out.println(animals.get(i).toString());
        }
    }
}
