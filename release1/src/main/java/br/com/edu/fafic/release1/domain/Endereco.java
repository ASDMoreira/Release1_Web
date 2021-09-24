package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Embeddable;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;


}
