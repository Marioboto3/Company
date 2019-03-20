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
    public double salario(double SalarioBase) {

        double venta = 0;
        double bonus;

        for(Employee employee: employees){
            if(employee instanceof Vendor){
                List<Venta> ventas = ((Vendor) employee).getListadeventas();
                if(ventas!=null) {
                    for (Venta vent : ventas) {
                        venta += vent.getVenta();
                    }
                }
            }
        }

        bonus = venta/100;

        this.salario = SalarioBase + bonus;
        return this.salario;
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
