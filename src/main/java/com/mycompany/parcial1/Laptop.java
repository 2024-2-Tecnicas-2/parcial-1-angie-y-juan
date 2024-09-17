
package com.mycompany.parcial1;


    public class Laptop extends Producto {
    
    private String procesador;
    private int memoria;

    public Laptop(String Nombre, String Descripcion, Double Precio, int Cantidad, String procesador, int memoria) {
        super(Nombre, Descripcion, Precio, Cantidad);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Laptop{" + "procesador=" + procesador + ", memoria=" + memoria + '}';
    }
    
    
}
