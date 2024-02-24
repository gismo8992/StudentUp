import controllers.AccountController;
import domen.*;
import services.TeacherService;

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

        System.out.println("----Lesson4----");
        Employee worker1 = new Employee("Vasiliy", 55, "worker");
        Employee worker2 = new Employee("Andrey", 40, "worker");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(worker1);
        employeeList.add(worker2);
        Teacher teacher1 = new Teacher("Leonid", 33, "доцент");
        //AccountController controller = new AccountController();
        AccountController.paySalary(teacher1, 2000);
        AccountController.paySalary(worker1, 1000);
        Student studentVasya = new Student("Vasya Hitriy", 19);
        // controller.paySalary(studentVasya, 1000);

        System.out.println("----Homework_4----");
        Teacher teacher2 = new Teacher("Aleksei", 30, "Старший преподаватель");
        Teacher teacher3 = new Teacher("Dmitry", 24, "Ассистент");
        Teacher teacher4 = new Teacher("Elena", 59, "Профессор");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        TeacherService teacherServiceList = new TeacherService();
        teacherServiceList.setTeacherList(teacherList); // передаем в экземпляр сервиса список учителей на сортировку
        teacherServiceList.printSortTeacherList(); // выполняем сортировку и вывод в консоль списка учителей
        System.out.print("Учителя: ");
        AccountController.averageAge(teacherList); // вывод среднего возраста учителей из списка
        System.out.print("Студенты: ");
        AccountController.averageAge(students2); // вывод среднего возраста студентов из списка
        System.out.print("Работники: ");
        AccountController.averageAge(employeeList); // вывод среднего возраста работников из списка
    }
}