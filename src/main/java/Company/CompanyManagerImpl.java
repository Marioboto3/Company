package Company;

import java.util.HashMap;
import java.util.List;

public class CompanyManagerImpl implements CompanyManager {

    HashMap<String, Employee> employees;

    public CompanyManagerImpl() {
        this.employees = new HashMap<String, Employee>();
    }
    public int get_size()
    {
        return this.employees.size();
    }
    public void addEmployee(String id, String name, double salary, String type, String idManager) throws ManagerNotFound {
        Manager m = (Manager) findById(idManager);
        if (m!=null)
        {
            if (type.equals("Vendor") || type.equals("vendor")) {
                Employee e = new Vendor(name, id, salary, idManager);
                this.employees.put(e.getId(), e);
                m.addEmployeem(e);

            }
            if (type.equals("Operator") || type.equals("operator")) {
                Employee e = new Operator(name, id, salary, idManager);
                this.employees.put(e.getId(), e);
                m.addEmployeem(e);
        }
        else throw new ManagerNotFound("Manager not found");
        }
    }

    public void addManager(String id, String name, double salary) {
        Employee m = new Manager(name,id,salary);
        this.employees.put(m.getId(),m);
    }

    public void nuevaVenta(String idventa, String idvendedor, double vent) throws VendorNotFoundException, ManagerNotFound {
        Venta venta = new Venta(idventa, vent);
        Employee v = findById(idvendedor);
        if (v != null && v instanceof Vendor) {
            ((Vendor) v).añadirVenta(venta);
        }
        else throw new VendorNotFoundException("Vendor not found");
    }
    public List<Employee> findAllByManager(String idManager) throws ManagerNotFound{
        Employee e = this.employees.get(idManager);
        Manager manager;
        List<Employee> res = null;

        if (e!=null && e instanceof Manager) {
            manager = (Manager) e;
            res = manager.getEmployees();
            return res;
        }
        else throw new ManagerNotFound("Manager not found");
    }

    public Employee findById(String id) throws ManagerNotFound {
        Employee e = this.employees.get(id);
        if(e!=null) {
            return e;
        }
        else throw new ManagerNotFound("Employee not found");
    }
    public List<Employee> findAllOrderBySalary(){
        return null;
    }
    public List<Employee> findAllOrderByName(){
        return null;
    }

}
