package Entidades;

public class Empleado extends Persona {
    private int codEmpleado, direccion, email;

    public Empleado(String apellidos, String nombres, String dni, String nacimiento, String numTel, int sexo, int direccion, int email) {
        super(apellidos, nombres, dni, nacimiento, numTel, sexo);
        this.direccion = direccion;
        this.email = email;
    }

    public int getCodEmpleado() {return codEmpleado;}
    public void setCodEmpleado(int codEmpleado) {this.codEmpleado = codEmpleado;}
    public int getDireccion() {return direccion;}
    public void setDireccion(int direccion) {this.direccion = direccion;}
    public int getEmail() {return email;}
    public void setEmail(int email) {this.email = email;}
}