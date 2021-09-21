package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity save(@RequestBody Livro livro){
        Livro lv = livroService.save(livro);
        return ResponseEntity.ok().body(lv);
    }

    @GetMapping("/{nome}")
    public ResponseEntity livrosBuscaNome(@PathVariable("nome") String nome){
        List<Livro> livros = livroService.findLivroByNome(nome);
        return ResponseEntity.ok().body(livros);
    }


    @GetMapping("/{isbn}")
    public ResponseEntity livrosBuscaISBN(@PathVariable("isbn") String isbn){
        List<Livro> livros = livroService.findByISBN(isbn);
        return ResponseEntity.ok().body(livros);
    }

    @GetMapping("/{area}")
    public ResponseEntity livrosBuscaISBN(@PathVariable("area") Integer area){
        Livro livros = livroService.findLivroByArea(area);
        return ResponseEntity.ok().body(livros);
    }

}
