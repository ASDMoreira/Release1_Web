package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/salvaraluno")
    public ResponseEntity save(@RequestBody Aluno aluno) {
        Aluno al = alunoService.saveAluno(aluno);
        return ResponseEntity.ok().body(al);

    }

    @PutMapping("/atualizaraluno")
    public ResponseEntity updateLivro(@RequestBody Aluno aluno) {
        Aluno al = alunoService.updateAluno(aluno);
        return ResponseEntity.ok().body(al);
    }

    @GetMapping("/buscaraluno/Matricula/{matricula}")
    public ResponseEntity getAlunoByMatricula(@PathVariable String matricula) {
        Aluno al = alunoService.getAlunoByMatricula(matricula);
        return ResponseEntity.ok().body(al);
    }

    @GetMapping("/buscaraluno/Nome/{nome}")
    public ResponseEntity getAlunoByNome(@PathVariable String nome) {
        Aluno al = alunoService.getAlunoByNome(nome);
        return ResponseEntity.ok().body(al);
    }

    @DeleteMapping("/deletaraluno/UUID/{id}")
    public ResponseEntity deleteAluno(@PathVariable("id") UUID id) {
        alunoService.deleteAluno(id);
        return ResponseEntity.noContent().build();
    }


}
