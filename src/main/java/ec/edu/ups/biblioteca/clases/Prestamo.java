package ec.edu.ups.biblioteca.clases;

import java.time.LocalDate;

public class Prestamo {

    private int id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    private Usuario usuario;
    private Libro libro;
    private Bibliotecario bibliotecario;

    public Prestamo() {
    }

    public Prestamo(int id, LocalDate fechaPrestamo, LocalDate fechaDevolucion, Usuario usuario, Libro libro, Bibliotecario bibliotecario) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.libro = libro;
        this.bibliotecario = bibliotecario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", usuario=" + usuario.getNombre() + ", libro=" + libro.getTitulo() + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

    public void cerrarPrestamo() {
        this.fechaDevolucion = LocalDate.now();
    }
}