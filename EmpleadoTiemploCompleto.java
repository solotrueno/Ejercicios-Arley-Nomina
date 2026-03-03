
public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, int id,
                                  double salarioBase, Departamento departamento) {
        super(nombre, id, salarioBase, departamento);
    }


    public double calcularSalario() {
        return getSalarioBase() * 1.2;
    }
}
