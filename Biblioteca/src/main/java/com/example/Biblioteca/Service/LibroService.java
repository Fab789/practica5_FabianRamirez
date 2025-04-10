

package com.example.Biblioteca.Service;


public interface LibroService {
List<Libro> listarLibros();
    Libro guardarLibro(Libro libro);
    Libro obtenerLibroPorId(Long id);
    void eliminarLibro(Long id);
}
