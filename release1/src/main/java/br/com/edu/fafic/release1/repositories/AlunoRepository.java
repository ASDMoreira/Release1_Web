package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID>{

    Aluno findByNome(String nome);
    Aluno findByMatricula(String matricula);
}
