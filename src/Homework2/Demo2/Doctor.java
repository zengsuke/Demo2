package Homework2.Demo2;

import java.util.Random;

public class Doctor {
    public void cure(Worker worker){
        Random random=new Random();
        int rad=random.nextInt(2)+1;//(1,3)
        try{
            worker.work();
        }catch(SickException e){
            if(rad==1){
                worker.setAlive("健康");
            }else{
                worker.setAlive("身亡");
            }
        }
    }
}
