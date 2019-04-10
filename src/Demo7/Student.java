package Demo7;

public class Student implements Comparable<Student>{
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {///排序方法
        //先比较id在比较名字,名字相同再比较年龄（默认升序）
        if(id!=o.id) {
            return id - o.id;//表示id应该在 o.id之前
        }else {
            if(name.compareTo(o.name)!=0){
                return name.compareTo(o.name);
            }else {
                return age-o.age;
            }
        }
    }
}
