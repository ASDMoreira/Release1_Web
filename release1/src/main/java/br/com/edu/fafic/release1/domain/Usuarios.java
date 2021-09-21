package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Usuarios {

    private Bibliotecario bibliotecario;
    private Aluno aluno;
    private Professor professor;
}
