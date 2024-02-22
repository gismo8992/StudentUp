import domen.Student;
import domen.StudentGroup;
import domen.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        Student student1 = new Student("Ivan", 20);
        Student student6 = new Student("Olga", 19);
        Student student7 = new Student("Andrei", 20);
        Student student2 = new Student("Anna", 22);
        Student student3 = new Student("Vova", 24);
        Student student4 = new Student("Sergei", 19);
        Student student5 = new Student("Dima", 22);
        Student student8 = new Student("Alex", 18);
        Student student9 = new Student("Igor", 23);
        Student student10 = new Student("Boris", 24);
        Student student11 = new Student("Kolya", 22);
        Student student12 = new Student("Katya", 20);
        students1.add(student1);
        students1.add(student7);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        students1.add(student6);

        StudentGroup studentGroup1 = new StudentGroup(1, students1);

        for (Student student : studentGroup1
        ) {
            System.out.println(student);
        }
        System.out.println("----------");
        Collections.sort(studentGroup1.getStudentList());
        for (Student student : studentGroup1
        ) {
            System.out.println(student);
        }
        System.out.println("----HW----");
        List<Student> students2 = new ArrayList<>(); // создаем список студентов 2
        List<Student> students3 = new ArrayList<>(); // создаем список студентов 3
        // добавляем студентов в группы
        students2.add(student8);
        students2.add(student9);
        students3.add(student10);
        students3.add(student11);
        students3.add(student12);
        List<StudentGroup> studentGroupList1 = new ArrayList<>(); // создаем список групп 1 для добавления групп на поток
        List<StudentGroup> studentGroupList2 = new ArrayList<>(); // создаем список групп 2 для добавления групп на поток
        StudentGroup studentGroup2 = new StudentGroup(2, students2); // создаем группу студентов 2
        StudentGroup studentGroup3 = new StudentGroup(3, students3); // создаем группу студентов 3
        // добавляем группы на один из потоков
        studentGroupList1.add(studentGroup2);
        studentGroupList1.add(studentGroup1);
        studentGroupList1.add(studentGroup3);
        studentGroupList2.add(studentGroup3);
        StudentSteam studentSteam1 = new StudentSteam(1, studentGroupList1); // создаем поток групп 1
        StudentSteam studentSteam2 = new StudentSteam(2, studentGroupList2); // создаем поток групп 2
        System.out.println("Print studentSteam1:");
        for (StudentGroup studentGroup : studentSteam1
        ) {
            System.out.println(studentGroup);
        }
        ;
        System.out.println("Print studentSteam2:");
        for (StudentGroup studentGroup : studentSteam2
        ) {
            System.out.println(studentGroup);
        }
        ;
        Collections.sort(studentSteam1.getStudentGroupList());
        System.out.println("----After sorting (amount of students in group is increase)----");
        System.out.println("studentSteam1 printing:");
        for (StudentGroup studentGroup : studentSteam1
        ) {
            System.out.println(studentGroup);
        }
        ;
        System.out.println("studentSteam1 printing:");
        System.out.println(studentSteam1);
    }
}