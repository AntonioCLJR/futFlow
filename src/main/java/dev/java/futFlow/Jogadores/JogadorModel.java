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

    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;

    private Posicao posicao;
    private String nacionalidade;

    private int numeroDaCamisa;
    private int idade;

    @ManyToOne //O jogador tem apenas um clube.
    @JoinColumn(name = "clube_id") //Chave estrangeira
    private ClubeModel clube;

}
