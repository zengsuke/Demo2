package Homework3.Demo3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张三");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        delete(list);
        for (String str: list) {
            System.out.println(str);
        }

    }

    public static void delete(List<String> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
    }
}
