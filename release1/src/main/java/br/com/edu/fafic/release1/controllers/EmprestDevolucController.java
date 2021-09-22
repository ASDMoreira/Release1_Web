package br.com.edu.fafic.release1.controllers;

import br.com.edu.fafic.release1.domain.EmprestDevoluc;
import br.com.edu.fafic.release1.service.EmprestDevolucService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emprestdevoluc")
public class EmprestDevolucController {

    private EmprestDevolucService emprestDevolucService;


    @PostMapping("/salvaremprestdevoluc")
    public ResponseEntity save(@RequestBody EmprestDevoluc emprestDevoluc){
        EmprestDevoluc ed = emprestDevolucService.saveEmprestDevoluc(emprestDevoluc);
        return ResponseEntity.ok().body(ed);
    }


}
