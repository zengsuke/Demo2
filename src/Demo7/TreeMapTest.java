package Demo7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Student,Integer> map=new TreeMap<Student,Integer>();
        map.put(new Student(1,"tom",22),1);
        map.put(new Student(2,"jone",21),2);
        map.put(new Student(3,"key",22),3);
        map.put(new Student(1,"tom",22),4);
        map.put(new Student(1,"jone",21),2);
        map.put(new Student(2,"aaa",22),3);
        map.put(new Student(3,"key",33),4);
        System.out.println(map.size());
        //TreeMap遍历
        for (Map.Entry<Student,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
