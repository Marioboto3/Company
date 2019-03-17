package Company;

import java.util.List;

public interface CompanyManager {

    void addEmployee(String id, String name, double salary, String type, String idManager);
    void addManager(String id, String name, double salary);
    void nuevaVenta(String idventa, String idvendedor, double venta);

    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager);
    Employee findById(String id);



}
