package Demo2;

public class Infantry extends Soldier {
    public Infantry() {
        super.setName("步兵");
    }

    @Override
    public void attack() {
        System.out.println(getName()+"步行攻击");
    }
}
