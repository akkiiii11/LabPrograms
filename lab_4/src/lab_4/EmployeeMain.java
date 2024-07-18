package lab_4;

// Class to represent an Employee
class Employee {
    String name; // employee name
    double salary; // base salary

    // Constructor to initialize employee name and salary
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate the total salary (just returns the base salary)
    public double calculateSalary() {
        return salary;
    }
}

// Class to represent a Manager (extends Employee)
class Manager extends Employee {
    double bonus; // bonus amount

    // Constructor to initialize employee name, salary, and bonus
    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Override the calculateSalary method to include the bonus
    public double calculateSalary() {
        return salary + bonus;
    }
}

// Class to represent a Programmer (extends Employee)
class Programmer extends Employee {
    double overtime; // overtime pay

    // Constructor to initialize employee name, salary, and overtime pay
    Programmer(String name, double salary, double overtime) {
        super(name, salary);
        this.overtime = overtime;
    }

    // Override the calculateSalary method to include the overtime pay
    public double calculateSalary() {
        return salary + overtime;
    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        // Create a Manager object and display details
        Manager em = new Manager("Akanksha", 50000, 10000);
        System.out.println("Manager details are: ");
        System.out.println("Name: " + em.name + ", Salary: " + em.salary + ", Bonus: " + em.bonus + ", Total Salary: " + em.calculateSalary());

        System.out.println();

        // Create a Programmer object and display details
        Programmer ep = new Programmer("Sunny", 60000, 15000);
        System.out.println("Programmer details are: ");
        System.out.println("Name: " + ep.name + ", Salary: " + ep.salary + ", Overtime: " + ep.overtime + ", Total Salary: " + ep.calculateSalary());
    }
}

/*Dry Run

Manager details are: 
Name: Akanksha, Salary: 50000.0, Bonus: 10000.0, Total Salary: 60000.0

Programmer details are: 
Name: Sunny, Salary: 60000.0, Overtime: 15000.0, Total Salary: 75000.0

*/