package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.Bibliotecario;
import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.enums.Area;
import br.com.edu.fafic.release1.service.BibliotecaService;
import br.com.edu.fafic.release1.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/salvarlivro")
    public ResponseEntity save(@RequestBody Livro livro) {
       Livro lv = livroService.saveLivro(livro);
        return ResponseEntity.ok().body(lv);

    }

    @GetMapping("/buscarlivro/Isbn/{isbn}")
    public ResponseEntity getLivroByIsbn(@PathVariable String isbn) {
        Livro lv = livroService.getLivroByIsbn(isbn);
        return ResponseEntity.ok().body(lv);
    }

    @GetMapping("/buscarlivro/Area/{area}")
    public ResponseEntity pegarLivroByArea(@PathVariable("area") Integer area){
        return ResponseEntity.ok().body(livroService.getLivroByArea(area));
    }

    @GetMapping("/buscarlivro/Nome/{nome}")
    public ResponseEntity getLivroByNome(@PathVariable String nome) {
        Livro lv = livroService.getLivroByNome(nome);
        return ResponseEntity.ok().body(lv);
    }

    @DeleteMapping("/deletarlivro/UUID/{id}")
    public ResponseEntity deleteLivro(@PathVariable("id") UUID id) {
        livroService.deleteLivroId(id);
        return ResponseEntity.noContent().build();

    }

}
