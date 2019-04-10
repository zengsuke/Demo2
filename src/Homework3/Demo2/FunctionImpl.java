package Homework3.Demo2;

import java.util.List;
import java.util.Scanner;

public class FunctionImpl implements Function {
    @Override
    public void add(List<Student> students) {
        Scanner input=new Scanner(System.in);
        students.add(new Student("zmj",1,33));
        System.out.println("第一个学生："+students.get(0).toString());
        while (true){
            int i=0;
            Student student=new Student();
            System.out.println("请输入id:");
            int id=input.nextInt();
            System.out.println("请输入姓名:");
            String name=input.next();
            System.out.println("请输入成绩：");
            double score=input.nextDouble();
            if(students.size()!=0){
                for (int j = 0; j <students.size(); j++) {
                    if ((id != students.get(i).getId()) || !(students.get(i).getName().equals(name))) {//只有姓名id有一个不同时就可以跳转
                        System.out.println("录入成功");
                        student.setId(id);
                        student.setName(name);
                        student.setScore(score);
                        students.add(student);
                        i++;
                        break;
                    }else {
                        System.out.println("失败");
                        i--;
                        break;
                    }
                }
            }
            if(students.size()==5){
                return;
            }
        }
    }

    @Override
    public void pl(List<Student> students) {//输出
        for (int i = 0; i <students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
