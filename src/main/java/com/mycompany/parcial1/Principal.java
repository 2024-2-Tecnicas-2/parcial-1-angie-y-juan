package com.mycompany.parcial1;

public class Principal {

    public static void main(String[] args) {
        // TODO: Aquí ingresas tu código para iniciar la aplicación.
        
        Telefono telefono1 = new Telefono("Iphone 16 pro max", "Iphone azul perla", 1000.0, 2, "apple", "iphone");
        Laptop laptop1 = new Laptop("MacBook Pro", "Laptop de Apple", 1999.99, 5, "M1", 16);
        Accesorio cargador1 = new Accesorio("Cargador", "Cargador rápido", 29.99, 20, "Cargador");
        
        Cliente cliente = new Cliente("Juan Melo", "Carrera 80c");

        
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(telefono1, 2);
        pedido.agregarProducto(laptop1, 1);
        pedido.agregarProducto(cargador1, 5);

       
        cliente.agregarPedido(pedido);

        
        System.out.println(pedido);
        System.out.println(telefono1);
        System.out.println(laptop1);
        System.out.println(cargador1);
    }  
}
