class Empleado {
    private String nom;
    private int ed;
    private double salarioB;

    public Empleado(String nombre, int edad, double salarioBase) {
        this.nom = nombre;
        this.ed = edad;
        this.salarioB = salarioBase;
    }
    
    public double calcularSalario() {
        return salarioB;
    }
    
    public void promocion(){
        System.out.println("Promociones para empleados");
    }
    
    public void despido(){
        System.out.println("Usted esta despedido. Gracias");
    }
    
    public void jubilacion(){
        System.out.println("Usted ha terminado su labor en la empresa");
    }
    
    public void informacionE(){
        System.out.println("Nombre: "+nom);
        System.out.println("Edad: "+ed);
        System.out.println("Salario: "+salarioB);
    }
    // Otros métodos comunes para calcular aumentos, promociones, jubilación, etc.
                           
}

class Supervisor extends Empleado{
    private double bonoSuper;

    public Supervisor(String nombre, int edad, double salarioBase, double bonoSupervisor) {
        super(nombre, edad, salarioBase);
        this.bonoSuper = bonoSupervisor;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoSuper;
    }
    
    public void informacionS(){
        informacionE();
        System.out.println("Bono: "+bonoSuper);
    }
    // Métodos específicos para supervisores
}

class Gerente extends Supervisor{
     private double bonoGer;

    public Gerente(String nombre, int edad, double salarioBase, double bonoSupervisor, double bonoGerente) {
        super(nombre, edad, salarioBase, bonoSupervisor);
        this.bonoGer = bonoGerente;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGer;
    }

    public void informacionGr(){
        informacionE();
        System.out.println("Bono: "+bonoGer);
    }
    // Métodos específicos para gerentes
}

class Director extends Gerente{
    private double bonoDir;

    public Director(String nombre, int edad, double salarioBase, double bonoSupervisor, double bonoGerente, double bonoDirector) {
        super(nombre, edad, salarioBase, bonoSupervisor, bonoGerente);
        this.bonoDir= bonoDirector;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoDir;
    }
    // Métodos específicos para directores
    
    public void informacion(){
        informacionE();
        System.out.println("Bono: "+bonoDir);
    }
}

class AccesoPublico extends Empleado{
    public AccesoPublico(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }
    // Métodos específicos para acceso público
  
    public void informacion(){
       informacionE();
    }
}

class AccesoRH extends Empleado{
     public AccesoRH(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    public void informacion(){
        informacionE();
    }
    // Métodos específicos para acceso de recursos humanos
}

class AccesoSU extends Gerente{

    public AccesoSU(String nombre, int edad, double salarioBase, double bonoSupervisor, double bonoGerente) {
        super(nombre, edad, salarioBase, bonoSupervisor, bonoGerente);
    }
    
    public void informacionSp(){
        informacionGr();
    }
    // Métodos específicos para acceso de SUNAT
}

class AccesoSup extends Supervisor{
    public AccesoSup(String nombre, int edad, double salarioBase, double bonoSupervisor) {
        super(nombre, edad, salarioBase, bonoSupervisor);
    }

    public void informacionSp(){
        informacionS();
    }
    // Métodos específicos para acceso de supervisor
}

class poo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear empleados de diferentes tipos
        Empleado e1 = new Empleado("Juan", 30, 50000.0);
        Supervisor s1 = new Supervisor("Ana", 35, 60000.0, 5000.0);
        Gerente g1 = new Gerente("Carlos", 40, 70000.0, 5000.0, 10000.0);
        Director d1 = new Director("Elena", 45, 80000.0, 5000.0, 10000.0, 15000.0);

       
        // Ejemplos de cálculo de salarios
        System.out.println("Salario de " + e1.getClass().getSimpleName() + ": " + e1.calcularSalario());
        System.out.println("Salario de " + s1.getClass().getSimpleName() + ": " + s1.calcularSalario());
        System.out.println("Salario de " + g1.getClass().getSimpleName() + ": " + g1.calcularSalario());
        System.out.println("Salario de " + d1.getClass().getSimpleName() + ": " + d1.calcularSalario());

    }
    
              
}