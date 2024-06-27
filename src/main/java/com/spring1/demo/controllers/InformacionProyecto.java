package com.spring1.demo.controllers;

import java.time.LocalDateTime;

public class InformacionProyecto {

    private LocalDateTime FechaHoy;
    private String Nombre;
    private String Apellido;
    private String Ficha;
    public InformacionProyecto(LocalDateTime fechaHoy, String nombre, String apellido, String ficha) {
        FechaHoy = fechaHoy;
        Nombre = nombre;
        Apellido = apellido;
        Ficha = ficha;
    }
    public InformacionProyecto() {
    }
    public LocalDateTime getFechaHoy() {
        return FechaHoy;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getFicha() {
        return Ficha;
    }
    public void setFechaHoy(LocalDateTime fechaHoy) {
        FechaHoy = fechaHoy;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public void setFicha(String ficha) {
        Ficha = ficha;
    }

    
}
