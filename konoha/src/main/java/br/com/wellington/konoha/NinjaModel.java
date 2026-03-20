package br.com.wellington.konoha;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String nome;
    String vila;
    Integer idade;
    String email;
    Long ninjaId;

    // Constructors
    public NinjaModel(){}

    public NinjaModel(String nome, String vila, Integer idade, String email) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
        this.email = email;
    }

    //Getters and Setters
    public Long getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(Long ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
