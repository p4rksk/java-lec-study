package ex06;

class Student{
    private int number;
    protected String name;

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
}


public class GraduateStudent extends Student{
    public String lab;
}
