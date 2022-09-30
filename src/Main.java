import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Employee> employeesMap = new HashMap<>(Map.of(1, new Employee("Литвин Алексей Сергеевич", "1", 65300),
                2, new Employee("Жуков Андрей Витальевич", "1", 67500),
                3, new Employee("Фанина Елена Потаповна", "1", 66750),
                4, new Employee("Зорина Римма Васильевна", "2", 75200),
                5, new Employee("Мартынов Петр Гаврилевич", "2", 74600),
                6, new Employee("Юрьевна Елизавета Родионовна", "3", 76450),
                7, new Employee("Гарин Елизар Сократович", "3", 78200),
                8, new Employee("Балтабева Яна Анатольевна", "4", 86380),
                9, new Employee("Арсеньев Вадим Агапович", "4", 88600),
                10, new Employee("Рудаков Антон Владимирович", "4", 95800)));

        employeesMap.put(11, new Employee("Сидоров Антон Семенович", "1", 67400));
        System.out.println(employeesMap);
        employeesMap.put(11, new Employee("Петросов Руслан Михаилович", "3", 75000));
        System.out.println(employeesMap);
        employeesMap.remove(10);
        System.out.println(employeesMap);
        if (employeesMap.containsKey(11)) {
            System.out.println(employeesMap.get(11));
        } else {
            System.out.println("Сотрудник не найден");
        }
        if (employeesMap.containsKey(13)) {
            System.out.println(employeesMap.get(13));
        } else {
            System.out.println("Cотрудник не найден");
        }
        Iterator<Employee> iterator = employeesMap.values().iterator();
        while (iterator.hasNext()) {
            float sumSalary = 0;
            float averageSalary = 0;
            for (int i = 0; i < employeesMap.size(); i++) {
                sumSalary += iterator.next().getSalary();
                averageSalary = sumSalary / employeesMap.size();
            }
            System.out.printf("Сумма трат в месяц составила %s рублей.\n", sumSalary);
            System.out.printf("Средняя зарплата составила %s рублей.\n", averageSalary);
        }
    }
}


