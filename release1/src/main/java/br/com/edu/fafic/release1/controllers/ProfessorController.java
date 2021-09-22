package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.domain.Professor;
import br.com.edu.fafic.release1.service.AlunoService;
import br.com.edu.fafic.release1.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping("/salvarprofessor")
    public ResponseEntity save(@RequestBody Professor professor) {
        Professor pr = professorService.saveProfessor(professor);
        return ResponseEntity.ok().body(pr);

    }

    @PutMapping("/atualizarprofessor")
    public ResponseEntity updateLivro(@RequestBody Professor professor) {
        Professor pr = professorService.updateProfessor(professor);
        return ResponseEntity.ok().body(pr);
    }

    @GetMapping("/buscarprofessor/Matricula/{matricula}")
    public ResponseEntity getAlunoByMatricula(@PathVariable String matricula) {
        Professor pr = professorService.getProfessorByMatricula(matricula);
        return ResponseEntity.ok().body(pr);
    }

    @GetMapping("/buscarprofessor/Nome/{nome}")
    public ResponseEntity getAlunoByNome(@PathVariable String nome) {
        Professor pr = professorService.getProfessorByNome(nome);
        return ResponseEntity.ok().body(pr);
    }

    @DeleteMapping("/deletarprofessor/UUID/{id}")
    public ResponseEntity deleteAluno(@PathVariable("id") UUID id) {
        professorService.deleteProfessor(id);
        return ResponseEntity.noContent().build();
    }


}
