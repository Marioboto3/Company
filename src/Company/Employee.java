package Company;

public abstract class Employee {
    public abstract void ponersalario();
    String name;
    String type;
    int id;
    double salario;
    int id_manager;

    public void Employee (String nombre, int id, double salario, String type, int idmang) {
        this.name=nombre;
        this.id=id;
        this.salario=salario;
        this.type=type;
        this.id_manager=idmang;
    }
    public abstract double salario();


}
