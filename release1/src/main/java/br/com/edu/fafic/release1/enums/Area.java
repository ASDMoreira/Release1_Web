package br.com.edu.fafic.release1.enums;

import java.util.Arrays;

public enum Area {

    HUMANAS(1, "Humanas"),
    EXATAS(2, "Exatas");

    private Integer codigo;
    private String valor;

    Area(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static Area codigoToEnum(Integer codigo){
        return Arrays.stream(Area.values())
                .filter(f -> f.getCodigo()
                        .equals(codigo))
                .findFirst().orElse(null);
    }

}
