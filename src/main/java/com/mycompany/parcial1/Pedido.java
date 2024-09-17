
package com.mycompany.parcial1;

import java.util.Map;
import java.util.HashMap;

public class Pedido {
    private Cliente cliente;
    private Map<Producto, Integer> productosSolicitados; 

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productosSolicitados = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
            productosSolicitados.put(producto, cantidad);
            producto.setCantidad(producto.getCantidad() - cantidad);
        } else {
            System.out.println("No hay suficiente inventario para el producto: " + producto.getNombre());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Producto, Integer> entry : productosSolicitados.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() + ", Total: $" + calcularTotal();
    }
    
}
