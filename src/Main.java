import domen.Student;
import domen.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan", 20);
        Student student6 = new Student("Olga", 19);
        Student student7 = new Student("Andrei", 20);
        Student student2 = new Student("Anna", 22);
        Student student3 = new Student("Vova", 24);
        Student student4 = new Student("Sergei", 19);
        Student student5 = new Student("Dima", 22);
        students.add(student1);
        students.add(student7);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        StudentGroup studentGroup = new StudentGroup(2, students);

        for (Student student: studentGroup
             ) {
            System.out.println(student);
        }
        System.out.println("----------");
        Collections.sort(studentGroup.getStudentList());
        for (Student student: studentGroup
        ) {
            System.out.println(student);
        }
    }
}