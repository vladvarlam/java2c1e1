package main;

import model.Student;

import service.MainService;

import java.util.List;

public class Main {


    public static void main(String[] args)  {
        Student s = new Student();
        s.setNume("ion");
        s.setEmail("ion@telacad.ro");
        System.out.println("pas 1");

        List<Student> studenti = MainService.getService().addAndGetAll(s);

        studenti.forEach(System.out::println);
    }
}
