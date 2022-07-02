package Entidades;

public class Persona {
    private String apellidos, nombres, dni, nacimiento, numTel;
    private int sexo; // 1: Hombre, 2: Mujer

    public Persona(String apellidos, String nombres, String dni, String nacimiento, String numTel, int sexo) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.numTel = numTel;
        this.sexo = sexo;
    }

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public String getNacimiento() {return nacimiento;}
    public void setNacimiento(String nacimiento) {this.nacimiento = nacimiento;}
    public String getNumTel() {return numTel;}
    public void setNumTel(String numTel) {this.numTel = numTel;}
    public int getSexo() {return sexo;}
    public void setSexo(int sexo) {this.sexo = sexo;}
}