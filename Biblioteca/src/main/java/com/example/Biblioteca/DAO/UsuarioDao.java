

package com.example.Biblioteca.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Biblioteca.Domain;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

}
