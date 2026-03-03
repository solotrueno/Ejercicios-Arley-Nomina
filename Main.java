class Principal {

    public static void main(String[] args) {


        Departamento ventas = new Departamento("Ventas", "Piso 2");


        Empleado e1 = new EmpleadoTiempoCompleto("Carlos", 1, 2000, ventas);
        Empleado e2 = new EmpleadoPorHoras("Ana", 2, 25, ventas, 80);
        Empleado e3 = new Gerente("Laura", 3, 3000, ventas, "Ventas Nacional");


        Empleado[] empleados = {e1, e2, e3};


        for (Empleado emp : empleados) {

            emp.mostrarInfo();


            if (emp instanceof Bonificable) {
                Bonificable b = (Bonificable) emp;
                System.out.println("Bono adicional: " + b.calcularBono());
            }

            System.out.println("-----------------------------");
        }
    }
}
