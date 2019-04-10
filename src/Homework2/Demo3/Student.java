package Homework2.Demo3;

/**
 * 1）创建Student类，包含String类型的name，int类型的age，double类型的score，并重写getter、setter等方法。
 * 2）创建5个Student对象，保存到ArrayList容器中。
 * 3）通过迭代器和增强for循环两种方式遍历该集合。
 */
public class Student {
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
