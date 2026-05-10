package ec.edu.ups.biblioteca.clases;

import java.time.LocalDate;

public class Bibliotecario extends Persona {

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

    public Prestamo registrarPrestamo(int id, Usuario usuario, Libro libro) {

        if (usuario.puedePedir() && libro.verificarDisponibilidad()) {

            libro.cambiarEstado(false);

            Prestamo prestamo = new Prestamo(id, LocalDate.now(), null, usuario, libro, this);

            usuario.getPrestamos().add(prestamo);

            return prestamo;
        }

        return null;
    }

    public void registrarDevolucion(Prestamo prestamo) {

        prestamo.cerrarPrestamo();
        prestamo.getLibro().cambiarEstado(true);
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "nombre=" + nombre + ", turno=" + turno + '}';
    }
}