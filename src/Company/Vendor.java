package Company;

import java.util.List;

public class Vendor extends Employee {

    private String id_manager;
    List<Venta> listadeventas;


    public Vendor(String nombre, String id, double salary, String id_manager)
    {
        this.name=nombre;
        this.id=id;
        this.salario=salary;
        this.id_manager=id_manager;
    }
    @Override
    public double salario() {
        return 0;
    }

    public void añadirVenta(Venta v)
    {
        this.listadeventas.add(v);
    }
    public int size() {return this.listadeventas.size();}

    @Override
    public void ponersalario() {

    }
}
