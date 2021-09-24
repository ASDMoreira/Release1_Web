package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.domain.Livro;
import br.com.edu.fafic.release1.domain.Professor;
import br.com.edu.fafic.release1.service.AlunoService;
import br.com.edu.fafic.release1.service.LivroService;
import br.com.edu.fafic.release1.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/bibliotecario")
public class BibliotecarioController {

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private LivroService livroService;


    //Aluno
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
    public ResponseEntity pegarAlunoByMatricula(@PathVariable String matricula) {
        Aluno al = alunoService.getAlunoByMatricula(matricula);
        return ResponseEntity.ok().body(al);
    }

    @GetMapping("/getAlunoNome/{nome}")
    public ResponseEntity pegarAlunoByNome(@PathVariable("nome") String nome){
        return ResponseEntity.ok().body(alunoService.getAlunoByNome(nome));
    }

    @GetMapping("/pegarTodosAlunos")
    public ResponseEntity pegarTodosAlunos(){
        List<Aluno> al = alunoService.getAllAlunos();
        return ResponseEntity.ok().body(al);

    }

    @DeleteMapping("/deletaraluno/UUID/{id}")
    public ResponseEntity deletarAluno(@PathVariable("id") UUID id) {
        alunoService.deleteAluno(id);
        return ResponseEntity.noContent().build();
    }

    //Professor

    @PostMapping("/salvarprofessor")
    public ResponseEntity save(@RequestBody Professor professor) {
        Professor pr = professorService.saveProfessor(professor);
        return ResponseEntity.ok().body(pr);

    }

    @PutMapping("/atualizarprofessor")
    public ResponseEntity atualizarProfessor(@RequestBody Professor professor) {
        Professor pr = professorService.updateProfessor(professor);
        return ResponseEntity.ok().body(pr);
    }

    @GetMapping("/buscarprofessor/Matricula/{matricula}")
    public ResponseEntity pegarProfessorByMatricula(@PathVariable String matricula) {
        Professor pr = professorService.getProfessorByMatricula(matricula);
        return ResponseEntity.ok().body(pr);
    }

    @GetMapping("/buscarprofessor/Nome/{nome}")
    public ResponseEntity pegarProfessorByNome(@PathVariable String nome) {
        Professor pr = professorService.getProfessorByNome(nome);
        return ResponseEntity.ok().body(pr);
    }

    @DeleteMapping("/deletarprofessor/UUID/{id}")
    public ResponseEntity deletarProfessor(@PathVariable("id") UUID id) {
        professorService.deleteProfessor(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pegarTodosProfs")
    public ResponseEntity pegarTodosProfessores(){
        List<Professor> pr = professorService.getAllProfessor();
        return ResponseEntity.ok().body(pr);

    }

    //Livro

    @PostMapping("/salvarlivro")
    public ResponseEntity save(@RequestBody Livro livro) {
        Livro lv = livroService.saveLivro(livro);
        return ResponseEntity.ok().body(lv);

    }

    @PutMapping("/atualizarlivro")
    public ResponseEntity atualizarLivro(@RequestBody Livro livro) {
        Livro lv = livroService.updateLivro(livro);
        return ResponseEntity.ok().body(lv);
    }

    @GetMapping("/buscarlivro/Isbn/{isbn}")
    public ResponseEntity pegarLivroByIsbn(@PathVariable String isbn) {
        Livro lv = livroService.getLivroByIsbn(isbn);
        return ResponseEntity.ok().body(lv);
    }

    @GetMapping("/buscarlivro/Area/{area}")
    public ResponseEntity pegarLivroByArea(@PathVariable("area") Integer area){
        List<Livro> lv = livroService.getLivroByArea(area);
        return ResponseEntity.ok().body(lv);
    }

    @GetMapping("/buscarlivro/Nome/{nome}")
    public ResponseEntity pegarLivroByNome(@PathVariable String nome) {
        Livro lv = livroService.getLivroByNome(nome);
        return ResponseEntity.ok().body(lv);
    }

    @GetMapping("/pegarTodosLivros")
    public ResponseEntity pegarTodosLivros(){
        List<Livro> lv = livroService.getAllLivros();
        return ResponseEntity.ok().body(lv);

    }

    @DeleteMapping("/deletarlivro/UUID/{id}")
    public ResponseEntity deleteLivro(@PathVariable("id") UUID id) {
        livroService.deleteLivroId(id);
        return ResponseEntity.noContent().build();

    }


}
