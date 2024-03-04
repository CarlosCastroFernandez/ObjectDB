package org.example.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

public class ObjectDBUtil {
    private static final EntityManagerFactory entityManagerFactory;
    //private static Logger log=new Logger(ObjectDBUtil.class.getClassLoader().getName());

    static{
        entityManagerFactory= Persistence.createEntityManagerFactory("data.odb");

    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
}
