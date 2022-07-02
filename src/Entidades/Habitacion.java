package Entidades;

public class Habitacion {
    private int codHabitacion, numHabitacion, categoria,tipoHabitacion, estado;
    private double precioPorDia;
    private String Descripcion;

    public Habitacion() {
    }

    public int getCodHabitacion() {return codHabitacion;}
    public void setCodHabitacion(int codHabitacion) {this.codHabitacion = codHabitacion;}
    public int getNumHabitacion() {return numHabitacion;}
    public void setNumHabitacion(int numHabitacion) {this.numHabitacion = numHabitacion;}
    public int getCategoria() {return categoria;}
    public void setCategoria(int categoria) {this.categoria = categoria;}
    public int getTipoHabitacion() {return tipoHabitacion;}
    public void setTipoHabitacion(int tipoHabitacion) {this.tipoHabitacion = tipoHabitacion;}
    public int getEstado() {return estado;}
    public void setEstado(int estado) {this.estado = estado;}
    public double getPrecioPorDia() {return precioPorDia;}
    public void setPrecioPorDia(double precioPorDia) {this.precioPorDia = precioPorDia;}
    public String getDescripcion() {return Descripcion;}
    public void setDescripcion(String descripcion) {Descripcion = descripcion;}
}