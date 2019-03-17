package Company;

import java.util.List;

public class Manager extends Employee{
    List<Employee> employees;

    public Manager(String name, String id, double salario) {
        this.name = name;
        this.id = id;
        this.salario = salario;
    }

    @Override
    public void ponersalario() {

    }
    @Override
    public double salario() {
        return 0;
    }

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
