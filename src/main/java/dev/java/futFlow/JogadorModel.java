package dev.java.futFlow;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private Posicao posicao;
    private String clube;
    private int numeroDaCamisa;
    private int idade;

    public JogadorModel(String nome, String email, Posicao posicao, String clube, int numeroDaCamisa, int idade) {
        this.nome = nome;
        this.email = email;
        this.posicao = posicao;
        this.clube = clube;
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

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
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
