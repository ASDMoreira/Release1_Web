package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Biblioteca {

    private String nome;
    private String nomeInstituicao;

    @OneToOne
    private Bibliotecario bibliotecario;


    @ManyToOne
    private List<Livro> livros;


    @OneToMany
    private Usuarios usuario;



}
