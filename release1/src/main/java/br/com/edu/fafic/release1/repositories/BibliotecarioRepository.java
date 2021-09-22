package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, UUID> {
}
