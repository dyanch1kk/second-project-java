package org.example;

public class IUStudent extends Student {
    public IUStudent(String surname, String name, String otchestvo, int course, int mark) {
        super(surname, name, otchestvo, course, mark);
    }



    @Override
    public void writeExam() {
        System.out.println(toString() + "Faculty: IU\n");
    }
}

