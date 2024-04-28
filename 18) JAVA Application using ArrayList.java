class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}

class EmpSalaryException extends Exception {
    public EmpSalaryException(String message) {
        super(message);
    }
}

public class EmployeeService {
    public static void checkEmployeeSalary(Employee emp) throws EmpSalaryException {
        if (emp.getEmpSalary() < 1000) {
            throw new EmpSalaryException("Employee salary is less than 1000");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("John");
        emp1.setEmpAge(25);
        emp1.setEmpSalary(1500);

        Employee emp2 = new Employee();
        emp2.setEmpName("Bob");
        emp2.setEmpAge(30);
        emp2.setEmpSalary(800);

        Employee emp3 = new Employee();
        emp3.setEmpName("Alice");
        emp3.setEmpAge(28);
        emp3.setEmpSalary(1200);

        Employee emp4 = new Employee();
        emp4.setEmpName("Mark");
        emp4.setEmpAge(27);
        emp4.setEmpSalary(900);

        Employee emp5 = new Employee();
        emp5.setEmpName("Sarah");
        emp5.setEmpAge(32);
        emp5.setEmpSalary(2000);

        Employee[] employees = { emp1, emp2, emp3, emp4, emp5 };

        for (Employee emp : employees) {
            try {
                checkEmployeeSalary(emp);
            } catch (EmpSalaryException e) {
                System.out.println(emp.getEmpName() + ": " + e.getMessage());
            }
        }
    }
}
