package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {

    List<Livro> findLivroByNome(String nomeLivro);

    Livro findLivroByArea(Integer lisvroArea);

    List<Livro> findByISBN(String isbn);


}
