package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Teacher> teachers=new ArrayList<Teacher>();
        List<Student> students=new ArrayList<Student>();
        Util util=new UtilImpl();
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("-----------------------");
            System.out.println("输入教师(t)，学生(s)");
            String r=input.next();
            if(r.equals("t")){
                System.out.print("姓名 ");
                String name=input.next();
                System.out.print("\n论文数 ");
                int num=input.nextInt();
                Teacher teacher=new Teacher(name,num);
                if(util.compare(teacher) instanceof Teacher){
                    teachers.add(teacher);
                }
            }else if(r.equals("s")){
                System.out.print("姓名 ");
                String name=input.next();
                System.out.print("\n成绩 ");
                double num=input.nextDouble();
                Student student=new Student(name,num);
                if(util.compare(student) instanceof Student){
                    students.add(student);
                }
            }
            else break;
        }
        System.out.println("---------------------");
        System.out.println("优秀教师，学生的名单如下：");
        util.listAllTeacher(teachers);
        util.listAllStudent(students);
    }
}
