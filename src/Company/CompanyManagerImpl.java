package Company;

import java.util.HashMap;
import java.util.List;

public class CompanyManagerImpl implements CompanyManager {

    HashMap<String, Employee> employees;

    public CompanyManagerImpl() {
        this.employees = new HashMap<String, Employee>();
    }

    @Override
    public void addEmployee_sub(String id, String name, String type, double salary, String idManager) {

    }
    @Override
    public void nuevaVenta(int idventa, int idvendedor) {
    }

    @Override
    public void addManager(String id, String name, double salary) {

    }

    void CompanyManagerImpl(){}

    public List<Employee> findAllByManager(String idManager) {
        Employee e = this.employees.get(idManager);
        Manager manager;
        List<Employee> res = null;

        /*if (e!=null && e instance Manager) {
            manager = (Manager)e;
            res = manager.getEmployees();
        }
        */
        return res;

    }
    public List<Employee> findAllOrderBySalary(){
        return null;
    }
    public List<Employee> findAllOrderByName(){
        return null;
    }

}
