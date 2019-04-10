package Homework4.Demo3;

import java.util.*;

/**
 * 随机产生50个30到35的整数，统计每个数字出现的次数（TreeMap实现），输出时按照数字的降序排列，并且统计出现次数最多的数字和它的次数。
 * PS：如果有两个数字出现的次数一样，则只需输出其中一个。
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//降序
            }
        });
        Random random=new Random();
        for (int i = 0; i <50; i++) {
            int a=random.nextInt(6)+30;
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        List<Integer> list=new ArrayList<Integer>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);//排序升序
        System.out.println(list.get(list.size()-1));//次数最多的
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==list.get(list.size()-1)){
                System.out.println("出现次数最多的是"+entry.getKey()+",出现了"+entry.getValue()+"次");
            }
        }
    }
}
