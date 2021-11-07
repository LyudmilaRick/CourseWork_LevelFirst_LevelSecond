package ru.skypro.LevelBase;

public class Main {
    // Массив, выполняющий роль хранилища для записей о сотрудниках.
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        // Основной метод для работы с экземплярами класса Employee
        /**
         * Заполнение начальных данных о сотрудниках.
         */
        employee[0] = new Employee(new FullName("Александр", "Сергеевич", "Пушкин"), 1, new java.util.Random().nextInt(100_000));
        employee[1] = new Employee(new FullName("Михаил", "Юрьевич", "Лермонтов"), 1, new java.util.Random().nextInt(100_000));
        employee[2] = new Employee(new FullName("Александр", "Александрович", "Блок"), 2, new java.util.Random().nextInt(100_000));
        employee[3] = new Employee(new FullName("Владимир", "Владимирович", "Маяковский"), 2, new java.util.Random().nextInt(100_000));
        employee[4] = new Employee(new FullName("Сергей", "Александрович", "Есенин"), 2, new java.util.Random().nextInt(100_000));
        employee[5] = new Employee(new FullName("Борис", "Акунин"), 3, new java.util.Random().nextInt(100_000));
        employee[6] = new Employee(new FullName("Анна", "Борисова"), 3, new java.util.Random().nextInt(100_000));
        /**
         * a. Получить список и вывести в консоль
         * всех сотрудников со всеми имеющимися по ним данными.
         */
        System.out.println("Полный список сотрудников:");
        getAllEmployeesList();
        printSeparator();
        /**
         * b. Посчитать сумму затрат на зарплаты в месяц.
         * @return Сумма затрат.
         */
        System.out.print("Сумма затрат на зарплаты в месяц:   ");
        System.out.format("%.2f\n", sumOfAllSalaries());
        printSeparator();
        /**
         * c. Найти сотрудника с минимальной зарплатой.
         *    @return Объект найденного сотрудника.
         */
        System.out.println("Сотрудник с минимальной зарплатой:");
        Employee employee;
        employee = findEmployeeWithMinSalary();
        System.out.println(employee);
        /**
         * c. d. Найти сотрудника с максимальной зарплатой..
         *    @return Объект найденного сотрудника.
         */
        System.out.println("Сотрудник с максимальной зарплатой:");
        employee = findEmployeeWithMaxSalary();
        System.out.println((employee != null) ? employee.toString() : "отсутствует");
        /**
         * e. Подсчитать среднее значение зарплат (можно использовать для этого метод пункта b).
         *  @return Величина зарплаты.
         */
        System.out.print("Среднее значение зарплат:  ");
        System.out.format("%.2f\n", sumOfAllSalaries() / numberOfRegisteredEmployees());
        printSeparator();
        /**
         * f Получить список и вывести в консоль
         * список Ф. И. О. всех сотрудников.
         */
        System.out.println("Ф. И. О. всех сотрудников");
        getAllFullName();
        printSeparator();
    }

    public static void getAllEmployeesList() {
        for (Employee item : employee) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void getAllFullName() {
        for (Employee item : employee) {
            if (item != null) {
                System.out.println(item.getPerson());
            }
        }
    }

    public static void printSeparator() {
        System.out.println("====================================================");
    }

    public static float sumOfAllSalaries() {
        float sumOfAllSalaries = 0;
        for (Employee item : employee) {
            if (item != null) {
                sumOfAllSalaries += item.getSalary();
            }
        }
        return sumOfAllSalaries;
    }

    public static int numberOfRegisteredEmployees() {
        int employeesNumber = 0;
        for (Employee item : employee) {
            if (item != null) {
                employeesNumber++;
            }
        }
        return employeesNumber;
    }

    public static Employee findEmployeeWithMinSalary() {
        float minValue = Float.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee item : employee) {
            if (item != null) {
                if (item.getSalary() < minValue) {
                    minValue = item.getSalary();
                    employeeWithMinSalary = item;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        float maxValue = Float.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee item : employee) {
            if (item != null) {
                if (item.getSalary() > maxValue) {
                    maxValue = item.getSalary();
                    employeeWithMaxSalary = item;
                }
            }
        }
        return employeeWithMaxSalary;
    }
}

