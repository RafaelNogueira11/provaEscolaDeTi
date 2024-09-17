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
public class Imovel{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    private String descricao;
    private DateFormat dataCompra;
    private String endereco;

    public Imovel(String descricao, DateFormat dataCompra, String endereco) {
        this.descricao = descricao;
        this.dataCompra = dataCompra;
        this.endereco = endereco;
    }

    public Imovel(){

    };

    public Long getId() {
        return Id;
    }

    public String getDescricao() {
        return descricao;
    }

    public DateFormat setDataCompra() {
        return dataCompra;
    }

    public String setEndereco() {
        return endereco;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCompra(DateFormat dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
