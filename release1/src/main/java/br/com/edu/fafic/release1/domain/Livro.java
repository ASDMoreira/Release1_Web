package br.com.edu.fafic.release1.domain;

import br.com.edu.fafic.release1.enums.Area;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Livro {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    @Column(unique = true)
    private String isbn;

    private Integer area;


}
