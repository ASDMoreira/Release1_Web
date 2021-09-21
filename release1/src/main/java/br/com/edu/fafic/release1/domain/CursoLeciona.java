package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class CursoLeciona {

    private String nome;
    private Integer area;
}
