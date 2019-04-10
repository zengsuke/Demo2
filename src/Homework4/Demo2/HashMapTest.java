package Homework4.Demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 2）创建5个Student对象。已知一个Integer类型的学号对应唯一的一个Student对象
 * 3）将5个Student对象保存到HashMap容器中。
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,Student> map=new HashMap<Integer, Student>();
        for (int i = 0; i <5; i++) {
            map.put(i,new Student("zmj",(22+i),55+i));
        }
        for (Map.Entry<Integer,Student> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue().toString());
        }
    }
}
