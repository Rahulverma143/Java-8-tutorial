package supplier;  // make sure your folder/package name matches

import java.util.function.Supplier;

// Employee class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Optional: override toString for easy printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

// Supplier class implementation
class EmployeeSupplier implements Supplier<Employee> {
    public Employee get() {
        return new Employee("Rahul");
    }
}

// Main class
public class SupplierExample04 {
    public static void main(String[] args) {
        
        // 1Using class implementation
        Supplier<Employee> supplier1 = new EmployeeSupplier();
        Employee emp1 = supplier1.get();
        System.out.println(emp1);  // Employee{name='Rahul'}

        // Using lambda expression
        Supplier<Employee> supplier2 = () -> new Employee("Rahul Verma");
        Employee emp2 = supplier2.get();
        System.out.println(emp2);  // Employee{name='Rahul Verma'}

        //  Generate multiple employees dynamically
        Supplier<Employee> randomEmployee = () -> new Employee("Employee" + (int)(Math.random()*100));
        for (int i = 0; i < 3; i++) {
            System.out.println(randomEmployee.get());
        }
    }
}
