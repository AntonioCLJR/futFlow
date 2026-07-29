package dev.java.futFlow.Clubes;

import dev.java.futFlow.Jogadores.JogadorModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_clubes")
public class ClubeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeClube;
    private String federacao;
    private String pais;
    private int anoDeCriacao;
    @OneToMany(mappedBy = "clube") //Um clube pode ter vários jogadores.
    private List<JogadorModel> jogador;

    public ClubeModel() {
    }

    public ClubeModel(String nomeClube, String federacao, int anoDeCriacao, String pais) {
        this.nomeClube = nomeClube;
        this.federacao = federacao;
        this.anoDeCriacao = anoDeCriacao;
        this.pais = pais;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public String getFederacao() { return federacao; }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getPais() { return pais; }

    public Long getId() {
        return id;
    }


    public void setPais(String pais) { this.pais = pais; }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

}
