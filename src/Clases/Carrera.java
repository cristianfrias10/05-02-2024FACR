/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author hecto
 */
public class Carrera implements java.io.Serializable {
    private int id;
    private String nombre;
    private String plantel;
    private byte duracion;
    private String universidad;
    private byte semestres;

    public Carrera(int id, String nombre, String plantel, byte duracion, String universidad, byte semestres) {
        this.id = id;
        this.nombre = nombre;
        this.plantel = plantel;
        this.duracion = duracion;
        this.universidad = universidad;
        this.semestres = semestres;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlantel() {
        return plantel;
    }

    public void setPlantel(String plantel) {
        this.plantel = plantel;
    }

    public byte getDuracion() {
        return duracion;
    }

    public void setDuracion(byte duracion) {
        this.duracion = duracion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public byte getSemestres() {
        return semestres;
    }

    public void setSemestres(byte semestres) {
        this.semestres = semestres;
    }
    
    @Override
    public String toString() {
        return String.format("%-10d %-15s %-20s %-5d %-20s %-5d", id, nombre, plantel, duracion, universidad, semestres);
    }
}
