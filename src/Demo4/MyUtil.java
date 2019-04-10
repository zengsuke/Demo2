package Demo4;

public class MyUtil {
    public int sum(int[] array)throws IllegalArgumentException{
        if(null==array){
            throw new IllegalArgumentException("null");
        }
        int sum=0;
        for (int i = 0; i <array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
