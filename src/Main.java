public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args){
        EMPLOYEES[0] = new Employee("Владислав", "Владиславов", "Владиславович", 11, 10);
        EMPLOYEES[1] = new Employee("Владислав", "Владиславов", "Владиславович", 4, 20);
        EMPLOYEES[2] = new Employee("Иван", "Харченин", "Владиславович", 5, 10);
        EMPLOYEES[3] = new Employee("Гоша", "Иванин", "Харитонович", 6, 30);
        EMPLOYEES[4] = new Employee("Тихон", "Елахин", "Владиславович", 7, 40);
        EMPLOYEES[5] = new Employee("Алан", "Елесов", "Валидович", 8, 50);
        EMPLOYEES[6] = new Employee("Банан", "Мангов", "Попович", 9, 60);
        EMPLOYEES[7] = new Employee("Кокос", "Пеструшкин", "Араратович", 2, 70);
        EMPLOYEES[8] = new Employee("Афанасий", "Фет", "Алексеевич", 1, 80);
        EMPLOYEES[9] = new Employee("Иван", "Бунин", "Ибрагимович", 11, 5);


        Employee();
        Employee1();
        System.out.println("Сумма зарплат всех сотрудников: " + sumSalary());
        System.out.println("Максимальная зарплата: " + maxSalaryEmployee());
        System.out.println("Минимальная зарплата: " + minSalaryEmployee());
        System.out.println("Cреднее значение зарплат: " + averageValue());
    }


    public static void Employee() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println(EMPLOYEES[i]);
        }
    }
    private static int sumSalary() { // метод: Сумма зарплат всех сотрудников
        int sum = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) {
                sum += EMPLOYEES[i].getSalary();
            }
        }
        return sum;
    }
    private static Employee maxSalaryEmployee () { // метод: Максимальная зарплата
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    private static Employee minSalaryEmployee () { // метод: Минимальная зарплата
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    private static double averageValue(){ // метод №6: Среднее значение зарплат
        double average = (double) sumSalary() / (double) EMPLOYEES.length;
        return average;
    }
    public static void Employee1() { // метод: вывод списка сотрудников
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println(EMPLOYEES[i].getName() + EMPLOYEES[i].getSurname() + EMPLOYEES[i].getMiddleName());
        }
    }

}


