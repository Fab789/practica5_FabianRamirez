
package com.example.Biblioteca.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Biblioteca.Domain;

public interface PrestamoDao extends JpaRepository<Prestamo, Long> {

}
