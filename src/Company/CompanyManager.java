package Company;

import java.util.List;

public interface CompanyManager {

    void addEmployee_sub(String id, String name, String type, double salary, String idManager);
    void addManager(String id, String name, double salary);
    void nuevaVenta(int idventa, int idvendedor);

    List<Employee> findAllOrderBySalary();
    List<Employee> findAllOrderByName();
    List<Employee> findAllByManager(String idManager);


}
