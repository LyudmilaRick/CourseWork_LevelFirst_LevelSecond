package ru.skypro.LevelBase;
public class Employee {
    private final Person person;
    private int department;
    private float salary;

    private final int id;   // табельный номер
    private static int counter = 0; // Добавить статическую переменную-счетчик

    public Employee(Person person, int department, float salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        // поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        id = ++counter;

    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    // 4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    public Person getPerson() {
        return person;
    }
    public float getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }
    //5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format( "Таб.номер %d, Сотрудник %s, Отдел - %d, З/П %10.2f руб. ",
                id, person, department, salary);

    }
}

