/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Usuario extends Persona{
    private List<Prestamo> prestamos;
    private int numeroCedula ;

    public Usuario() {
        this.prestamos = new ArrayList<>();
    }

    public Usuario(int numeroCedula, String nombre, String correo) {
        super(nombre, correo);
        this.numeroCedula = numeroCedula;
        this.prestamos = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    @Override
    public String toString() {
        return "Usuario{" + "prestamos=" + prestamos + ", numeroCedula=" + numeroCedula + '}';
    }
    
}
