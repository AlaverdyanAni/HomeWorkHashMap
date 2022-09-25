public class Employee {
    private String fullName;
    private String departament;
    private int salary;

    private int id;


    public Employee(String fullName, String departament, int salary, int id) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = id;
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

    public int getId() {
        return this.id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О. " + fullName + ", отдел - " + departament + ", зарплата - " + salary + ", ID - " + getId();
    }
}



