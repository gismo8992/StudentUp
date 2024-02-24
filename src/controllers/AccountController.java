package controllers;

import domen.Person;
import domen.WorkingPerson;

public class AccountController {
    public static  <T extends WorkingPerson, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплаченная зарплата: " + salary);
    }
}
