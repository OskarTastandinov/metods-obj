public class Main {
    private static final Employee[] Employee = new Employee[10];

    public static void main(String[] args) {
        Employee[0] = new Employee("Владимир", "Владимиров", "Владимирович", 1, 35000);
        Employee[1] = new Employee("Владислав", "Владиславов", "Владиславович", 2, 15000);
        Employee[2] = new Employee("Иван", "Харченин", "Владиславович", 3, 15000);
        Employee[3] = new Employee("Гоша", "Иванин", "Харитонович", 4, 25000);
        Employee[4] = new Employee("Тихон", "Елахин", "Владиславович", 5, 35000);
        Employee[5] = new Employee("Алан", "Елесов", "Валидович", 1, 45000);
        Employee[6] = new Employee("Банан", "Мангов", "Попович", 2, 25000);
        Employee[7] = new Employee("Кокос", "Пеструшкин", "Араратович", 3, 15000);
        Employee[8] = new Employee("Афанасий", "Фет", "Алексеевич", 4, 55000);
        Employee[9] = new Employee("Иван", "Бунин", "Ибрагимович", 5, 65000);
        for (int i = 0; i < Employee.length; i++) {
            System.out.println(Employee[i]);

        }
        System.out.println("Сумма зарплат всех сотрудников: " + sumSalary());
        System.out.println("Максимальная зарплата: " + maxSalaryEmployee());
        System.out.println("Минимальная зарплата: " + minSalaryEmployee());
        System.out.println("Минимальная зарплата: " + averageValue());

    }

    private static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i] != null) {
                sum += Employee[i].getSalary();
            }
        }
        return sum;
    }
    private static Employee maxSalaryEmployee () {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : Employee) {
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
        for (Employee employee : Employee) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    private static double averageValue(){
        double average = sumSalary() / 10;
        return  average;
    }

}


