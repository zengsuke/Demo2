package Demo7;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student,Integer> map=new HashMap<Student,Integer>();
        map.put(new Student(1,"tom",22),1);
        map.put(new Student(2,"jone",21),2);
        map.put(new Student(3,"key",22),3);
        map.put(new Student(1,"tom",22),4);
        System.out.println(map.size());
        Set<Map.Entry<Student,Integer>> set=map.entrySet();//保存在set里面

        for (Map.Entry<Student,Integer> entry:set) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }//增强for循环
        Iterator<Map.Entry<Student,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Student,Integer> entry=iterator.next();
            Student student=entry.getKey();
            if(student.getName().equals("tom")){
                iterator.remove();
            }
        }
        while (iterator.hasNext()){
            Map.Entry<Student,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
            /* System.out.println(iterator.next().getKey()+" "+iterator.next().getValue()); 这样写，每一次next都会把游标进行往后移动一位，这样后面的getvalue并不是原先key所对应的值*/
        }//迭代器

    }
}
