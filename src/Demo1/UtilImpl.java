package Demo1;

import java.util.ArrayList;
import java.util.List;

public class UtilImpl implements Util {
    @Override
    public Teacher compare(Teacher teacher) {
        if(teacher.getNumber()>=3){
            return teacher;
        }
        else
            return null;
    }

    @Override
    public Student compare(Student student) {
        if(student.getScore()>=90){
            return student;
        }
        else
            return null;

    }

    @Override
    public void listAllTeacher(List<Teacher> teachers) {
        for (Teacher t:teachers) {
            System.out.println(t);
        }
    }

    @Override
    public void listAllStudent(List<Student> students) {
        for (Student s:students) {
            System.out.println(s);
        }
    }
}
