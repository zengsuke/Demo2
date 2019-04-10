package Demo3;

public class Car implements Transportation {
    /*卡车：运费=重量*距离*120，当距离大于1000km或重量大于60（t）的时候拒载，返回-1*/
    @Override
    public double cost(double weight, double space) {
        if(weight>60||space>1000){
            return  -1;
        }
        else
            return weight*space*120;
    }
}
