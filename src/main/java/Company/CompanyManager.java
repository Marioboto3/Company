package Company;

import java.util.List;

public interface CompanyManager {

    void addEmployee(String id, String name, double salary, String type, String idManager) throws ManagerNotFound;
    void addManager(String id, String name, double salary);
    void nuevaVenta(String idventa, String idvendedor, double venta) throws VendorNotFoundException, ManagerNotFound;

    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager) throws ManagerNotFound;
    Employee findById(String id) throws ManagerNotFound;



}
