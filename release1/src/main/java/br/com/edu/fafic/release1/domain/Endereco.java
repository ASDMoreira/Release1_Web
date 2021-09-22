package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Endereco {

    @Id
    @GeneratedValue
    private UUID id;

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;


}
