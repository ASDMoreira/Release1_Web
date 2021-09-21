package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.repositories.LivroRepository;

import java.util.List;

public class LivroService {

    private final LivroRepository livroRepository;


    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro save(Livro livros){
        return livroRepository.save(livros);
    }

    public List<Livro> findLivroByNome(String nome){
        return livroRepository.findLivroByNome(nome);

    }

    public Livro findLivroByArea(Integer area){
        return livroRepository.findLivroByArea(area);

    }

    public List<Livro> findByISBN(String isbn){
        return livroRepository.findByISBN(isbn);

    }


}
