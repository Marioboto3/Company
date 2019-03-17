package Company;

import java.util.HashMap;
import java.util.List;

public class CompanyManagerImpl implements CompanyManager {

    HashMap<String, Employee> employees;

    public CompanyManagerImpl() {
        this.employees = new HashMap<String, Employee>();
    }

    @Override
    public void addEmployee(String id, String name, double salary, String type, String idManager) {
        if(type.equals("Vendor")||type.equals("vendor")) {
            Employee e = new Vendor(name, id, salary, idManager);
            this.employees.put(e.getId(),e);

        }
        if (type.equals("Operator") || type.equals("operator")) {
            Employee e = new Operator(name, id, salary,idManager);
            this.employees.put(e.getId(),e);
        }
    }
    @Override
    public void addManager(String id, String name, double salary) {
        Manager m = new Manager(name,id,salary);
        this.employees.put(m.getId(),m);
    }

    @Override
    public void nuevaVenta(String idventa, String idvendedor, double vent) {
        Venta venta = new Venta(idventa, vent);
        Employee v = findById(idvendedor);
        if (v != null && v instanceof Vendor) {
            ((Vendor) v).añadirVenta(venta);
        }
        else
        {
        }
    }
    void CompanyManagerImpl(){}

    public List<Employee> findAllByManager(String idManager) {
        Employee e = this.employees.get(idManager);
        Manager manager;
        List<Employee> res = null;

        if (e!=null && e instanceof Manager) {
            manager = (Manager)e;
            res = manager.getEmployees();
        }
        return res;
    }

    @Override
    public Employee findById(String id) {
        return null;
    }
    public List<Employee> findAllOrderBySalary(){
        return null;
    }
    public List<Employee> findAllOrderByName(){
        return null;
    }

}
