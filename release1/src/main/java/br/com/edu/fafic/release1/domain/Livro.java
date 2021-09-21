package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Livro {

    private String nome;

    @Column(unique = true)
    private String isbn;

    private Integer area;


}
