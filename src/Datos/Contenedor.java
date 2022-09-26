package Datos;

public class Contenedor {

    private int numero;
    private String empresa;


    public Contenedor(int numero, String empresa) {
        this.numero = numero;
        this.empresa = empresa;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
