package dev.java.futFlow.Jogadores;
import dev.java.futFlow.Clubes.ClubeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor //constructor no args
@AllArgsConstructor //constructor all args
@Data //getters - setters
public class JogadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "posicao")
    private Posicao posicao;
    @Column(name = "nacionalidade")
    private String nacionalidade;
    @Column(name = "numeroDaCamisa")
    private int numeroDaCamisa;
    @Column(name = "idade")
    private int idade;

    @ManyToOne //O jogador tem apenas um clube.
    @JoinColumn(name = "clube_id") //Chave estrangeira
    private ClubeModel clube;

}
