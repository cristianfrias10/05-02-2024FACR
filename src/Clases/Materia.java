/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author hecto
 */
public class Materia implements java.io.Serializable {
    private int id;
    private String nombre;
    private String profesor;
    private byte creditos;
    private String diasI;
    private byte horasS;

    public Materia(int id, String nombre, String profesor, byte creditos, String diasI, byte horasS) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
        this.diasI = diasI;
        this.horasS = horasS;
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

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public byte getCreditos() {
        return creditos;
    }

    public void setCreditos(byte creditos) {
        this.creditos = creditos;
    }

    public String getDiasI() {
        return diasI;
    }

    public void setDiasI(String diasI) {
        this.diasI = diasI;
    }

    public byte getHorasS() {
        return horasS;
    }

    public void setHorasS(byte horasS) {
        this.horasS = horasS;
    }
    
    @Override
    public String toString() {
        return String.format("%-10d %-15s %-20s %-5d %-20s %-5d", id, nombre, profesor, creditos, diasI, horasS);
    }
    
}
