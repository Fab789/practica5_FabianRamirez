

package com.example.Biblioteca.Domain;

@Entity
public class UsuarioDomain {
  @Id @GeneratedValue
    private Long id;
    private String usuario;
    private String contraseña;
    private String rol;
}
