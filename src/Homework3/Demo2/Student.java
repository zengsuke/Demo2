package Homework3.Demo2;

/**
 * 创建一个学生类，具有属性 id,name,score
 *
 * 创建arraylist，循环往集合中添加学生对象（5个即可）
 *
 * 要求：学号相同并且姓名相同的学员视为同一个学生，无法添加，给出提示，最后学生依然放5个
 *
 *          遍历整个集合输出
 *
 *          查找一个学生是否存在，存在的话删除该学生，不存在给出提示
 *
 *          查找一个学生是否存在，如果存在修改该学生信息，不存在给出提示
 */
public class Student {
    private String name;
    private int id;
    private double score;

    public Student() {
    }

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", id=" + id +
                ", score=" + score +
                '}';
    }
}
