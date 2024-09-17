package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.text.DateFormat;

@Getter
@ToString
@AllArgsConstructor
@Entity
public class Comodo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    private String nome;

    public Comodo(String nome) {
        this.nome = nome;
    }

    public Comodo(){

    };

    public Long getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}