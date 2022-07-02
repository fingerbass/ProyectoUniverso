package Entidades;

public class Comida {
    private int codPlato;
    private String nombreComida;
    private double precio;

    public Comida(String nombreComida, double precio) {
        this.nombreComida = nombreComida;
        this.precio = precio;
    }

    public int getCodPlato() {return codPlato;}
    public void setCodPlato(int codPlato) {this.codPlato = codPlato;}
    public String getNombreComida() {return nombreComida;}
    public void setNombreComida(String nombreComida) {this.nombreComida = nombreComida;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
}