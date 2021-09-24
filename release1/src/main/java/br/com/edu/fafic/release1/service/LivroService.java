package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.enums.Area;
import br.com.edu.fafic.release1.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {

        this.livroRepository = livroRepository;
    }

    public Livro saveLivro(Livro livro) {

        return livroRepository.save(livro);
    }

    public Livro updateLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro getLivroByIsbn(String isbn) {

        return livroRepository.findByIsbn(isbn);
    }

    public List<Livro> getLivroByArea(Integer area){
        return  livroRepository.findLivroByArea(area);
    }

    public Livro getLivroByNome(String nome) {
        return livroRepository.findLivroByNome(nome);
    }

    public List<Livro> getAllLivros(){

        return  livroRepository.findAll();
    }

    public void deleteLivroId(UUID id) {
        Livro livro = livroRepository.getById(id);
        livroRepository.delete(livro);
    }

}
