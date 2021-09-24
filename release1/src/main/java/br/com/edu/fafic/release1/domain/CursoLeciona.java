package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Embeddable;


@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class CursoLeciona {

    private String cursoLeciona;
    private Integer areaLeciona;
}
