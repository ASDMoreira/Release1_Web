package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class EmprestDevoluc {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private Usuarios usuario;


    private String dataLoca;

    private String dataDevoluc;

    @OneToMany
    private List<Livro> livrosLoc;

}
