
package Control;
public class Empleado {
private String nombre;
private String apellido;
private int edad;
private String categoria;
private double salarioBruto;
private double deduciones;
private double iees;
private double salarioTotal;

    public Empleado(String nombre, String apellido, int edad, String categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.categoria = categoria;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getsalarioBruto() {
        return salarioBruto;
    }

    public void setsalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }    
   
    public double deduciones() {
        return deduciones;
    }

    public void  deduciones(double deduciones) {
        this.deduciones = deduciones;
    }  
    
    public double getiees() {
        return iees;
    }

    public void setiees(double iees) {
        this.iees= iees;
    }  
    
        public double getsalarioTotal() {
        return salarioTotal;
    }

    public void setsalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }  
}
