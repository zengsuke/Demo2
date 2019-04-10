package Homework2.Demo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("zmj",22,35.5));
        students.add(new Student("zzz",20,80));
        students.add(new Student("z",3,6));
        students.add(new Student("zlz",21,44));
        students.add(new Student("zcc",40,23));

        //迭代器
        Iterator iterator=students.iterator();
        while (iterator.hasNext()) {
            Object object = (Object) iterator.next();
            System.out.println(object.toString());
        }
        System.out.println();
        //for循环
        for (Object obj : students) {
            System.out.println(obj.toString());
        }
    }
}
