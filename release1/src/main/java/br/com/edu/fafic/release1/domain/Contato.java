package br.com.edu.fafic.release1.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Contato {

    private String email;
    private String telefone;
}
