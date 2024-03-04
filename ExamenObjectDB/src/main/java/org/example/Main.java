package org.example;

import org.example.DAO.ClienteDAO;
import org.example.clase.Cliente;

public class Main {
    public static void main(String[] args) {

        ClienteDAO dao=new ClienteDAO();
        Cliente cliente1=new Cliente("Carlos",20L,"activo");
        Cliente cliente2=new Cliente("Naomi",34L,"activo");
        Cliente cliente3=new Cliente("Pablo",10L,"inactivo");
        Cliente cliente4=new Cliente("Raul",54L,"inactivo");
        Cliente cliente5=new Cliente("Pepe",44L,"activo");
        //Insertar Cliente
            dao.insertarCliente(cliente2);
            dao.insertarCliente(cliente3);
            dao.insertarCliente(cliente4);
            dao.insertarCliente(cliente5);
            dao.insertarCliente(cliente1);



        //Informacion de un cliente por ID
        dao.getCliente(2L);

        //Mejores Clientes
        dao.listarMejoresClientes(11L);

        //Estadistica
        dao.estadistica();


    }
}