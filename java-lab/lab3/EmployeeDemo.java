// 5. Create a class named Employee with a method work() that prints "Employee is working.". Create two subclasses Manager and Programmer that override the work() method to print "Manager is managing the team." and "Programmer is writing code." respectively.
// Using a reference variable of type Employee, invoke the work() method for objects of both subclasses and demonstrate Dynamic Method Dispatch.

class Employee {

    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager is managing the team.");
    }
}

class Programmer extends Employee {

    @Override
    void work() {
        System.out.println("Programmer is writing code.");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {
        // Employee reference, but pointing to different subclass objects
        Employee emp;

        emp = new Manager();
        emp.work();   // Calls Manager's overridden work()

        emp = new Programmer();
        emp.work();   // Calls Programmer's overridden work()
    }
}
