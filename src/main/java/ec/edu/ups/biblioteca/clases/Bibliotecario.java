/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author DELL
 */
public class Bibliotecario extends Persona{
    private String turno;

    public Bibliotecario() {
    }

    public Bibliotecario(String turno) {
        this.turno = turno;
    }

    public Bibliotecario(String turno, String nombre, String correo) {
        super(nombre, correo);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "turno=" + turno + '}';
    }
    
}
