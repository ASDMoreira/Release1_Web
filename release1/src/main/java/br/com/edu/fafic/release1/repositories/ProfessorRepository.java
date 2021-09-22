package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorRepository extends JpaRepository<Professor, UUID> {

    Professor findByNome(String nome);
    Professor findByMatricula(String matricula);
}
