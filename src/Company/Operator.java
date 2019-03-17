package Company;

public class Operator extends Employee {
    private String id_manager;

    @Override
    public void ponersalario() {
    }

    @Override
    public double salario() {
        return 0;
    }
    public Operator (String name, String id, double salary, String idmang)
    {
        this.name=name;
        this.id=id;
        this.salario=salary;
        this.id_manager=idmang;
    }
}
