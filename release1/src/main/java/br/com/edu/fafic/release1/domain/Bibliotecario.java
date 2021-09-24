package br.com.edu.fafic.release1.domain;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "B")
public class Bibliotecario extends Usuarios{

}
