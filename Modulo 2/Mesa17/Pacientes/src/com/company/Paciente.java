package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteExecption {
        Date hoy= new Date(2022,6,24);
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.after(hoy))
            throw new PacienteExecption("error en la fecha de internacion ");
        else {this.fechaInternacion=fechaInternacion;}
    }
    /*
    Para evitar posibles errores en la carga de datos debemos generar una Excepción
    personalizada que se genera cuando se crea el paciente, si la fecha de internación fuera
    posterior al día de hoy y cuando la fecha de alta es posterior al día de la internación.
     */

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteExecption {
        if (fechaAlta.before(fechaInternacion)){
            throw new PacienteExecption("Error en la fecha de alta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public void setFechaInternacion(Date fechaInternacion) {
        this.fechaInternacion = fechaInternacion;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
