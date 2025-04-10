
package com.example.Biblioteca.Domain;

@Entity
public class LibroDomain {
 @Id @GeneratedValue
    private Long id;
    private String titulo;
    private String autor;

    @ManyToOne
    private Categoria categoria;

    private boolean disponible = true;
}
