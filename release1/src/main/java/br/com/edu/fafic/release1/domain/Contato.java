package br.com.edu.fafic.release1.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Contato {

    private String email;
    private String telefone;
}
