package Company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<Employee> employees;

    public Manager(String name, String id, double salario) {
        this.name = name;
        this.id = id;
        this.salario = salario;
        this.employees= new ArrayList<Employee>();
    }
    @Override
    public void ponersalario() {
    }
    @Override
    public double salario() {
        return 0;
    }

    public void addEmployeem (Employee e)
    {this.employees.add(e);}

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
}
