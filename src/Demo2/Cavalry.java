package Demo2;

public class Cavalry extends Soldier {
    public Cavalry() {
        super.setName("骑兵");
    }

    @Override
    public void attack() {
        System.out.println(getName()+"骑马攻击");
    }
}
