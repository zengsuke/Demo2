package Demo4;

public class Test {
    public static void main(String[] args) {
        int[]array={1,2,3};
        MyUtil myUtil=new MyUtil();
        try {
            int sum=myUtil.sum(array);
            System.out.println(sum);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
