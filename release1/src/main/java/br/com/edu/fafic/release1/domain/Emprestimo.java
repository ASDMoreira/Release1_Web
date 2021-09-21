package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Emprestimo {

    @Id
    @GeneratedValue
    private UUID id;

    private Usuarios usuarioProf;
    private String dataEmprestimo;
    private List<Livro> livros;



}
