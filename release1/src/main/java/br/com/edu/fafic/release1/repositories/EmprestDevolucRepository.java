package br.com.edu.fafic.release1.repositories;

import br.com.edu.fafic.release1.domain.EmprestDevoluc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmprestDevolucRepository extends JpaRepository<EmprestDevoluc, UUID> {
}
