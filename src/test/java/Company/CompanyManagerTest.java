package Company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CompanyManagerTest {
    private CompanyManagerImpl Company_test;

    @Before
    public void initialize() throws ManagerNotFound, VendorNotFoundException {
        Company_test = new CompanyManagerImpl();

        Company_test.addManager("1","Antonio",2000);
        Company_test.addManager("2","Jose",2000);
        Company_test.addManager("3","Pepe",2000);
        Company_test.addManager("4","Luisa",2000);

        Company_test.addEmployee("5", "Mario",1000,"vendor","2");
        Company_test.addEmployee("6", "Pol",1000,"vendor","2");
        Company_test.addEmployee("7", "Hanni",1000,"vendor","2");
        Company_test.addEmployee("8", "Marta",1000,"vendor","3");
        Company_test.addEmployee("9", "Ana",1000,"operator","3");
        Company_test.addEmployee("10", "Laura",1000,"operator","3");
        Company_test.addEmployee("11", "Marina",1000,"operator","3");
        Company_test.addEmployee("12", "Tere",1000,"operator","3");

        Company_test.nuevaVenta("1","5",100);
    }

    @After
    public void tearDown(){
        Company_test =null;
    }
    @Test
    public void addEmployeeTest() throws ManagerNotFound{
        assertEquals(12,Company_test.get_size()); }

    @Test
    public void addManagerTest() throws ManagerNotFound{

        Employee e = (Manager)Company_test.findById("2");
        assertEquals("Jose",e.getName());
    }
    @Test
    public void findByIdTest() throws ManagerNotFound {
        Employee e= Company_test.findById("5");
        assertEquals("Mario", e.getName());
    }

    @Test
    public void findAllByManager () throws ManagerNotFound
    {
        List<Employee> list;
        list= Company_test.findAllByManager("2");
        assertEquals(3,list.size());
    }

    @Test
    public void nuevaVenta() throws ManagerNotFound{
        Vendor v = (Vendor) Company_test.findById("5");
        assertEquals(1,v.size());
    }

    @Test
    public void findAllOrderByName (){
        List<Employee> list;
        list = Company_test.findAllOrderByName();
        Assert.assertEquals("Ana",list.get(0).getName());

    }
    @Test
    public void salarioTest() throws ManagerNotFound {
    }


}