import java.util.Objects;


public class Employee {
    int departament;
    int salary;
    static int count;
    int id;
    String lastName;
    String ferstName;
    String midlleName;


    public Employee(String lastName, String ferstName, String middleName, int departament, int salary) {
        setLastName(lastName);
        setFerstName(ferstName);
        setMidlleName(middleName);
        setDepartament(departament);
        setSalary(salary);
        setId(count++);

    }

    public String getFullInfo() {
        return this.getFullName() + " " + this.departament + " " + this.salary + " ";

    }

    public static int id(int id) {
        id++;
        return id;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFerstName(String ferstName) {
        this.ferstName = ferstName;
    }

    public void setMidlleName(String midlleName) {
        this.midlleName = midlleName;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = count++;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return departament == employee.departament && salary == employee.salary && id == employee.id && Objects.equals(getFullName(),getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), departament, salary, id);
    }


}
