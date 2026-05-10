package ec.edu.ups.biblioteca;

import ec.edu.ups.biblioteca.clases.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Libro> libros = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        List<Bibliotecario> bibliotecarios = new ArrayList<>();
        List<Prestamo> prestamos = new ArrayList<>();

        int opcion;
        int contadorPrestamo = 1;

        do {

            System.out.println("\n====== BIBLIOTECA ======");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Registrar bibliotecario");
            System.out.println("4. Registrar prestamo");
            System.out.println("5. Registrar devolucion");
            System.out.println("6. Mostrar libros");
            System.out.println("7. Mostrar usuarios");
            System.out.println("8. Mostrar prestamos");
            System.out.println("9. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n--- REGISTRO LIBRO ---");

                    System.out.print("ISBN: ");
                    String isbn = teclado.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = teclado.nextLine();

                    System.out.print("Autor: ");
                    String autor = teclado.nextLine();

                    System.out.print("Anio publicacion: ");
                    int anio = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Categoria: ");
                    String tipoCategoria = teclado.nextLine();

                    Categoria categoria = new Categoria(tipoCategoria);

                    Libro libro = new Libro(isbn, titulo, autor, anio, true, categoria);

                    libros.add(libro);

                    System.out.println("Libro registrado correctamente");

                    break;

                case 2:

                    System.out.println("\n--- REGISTRO USUARIO ---");

                    System.out.print("Cedula: ");
                    int cedula = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Nombre: ");
                    String nombreUsuario = teclado.nextLine();

                    System.out.print("Correo: ");
                    String correoUsuario = teclado.nextLine();

                    Usuario usuario = new Usuario(cedula, nombreUsuario, correoUsuario);

                    usuarios.add(usuario);

                    System.out.println("Usuario registrado correctamente");

                    break;

                case 3:

                    System.out.println("\n--- REGISTRO BIBLIOTECARIO ---");

                    System.out.print("Nombre: ");
                    String nombreBibliotecario = teclado.nextLine();

                    System.out.print("Correo: ");
                    String correoBibliotecario = teclado.nextLine();

                    System.out.print("Turno: ");
                    String turno = teclado.nextLine();

                    Bibliotecario bibliotecario = new Bibliotecario(turno, nombreBibliotecario, correoBibliotecario);

                    bibliotecarios.add(bibliotecario);

                    System.out.println("Bibliotecario registrado correctamente");

                    break;

                case 4:

                    System.out.println("\n--- REGISTRO PRESTAMO ---");

                    if (libros.isEmpty()) {
                        System.out.println("No existen libros registrados");
                        break;
                    }

                    if (usuarios.isEmpty()) {
                        System.out.println("No existen usuarios registrados");
                        break;
                    }

                    if (bibliotecarios.isEmpty()) {
                        System.out.println("No existen bibliotecarios registrados");
                        break;
                    }

                    boolean libroDisponible = false;

                    for (int i = 0; i < libros.size(); i++){

                        if (libros.get(i).verificarDisponibilidad()){
                            libroDisponible = true;
                        }
                    }

                    if (libroDisponible == false){
                        System.out.println("No hay libros disponibles");
                        break;
                    }

                    System.out.println("\nUSUARIOS");

                    for (int i = 0; i < usuarios.size(); i++){
                        System.out.println(i + ". " + usuarios.get(i).getNombre());
                    }

                    System.out.print("Seleccione usuario: ");
                    int indiceUsuario = teclado.nextInt();

                    System.out.println("\nLIBROS DISPONIBLES");

                    for (int i = 0; i < libros.size(); i++){

                        if (libros.get(i).verificarDisponibilidad()){
                            System.out.println(i + ". " + libros.get(i).getTitulo());
                        }
                    }

                    System.out.print("Seleccione libro: ");
                    int indiceLibro = teclado.nextInt();

                    System.out.println("\nBIBLIOTECARIOS");

                    for (int i = 0; i < bibliotecarios.size(); i++){
                        System.out.println(i + ". " + bibliotecarios.get(i).getNombre());
                    }

                    System.out.print("Seleccione bibliotecario: ");
                    int indiceBibliotecario = teclado.nextInt();

                    Bibliotecario bibliotecarioSeleccionado = bibliotecarios.get(indiceBibliotecario);

                    Usuario usuarioSeleccionado = usuarios.get(indiceUsuario);

                    Libro libroSeleccionado = libros.get(indiceLibro);

                    if (usuarioSeleccionado.puedePedir() && libroSeleccionado.verificarDisponibilidad()){

                        Prestamo prestamo = bibliotecarioSeleccionado.registrarPrestamo(contadorPrestamo, usuarioSeleccionado, libroSeleccionado);

                        prestamos.add(prestamo);

                        contadorPrestamo++;

                        System.out.println("Prestamo realizado correctamente");

                    } else{

                        System.out.println("No se pudo realizar el prestamo");
                    }

                    break;

                case 5:

                    System.out.println("\n--- DEVOLUCION LIBRO ---");

                    if (prestamos.isEmpty()) {
                        System.out.println("No existen prestamos");
                        break;
                    }

                    for (int i = 0; i < prestamos.size(); i++){

                        System.out.println(i + ". " + prestamos.get(i));
                    }

                    System.out.print("Seleccione prestamo: ");
                    int indicePrestamo = teclado.nextInt();

                    Prestamo prestamoSeleccionado = prestamos.get(indicePrestamo);

                    Bibliotecario bibliotecarioDevolucion = prestamoSeleccionado.getBibliotecario();

                    bibliotecarioDevolucion.registrarDevolucion(prestamoSeleccionado);

                    System.out.println("Libro devuelto correctamente");

                    break;

                case 6:

                    System.out.println("\n--- LIBROS ---");

                    for (int i = 0; i < libros.size(); i++){
                        System.out.println(libros.get(i));
                    }

                    break;

                case 7:

                    System.out.println("\n--- USUARIOS ---");

                    for (int i = 0; i < usuarios.size(); i++){
                        System.out.println(usuarios.get(i));
                    }

                    break;

                case 8:

                    System.out.println("\n--- PRESTAMOS ---");

                    for (int i = 0; i < prestamos.size(); i++){
                        System.out.println(prestamos.get(i));
                    }

                    break;

                case 9:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 9);

    }
}
