package org.example;

public abstract class Student {
    //в этом классе использовать не можем, но методами и переменными могут пользоваться наследниками.
    //характеристики
    private final String surname;
    private final String name;
    private final String otchestvo;
    private int course;



    //конструктор для характеристик
    public Student(String surname, String name, String otchestvo,int course) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        if (course < 1 || course > 6){
            throw new RuntimeException("Course invalid");
        }
        else{
            this.course = course;
        }
    }


    public abstract void writeExam();//астрактный метод не имеет тело(тело пишется в фигурных скобках)

    @Override
    public String toString() {
        return "Student " + surname + " " + name + " " + otchestvo + ":\n" + "Studying at the " + course + " course\n";
    }
    //его нужно реализовать в дочерних классах
}
