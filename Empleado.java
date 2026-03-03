
public abstract class Empleado {

    private String nombre;
    private int id;
    private double salarioBase;
    private Departamento departamento; // AGREGACIÓN


    public Empleado(String nombre, int id, double salarioBase, Departamento departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }


    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public abstract double calcularSalario();


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Salario calculado: " + calcularSalario());
    }
}
