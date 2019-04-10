package Demo2;
/*模拟一个军队作战，军队里面有各种兵，骑兵，步兵等等。每种兵的攻击敌人方式不一样。
        建立各种各样的兵,至少3种,然后建立一个军官，军官也会上场去攻击敌人，但是军官还有一种行为，就是发号，军官发号了，
        无论什么兵都去战场攻击敌人,也可以指定哪种兵去攻击敌人。
        最后程序运行效果就是一个军官开始发号，然后所有被指定的士兵包括军官都去打仗,显示每个人攻击敌人的方式。*/
public abstract class Soldier {
    private String name;

    public Soldier() {
    }

    public Soldier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();//攻击方式
}
