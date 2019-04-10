package Demo5;

/**
 * 学生类：id name age 写一个方法，循环录入五条数据
 * 写一个方法，删除id为10的人 写一个方法，查询集合中是否存在一个叫李四的人
 * 写一个方法，查询集合中是否有一个叫王五并且年龄为32的人
 * 写一个方法，获取集合中名字叫王五，年龄为32，id为4的人的下标 通过这个下标对这个人进行修改 修改他的年龄为55
 * 写一个方法，遍历输出所有学生的信息
 * 写一个方法，写一个方法遍历输出所有年龄为4的学员信息
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
