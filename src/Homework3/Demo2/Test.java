package Homework3.Demo2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<Student>();
        FunctionImpl function=new FunctionImpl();
        function.add(students);
        function.pl(students);
    }
}
