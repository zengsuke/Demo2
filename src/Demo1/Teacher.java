package Demo1;

public class Teacher {
    private String name;
    private int number;

    public Teacher() {
    }

    public Teacher(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "老师" + name + " 论文数" + number ;
    }
}
