package br.com.edu.fafic.release1.domain;

import lombok.*;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Bibliotecario {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    private Integer genero;

    @Column(unique = true)
    private String matricula;

    @OneToOne
    private Endereco endereco;

    @Embedded
    private Contato contato;



}
