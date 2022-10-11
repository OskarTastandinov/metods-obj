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

    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Владимир", "Владимиров", "Владимирович", 1, 35000);
        employee[1] = new Employee("Владислав", "Владиславов", "Владиславович", 2, 15000);
        employee[2] = new Employee("Иван", "Харченин", "Владиславович", 3, 15000);
        employee[3] = new Employee("Гоша", "Иванин", "Харитонович", 4, 25000);
        employee[4] = new Employee("Тихон", "Елахин", "Владиславович", 5, 35000);
        employee[5] = new Employee("Алан", "Елесов", "Валидович", 1, 45000);
        employee[6] = new Employee("Банан", "Мангов", "Попович", 2, 25000);
        employee[7] = new Employee("Кокос", "Пеструшкин", "Араратович", 3, 15000);
        employee[8] = new Employee("Афанасий", "Фет", "Алексеевич", 4, 55000);
        employee[9] = new Employee("Иван", "Бунин", "Ибрагимович", 5, 65000);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);

        }
        sum_salary();
        maxSalaryEmployee();
        minSalaryEmployee();

    }

    public static void sum_salary() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат всех сотрудников: " + sum);
        System.out.println("Средняя сумма зарплат всех сотрудников: " + sum / 2);
        System.out.println("Максимальная зарплата: " + maxSalaryEmployee());
        System.out.println("Минимальная зарплата: " + minSalaryEmployee());

    }

    public static Employee maxSalaryEmployee() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for(Employee employee : employee) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    public static Employee minSalaryEmployee() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for(Employee employee : employee) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

}





