package Company;

public class Venta {
    String id;
    double venta;

    public String getId() {
        return id;
    }

    public double getVenta() {
        return venta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public Venta(String id, double venta) {
        this.id = id;
        this.venta = venta;
    }
}
