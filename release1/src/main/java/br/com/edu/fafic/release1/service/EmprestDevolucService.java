package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.EmprestDevoluc;
import br.com.edu.fafic.release1.repositories.EmprestDevolucRepository;
import org.springframework.stereotype.Service;

@Service
public class EmprestDevolucService {

    private final EmprestDevolucRepository emprestDevolucRepository;


    public EmprestDevolucService(EmprestDevolucRepository emprestDevolucRepository) {
        this.emprestDevolucRepository = emprestDevolucRepository;
    }

    public EmprestDevoluc saveEmprestDevoluc(EmprestDevoluc emprestDevoluc){
        return  emprestDevolucRepository.save(emprestDevoluc);

    }
}
