package Homework2.Demo2;

public class SickException extends Exception {
    private String message;
    public SickException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
