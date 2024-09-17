
package com.mycompany.parcial1;


public class Accesorio extends Producto{
    
    private String tipoAccesorio;

    public Accesorio(String Nombre, String Descripcion, Double Precio, int Cantidad, String tipoAccesorio) {
        super(Nombre, Descripcion, Precio, Cantidad);
        this.tipoAccesorio = tipoAccesorio;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "tipoAccesorio=" + tipoAccesorio + '}';
    }
    
    
}
