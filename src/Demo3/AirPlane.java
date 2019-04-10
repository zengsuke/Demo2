package Demo3;
/*飞机：当距离大于500km时，运费=重量*距离*750，否则拒载，返回-1

提示：飞机常量public static final int TRUCK=1*/
public class AirPlane implements Transportation {


    @Override
    public double cost(double weight, double space) {
        if(space>500){
            return -1;
        }
        return weight*space*750;
    }
}
