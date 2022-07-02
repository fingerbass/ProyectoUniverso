package Entidades;

import java.util.List;

public class Factura {
    private int codFactura, descuento, dias, totalPagar;
    private Empleado empleado;
    private Cliente cliente;
    private List<Habitacion> habitaciones;
    private List<Comida> comidas;

    public Factura(Empleado empleado, Cliente cliente) {
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public int getCodFactura() {return codFactura;}
    public void setCodFactura(int codFactura) {this.codFactura = codFactura;}
    public int getDescuento() {return descuento;}
    public void setDescuento(int descuento) {this.descuento = descuento;}
    public int getDias() {return dias;}
    public void setDias(int dias) {this.dias = dias;}
    public int getTotalPagar() {return totalPagar;}
    public void setTotalPagar(int totalPagar) {this.totalPagar = totalPagar;}
    public Empleado getEmpleado() {return empleado;}
    public void setEmpleado(Empleado empleado) {this.empleado = empleado;}
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    public List<Habitacion> getHabitaciones() {return habitaciones;}
    public void setHabitaciones(List<Habitacion> habitaciones) {this.habitaciones = habitaciones;}
    public List<Comida> getComidas() {return comidas;}
    public void setComidas(List<Comida> comidas) {this.comidas = comidas;}
    public double calculaDscto(){return descuento==1?0.13:0;}
}