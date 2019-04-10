package Homework3.Demo1;

import java.util.LinkedList;

public interface Function {
    public LinkedList<Animal> add();//添加
    public void addLast(LinkedList<Animal> animals);//最后添加
    public Animal deleteLast(LinkedList<Animal> animals);//删除最后的
    public LinkedList<Animal> findByName(LinkedList<Animal> animals,String name);//通过名字
    public void deleteById(LinkedList<Animal> animals,int id);//删除id
    public void pl(LinkedList<Animal> animals);//输出

}
