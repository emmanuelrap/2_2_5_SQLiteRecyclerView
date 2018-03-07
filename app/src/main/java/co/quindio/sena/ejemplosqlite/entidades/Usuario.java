package co.quindio.sena.ejemplosqlite.entidades;


import java.io.Serializable;

/**
 * Created by CHENAO on 7/05/2017.
 */

public class Usuario implements Serializable {

    private Integer id;
    private String nombre;
    private Double sueldo;

    public Usuario(Integer id, String nombre, Double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Usuario(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
