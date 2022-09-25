import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Литвин Алексей Сергеевич", "1", 65300, 1);
        employee[1] = new Employee("Жуков Андрей Витальевич", "1", 67500, 2);
        employee[2] = new Employee("Фанина Елена Потаповна", "1", 66750, 3);
        employee[3] = new Employee("Зорина Римма Васильевна", "2", 75200, 4);
        employee[4] = new Employee("Мартынов Петр Гаврилевич", "2", 74600, 5);
        employee[5] = new Employee("Юрьевна Елизавета Родионовна", "3", 76450, 6);
        employee[6] = new Employee("Гарин Елизар Сократович", "3", 78200, 7);
        employee[7] = new Employee("Балтабева Яна Анатольевна", "4", 86380, 8);
        employee[8] = new Employee("Арсеньев Вадим Агапович", "4", 88600, 9);
        employee[9] = new Employee("Рудаков Антон Владимирович", "4", 95800, 10);

        List<Employee> employeeList = Arrays.asList(employee);
        HashMap<Integer, Employee> employeesMap = new HashMap<>();
        for (Employee employee1 : employeeList) {
            employeesMap.put(employee1.getId(), employee1);
        }
        System.out.println(employeesMap);

        employeesMap.put(11,new Employee("Сидоров Антон Семенович", "1", 67400,11));
        System.out.println(employeesMap);
        employeesMap.put(11,new Employee("Петросов Руслан Михаилович","3",75000,11));
        System.out.println(employeesMap);
        employeesMap.remove(10);
        System.out.println(employeesMap);
        if (employeesMap.containsKey(11)){
            System.out.println(employeesMap.get(11));
        }else {
            System.out.println("Сотрудник не найден");
        }
        if (employeesMap.containsKey(13)) {
            System.out.println(employeesMap.get(13));
        }else {
            System.out.println("Cотрудник не найден");
        }
    }
}
