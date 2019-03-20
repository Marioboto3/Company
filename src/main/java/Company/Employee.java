package Company;

public abstract class Employee implements Comparable<Employee>{

    String name;
    String id;
    double salario;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double salario(double SalarioBase);

    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

}
