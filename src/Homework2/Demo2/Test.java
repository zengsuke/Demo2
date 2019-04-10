package Homework2.Demo2;

public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker();
        Doctor doctor=new Doctor();
        doctor.cure(worker);
        System.out.println(worker.getAlive());
        if(worker.getAlive().equals("健康")){
            System.out.println("恭喜你");
        }else{
            System.out.println("sorry尽力了");
        }
    }
}
