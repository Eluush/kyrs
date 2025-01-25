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


    }
}