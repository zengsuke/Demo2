package Demo6;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> linkedList;

    public MyStack() {
        linkedList=new LinkedList<String>();
    }
    public void push(String string){
        linkedList.add(string);
    }
    public void pop(){
        linkedList.removeLast();
    }

}
