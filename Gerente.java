
public class Gerente extends Empleado implements Bonificable {

    private String departamentoACargo;

    public Gerente(String nombre, int id,
                   double salarioBase, Departamento departamento,
                   String departamentoACargo) {
        super(nombre, id, salarioBase, departamento);
        this.departamentoACargo = departamentoACargo;
    }


    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.3;
    }

    public String getDepartamentoACargo() {
        return departamentoACargo;
    }

    public void setDepartamentoACargo(String departamentoACargo) {
        this.departamentoACargo = departamentoACargo;
    }
}
