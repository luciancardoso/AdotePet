package br.com.treinaweb.adoteumpet.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // @EqualsAndHashCOde leva em consideração apenas o id, Definindo o onlyExplicity para = true está EqualsAndHashCode que vou utilizar apenas os atributos de forma explicita
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false) // estou informando que é um campo obrigatorio , não posso criar um pet sem que ele tem um nome na minha tabela (BD)
    private String nome;

    @Column(nullable = false)
    private String historia;

    @Column(nullable = false)
    private String foto; // ela só vai salvar a urla da imagem

    public Object getId() {
        return null;
    }

    public Object getNome() {
        return null;
    }

    public Object getHistoria() {
        return null;
    }

    public Object getFoto() {
        return null;
    }

}
