package Entidades;

public class Cliente extends Persona {
    private int codCliente, categoria;

    public Cliente(String apellidos, String nombres, String dni, String nacimiento, String numTel, int sexo, int categoria) {
        super(apellidos, nombres, dni, nacimiento, numTel, sexo);
        this.categoria = categoria;
    }

    public int getCodCliente() {return codCliente;}
    public void setCodCliente(int codCliente) {this.codCliente = codCliente;}
    public int getCategoria() {return categoria;}
    public void setCategoria(int categoria) {this.categoria = categoria;}
}