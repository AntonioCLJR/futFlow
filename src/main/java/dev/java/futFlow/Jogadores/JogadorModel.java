package dev.java.futFlow.Jogadores;
import dev.java.futFlow.Clubes.ClubeModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private Posicao posicao;
    private String nacionalidade;
    private int numeroDaCamisa;
    private int idade;
    @ManyToOne //O jogador tem apenas um clube.
    @JoinColumn(name = "clube_id") //Chave estrangeira
    private ClubeModel clube;


    public JogadorModel(String nome, String email, Posicao posicao, String nacionalidade, int numeroDaCamisa, int idade) {
        this.nome = nome;
        this.email = email;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.numeroDaCamisa = numeroDaCamisa;
        this.idade = idade;
    }

    public JogadorModel() {
        //no args constructor
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(int numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Long getId(){
        return id;
    }

}
