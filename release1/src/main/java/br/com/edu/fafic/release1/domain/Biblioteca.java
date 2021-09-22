package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Biblioteca {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
    private String nomeInstituicao;

    @OneToOne
    private Bibliotecario bibliotecario;


    @OneToMany
    private List<Livro> livros;


    @OneToMany
    private List<Usuarios> usuários;



}
