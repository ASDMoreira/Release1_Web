package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Professor;
import br.com.edu.fafic.release1.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor saveProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor updateProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor getProfessorByMatricula(String matricula) {
        return professorRepository.findByMatricula(matricula);
    }

    public Professor getProfessorByNome(String nome) {
        return professorRepository.findByNome(nome);
    }

    public List<Professor> getAllProfessor() {

        return professorRepository.findAll();
    }

    public void deleteProfessor(UUID id) {
        Professor professor = professorRepository.getById(id);
        professorRepository.delete(professor);
    }
}
