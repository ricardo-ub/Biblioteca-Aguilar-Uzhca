/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author DELL
 */
public class Categoria {
    private String tipoCategoria;

    public Categoria() {
    }

    public Categoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "tipoCategoria=" + tipoCategoria + '}';
    }
    
}
