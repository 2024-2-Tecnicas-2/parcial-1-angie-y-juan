package com.mycompany.parcial1;

public class Producto {
    
    String Nombre;
    String Descripcion;
    Double Precio;
    int Cantidad;

    public Producto(String Nombre, String Descripcion, Double Precio, int Cantidad) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    
    public void mostrarProducto() {
        System.out.println("Nombre: "+Nombre);
        System.out.println("Descripcion: "+Descripcion);
        System.out.println("precio: "+ getPrecio());
        System.out.println("cantidad: "+Cantidad);
    }

    

    
 
}
