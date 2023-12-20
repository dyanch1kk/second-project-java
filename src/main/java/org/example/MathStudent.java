package org.example;

public class MathStudent extends Student{
    public MathStudent(String surname, String name, String otchestvo, int course, int mark) {
        super(surname, name, otchestvo,course,mark);
    }

    @Override
    public void writeExam(){
        toString();
        System.out.println(toString() + "Faculty: Math\n");
    }
}
