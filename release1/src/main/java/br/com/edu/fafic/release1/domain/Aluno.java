package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
@DiscriminatorValue(value = "A")
public class Aluno extends Usuarios{

    @Embedded
    private CursoEstuda cursoEstuda;

}
