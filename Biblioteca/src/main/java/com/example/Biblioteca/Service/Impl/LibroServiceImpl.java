

package com.example.Biblioteca.Service.Impl;


public class LibroServiceImpl implements LibroService {
    
    private LibroDao libroDao;

    public List<Libro> listarLibros() {
        return libroDao.findAll();
    }

    public Libro guardarLibro(Libro libro) {
        return librodDao.save(libro);
    }

    public Libro obtenerLibroPorId(Long id) {
        return libroDao.findById(id).orElse(null);
    }

    public void eliminarLibro(Long id) {
        libroDao.deleteById(id);
    }

}
