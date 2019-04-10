package Homework2.Demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 定义一个List对象，如下
 *    List <String>list = new ArrayList<String>();
 * 1) 在list中添加元素，nihao,wohao,dajiahao,nihao
 *
 * 2) 在list的第二个位置添加元素，tahao
 *
 * ) 用Iterator迭代器遍历打印list中元素
 */
public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("nihao");
        list.add("wohao");
        list.add("dajiahao");
        list.add("nihao");
        list.add(2,"tahao");

/*        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            String string = (String)iterator.next();
            System.out.println(string);
        }*/
        ListIterator<String> li=list.listIterator(list.size());
        while (li.hasPrevious()){
            String string=li.previous();
            System.out.print(string+" ");
        }
        System.out.println();
        list.clear();
        list.add("123");
        list.add("234");
        list.add(2,"ccc");

        ListIterator<String> li1=list.listIterator(list.size());
        while (li1.hasPrevious()){
            String string=li1.previous();
            System.out.print(string+" ");
        }
        System.out.println();
        List<StringBuffer> list1=new ArrayList<StringBuffer>();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("123");
        list1.add(0,stringBuffer);
        list1.toString();
        stringBuffer.setLength(0);
        stringBuffer.append("456");
        list1.add(1,stringBuffer);

        ListIterator<StringBuffer> listIterator=list1.listIterator(list1.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
