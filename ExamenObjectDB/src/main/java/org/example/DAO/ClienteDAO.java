package org.example.DAO;

import org.example.clase.Cliente;
import org.example.utils.ObjectDBUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class ClienteDAO {
    public void insertarCliente(Cliente cliente){
        EntityManager em= ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public void getCliente(Long id){
        EntityManager em= ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        Cliente cliente=em.find(Cliente.class,id);
        System.out.println("Informacion del cliente: "+cliente);
    }

    public void listarMejoresClientes(Long cantidad) {
        EntityManager em = ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Cliente> q = em.createQuery("select c from Cliente c where c.totalVentas >: cantidad", Cliente.class);
        q.setParameter("cantidad", cantidad);
        ArrayList<Cliente> clientesMejores = (ArrayList<Cliente>) q.getResultList();
        for (Cliente cliente : clientesMejores) {
            System.out.println("Mejores clientes: "+cliente);
        }
    }
    public void estadistica(){
        EntityManager em= ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Cliente> q = em.createQuery("select c from Cliente c", Cliente.class);
        Long sumaVentas=0L;
        ArrayList<Cliente>clientes= (ArrayList<Cliente>) q.getResultList();
        for (Cliente cliente : clientes) {
           sumaVentas+=cliente.getTotalVentas();
        }
        System.out.println("Totl de ventas es de: "+sumaVentas);
        sumaVentas=0L;

        q = em.createQuery("select c from Cliente c where c.estado='activo'", Cliente.class);

        ArrayList<Cliente>clientesActivos= (ArrayList<Cliente>) q.getResultList();
        for (Cliente cliente : clientesActivos) {
            sumaVentas+=cliente.getTotalVentas();
        }
        Double promedio=(double)sumaVentas/clientesActivos.size();
        System.out.println("El promedio de ventas de los clientes activos es de : "+promedio);

        q = em.createQuery("select c from Cliente c where c.estado='inactivo'and c.totalVentas>0", Cliente.class);
        ArrayList<Cliente>clientesInactivos= (ArrayList<Cliente>) q.getResultList();
        System.out.println("Cantidad de clientes inactivos con ventas superiores a 0 es de: "+clientesInactivos.size());
    }
}
