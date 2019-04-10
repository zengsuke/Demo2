package Demo5;

import java.util.List;
import java.util.ListIterator;

public class FunctionImpl implements Function{
    //写一个方法，删除id为10的人 写一个方法，查询集合中是否存在一个叫李四的人
    @Override
    public void delId(List<Student> students) {
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==10){
                students.remove(i);
                i--;
            }
        }
    }
    //查询集合中是否存在一个叫李四的人
    @Override
    public Student findName(List<Student> students) {
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==10){
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public int findStudent(List<Student> students) {
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==10&&students.get(i).getAge()==32&&students.get(i).getName().equals("张三")){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void changeStduent(List<Student> students) {

    }

    @Override
    public void findAll(List<Student> students) {

    }

    @Override
    public void findAgeAll(List<Student> students) {

    }
}
