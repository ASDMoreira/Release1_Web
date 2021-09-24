package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.enums.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {

    Livro findLivroByNome(String nome);

    List<Livro> findLivroByArea(Integer area);

    Livro findByIsbn(String isbn);






}
