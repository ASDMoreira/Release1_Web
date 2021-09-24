package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class CursoEstuda {

    private String cursoEstuda;
    private String periodo;

}
