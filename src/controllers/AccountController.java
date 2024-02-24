package controllers;

import domen.Person;
import domen.WorkingPerson;

import java.util.List;

public class AccountController {
    public static  <T extends WorkingPerson, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплаченная зарплата: " + salary);
    }
    public static <M extends Person> void averageAge(List<M> list) {
        double sumForAverageAge = 0;
        for (M m : list) {
            sumForAverageAge = sumForAverageAge + m.getAge();
        }
        double averageAge = sumForAverageAge/ list.size();
        System.out.println("Средний возраст: " + averageAge);
    }
}

