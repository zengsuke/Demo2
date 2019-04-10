package Homework.Demo3;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) throws IllegalAccessException{
        Scanner input = new Scanner(System.in);
        int[] arrays=new int[3];
        for (int i = 0; i <arrays.length; i++) {
            System.out.println("please input the "+(i+1)+" length");
            arrays[i]=input.nextInt();
        }
        judge(arrays);
    }

    private static void judge(int[] arrays) throws IllegalAccessException {
        if(arrays[0]+arrays[1]>arrays[2] && arrays[0]+arrays[2]>arrays[1] && arrays[1]+arrays[2]>arrays[0]){
            System.out.println("Triangle success");
        }
        else
            throw new IllegalAccessException(arrays[0]+","+arrays[1]+","+arrays[2]+"can not create Triangle");
    }
}
