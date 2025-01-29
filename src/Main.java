import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static  Employee[] employees = new Employee[10];

    public static void main(String[] args) {


        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 10000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 2, 12000);
        employees[2] = new Employee("Макашова", "Алина", "Александровна", 3, 15000);
        employees[3] = new Employee("Марченко", "Максим", "Сергеевич", 4, 11000);
        employees[4] = new Employee("Завершинская", "Елена", "Александровна", 5, 13000);
        employees[5] = new Employee("Селиванов ", "Андрей", "Юрьевич", 1, 16000);
        employees[6] = new Employee("Малюкова", "Татьяна", "Ивановна", 2, 9000);
        employees[7] = new Employee("Шибина", "Кристина", "Анатольевна", 3, 18000);
        employees[8] = new Employee("Дедяева", "Анастасия", "Сергеевна", 4, 20000);
        employees[9] = new Employee("Гурченко", "Наталья", "Алексеевна", 5, 17000);


        printAllEmployees();
        System.out.println("Сумма всех затрат на зарплаты составляет =" + getSumSalary());
        System.out.println("Минимальная зарптала составляет =" + getMinSalary());
        System.out.println("Максимальная зарптала составляет =" + getMaxSalary());
        printAllName();
        System.out.println(getTheAverageValue());


    }

    public static void printAllEmployees() {
        for ( Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void printAllName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }

    }


    public static int getSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static int getMinSalary() {
        int minSalary = getSumSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();

            }
        }
        return minSalary;
    }

    public static int getMaxSalary() {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();

            }
        }
        return maxSalary;
    }

    public static int getTheAverageValue() {
        double totalSalary = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                totalSalary += emp.getSalary();
            }
            count++;
        }

        if(count==0){return 0;}
        double averageSalary = totalSalary / count;
        return (int) averageSalary;
    }


}