package Lesson6;

public class Employee {

    Employee(int id2,String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }

    Employee(String surname2 , int age2){
        surname= surname2;
        age=age2;
    }

    Employee(int id2, String surname2, int age2,double salary2,String departament2){
        id=id2;
        surname=surname2;
        age=age2;
        salary=salary2;
        departament=departament2;
    }



    int id;
    String surname;
    int age;
    double salary;
    String departament;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivanov",25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov",30);
        System.out.println(emp2.age);

    }
}
