/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author hecto
 */
public class Grupo implements java.io.Serializable {
    private int id;
    private String grupo;

    public Grupo(int id, String grupo) {
        this.id = id;
        this.grupo = grupo;
    }
    
    private Materia numMat;
    private Profesor numProf;
    private Alumno alumnos;
    private Carrera carrera;

    public Grupo(Materia numMat, Profesor numProf, Alumno alumnos, Carrera carrera) {
        this.numMat = numMat;
        this.numProf = numProf;
        this.alumnos = alumnos;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Materia getNumMat() {
        return numMat;
    }

    public void setNumMat(Materia numMat) {
        this.numMat = numMat;
    }

    public Profesor getNumProf() {
        return numProf;
    }

    public void setNumProf(Profesor numProf) {
        this.numProf = numProf;
    }

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-15s", id, grupo);
    }
    
}
