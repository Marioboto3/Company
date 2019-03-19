package Company;

public class Operator extends Employee {
    private String id_manager;

    @Override
    public void ponersalario() {
        this.salario=this.salario+0.1*this.salario;
    }
    @Override
    public double salario() {
        return this.salario;
    }
    public Operator (String name, String id, double salary, String idmang)
    {
        this.name=name;
        this.id=id;
        this.salario=salary;
        this.id_manager=idmang;
    }
}
