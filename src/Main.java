import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Employee[] employees = new Employee[10];
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



        System.out.println(employees[0].toString());
        System.out.println(employees[1].toString());
        System.out.println(employees[2].toString());
        System.out.println(employees[3].toString());
        System.out.println(employees[4].toString());
        System.out.println(employees[5].toString());
        System.out.println(employees[6].toString());
        System.out.println(employees[7].toString());
        System.out.println(employees[8].toString());
        System.out.println(employees[9].toString());
        System.out.println("Сумма всех затрат на зарплаты составляет =" + getSumSalary(employees));
        System.out.println("Минимальная зарптала составляет =" + getMinSalary(employees));
        System.out.println("Максимальная зарптала составляет =" + getMaxSalary(employees));
        System.out.println(employees[0].getFullName());
        System.out.println(employees[1].getFullName());
        System.out.println(employees[2].getFullName());
        System.out.println(employees[3].getFullName());
        System.out.println(employees[4].getFullName());
        System.out.println(employees[5].getFullName());
        System.out.println(employees[6].getFullName());
        System.out.println(employees[7].getFullName());
        System.out.println(employees[8].getFullName());
        System.out.println(employees[9].getFullName());
        System.out.println(getTheAverageValue(employees));


    }
    public static void printAllEmployees(Employee[] employees){
        return;

    }

    public static int getSumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }


        }
        return sum;
    }

    public static int getMinSalary(Employee[] employees) {
        int minSalary = getSumSalary(employees);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();

            }

        }
        return minSalary;
    }

    public static int getMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();

            }

        }
        return maxSalary;
    }

    public static int getTheAverageValue(Employee[] employees) {
        int theAverageValue = getSumSalary(employees);
        theAverageValue = getSumSalary(employees) / employees.length;
        return theAverageValue;

    }

}