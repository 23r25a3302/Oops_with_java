public class CompanyDemo {
    public static void main(String args[]) {
        Manager m =new Manager("swetha", "Hyderabad", "9988776655", 25, 15000, "Quality Assurance");
        m.printDetails();
        System.out.println();
        Employee e = new Employee("ramu", "Hyderabad", "9933552244", 20, 60000, "Computer Science" );
        e.printDetails();
    }
}
// member class
class Member {
    String name, address, mobile;
    int age;
    double salary;
    // assigning details to member
    Member(String name, String address, String mobile, int age, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobile = mobile;
        this.salary = salary;
    }
    // to print details
    public void printDetails() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
        System.out.println("Mobile : "+mobile);
        System.out.println("Salary : "+salary);
    }
}
// sub_class for manager
class Manager extends Member {
    String destination;
    Manager(String name, String address, String mobile, int age, double salary, String destination) {
        super(name, address, mobile, age, salary);
        this.destination = destination;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Destination : "+destination);
    }
}
//sub_class for employee
class Employee extends Member {
    String specialization;
    Employee(String name, String address, String mobile, int age, double salary,String specialization) {
        super(name,address, mobile, age, salary);
        this.specialization = specialization;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization : "+specialization);
    }
}
