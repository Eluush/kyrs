import java.util.Objects;


public class Employee {
    private int departament;
    private int salary;
    private static int count;
    private int id;
    private String lastName;
    private String ferstName;
    private String midlleName;


    public Employee(String lastName, String ferstName, String middleName, int departament, int salary) {
        this.lastName = lastName;
        this.ferstName = ferstName;
        this.midlleName = middleName;
        this.departament = departament;
        this.salary = salary;
        this.id = ++count;

    }

    public String getFullInfo() {
        return this.getFullName() + " " + this.departament + " " + this.salary + " " + this.id;

    }

    String getFullName() {
        return this.lastName + " " + ferstName + " " + midlleName;
    }

    int getDepartament() {
        return this.departament;
    }

    int getSalary() {
        return this.salary;
    }

    public String toString() {
        return getFullName() + " " + departament + " " + salary;
    }

    public void setDepartament (int departament){
        this.departament=departament;

    }

    private void setSalary(int salary) {
        this.salary = salary;
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return departament == employee.departament && salary == employee.salary && id == employee.id && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), departament, salary, id);
    }


}
