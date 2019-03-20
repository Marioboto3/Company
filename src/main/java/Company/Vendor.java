package Company;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends Employee {

    private String id_manager;
    List<Venta> listadeventas = new ArrayList<Venta>();


    public Vendor(String nombre, String id, double salary, String id_manager)
    {
        this.name=nombre;
        this.id=id;
        this.salario=salary;
        this.id_manager=id_manager;
    }
    @Override
    public double salario(double SalarioBase) {
        double cantidad = 0;
        double plus;

        if(this.listadeventas == null) {this.salario = SalarioBase;}
        else {
            for (Venta sell : listadeventas) {
                cantidad += sell.getVenta();
            }
            plus = cantidad*10/100;
            this.salario = SalarioBase + plus;
        }
        return this.salario;
    }

    public void añadirVenta(Venta v)
    {
        this.listadeventas.add(v);
    }

    public int size() {return this.listadeventas.size();}

    public String getId_manager() {
        return id_manager;
    }

    public List<Venta> getListadeventas() {
        return listadeventas;
    }

    public void setId_manager(String id_manager) {
        this.id_manager = id_manager;
    }

    public void setListadeventas(List<Venta> listadeventas) {
        this.listadeventas = listadeventas;
    }

}
