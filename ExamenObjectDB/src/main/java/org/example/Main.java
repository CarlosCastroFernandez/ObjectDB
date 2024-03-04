package org.example;

import org.example.DAO.ClienteDAO;
import org.example.clase.Cliente;

public class Main {
    public static void main(String[] args) {

        ClienteDAO dao=new ClienteDAO();
        Cliente cliente1=new Cliente(1L,"Carlos",20L,"activo");
        Cliente cliente2=new Cliente(2L,"Naomi",34L,"activo");
        Cliente cliente3=new Cliente(3L,"Pablo",10L,"inactivo");
        Cliente cliente4=new Cliente(4L,"Raul",54L,"inactivo");
        Cliente cliente5=new Cliente(5L,"Pepe",44L,"activo");
        //Insertar Cliente
        try{
            dao.insertarCliente(cliente2);
            dao.insertarCliente(cliente3);
            dao.insertarCliente(cliente4);
            dao.insertarCliente(cliente5);
            dao.insertarCliente(cliente1);
        }catch(Exception e){

        }
        
        //Informacion de un cliente por ID
        dao.getCliente(2L);

        //Mejores Clientes
        dao.listarMejoresClientes(11L);

        //Estadistica
        dao.estadistica();


    }
}