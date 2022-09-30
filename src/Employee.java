public class Employee {
    private String fullName;
    private String departament;
    private int salary;


    public Employee(String fullName, String departament, int salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getDepartament() {
        return this.departament;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О. " + fullName + ", отдел - " + departament + ", зарплата - " + salary;
    }
}



