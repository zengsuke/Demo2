package Demo2;

public class Officer extends Soldier {
    public Officer() {
        super.setName("军官");
    }

    @Override
    public void attack() {
        System.out.println(getName()+"指挥攻击");
    }

    public void single(int type){//发号
        switch (type){
            case 1:
                Infantry infantry=new Infantry();
                infantry.attack();
                break;
            case 2:
                Cavalry cavalry=new Cavalry();
                cavalry.attack();
                break;
            case 3:
                Mauler mauler=new Mauler();
                mauler.attack();
                break;
            case 4:
                cavalry=new Cavalry();
                infantry=new Infantry();
                mauler=new Mauler();
                infantry.attack();
                cavalry.attack();
                mauler.attack();
                break;

            default:
                break;
        }
    }
}
