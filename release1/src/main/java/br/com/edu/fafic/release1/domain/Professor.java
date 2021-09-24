package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@DiscriminatorValue(value = "P")
public class Professor extends Usuarios{

    @Embedded
    private CursoLeciona cursoLeciona;
}
