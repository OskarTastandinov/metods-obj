public class Main {
    public static void main(String[] args){

        EMPLOYEE();
        sumSalary();
        maxSalaryEmployee();
        minSalaryEmployee();
        averageValue();
        System.out.println("Сумма зарплат всех сотрудников: " + sumSalary());
        System.out.println("Максимальная зарплата: " + maxSalaryEmployee());
        System.out.println("Минимальная зарплата: " + minSalaryEmployee());
        System.out.println("Минимальная зарплата: " + averageValue());
    }

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void EMPLOYEE() {
        EMPLOYEES[0] = new Employee("Владимир", "Владимиров", "Владимирович", 1, 35000);
        EMPLOYEES[1] = new Employee("Владислав", "Владиславов", "Владиславович", 2, 15000);
        EMPLOYEES[2] = new Employee("Иван", "Харченин", "Владиславович", 3, 15000);
        EMPLOYEES[3] = new Employee("Гоша", "Иванин", "Харитонович", 4, 25000);
        EMPLOYEES[4] = new Employee("Тихон", "Елахин", "Владиславович", 5, 35000);
        EMPLOYEES[5] = new Employee("Алан", "Елесов", "Валидович", 1, 45000);
        EMPLOYEES[6] = new Employee("Банан", "Мангов", "Попович", 2, 25000);
        EMPLOYEES[7] = new Employee("Кокос", "Пеструшкин", "Араратович", 3, 15000);
        EMPLOYEES[8] = new Employee("Афанасий", "Фет", "Алексеевич", 4, 55000);
        EMPLOYEES[9] = new Employee("Иван", "Бунин", "Ибрагимович", 5, 65000);
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println(EMPLOYEES[i]);

        }
    }
    private static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) {
                sum += EMPLOYEES[i].getSalary();
            }
        }
        return sum;
    }
    private static Employee maxSalaryEmployee () {
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
    private static Employee minSalaryEmployee () {
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
    private static double averageValue(){
        double average = (double) sumSalary() / (double) EMPLOYEES.length;
        return average;
    }

}



