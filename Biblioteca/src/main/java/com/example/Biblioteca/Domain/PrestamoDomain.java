
package com.example.Biblioteca.Domain;

@Entity
public class PrestamoDomain {
 @Id @GeneratedValue
    private Long id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    @ManyToOne
    private Libro libro;

    @ManyToOne
    private Usuario usuario;
}
