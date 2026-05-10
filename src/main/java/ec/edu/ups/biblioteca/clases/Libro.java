/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author DELL
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponibilidad;

    private Categoria categoria;

    public Libro() {
        this.disponibilidad = true;
    }

    public Libro(String ISBN, String titulo, String autor, int anioPublicacion, boolean disponibilidad, Categoria categoria) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponibilidad = disponibilidad;
        this.categoria = categoria;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", disponibilidad=" + disponibilidad + ", categoria=" + categoria + '}';
    }

    public boolean verificarDisponibilidad() {
        return disponibilidad;
    }

    public void cambiarEstado(boolean disponible) {
        this.disponibilidad = disponible;
    }

}
