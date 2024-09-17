
package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
   private String Nombre;
    private String direccionEnvio;
    private List<Pedido> listaPedidos;

    public Cliente(String nombre, String direccionEnvio) {
        this.Nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.listaPedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    @Override
    public String toString() {
        return "Cliente: " + Nombre + ", Dirección de envío: " + direccionEnvio + ", Total de pedidos: " + listaPedidos.size();
    }
    
    
    
}
