package Demo5;

import java.util.List;

public interface Function {
    public void delId(List<Student> students);
    public Student findName(List<Student> students);
    public int findStudent(List<Student> students);
    public void changeStduent(List<Student> students);
    public void findAll(List<Student> students);
    public void findAgeAll(List<Student> students);
}
