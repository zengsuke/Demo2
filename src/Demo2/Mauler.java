package Demo2;

public class Mauler extends Soldier {
    public Mauler() {
        super.setName("盾兵");
    }

    @Override
    public void attack() {
        System.out.println(getName()+"持盾抵挡");
    }
}
