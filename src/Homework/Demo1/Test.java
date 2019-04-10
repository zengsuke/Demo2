package Homework.Demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        String data1="2015-2-17";
        String data2="2015-3-29";
        int days=cal(data1,data2);//所得天数
        System.out.println(data1+"和"+data2+"之间一共有："+days+"天");
    }

    private static int cal(String data1, String data2){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        long days= 0;
        long time1=0;
        long time2=0;
        try {
            time1=simpleDateFormat.parse(data2).getTime();
            time2=simpleDateFormat.parse(data1).getTime();
            days=(time1-time2)/(1000*60*60*24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int)days;
    }
}
