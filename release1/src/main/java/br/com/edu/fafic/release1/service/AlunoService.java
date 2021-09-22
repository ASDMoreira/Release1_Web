package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {

        this.alunoRepository = alunoRepository;
    }

    public Aluno saveAluno(Aluno aluno) {

        return alunoRepository.save(aluno);
    }

    public Aluno updateAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> buscarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno getAlunoByMatricula(String matricula) {
        return alunoRepository.findByMatricula(matricula);
    }

    public Aluno getAlunoByNome(String nome) {
        return alunoRepository.findByNome(nome);
    }

    public void deleteAluno(UUID id) {
        Aluno aluno = alunoRepository.getById(id);
        alunoRepository.delete(aluno);
    }
}
