package Company;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CompanyManagerTest {
    private final CompanyManagerImpl Company_test = new CompanyManagerImpl();

    @Test
    public void addEmployee_test() throws ManagerNotFound{
        Company_test.addManager("2","Jose",1000);
        Company_test.addEmployee("2", "Mario",1000,"vendor","2");
        assertEquals(1,Company_test.get_size()); }

    @Test
    public void addManager_test(){
        Company_test.addManager("2","Jose",1000);
        assertEquals(1,Company_test.get_size());
    }
    @Test
    public void findById_test() throws ManagerNotFound {
        Company_test.addManager("2","Jose",2000);
        Company_test.addEmployee("2", "Mario",1000,"vendor","2");
        Company_test.addEmployee("3", "Pepe",1000,"vendor","2");

        Employee e= Company_test.findById("2");
        assertEquals("Mario", e.getName());
    }

    @Test
    public void findAllByManager () throws ManagerNotFound
    {
        Company_test.addManager("2","Jose",1000);

        Company_test.addEmployee("2", "Mario",1000,"vendor","2");
        Company_test.addEmployee("3", "Pepe",1000,"vendor","2");
        Company_test.addEmployee("4", "Oscar",1000,"vendor","2");

        List<Employee> list;

        list= Company_test.findAllByManager("2");

        assertEquals(3,list.size());
    }

    @Test
    public void nuevaVenta() throws ManagerNotFound, VendorNotFoundException{
        Company_test.addEmployee("2", "Mario",1000,"vendor","2");
        Company_test.nuevaVenta("2","2",200);
        Vendor v = (Vendor) Company_test.findById("2");
        assertEquals(1,v.size());
    }

}