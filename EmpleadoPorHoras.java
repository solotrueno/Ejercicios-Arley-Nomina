
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int id,
                            double salarioBase, Departamento departamento,
                            int horasTrabajadas) {
        super(nombre, id, salarioBase, departamento);
        this.horasTrabajadas = horasTrabajadas;
    }


    public double calcularSalario() {
        return getSalarioBase() * horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
