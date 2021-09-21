package br.com.edu.fafic.release1.enums;

import java.util.Arrays;

public enum Genero {

    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private Integer codigo;
    private String valor;

    Genero(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public static Genero codigoToEnum(Integer codigo){

        return Arrays.stream(Genero.values())
                .filter(f -> f.getCodigo().equals(codigo))
                .findFirst().orElse(null);

    }
}
