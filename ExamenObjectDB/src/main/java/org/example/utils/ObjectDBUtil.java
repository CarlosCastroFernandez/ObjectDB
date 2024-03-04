package org.example.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

public class ObjectDBUtil {
    private static final EntityManagerFactory entityManagerFactory;
    private static Logger log= Logger.getLogger(ObjectDBUtil.class.getName());

    static{
        entityManagerFactory= Persistence.createEntityManagerFactory("data.odb");
        log.info("Conexion exitosa");



    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
}
