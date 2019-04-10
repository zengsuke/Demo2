package Demo3;

public class Train implements Transportation {
    /*火车：当距离在900km内，运费=重量*距离*250，大于900km时，运费=重量*距离*300*/
    @Override
    public double cost(double weight, double space) {
        if(space<=900){
            return weight*space*250;
        }
        else
            return weight*space*300;
    }

}
