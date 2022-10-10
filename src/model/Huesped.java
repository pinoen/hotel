package model;

import java.sql.Date;

public class Huesped {

    private int id;
    private String nombre, apellido;
    private Date fecha_nacimiento;
    private String nacionalidad, telefono;
    private int idReserva;

    public Huesped(String nombre, String apellido, Date fecha_nacimiento, String nacionalidad, String telefono, int idReserva) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.idReserva = idReserva;
    }

    public Huesped(int id, String nombre, String apellido, Date fecha_nacimiento, String nacionalidad, String telefono, int idReserva) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.idReserva = idReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdReserva() {
        return idReserva;
    }

    @Override
    public String toString() {
        return "Huesped{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idReserva=" + idReserva +
                '}';
    }
}
