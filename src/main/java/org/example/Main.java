package org.example;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human("Имя", "Фамилия");
//        human.setAge(20);
//        human.setHeight(1.7);
//        human.setWeight(55);
//        Child child = new Child("Имя1", "Фамилия1");
//        child.setAge(15);
//        child.setHeight(1.4);
//        child.setWeight(50);
//
//
//        Human human1 = new Child("Name", "Surname");
//        child.playGames();
//        if (human1 instanceof Child) {
//            Child human11 = (Child) human1;
//            human11.playGames();
//        }
////        Child human2 = (Child) human;
//
////        System.out.println(human11 == human1);
//
//        child.playGame();
//        Cat cat = new Cat();
//        cat.playGame();
//
////        CanPlayGames canPlayGames1 = new Child();
////        canPlayGames1.playGame();
//
//        CanPlayGames canPlayGames2 = cat;
//        canPlayGames2.playGame();
        MathStudent stud1 = new MathStudent("Murashkina","Diana","Valer'evna",3,4);
        IUStudent stud2 = new IUStudent("Milashkina","Milana","Alexandovna",4,5);
        stud1.writeExam();
        stud2.writeExam();
        StrSort a = new StrSort();
        a.add("i love");
        a.add("small");
        a.add("kittens");
        a.add("<3");

        System.out.println("Element with max lenght: " + a.getMax());
        System.out.println("Srednee znachenie dlinii: " + a.getSr());
    }
}