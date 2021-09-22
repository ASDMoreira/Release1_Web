package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.Bibliotecario;
import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/bibliotecario")
public class BibliotecarioController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @PostMapping("/salvarbibliotecario")
    public ResponseEntity save(@RequestBody Bibliotecario bibliotecario){
        Bibliotecario bl = bibliotecaService.saveBibliotecario(bibliotecario);
        return ResponseEntity.ok().body(bl);

    }

    @PutMapping("/atualizarbibliotecario")
    public ResponseEntity updateBibliotecario(@RequestBody Bibliotecario bibliotecario) {
        Bibliotecario bl = bibliotecaService.updateBibliotecario(bibliotecario);
        return ResponseEntity.ok().body(bl);
    }

    @DeleteMapping("/deletarbibliotecario/{id}")
    public ResponseEntity deleteBibliotecario(@PathVariable("id") UUID id) {
        bibliotecaService.deleteBibliotecario(id);
        return ResponseEntity.noContent().build();

    }

}
