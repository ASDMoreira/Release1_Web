package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.domain.Professor;
import br.com.edu.fafic.release1.repositories.AlunoRepository;
import br.com.edu.fafic.release1.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService {

    private final ProfessorRepository professorRepository;

    private final AlunoRepository alunoRepository;

    public BibliotecarioService(ProfessorRepository professorRepository, AlunoRepository alunoRepository) {
        this.professorRepository = professorRepository;
        this.alunoRepository = alunoRepository;
    }

    public Professor saveProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    public Aluno saveAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

}
