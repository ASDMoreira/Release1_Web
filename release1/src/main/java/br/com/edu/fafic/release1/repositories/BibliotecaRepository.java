package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.Biblioteca;
import br.com.edu.fafic.release1.domain.Bibliotecario;
import br.com.edu.fafic.release1.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, UUID> {



}
