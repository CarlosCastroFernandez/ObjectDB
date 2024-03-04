package org.example.clase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity

public class Cliente implements Serializable {
    @Id
    private Long id;
    private String nombre;
    private Long totalVentas;
    private String estado;

    public Cliente(String nombre, Long totalVentas, String estado) {
        this.nombre = nombre;
        this.totalVentas = totalVentas;
        this.estado = estado;
    }
    public Cliente(Long id,String nombre, Long totalVentas, String estado) {
        this.id=id;
        this.nombre = nombre;
        this.totalVentas = totalVentas;
        this.estado = estado;
    }
    public Cliente(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(Long totalVentas) {
        this.totalVentas = totalVentas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", totalVentas=" + totalVentas +
                ", estado=" + estado +
                '}';
    }
}
