package Company;

import java.util.List;

public class Manager {
    List<Employee> employees;
    String name;
    String type;
    int id;
    double salario;

    public Manager(String name, String type, int id, double salario) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.salario = salario;
    }
}
