package Homework4.Demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * "chenhao"
 * "zhangsan"
 * "zhangsan"
 * "chenhao"
 * "lisi"
 * "wangwu"
 * "zhaoliu"
 * "xiaoqiang"
 * "haha"
 * 打印输出各个字符串出现的次数（使用HashMap实现，键保存字符串，值保存保存出现的次数）
 */
public class HashMapTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<9;i++){
            System.out.println("please input your name:");
            String name=input.next();
            if(map.containsKey(name)){
                map.put(name,map.get(name)+1);
            }
            else {
                map.put(name,1);
            }
        }

        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
