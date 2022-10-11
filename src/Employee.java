public class Employee {
    private final String name;
    private final String surname;
    private final String middleName;
    private int salary;
    private int department;
    private static int counter = 0;
    private int id = counter++;

    public Employee(String name, String surname, String middleName, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public int getSalary() {
        return this.salary = salary;
    }

    public int setSalary(int salary) {
        return this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Сотрудник: " + getName() + " " + getMiddleName() + " " + getSurname() + ", " + getDepartment() + " Отдел , " + getSalary() + getId();
    }
}






